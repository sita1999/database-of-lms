package sita.dialog;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import sita.database.Student;
import sita.database.StudentDb;

/**
 *
 * @author sita kumari
 */
public class AddStudent extends javax.swing.JDialog {

    private StudentDb studentdb;
    private Student student;

    public AddStudent() {
        initComponents();
    }

    public AddStudent(java.awt.Frame parent, boolean modal, boolean isAdd) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(parent);
        studentdb = new StudentDb();
        student = new Student();
        isAdd(isAdd);
        studentid.setText(String.valueOf(studentdb.getLastId()+1));
        DateFormat df1=new SimpleDateFormat("dd-MM-YYYY");
        
        date.setText(df1.format(new Date()));
    }

    public AddStudent(java.awt.Frame parent, boolean modal, boolean isAdd, int bookid) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(parent);
        studentdb = new StudentDb();
        student = new Student();
        isAdd(isAdd);
        loadData(bookid);
    }

    private void loadData(int id) {
        student = studentdb.findStudent(id);
        studentid.setText(String.valueOf(student.getStudentId()));
        txt_studentname.setText(student.getStudentname());
        txt_father.setText(student.getFathername());
        txt_roll.setText(student.getRollno());
        branch_name.setSelectedItem(student.getBranchname());
        year.setSelectedItem(student.getYear());
        section.setText(student.getSection());
        dateofbirth.setText(student.getDateofbirth());
        email.setText(student.getEmail());
        contactno.setText(student.getContactno());
        addressname.setText(student.getAddressname());

    }

    private void isAdd(boolean value) {
        if (!value) {
            btnadd.setVisible(false);
            btnupdate.setVisible(true);
            btndelete.setVisible(true);
        } else {
            btnupdate.setVisible(false);
            btndelete.setVisible(false);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel12 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txt_father = new javax.swing.JTextField();
        txt_roll = new javax.swing.JTextField();
        dateofbirth = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        contactno = new javax.swing.JTextField();
        addressname = new javax.swing.JTextField();
        section = new javax.swing.JTextField();
        branch_name = new javax.swing.JComboBox<>();
        btndelete = new javax.swing.JButton();
        year = new javax.swing.JComboBox<>();
        btnupdate = new javax.swing.JButton();
        btnadd = new javax.swing.JButton();
        btncancel = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txt_studentname = new javax.swing.JTextField();
        studentid = new javax.swing.JLabel();
        date = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setFont(new java.awt.Font("Algerian", 3, 36)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(204, 0, 0));
        jLabel12.setText("STUDENT'S DETAILS :");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, -1, -1));

        jLabel1.setFont(new java.awt.Font("Algerian", 3, 24)); // NOI18N
        jLabel1.setText("Student 's  id");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 190, -1));

        jLabel2.setFont(new java.awt.Font("Algerian", 3, 24)); // NOI18N
        jLabel2.setText("Father's Name");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 200, -1));

        jLabel4.setFont(new java.awt.Font("Algerian", 3, 24)); // NOI18N
        jLabel4.setText("Roll no.");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 250, -1, -1));

        jLabel3.setFont(new java.awt.Font("Algerian", 3, 24)); // NOI18N
        jLabel3.setText("Section");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 300, 110, -1));

        jLabel6.setFont(new java.awt.Font("Algerian", 3, 24)); // NOI18N
        jLabel6.setText("Date Of Birth");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, 200, -1));

        jLabel9.setFont(new java.awt.Font("Algerian", 3, 24)); // NOI18N
        jLabel9.setText("Email");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 620, -1, -1));

        jLabel10.setFont(new java.awt.Font("Algerian", 3, 24)); // NOI18N
        jLabel10.setText("Contact no.");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 410, -1, -1));

        jLabel11.setFont(new java.awt.Font("Algerian", 3, 24)); // NOI18N
        jLabel11.setText("AddresS Name");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 460, 200, -1));

        jLabel7.setFont(new java.awt.Font("Algerian", 3, 24)); // NOI18N
        jLabel7.setText("BRANCH_ NAME");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 570, 200, -1));

        jLabel8.setFont(new java.awt.Font("Algerian", 3, 24)); // NOI18N
        jLabel8.setText("YEAR");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 510, 80, -1));
        getContentPane().add(txt_father, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 190, 390, 20));
        getContentPane().add(txt_roll, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 240, 390, -1));
        getContentPane().add(dateofbirth, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 350, 400, -1));
        getContentPane().add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 620, 390, 20));
        getContentPane().add(contactno, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 400, 400, 20));
        getContentPane().add(addressname, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 450, 400, -1));

        section.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sectionActionPerformed(evt);
            }
        });
        getContentPane().add(section, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 300, 390, 20));

        branch_name.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CSE", "ECE", "CIVIL", "MECHANICAL" }));
        getContentPane().add(branch_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 560, -1, -1));

        btndelete.setText("DELETE");
        btndelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeleteActionPerformed(evt);
            }
        });
        getContentPane().add(btndelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 760, 120, 40));

        year.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1st", "2nd", "3rd", "4th" }));
        getContentPane().add(year, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 510, -1, -1));

        btnupdate.setText("UPDATE");
        btnupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdateActionPerformed(evt);
            }
        });
        getContentPane().add(btnupdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(539, 760, 100, 40));

        btnadd.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnadd.setText("ADD");
        btnadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddActionPerformed(evt);
            }
        });
        getContentPane().add(btnadd, new org.netbeans.lib.awtextra.AbsoluteConstraints(279, 760, 100, -1));

        btncancel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btncancel.setText("cancel");
        btncancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncancelActionPerformed(evt);
            }
        });
        getContentPane().add(btncancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 757, 110, 40));

        jLabel5.setFont(new java.awt.Font("Algerian", 3, 24)); // NOI18N
        jLabel5.setText("Student Name");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 190, -1));
        getContentPane().add(txt_studentname, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 140, 390, -1));
        getContentPane().add(studentid, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 90, 370, 30));

        date.setText("Date");
        getContentPane().add(date, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 30, 40, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btndeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeleteActionPerformed
        studentdb.deleteStudent(Integer.parseInt(studentid.getText()));
        dispose();
    }//GEN-LAST:event_btndeleteActionPerformed

    private void btnupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdateActionPerformed
        student.setStudentId(Integer.parseInt(studentid.getText()));
        student.setStudentname(txt_studentname.getText());
        student.setFathername(txt_father.getText());
        student.setRollno(txt_roll.getText());
        student.setBranchname(branch_name.getSelectedItem().toString());
        student.setYear(year.getSelectedItem().toString());
        student.setSection(section.getText());
        student.setDateofbirth(dateofbirth.getText());
        student.setEmail(email.getText());
        student.setContactno(contactno.getText());
        student.setAddressname(addressname.getText());
        studentdb.updateStudent(student);
        
        dispose();
    }//GEN-LAST:event_btnupdateActionPerformed

    private void btnaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddActionPerformed
        student.setStudentname(txt_studentname.getText());
        student.setFathername(txt_father.getText());
        student.setRollno(txt_roll.getText());
        student.setBranchname(branch_name.getSelectedItem().toString());
        student.setYear(year.getSelectedItem().toString());
        student.setSection(section.getText());
        student.setDateofbirth(dateofbirth.getText());
        student.setEmail(email.getText());
        student.setContactno(contactno.getText());
        student.setAddressname(addressname.getText());
        studentdb.addStudent(student);
        dispose();
    }//GEN-LAST:event_btnaddActionPerformed

    private void btncancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancelActionPerformed
        dispose();
    }//GEN-LAST:event_btncancelActionPerformed

    private void sectionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sectionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sectionActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField addressname;
    private javax.swing.JComboBox<String> branch_name;
    private javax.swing.JButton btnadd;
    private javax.swing.JButton btncancel;
    private javax.swing.JButton btndelete;
    private javax.swing.JButton btnupdate;
    private javax.swing.JTextField contactno;
    private javax.swing.JLabel date;
    private javax.swing.JTextField dateofbirth;
    private javax.swing.JTextField email;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField section;
    private javax.swing.JLabel studentid;
    private javax.swing.JTextField txt_father;
    private javax.swing.JTextField txt_roll;
    private javax.swing.JTextField txt_studentname;
    private javax.swing.JComboBox<String> year;
    // End of variables declaration//GEN-END:variables
}
