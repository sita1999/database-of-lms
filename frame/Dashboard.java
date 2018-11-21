package sita.frame;

import sita.dialog.AddStudent;
import sita.dialog.Add_Book;
import sita.dialog.AllBook;
import sita.dialog.AllRegStudent;
import sita.dialog.Return_book;
import sita.dialog.book_issue;
import sita.dialog.issuebook_history;
import sita.dialog.returnbook_history;
import sita.dialog.search_book;
import sita.dialog.search_student;

/**
 *
 * @author sita kumari
 */
public class Dashboard extends javax.swing.JFrame {

    public Dashboard() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TopPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        BottomPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        CenterPanel = new javax.swing.JPanel();
        btnDisplayBook = new javax.swing.JButton();
        btnAddBook = new javax.swing.JButton();
        btnAddStudent = new javax.swing.JButton();
        btnAllStudent = new javax.swing.JButton();
        btnIssueBookHistory = new javax.swing.JButton();
        btnSearchBook = new javax.swing.JButton();
        btnSearchStudent = new javax.swing.JButton();
        btnIssueBook = new javax.swing.JButton();
        btnReturnBookHistory = new javax.swing.JButton();
        btnReturnBook = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1276, 866));
        setPreferredSize(new java.awt.Dimension(1276, 866));
        setSize(new java.awt.Dimension(1276, 866));

        TopPanel.setBackground(new java.awt.Color(255, 255, 255));
        TopPanel.setPreferredSize(new java.awt.Dimension(1239, 86));

        jLabel1.setFont(new java.awt.Font("Algerian", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 204, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("LIBRARY MANAGEMENT SYSTEM");

        javax.swing.GroupLayout TopPanelLayout = new javax.swing.GroupLayout(TopPanel);
        TopPanel.setLayout(TopPanelLayout);
        TopPanelLayout.setHorizontalGroup(
            TopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TopPanelLayout.createSequentialGroup()
                .addContainerGap(75, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1082, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(84, Short.MAX_VALUE))
            .addComponent(jSeparator1)
        );
        TopPanelLayout.setVerticalGroup(
            TopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TopPanelLayout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 5, Short.MAX_VALUE))
        );

        getContentPane().add(TopPanel, java.awt.BorderLayout.PAGE_START);

        BottomPanel.setBackground(new java.awt.Color(255, 255, 255));
        BottomPanel.setPreferredSize(new java.awt.Dimension(1239, 26));

        jLabel2.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        jLabel2.setText("Design & Develop By : Sita Kumari");

        javax.swing.GroupLayout BottomPanelLayout = new javax.swing.GroupLayout(BottomPanel);
        BottomPanel.setLayout(BottomPanelLayout);
        BottomPanelLayout.setHorizontalGroup(
            BottomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BottomPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 610, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(619, Short.MAX_VALUE))
        );
        BottomPanelLayout.setVerticalGroup(
            BottomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
        );

        getContentPane().add(BottomPanel, java.awt.BorderLayout.PAGE_END);

        CenterPanel.setBackground(new java.awt.Color(255, 255, 255));
        CenterPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnDisplayBook.setBackground(new java.awt.Color(51, 153, 255));
        btnDisplayBook.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        btnDisplayBook.setForeground(new java.awt.Color(255, 255, 255));
        btnDisplayBook.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sita/images/icons8-book-filled-50 (1).png"))); // NOI18N
        btnDisplayBook.setText("All Books");
        btnDisplayBook.setBorder(null);
        btnDisplayBook.setBorderPainted(false);
        btnDisplayBook.setContentAreaFilled(false);
        btnDisplayBook.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDisplayBook.setFocusPainted(false);
        btnDisplayBook.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnDisplayBook.setIconTextGap(10);
        btnDisplayBook.setOpaque(true);
        btnDisplayBook.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnDisplayBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDisplayBookActionPerformed(evt);
            }
        });
        CenterPanel.add(btnDisplayBook, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 120, 220, 140));

        btnAddBook.setBackground(new java.awt.Color(51, 153, 255));
        btnAddBook.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        btnAddBook.setForeground(new java.awt.Color(255, 255, 255));
        btnAddBook.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sita/images/icons8-book-filled-50 (1).png"))); // NOI18N
        btnAddBook.setText("Add Book");
        btnAddBook.setBorder(null);
        btnAddBook.setBorderPainted(false);
        btnAddBook.setContentAreaFilled(false);
        btnAddBook.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAddBook.setFocusPainted(false);
        btnAddBook.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAddBook.setIconTextGap(10);
        btnAddBook.setOpaque(true);
        btnAddBook.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnAddBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddBookActionPerformed(evt);
            }
        });
        CenterPanel.add(btnAddBook, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 120, 220, 140));

        btnAddStudent.setBackground(new java.awt.Color(51, 153, 255));
        btnAddStudent.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        btnAddStudent.setForeground(new java.awt.Color(255, 255, 255));
        btnAddStudent.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sita/images/addStudent.png"))); // NOI18N
        btnAddStudent.setText("Add Student");
        btnAddStudent.setBorder(null);
        btnAddStudent.setBorderPainted(false);
        btnAddStudent.setContentAreaFilled(false);
        btnAddStudent.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAddStudent.setFocusPainted(false);
        btnAddStudent.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAddStudent.setIconTextGap(10);
        btnAddStudent.setOpaque(true);
        btnAddStudent.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnAddStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddStudentActionPerformed(evt);
            }
        });
        CenterPanel.add(btnAddStudent, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 120, 220, 140));

        btnAllStudent.setBackground(new java.awt.Color(51, 153, 255));
        btnAllStudent.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        btnAllStudent.setForeground(new java.awt.Color(255, 255, 255));
        btnAllStudent.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sita/images/icons8-children-filled-50_1.png"))); // NOI18N
        btnAllStudent.setText("All Registerd Student");
        btnAllStudent.setBorder(null);
        btnAllStudent.setBorderPainted(false);
        btnAllStudent.setContentAreaFilled(false);
        btnAllStudent.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAllStudent.setFocusPainted(false);
        btnAllStudent.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAllStudent.setIconTextGap(10);
        btnAllStudent.setOpaque(true);
        btnAllStudent.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnAllStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAllStudentActionPerformed(evt);
            }
        });
        CenterPanel.add(btnAllStudent, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 120, 220, 140));

        btnIssueBookHistory.setBackground(new java.awt.Color(51, 153, 255));
        btnIssueBookHistory.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        btnIssueBookHistory.setForeground(new java.awt.Color(255, 255, 255));
        btnIssueBookHistory.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sita/images/icons8-double-right-filled-50.png"))); // NOI18N
        btnIssueBookHistory.setText("Issue Book History");
        btnIssueBookHistory.setBorder(null);
        btnIssueBookHistory.setBorderPainted(false);
        btnIssueBookHistory.setContentAreaFilled(false);
        btnIssueBookHistory.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnIssueBookHistory.setFocusPainted(false);
        btnIssueBookHistory.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnIssueBookHistory.setIconTextGap(10);
        btnIssueBookHistory.setOpaque(true);
        btnIssueBookHistory.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnIssueBookHistory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIssueBookHistoryActionPerformed(evt);
            }
        });
        CenterPanel.add(btnIssueBookHistory, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 440, 220, 140));

        btnSearchBook.setBackground(new java.awt.Color(51, 153, 255));
        btnSearchBook.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        btnSearchBook.setForeground(new java.awt.Color(255, 255, 255));
        btnSearchBook.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sita/images/icons8-books-filled-50.png"))); // NOI18N
        btnSearchBook.setText("Search Book");
        btnSearchBook.setBorder(null);
        btnSearchBook.setBorderPainted(false);
        btnSearchBook.setContentAreaFilled(false);
        btnSearchBook.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSearchBook.setFocusPainted(false);
        btnSearchBook.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSearchBook.setIconTextGap(10);
        btnSearchBook.setOpaque(true);
        btnSearchBook.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnSearchBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchBookActionPerformed(evt);
            }
        });
        CenterPanel.add(btnSearchBook, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 290, 220, 140));

        btnSearchStudent.setBackground(new java.awt.Color(51, 153, 255));
        btnSearchStudent.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        btnSearchStudent.setForeground(new java.awt.Color(255, 255, 255));
        btnSearchStudent.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sita/images/icons8-student-male-50.png"))); // NOI18N
        btnSearchStudent.setText("Search Student");
        btnSearchStudent.setBorder(null);
        btnSearchStudent.setBorderPainted(false);
        btnSearchStudent.setContentAreaFilled(false);
        btnSearchStudent.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSearchStudent.setFocusPainted(false);
        btnSearchStudent.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSearchStudent.setIconTextGap(10);
        btnSearchStudent.setOpaque(true);
        btnSearchStudent.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnSearchStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchStudentActionPerformed(evt);
            }
        });
        CenterPanel.add(btnSearchStudent, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 290, 220, 140));

        btnIssueBook.setBackground(new java.awt.Color(51, 153, 255));
        btnIssueBook.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        btnIssueBook.setForeground(new java.awt.Color(255, 255, 255));
        btnIssueBook.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sita/images/icons8-book-filled-50 (2).png"))); // NOI18N
        btnIssueBook.setText("Issue Book");
        btnIssueBook.setBorder(null);
        btnIssueBook.setBorderPainted(false);
        btnIssueBook.setContentAreaFilled(false);
        btnIssueBook.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnIssueBook.setFocusPainted(false);
        btnIssueBook.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnIssueBook.setIconTextGap(10);
        btnIssueBook.setOpaque(true);
        btnIssueBook.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnIssueBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIssueBookActionPerformed(evt);
            }
        });
        CenterPanel.add(btnIssueBook, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 290, 220, 140));

        btnReturnBookHistory.setBackground(new java.awt.Color(51, 153, 255));
        btnReturnBookHistory.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        btnReturnBookHistory.setForeground(new java.awt.Color(255, 255, 255));
        btnReturnBookHistory.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sita/images/icons8-double-left-filled-50.png"))); // NOI18N
        btnReturnBookHistory.setText("Return Book History");
        btnReturnBookHistory.setBorder(null);
        btnReturnBookHistory.setBorderPainted(false);
        btnReturnBookHistory.setContentAreaFilled(false);
        btnReturnBookHistory.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnReturnBookHistory.setFocusPainted(false);
        btnReturnBookHistory.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnReturnBookHistory.setIconTextGap(10);
        btnReturnBookHistory.setOpaque(true);
        btnReturnBookHistory.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnReturnBookHistory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReturnBookHistoryActionPerformed(evt);
            }
        });
        CenterPanel.add(btnReturnBookHistory, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 440, 220, 140));

        btnReturnBook.setBackground(new java.awt.Color(51, 153, 255));
        btnReturnBook.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        btnReturnBook.setForeground(new java.awt.Color(255, 255, 255));
        btnReturnBook.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sita/images/icons8-bill-filled-50.png"))); // NOI18N
        btnReturnBook.setText("Return Book");
        btnReturnBook.setBorder(null);
        btnReturnBook.setBorderPainted(false);
        btnReturnBook.setContentAreaFilled(false);
        btnReturnBook.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnReturnBook.setFocusPainted(false);
        btnReturnBook.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnReturnBook.setIconTextGap(10);
        btnReturnBook.setOpaque(true);
        btnReturnBook.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnReturnBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReturnBookActionPerformed(evt);
            }
        });
        CenterPanel.add(btnReturnBook, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 290, 220, 140));

        getContentPane().add(CenterPanel, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddBookActionPerformed
        new Add_Book(this, true, true).setVisible(true);
    }//GEN-LAST:event_btnAddBookActionPerformed

    private void btnDisplayBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDisplayBookActionPerformed
        new AllBook(this, true).setVisible(true);
    }//GEN-LAST:event_btnDisplayBookActionPerformed

    private void btnAddStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddStudentActionPerformed
        new AddStudent(this, true, true).setVisible(true);
    }//GEN-LAST:event_btnAddStudentActionPerformed

    private void btnAllStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAllStudentActionPerformed
        // TODO add your handling code here:
        new AllRegStudent(this, true).setVisible(true);
    }//GEN-LAST:event_btnAllStudentActionPerformed

    private void btnIssueBookHistoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIssueBookHistoryActionPerformed
        new issuebook_history(this,true).setVisible(true);
    }//GEN-LAST:event_btnIssueBookHistoryActionPerformed

    private void btnSearchBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchBookActionPerformed
       new search_book(this, true).setVisible(true);
    }//GEN-LAST:event_btnSearchBookActionPerformed

    private void btnSearchStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchStudentActionPerformed
       new search_student(this, true).setVisible(true);
    }//GEN-LAST:event_btnSearchStudentActionPerformed

    private void btnReturnBookHistoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReturnBookHistoryActionPerformed
        new returnbook_history(this,true).setVisible(true);
    }//GEN-LAST:event_btnReturnBookHistoryActionPerformed

    private void btnReturnBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReturnBookActionPerformed
        new Return_book(this, true).setVisible(true);
    }//GEN-LAST:event_btnReturnBookActionPerformed

    private void btnIssueBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIssueBookActionPerformed
        new book_issue(this, true).setVisible(true);
    }//GEN-LAST:event_btnIssueBookActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BottomPanel;
    private javax.swing.JPanel CenterPanel;
    private javax.swing.JPanel TopPanel;
    private javax.swing.JButton btnAddBook;
    private javax.swing.JButton btnAddStudent;
    private javax.swing.JButton btnAllStudent;
    private javax.swing.JButton btnDisplayBook;
    private javax.swing.JButton btnIssueBook;
    private javax.swing.JButton btnIssueBookHistory;
    private javax.swing.JButton btnReturnBook;
    private javax.swing.JButton btnReturnBookHistory;
    private javax.swing.JButton btnSearchBook;
    private javax.swing.JButton btnSearchStudent;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
