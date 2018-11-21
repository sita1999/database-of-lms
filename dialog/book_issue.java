package sita.dialog;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import sita.database.Database;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class book_issue extends javax.swing.JDialog {

    private ArrayList<String> bookIdList;

    public book_issue(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        DateFormat df = new SimpleDateFormat("dd-MM-YYYY");
        txtDate.setText(df.format(new Date()));
        bookIdList = new ArrayList<>();
        DateFormat df1=new SimpleDateFormat("dd-MM-YYYY");
        
        txtDate.setText(df1.format(new Date()));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtname = new javax.swing.JTextField();
        txtroll = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txt_bookid = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        book_table = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        txtSid = new javax.swing.JTextField();
        btn_find_student = new javax.swing.JButton();
        txtDate = new javax.swing.JLabel();
        cmbyear = new javax.swing.JTextField();
        cmbbranch = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel1.setText("BOOK ISSUE:");

        jLabel2.setText("Student's Name");

        jLabel3.setText("Roll no.");

        jLabel4.setText("Year");

        jLabel5.setText("Branch Name");

        txtname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnameActionPerformed(evt);
            }
        });

        txtroll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtrollActionPerformed(evt);
            }
        });

        jLabel6.setText("Book Id");

        jButton1.setText("ISSUE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("CANCEL");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        book_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Book Id", "Book author", "Book Title", "Book Publisher", "Available"
            }
        ));
        jScrollPane1.setViewportView(book_table);

        jButton3.setText("ADD");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel9.setText("Student id");

        txtSid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSidActionPerformed(evt);
            }
        });

        btn_find_student.setText("OK");
        btn_find_student.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_find_studentActionPerformed(evt);
            }
        });

        txtDate.setText("Date:");

        cmbyear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbyearActionPerformed(evt);
            }
        });

        jLabel7.setText("Semester");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1st", "2nd", "3rd", "4th", "5th", "6th", "7th", "8th", " " }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addGap(469, 469, 469))
            .addGroup(layout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(138, 138, 138)
                        .addComponent(txtSid, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_find_student)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 707, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 109, Short.MAX_VALUE)
                                        .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(17, 17, 17)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel3)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel5)
                                                .addComponent(jLabel4)
                                                .addComponent(jLabel6)
                                                .addComponent(jLabel7)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtroll, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 378, Short.MAX_VALUE)
                                            .addComponent(txt_bookid, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(cmbbranch, javax.swing.GroupLayout.DEFAULT_SIZE, 305, Short.MAX_VALUE)
                                            .addComponent(cmbyear)
                                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(136, 136, 136)
                                .addComponent(jButton1))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtDate)))
                        .addGap(71, 71, 71)
                        .addComponent(jButton2)
                        .addGap(153, 153, 153))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtDate))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabel9))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_find_student)
                            .addComponent(txtSid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtroll, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(cmbyear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(cmbbranch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(jButton2))
                        .addGap(35, 35, 35)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_bookid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(97, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtrollActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtrollActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtrollActionPerformed

    private void txtnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnameActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtSidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSidActionPerformed

    private void btn_find_studentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_find_studentActionPerformed

        // find student coding start here
        try {
            Connection co = Database.MySqlConnection();
            PreparedStatement st = co.prepareStatement("select name,rollno,year,branchname from studentdb where id=?");
            st.setInt(1, Integer.parseInt(txtSid.getText()));
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                txtname.setText(rs.getString("name"));
                txtroll.setText(rs.getString("rollno"));
                cmbyear.setText(rs.getString("year"));
                cmbbranch.setText(rs.getString("branchname"));

            } else {
                JOptionPane.showMessageDialog(null, "Data not found");
            }
        } catch (SQLException ex) {
            Logger.getLogger(book_issue.class.getName()).log(Level.SEVERE, null, ex);
        }
        // find student coding end here


    }//GEN-LAST:event_btn_find_studentActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        // add book coding start here
        DefaultTableModel tm = (DefaultTableModel) book_table.getModel();

        try {
            Connection co = Database.MySqlConnection();
            PreparedStatement st = co.prepareStatement("select bookid,booktittle,bookauthor,bookpublisher,availablestock from bookdb where booKid=?");
            st.setInt(1, Integer.parseInt(txt_bookid.getText()));
            ResultSet rs = st.executeQuery();

            Object[] row = new Object[5];

            if (rs.next()) {
                row[0] = rs.getInt("bookid");
                row[1] = rs.getString("booktittle");
                row[2] = rs.getString("bookauthor");
                row[3] = rs.getString("bookpublisher");
                row[4] = rs.getString("availablestock");

                if (rs.getString("availablestock").equalsIgnoreCase("YES")) {
                    tm.addRow(row);
                    bookIdList.add(txt_bookid.getText());
                    txt_bookid.setText("");
                } else {
                    JOptionPane.showMessageDialog(null, "Book is not available");

                }
            } else {
                JOptionPane.showMessageDialog(null, "book id not foud");
            }
        } catch (SQLException ex) {
            Logger.getLogger(book_issue.class.getName()).log(Level.SEVERE, null, ex);
        }
        // add book coding end here
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Connection co = Database.MySqlConnection();
        try {
            int rows=0;
            PreparedStatement st = co.prepareStatement("insert into issuebook(student_id,book_id,issue_date) values(?,?,?)");
            for (String id : bookIdList) {
                st.setString(1, txtSid.getText());
                st.setString(2, id);
                st.setString(3, txtDate.getText());
                rows = st.executeUpdate();
            }
            if (rows > 0) {
                JOptionPane.showMessageDialog(null, "Book is succesfully issue");
                dispose();
            } else {
                JOptionPane.showMessageDialog(null, "Book is not successfully issue");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }


    }//GEN-LAST:event_jButton1ActionPerformed

    private void cmbyearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbyearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbyearActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable book_table;
    private javax.swing.JButton btn_find_student;
    private javax.swing.JTextField cmbbranch;
    private javax.swing.JTextField cmbyear;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel txtDate;
    private javax.swing.JTextField txtSid;
    private javax.swing.JTextField txt_bookid;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txtroll;
    // End of variables declaration//GEN-END:variables
}
