package sita.dialog;

import sita.database.Database;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author sita kumari
 */
public class Return_book extends javax.swing.JDialog {

   
    public Return_book(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        DateFormat df1=new SimpleDateFormat("dd-MM-YYYY");
        
       date.setText(df1.format(new Date()));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        rbooktable = new javax.swing.JTable();
        studentname = new javax.swing.JTextField();
        roll = new javax.swing.JTextField();
        bookid = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        add_btn = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        studentid = new javax.swing.JTextField();
        returnok = new javax.swing.JButton();
        cyear = new javax.swing.JTextField();
        cbranch = new javax.swing.JTextField();
        date = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel1.setText("RETURN BOOK :");

        jLabel2.setText("Student's Name");

        jLabel3.setText("Roll No.");

        jLabel4.setText("Year");

        jLabel5.setText("Branch");

        jLabel6.setText("Book Id");

        rbooktable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Book Id", "Book Author", "Book Tittle", "Book Publishier"
            }
        ));
        jScrollPane1.setViewportView(rbooktable);

        jButton1.setText("RETURN");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("CANCEL");

        add_btn.setText("ADD");
        add_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_btnActionPerformed(evt);
            }
        });

        jLabel7.setText("Student Id");

        returnok.setText("OK");
        returnok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnokActionPerformed(evt);
            }
        });

        cyear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cyearActionPerformed(evt);
            }
        });

        date.setText("Date");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(158, 158, 158)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6))
                                .addGap(113, 113, 113)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(roll, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE)
                                        .addComponent(studentname, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(bookid, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(cbranch)
                                                .addGap(33, 33, 33)))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(202, 202, 202)
                                                .addComponent(jButton1)
                                                .addGap(107, 107, 107)
                                                .addComponent(jButton2))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(39, 39, 39)
                                                .addComponent(add_btn))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(studentid, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(82, 82, 82)
                                        .addComponent(returnok))
                                    .addComponent(cyear, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(167, 167, 167)
                        .addComponent(jLabel7))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(146, 146, 146)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 749, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(141, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(186, 186, 186))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(date)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(studentid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(returnok)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(studentname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(roll, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cyear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(cbranch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(jButton2))
                        .addGap(20, 20, 20)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(bookid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(add_btn))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(93, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void returnokActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnokActionPerformed
         try {
            Connection co = Database.MySqlConnection();
            PreparedStatement st = co.prepareStatement(" select idissuebook,name,rollno,year,branchname from issuebook left join studentdb on issuebook.student_id=studentdb.id where studentdb.id=?");
            st.setInt(1, Integer.parseInt(studentid.getText()));
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                studentname.setText(rs.getString("name"));
                roll.setText(rs.getString("rollno"));
                cyear.setText(rs.getString("year"));
                cbranch.setText(rs.getString("branchname"));
                
            } else {
                JOptionPane.showMessageDialog(null, "Data not found");
            }
        } catch (SQLException ex) {
            Logger.getLogger(book_issue.class.getName()).log(Level.SEVERE, null, ex);
        }
      
    }//GEN-LAST:event_returnokActionPerformed

    private void add_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_btnActionPerformed
   DefaultTableModel tm = (DefaultTableModel) rbooktable.getModel();

        try {
            Connection co = Database.MySqlConnection();
            PreparedStatement st = co.prepareStatement("select bookid,booktittle,bookauthor,bookpublisher,availablestock from issuebook left join bookdb on issuebook.book_id=bookdb.booKid where issuebook.student_id=? and issuebook.book_id=?");
            st.setString(1,studentid.getText());
            st.setString(2,bookid.getText());
            
            ResultSet rs = st.executeQuery();
          
            Object[] row = new Object[5];

            if (rs.next()) {
                row[0] = rs.getInt("bookid");
                row[1] = rs.getString("booktittle");
                row[2]=rs.getString("bookauthor");
                row[3]=rs.getString("bookpublisher");
                row[4]=rs.getString("availablestock");
                tm.addRow(row);
            } else {
                JOptionPane.showMessageDialog(null, "Book is not Issue");
            }
        } catch (SQLException ex) {
            Logger.getLogger(book_issue.class.getName()).log(Level.SEVERE, null, ex);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_add_btnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       DefaultTableModel tm = (DefaultTableModel) rbooktable.getModel();
        try {
            // TODO add your handling code here:
            Connection co = Database.MySqlConnection();
            PreparedStatement st= co.prepareStatement("delete from issuebook where student_id=? and book_id=?");
            st.setString(1, studentid.getText());
            st.setString(2, bookid.getText());
            
          if(  st.executeUpdate()>0)            
            JOptionPane.showMessageDialog(null, "Book is Return");
          
          else{
               JOptionPane.showMessageDialog(null, "Book is not Return");
          }
          
            
        } catch (SQLException ex) {
            Logger.getLogger(Return_book.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void cyearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cyearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cyearActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add_btn;
    private javax.swing.JTextField bookid;
    private javax.swing.JTextField cbranch;
    private javax.swing.JTextField cyear;
    private javax.swing.JLabel date;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable rbooktable;
    private javax.swing.JButton returnok;
    private javax.swing.JTextField roll;
    private javax.swing.JTextField studentid;
    private javax.swing.JTextField studentname;
    // End of variables declaration//GEN-END:variables
}
