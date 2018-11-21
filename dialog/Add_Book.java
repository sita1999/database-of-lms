package sita.dialog;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import sita.database.Book;
import sita.database.BookDB;

/**
 *
 * @author sita kumari
 */
public class Add_Book extends javax.swing.JDialog {

    private BookDB bookDB;
    private Book book;

    public Add_Book(java.awt.Frame parent, boolean modal, boolean isAdd) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(parent);
        bookDB = new BookDB();
        book = new Book();
          DateFormat df1=new SimpleDateFormat("dd-MM-YYYY");
        
        date.setText(df1.format(new Date()));
        isAdd(isAdd);
    }

    public Add_Book(java.awt.Frame parent, boolean modal, boolean isAdd, int bookid) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(parent);
        bookDB = new BookDB();
        book = new Book();
        isAdd(isAdd);
        loadData(bookid);
    }

    private void loadData(int id) {
        book = bookDB.findBook(id);
        bookid.setText(String.valueOf(book.getBookid()));
        bookcategory.setSelectedItem(book.getBookcategory());
        booktittle.setText(book.getBooktittle());
        bookauthor.setText(book.getBookauthor());
        bookpublisher.setText(book.getBookpublisher());
        cyear1.setSelectedItem(book.getYear());
        cbranch.setSelectedItem(book.getBranchName());
        availablestock.setText(book.getAvailablestock());
        csemster.setSelectedItem(book.getSemester());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        booktittle = new javax.swing.JTextField();
        bookcategory = new javax.swing.JComboBox<>();
        bookauthor = new javax.swing.JTextField();
        bookpublisher = new javax.swing.JTextField();
        availablestock = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        csemster = new javax.swing.JComboBox<>();
        cbranch = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        bookid = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        cyear1 = new javax.swing.JComboBox<>();
        date = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setBackground(new java.awt.Color(0, 153, 0));
        jLabel7.setFont(new java.awt.Font("Algerian", 2, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 0, 0));
        jLabel7.setText("add book details:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(87, 38, 244, 48));

        jLabel1.setText("Book Id");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(112, 166, 61, -1));

        jLabel2.setText("Book Category");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(112, 214, 105, -1));

        jLabel3.setText("Book Tittle");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(112, 262, -1, -1));

        jLabel4.setText("Book Author");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(112, 307, -1, -1));

        jLabel5.setText("Book Publisher");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(112, 352, -1, -1));

        jLabel8.setText("Available Stock");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(104, 423, -1, -1));
        getContentPane().add(booktittle, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 260, 472, -1));

        bookcategory.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(bookcategory, new org.netbeans.lib.awtextra.AbsoluteConstraints(222, 211, 472, -1));
        getContentPane().add(bookauthor, new org.netbeans.lib.awtextra.AbsoluteConstraints(222, 304, 472, -1));
        getContentPane().add(bookpublisher, new org.netbeans.lib.awtextra.AbsoluteConstraints(222, 349, 472, -1));
        getContentPane().add(availablestock, new org.netbeans.lib.awtextra.AbsoluteConstraints(222, 423, 472, -1));

        btnAdd.setBackground(new java.awt.Color(255, 0, 0));
        btnAdd.setText("ADD");
        btnAdd.setFocusPainted(false);
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        getContentPane().add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(222, 617, 109, 47));

        btnCancel.setBackground(new java.awt.Color(255, 0, 0));
        btnCancel.setText("CANCEL");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(584, 617, 110, 47));

        csemster.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1st", "2nd", "3rd", "4th", "5th", "6th", "7th", "8th" }));
        getContentPane().add(csemster, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 510, 321, -1));

        cbranch.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CSE", "ECE", "CIVIL", "MECHANICAL" }));
        getContentPane().add(cbranch, new org.netbeans.lib.awtextra.AbsoluteConstraints(222, 544, 472, -1));

        jLabel6.setText("Semester");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 520, -1, -1));

        jLabel9.setText("Branch");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(144, 550, -1, -1));

        btnUpdate.setText("UPDATE");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        getContentPane().add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(338, 616, 115, 47));

        btnDelete.setText("DELETE");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        getContentPane().add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(465, 615, 112, 48));
        getContentPane().add(bookid, new org.netbeans.lib.awtextra.AbsoluteConstraints(222, 160, 472, -1));

        jLabel10.setText("Year");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(157, 481, -1, -1));

        cyear1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1st", "2nd", "3rd", "4th" }));
        getContentPane().add(cyear1, new org.netbeans.lib.awtextra.AbsoluteConstraints(222, 478, 321, -1));

        date.setText("Date");
        getContentPane().add(date, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 40, 40, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        book.setBookid(Integer.parseInt(bookid.getText()));
        book.setBookcategory(bookcategory.getSelectedItem().toString());
        book.setBooktittle(booktittle.getText());
        book.setBookauthor(bookauthor.getText());
        book.setBookpublisher(bookpublisher.getText());
        book.setYear(String.valueOf(csemster.getSelectedItem()));
        book.setBranchName(cbranch.getSelectedItem().toString());
        book.setAvailablestock(availablestock.getText());
        book.setSemester(csemster.getSelectedItem().toString());
        bookDB.addBook(book);
        dispose();
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        dispose();
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        book.setBookid(Integer.parseInt(bookid.getText()));
        book.setBookcategory(bookcategory.getSelectedItem().toString());
        book.setBooktittle(booktittle.getText());
        book.setBookauthor(bookauthor.getText());
        book.setBookpublisher(bookpublisher.getText());
        book.setYear(String.valueOf(csemster.getSelectedItem()));
        book.setAvailablestock(availablestock.getText());
        book.setSemester(csemster.getSelectedItem().toString());

        bookDB.updateBook(book);
        dispose();
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        bookDB.deleteBook(Integer.parseInt(bookid.getText()));
        dispose();
    }//GEN-LAST:event_btnDeleteActionPerformed
    private void isAdd(boolean value) {
        if (!value) {
            btnAdd.setVisible(false);
            btnUpdate.setVisible(true);
            btnDelete.setVisible(true);
        } else {
            btnUpdate.setVisible(false);
            btnDelete.setVisible(false);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField availablestock;
    private javax.swing.JTextField bookauthor;
    private javax.swing.JComboBox<String> bookcategory;
    private javax.swing.JTextField bookid;
    private javax.swing.JTextField bookpublisher;
    private javax.swing.JTextField booktittle;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> cbranch;
    private javax.swing.JComboBox<String> csemster;
    private javax.swing.JComboBox<String> cyear1;
    private javax.swing.JLabel date;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
