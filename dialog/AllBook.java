package sita.dialog;

import java.awt.Frame;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.table.DefaultTableModel;
import sita.database.Book;
import sita.database.BookDB;

/**
 *
 * @author sita kumari
 */
public class AllBook extends javax.swing.JDialog {

    private DefaultTableModel dtm;
    private Frame parent;
    private BookDB bookDB;
    private ArrayList<Book> list;

    public AllBook(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        this.parent = parent;
        bookDB = new BookDB();
        initComponents();
        setLocationRelativeTo(null);
        dtm = (DefaultTableModel) bookTable.getModel();
        loadData(bookDB.allBook());

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnRefresh = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        bookTable = new javax.swing.JTable();
        cmbBranch = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cmbYear = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 204));
        jLabel1.setText("LIST OF ALL BOOKS IN LIBRARY");

        btnRefresh.setText("Refresh");
        btnRefresh.setPreferredSize(new java.awt.Dimension(50, 45));
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });

        btnCancel.setText("CANCEL");
        btnCancel.setPreferredSize(new java.awt.Dimension(50, 45));
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        bookTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Book Id", "Book Category", "Book Author", "Book Tittle", "Book Publisher", "Availabe Stock"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        bookTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bookTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(bookTable);

        cmbBranch.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "All", "CSE", "ECE", "CIVIL", "MECHANICAL" }));
        cmbBranch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbBranchActionPerformed(evt);
            }
        });

        jLabel2.setText("Year:");

        jLabel3.setText("Branch");

        cmbYear.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "All", "1st", "2nd", "3rd", "4th" }));
        cmbYear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbYearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(377, 377, 377)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 589, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(180, 466, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(cmbYear, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmbBranch, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(btnRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmbBranch, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cmbYear, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 666, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        dispose();
    }//GEN-LAST:event_btnCancelActionPerformed

    private void bookTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bookTableMouseClicked
        if (evt.getClickCount() == 2) {
            int rowId = bookTable.getSelectedRow();
            int id = (int) dtm.getValueAt(rowId, 0);
            new Add_Book(parent, true, false, id).setVisible(true);
        }
    }//GEN-LAST:event_bookTableMouseClicked

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
       cmbYear.setSelectedItem("All");
        cmbBranch.setSelectedItem("All");
        loadData(bookDB.allBook());
    }//GEN-LAST:event_btnRefreshActionPerformed

    private void cmbBranchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbBranchActionPerformed
        String year = cmbYear.getSelectedItem().toString();
        String branch = cmbBranch.getSelectedItem().toString();
        if (branch.equalsIgnoreCase("All")) {
            if (year.equalsIgnoreCase("All")) {
                loadData(bookDB.allBook());
            } else {
                loadData(bookDB.findBook( BookDB.FIND_BOOK_YEAR,year));
            }
        } else {
            if (year.equalsIgnoreCase("All")) {
                loadData(bookDB.findBook( BookDB.FIND_BOOK_BRANCH,branch));
            }else{
                                loadData(bookDB.findBook(BookDB.FIND_BOOK_YEAR_AND_BRANCH,year,branch));
            }
        }
    }//GEN-LAST:event_cmbBranchActionPerformed

    private void cmbYearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbYearActionPerformed
        // TODO add your handling code here:
         String year = cmbYear.getSelectedItem().toString();
        String branch = cmbBranch.getSelectedItem().toString();
        if (year.equalsIgnoreCase("All")) {
            if (branch.equalsIgnoreCase("All")) {
                loadData(bookDB.allBook());
            } else {
                loadData(bookDB.findBook( BookDB.FIND_BOOK_BRANCH,branch));
            }
        } else {
            if (branch.equalsIgnoreCase("All")) {
                loadData(bookDB.findBook( BookDB.FIND_BOOK_YEAR,year));
            }else{
                loadData(bookDB.findBook(BookDB.FIND_BOOK_YEAR_AND_BRANCH,year,branch));
            }
        }
    }//GEN-LAST:event_cmbYearActionPerformed

    private void loadData(ArrayList<Book> li) {
        list = li;
        Object[] row = new Object[6];
        dtm.getDataVector().removeAllElements();
        bookTable.revalidate();
   
        for (Book book : list) {
            
            row[0] = book.getBookid();
            row[1] = book.getBookcategory();
            row[2] = book.getBookauthor();
            row[3] = book.getBooktittle();
            row[4] = book.getBookpublisher();
            row[5] = book.getAvailablestock();
            dtm.addRow(row);
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable bookTable;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JComboBox<String> cmbBranch;
    private javax.swing.JComboBox<String> cmbYear;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
