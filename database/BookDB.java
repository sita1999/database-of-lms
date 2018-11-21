package sita.database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author sita kumari
 */
public class BookDB {

    private static final String ADD_BOOK = "INSERT INTO BOOKDB (BOOKID,BOOKTITTLE,BOOKCATEGORY,BOOKAUTHOR,BOOKPUBLISHER,AVAILABLESTOCK,YEAR,BRANCH,SEMESTER) VALUES (?,?,?,?,?,?,?,?,?)";
    private static final String All_BOOK = "SELECT * FROM BOOKDB";
    private static final String FIND_BOOK = "SELECT * FROM BOOKDB WHERE BOOKID=?";
    public static final String FIND_BOOK_YEAR = "SELECT * FROM BOOKDB WHERE YEAR=?";
    public static final String FIND_BOOK_BRANCH = "SELECT * FROM BOOKDB WHERE BRANCH=?";
    public static final String FIND_BOOK_YEAR_AND_BRANCH = "SELECT * from bookdb where year=? and branch=?";
    private static final String DELETE_BOOK="DELETE FROM BOOKDB WHERE BOOKID=?";
    private static final String UPDATE_BOOK="UPDATE BOOKDB SET BOOKID=?,BOOKTITTLE=?,BOOKCATEGORY=?,BOOKAUTHOR=?,BOOKPUBLISHER=?,AVAILABLESTOCK=?,YEAR=? WHERE BOOKID=?";
    private Connection con = null;
    private PreparedStatement pst = null;
    private ResultSet rs = null;
    private ArrayList<Book> aList;
    private Book book;

    public BookDB() {
        con = Database.MySqlConnection();
        aList=new ArrayList<>();
    }

    public void addBook(Book book) {
        try {
            pst = con.prepareStatement(ADD_BOOK);
            pst.setInt(1, book.getBookid());
            pst.setString(2, book.getBooktittle());
            pst.setString(3, book.getBookcategory());
            pst.setString(4, book.getBookauthor());
            pst.setString(5, book.getBookpublisher());
            pst.setString(6, book.getAvailablestock());
            pst.setString(7, book.getYear());
            pst.setString(8, book.getBranchName());
             pst.setString(9, book.getSemester());
            int row = pst.executeUpdate();
            if (row > 0) {
                JOptionPane.showMessageDialog(null, "Book saved.");
            } else {
                JOptionPane.showMessageDialog(null, "Book not saved.");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }
    public void updateBook(Book book) {
        try {
            pst = con.prepareStatement(UPDATE_BOOK);
            pst.setInt(1, book.getBookid());
            pst.setString(2, book.getBooktittle());
            pst.setString(3, book.getBookcategory());
            pst.setString(4, book.getBookauthor());
            pst.setString(5, book.getBookpublisher());
            pst.setString(6, book.getAvailablestock());
            pst.setString(7, book.getYear());
            pst.setInt(8,book.getBookid());
            int row = pst.executeUpdate();
            if (row > 0) {
                JOptionPane.showMessageDialog(null, "Book updated.");
            } else {
                JOptionPane.showMessageDialog(null, "Book not updated.");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }
    public ArrayList<Book> allBook() {
        aList.clear();
        try {
            pst = con.prepareStatement(All_BOOK);
            rs = pst.executeQuery();
           while(rs.next()){
                book=new Book();
                book.setBookid(rs.getInt("bookid"));
                book.setBooktittle(rs.getString("booktittle"));
                book.setBookcategory(rs.getString("booKcategory"));
                book.setBookauthor(rs.getString("bookauthor"));
                book.setBookpublisher(rs.getString("booKpublisher"));
                book.setAvailablestock(rs.getString("availablestock"));
                book.setYear(rs.getString("year"));
                book.setBranchName(rs.getString("branch"));
                 book.setSemester(rs.getString("semester"));
                
                aList.add(book);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        return aList;
    }
    public Book findBook(int id){
        try {
            pst = con.prepareStatement(FIND_BOOK);
            pst.setInt(1, id);
            rs = pst.executeQuery();
           if(rs.next()){
                book=new Book();
                book.setBookid(rs.getInt("bookid"));
                book.setBooktittle(rs.getString("booktittle"));
                book.setBookcategory(rs.getString("booKcategory"));
                book.setBookauthor(rs.getString("bookauthor"));
                book.setBookpublisher(rs.getString("booKpublisher"));
                book.setAvailablestock(rs.getString("availablestock"));
                book.setYear(rs.getString("year"));
                book.setBranchName(rs.getString("branch"));
                 book.setSemester(rs.getString("semester"));
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        return book;
    }
    
    public void deleteBook(int id){
        try {
            pst = con.prepareStatement(DELETE_BOOK);
            pst.setInt(1, id);
            int row = pst.executeUpdate();
            if (row > 0) {
                JOptionPane.showMessageDialog(null, "Book deleted.");
            } else {
                JOptionPane.showMessageDialog(null, "Book not deleted.");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }
    
    
    public ArrayList<Book> findBook(String sql,String year){
        aList.clear();
        try {
            pst = con.prepareStatement(sql);
            
              pst.setString(1, year);
            rs = pst.executeQuery();
           while(rs.next()){
                book=new Book();
                book.setBookid(rs.getInt("bookid"));
                book.setBooktittle(rs.getString("booktittle"));
                book.setBookcategory(rs.getString("booKcategory"));
                book.setBookauthor(rs.getString("bookauthor"));
                book.setBookpublisher(rs.getString("booKpublisher"));
                book.setAvailablestock(rs.getString("availablestock"));
                book.setYear(rs.getString("year"));
                book.setBranchName(rs.getString("branch"));
                 book.setSemester(rs.getString("semester"));
                aList.add(book);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        return aList;
    }
    public ArrayList<Book> findBook(String sql,String year,String branch){
        aList.clear();
        try {
            pst = con.prepareStatement(sql);
             pst.setString(1, year);
              pst.setString(2, branch);
            rs = pst.executeQuery();
            
           while(rs.next()){
                book=new Book();
                book.setBookid(rs.getInt("bookid"));
                book.setBooktittle(rs.getString("booktittle"));
                book.setBookcategory(rs.getString("booKcategory"));
                book.setBookauthor(rs.getString("bookauthor"));
                book.setBookpublisher(rs.getString("booKpublisher"));
                book.setAvailablestock(rs.getString("availablestock"));
                book.setYear(rs.getString("year"));
                book.setBranchName(rs.getString("branch"));
                 book.setSemester(rs.getString("semester"));
                aList.add(book);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        return aList;
    }
}
