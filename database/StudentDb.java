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
public class StudentDb {
    private static final String ADD_STUDENT = "INSERT INTO STUDENTDB (NAME,FATHERNAME,ROLLNO,BRANCHNAME,YEAR,SECTION,DATEOFBIRTH,EMAIL,CONTACTNO,ADDRESSNAME) VALUES (?,?,?,?,?,?,?,?,?,?)";
    private static final String All_STUDENT = "SELECT * FROM STUDENTDB";
    private static final String FIND_STUDENT = "SELECT * FROM STUDENTDB WHERE id=?";
    private static final String LAST_ID = "SELECT ID FROM STUDENTDB ORDER BY ID DESC";
    private static final String DELETE_STUDENT = "DELETE FROM STUDENTDB WHERE ID=?";
    public static final String FIND_STUDENT_YEAR = "SELECT * FROM STUDENTDB WHERE YEAR=?";
    public static final String FIND_STUDENT_BRANCH = "SELECT * FROM STUDENTDB WHERE BRANCHNAME=?";
    public static final String FIND_STUDENT_YERA_AND_BRANCH = "SELECT * FROM STUDENTDB WHERE YEAR=? AND BRANCHNAME=?";
    private static final String UPDATE_STUDENT="UPDATE STUDENTDB SET NAME=?,FATHERNAME=?,ROLLNO=?,BRANCHNAME=?,YEAR=?,SECTION=?,DATEOFBIRTH=?,EMAIL=?,CONTACTNO=?,ADDRESSNAME=? WHERE ID=?";
    private static final String SEARCH="SELECT * FROM STUDENTDB WHERE NAME=? AND ROLLNO=?";
    private Connection con = null;
    private PreparedStatement pst = null;
    private ResultSet rs = null;
    private ArrayList<Student> aList;
    private Student student;
    public StudentDb() {
        con = Database.MySqlConnection();
    }
    public void addStudent(Student student) {
        try {
            pst = con.prepareStatement(ADD_STUDENT);
            pst.setString(1, student.getStudentname());
            pst.setString(2, student.getFathername());
            pst.setString(3, student.getRollno());
            pst.setString(4, student.getBranchname());
            pst.setString(5, student.getYear());
            pst.setString(6, student.getSection());
            pst.setString(7, student.getDateofbirth());
            pst.setString(8, student.getEmail());
            pst.setString(9, student.getContactno());
            pst.setString(10, student.getAddressname());
            int row = pst.executeUpdate();
            if (row > 0) {
                JOptionPane.showMessageDialog(null, "Record saved", "Message", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Record not saved", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    public ArrayList<Student> allstudent() {
        aList = new ArrayList<>();
        try {
            pst = con.prepareStatement(All_STUDENT);
            rs = pst.executeQuery();
            while (rs.next()) {
                setStudent(rs);
                aList.add(student);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        return aList;
    }
    public ArrayList<Student> searchStudent(String name,String roll) {
        aList = new ArrayList<>();
        try {
            pst = con.prepareStatement(SEARCH);
           pst.setString(1,name);
           pst.setString(2, roll);
            rs = pst.executeQuery();
            while (rs.next()) {
                setStudent(rs);
                aList.add(student);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        return aList;
    }
    public int getLastId() {
        try {
            pst = con.prepareStatement(LAST_ID);
            rs = pst.executeQuery();
            if (rs.next()) {
                return rs.getInt("id");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        return 0;
    }
    public Student findStudent(int id) {
        try {
            pst = con.prepareStatement(FIND_STUDENT);
            pst.setInt(1, id);
            rs = pst.executeQuery();
            if (rs.next()) {
                setStudent(rs);

            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        return student;
    }
    private void setStudent(ResultSet rs) {
        try {
            student = new Student();
            student.setStudentId(rs.getInt("id"));
            student.setStudentname(rs.getString("name"));
            student.setFathername(rs.getString("fathername"));
            student.setRollno(rs.getString("rollno"));
            student.setBranchname(rs.getString("branchname"));
            student.setYear(rs.getString("year"));
            student.setSection(rs.getString("section"));
            student.setDateofbirth(rs.getString("dateofbirth"));
            student.setEmail(rs.getString("email"));
            student.setContactno(rs.getString("contactno"));
            student.setAddressname(rs.getString("addressname"));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }
    public void deleteStudent(int id) {
        try {
            pst = con.prepareStatement(DELETE_STUDENT);
            pst.setInt(1, id);
            int row = pst.executeUpdate();
            if (row > 0) {
                JOptionPane.showMessageDialog(null, "Student deleted.");
            } else {
                JOptionPane.showMessageDialog(null, "Student not deleted.");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }

    public ArrayList<Student> findStudent(String sql, String... arg) {
        aList.clear();
        try {
            pst = con.prepareStatement(sql);
            for (int i = 1; i <= arg.length; i++) {
                pst.setString(i, arg[i - 1]);
            }
            rs = pst.executeQuery();
            while (rs.next()) {
                student = new Student();
                student.setStudentId(rs.getInt("id"));
                student.setStudentname(rs.getString("name"));
                student.setFathername(rs.getString("fathername"));
                student.setRollno(rs.getString("rollno"));
                student.setBranchname(rs.getString("branchname"));
                student.setYear(rs.getString("year"));
                student.setSection(rs.getString("section"));
                student.setDateofbirth(rs.getString("dateofbirth"));
                student.setEmail(rs.getString("email"));
                student.setContactno(rs.getString("contactno"));
                student.setAddressname(rs.getString("addressname"));
                aList.add(student);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        return aList;
    }

    public void updateStudent(Student student) {
         try {
            pst = con.prepareStatement(UPDATE_STUDENT);
            pst.setString(1, student.getStudentname());
            pst.setString(2, student.getFathername());
            pst.setString(3, student.getRollno());
            pst.setString(4, student.getBranchname());
            pst.setString(5, student.getYear());
            pst.setString(6, student.getSection());
            pst.setString(7, student.getDateofbirth());
            pst.setString(8, student.getEmail());
            pst.setString(9, student.getContactno());
            pst.setString(10, student.getAddressname());
            pst.setInt(11, student.getStudentId());
            int row = pst.executeUpdate();
            if (row > 0) {
                JOptionPane.showMessageDialog(null, "Student updated.");
            } else {
                JOptionPane.showMessageDialog(null, "Student not updated.");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }
}
