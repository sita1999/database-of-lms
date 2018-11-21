package sita.dialog;

import java.awt.Frame;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import sita.database.Book;
import sita.database.BookDB;
import sita.database.Student;
import sita.database.StudentDb;

public class AllRegStudent extends javax.swing.JDialog {

    private DefaultTableModel dtm;
    private Frame parent;
    private StudentDb studentDb;
    private ArrayList<Student> list;

    public AllRegStudent(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        this.parent = parent;
        studentDb = new StudentDb();
        initComponents();
        setLocationRelativeTo(null);
        dtm = (DefaultTableModel) alltable.getModel();
        loadData(studentDb.allstudent());

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        allok_btn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        alltable = new javax.swing.JTable();
        allyear = new javax.swing.JComboBox<>();
        allbranch = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        allcancel_btn = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Algerian", 3, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("ALL REGISTERED STUDENT:");

        jLabel2.setFont(new java.awt.Font("Algerian", 0, 24)); // NOI18N
        jLabel2.setText("YEAR BRANCH WISE DETAILS :");

        allok_btn.setText("Search");
        allok_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                allok_btnActionPerformed(evt);
            }
        });

        alltable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Student Id", "Name", "Roll no.", "Father name", "Branch Name", "Year", "Section", "Email", "Contact no.", "Date of Birth", "Address"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        alltable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                alltableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(alltable);

        allyear.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "All", "1st", "2nd", "3rd", "4th" }));
        allyear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                allyearActionPerformed(evt);
            }
        });

        allbranch.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "All", "CSE", "ECE", "CIVIL", "MECHANICAL" }));
        allbranch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                allbranchActionPerformed(evt);
            }
        });

        jLabel3.setText("YEAR");

        jLabel4.setText("BRANCH");

        allcancel_btn.setText("CANCEL");
        allcancel_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                allcancel_btnActionPerformed(evt);
            }
        });

        jButton1.setText("REFRESH");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(151, 151, 151)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 555, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)
                        .addGap(36, 36, 36)
                        .addComponent(jLabel3)
                        .addGap(27, 27, 27)
                        .addComponent(allyear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(allbranch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(allok_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(jButton1)
                        .addGap(45, 45, 45)
                        .addComponent(allcancel_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(59, 122, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(allyear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(allbranch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(allok_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(allcancel_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(34, 34, 34)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 679, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void allyearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_allyearActionPerformed
        String year = allyear.getSelectedItem().toString();
        String branch = allbranch.getSelectedItem().toString();
        if (year.equalsIgnoreCase("All")) {
            if (branch.equalsIgnoreCase("All")) {
                loadData(studentDb.allstudent());
            } else {
                loadData(studentDb.findStudent(StudentDb.FIND_STUDENT_BRANCH, branch));
            }
        } else {
            if (branch.equalsIgnoreCase("All")) {
                loadData(studentDb.findStudent(StudentDb.FIND_STUDENT_YEAR, year));
            } else {
                loadData(studentDb.findStudent(StudentDb.FIND_STUDENT_YERA_AND_BRANCH, year, branch));
            }
        }
    }//GEN-LAST:event_allyearActionPerformed

    private void allcancel_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_allcancel_btnActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_allcancel_btnActionPerformed

    private void allok_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_allok_btnActionPerformed
        // TODO add your handling code here    
        // allData("select * from student where year='" + allyear.getSelectedItem() + "' and branchname='" + allbranch.getSelectedItem() + "'");
    }//GEN-LAST:event_allok_btnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        allyear.setSelectedItem("All");
        allbranch.setSelectedItem("All");
        loadData(studentDb.allstudent());
    }//GEN-LAST:event_jButton1ActionPerformed

    private void alltableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_alltableMouseClicked
        if (evt.getClickCount() == 2) {
            int rowId = alltable.getSelectedRow();
            int id = (int) dtm.getValueAt(rowId, 0);
            new AddStudent(parent, true, false, id).setVisible(true);
        }
    }//GEN-LAST:event_alltableMouseClicked

    private void allbranchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_allbranchActionPerformed
        String year = allyear.getSelectedItem().toString();
        String branch = allbranch.getSelectedItem().toString();
        if (branch.equalsIgnoreCase("All")) {
            if (year.equalsIgnoreCase("All")) {
                loadData(studentDb.allstudent());
            } else {
                loadData(studentDb.findStudent(StudentDb.FIND_STUDENT_YEAR, year));
            }
        } else {
            if (year.equalsIgnoreCase("All")) {
                loadData(studentDb.findStudent(StudentDb.FIND_STUDENT_BRANCH, branch));
            } else {
                loadData(studentDb.findStudent(StudentDb.FIND_STUDENT_YERA_AND_BRANCH, year, branch));
            }
        }
    }//GEN-LAST:event_allbranchActionPerformed
    private void loadData(ArrayList<Student> li) {
        list = li;
        Object[] row = new Object[11];
        dtm.getDataVector().removeAllElements();
        alltable.revalidate();
        for (Student student : list) {
            row[0] = student.getStudentId();
            row[1] = student.getStudentname();
            row[2] = student.getFathername();
            row[3] = student.getRollno();
            row[4] = student.getBranchname();
            row[5] = student.getYear();
            row[6] = student.getSection();
            row[7] = student.getDateofbirth();
            row[8] = student.getEmail();
            row[9] = student.getContactno();
            row[10] = student.getAddressname();
            dtm.addRow(row);
        }

        
    }
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> allbranch;
    private javax.swing.JButton allcancel_btn;
    private javax.swing.JButton allok_btn;
    private javax.swing.JTable alltable;
    private javax.swing.JComboBox<String> allyear;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

}
