package sita.dialog;

import sita.database.Database;
import static java.lang.ProcessBuilder.Redirect.from;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import sita.database.Book;
import sita.database.BookDB;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sita kumari
 */
public class search_book extends javax.swing.JDialog {

     DefaultTableModel model;
    private BookDB bookDB;
    public search_book(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        bookDB=new BookDB();
        model= (DefaultTableModel) searchtable.getModel();
        data(bookDB.allBook());
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        searchbook = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        bookid = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        searchtable = new javax.swing.JTable();
        refresh_btn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Algerian", 3, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 255));
        jLabel1.setText("SEARCH BOOK DETAILS :");

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 3, 36)); // NOI18N
        jLabel2.setText("Book Id :");

        searchbook.setText("SEARCH");
        searchbook.setPreferredSize(new java.awt.Dimension(50, 45));
        searchbook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchbookActionPerformed(evt);
            }
        });

        jButton2.setText("CANCEL");
        jButton2.setPreferredSize(new java.awt.Dimension(50, 45));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        bookid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookidActionPerformed(evt);
            }
        });

        searchtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Book Id", "Book Category", "Book Tittle", "Book Author", "Book Publisher", "Available Stock"
            }
        ));
        jScrollPane1.setViewportView(searchtable);

        refresh_btn.setText("REFRESH");
        refresh_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refresh_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(109, 109, 109)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 461, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(101, 101, 101)
                        .addComponent(bookid, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(129, 129, 129)
                        .addComponent(searchbook, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(refresh_btn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(147, Short.MAX_VALUE))
            .addComponent(jScrollPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(jLabel1)
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(bookid, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(searchbook, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(refresh_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 507, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bookidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bookidActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void searchbookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchbookActionPerformed
         data(bookDB.findBook(Integer.parseInt(bookid.getText())));
  
    }//GEN-LAST:event_searchbookActionPerformed

    public void data(ArrayList<Book> list){
        model.getDataVector().removeAllElements();
        searchtable.revalidate();
       Object rows[]=new Object[10];
       for(Book s1:list){
           rows[0]=s1.getBookid();
           rows[1]=s1.getBookcategory();
           rows[2]=s1.getBooktittle();
           rows[3]=s1.getBookauthor();
           rows[4]=s1.getBookpublisher();
           rows[5]=s1.getAvailablestock();
          
           model.addRow(rows);
       }
  
        
    }
     public void data(Book s1){
        model.getDataVector().removeAllElements();
        searchtable.revalidate();
       Object rows[]=new Object[10];
              rows[0]=s1.getBookid();
           rows[1]=s1.getBookcategory();
           rows[2]=s1.getBooktittle();
           rows[3]=s1.getBookauthor();
           rows[4]=s1.getBookpublisher();
           rows[5]=s1.getAvailablestock();
          
           model.addRow(rows);
     
  
        
    }
    
    private void refresh_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refresh_btnActionPerformed
        // TODO add your handling code here:
      data(bookDB.allBook());
    }//GEN-LAST:event_refresh_btnActionPerformed

  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField bookid;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton refresh_btn;
    private javax.swing.JButton searchbook;
    private javax.swing.JTable searchtable;
    // End of variables declaration//GEN-END:variables
}
