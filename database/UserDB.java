package sita.database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author sita kumari
 */
public class UserDB {

    private static final String ADD_INSERT = "INSERT INTO USERDB (USERNAME,PASSWORD) VALUES(?,?)";
    private static final String DISPLAY = "SELECT * FROM USERDB";
    private static final String FIND_USER = "SELECT USERNAME,PASSWORD FROM USERDB WHERE USERNAME=? AND PASSWORD=?";

    private Connection con = null;
    private PreparedStatement pst = null;
    private ResultSet rs = null;

    public boolean isUserExist(User user) {
        try {
            con = Database.MySqlConnection();
            pst = con.prepareStatement(FIND_USER);
            pst.setString(1, user.getUsername());
            pst.setString(2, user.getPassword());
            rs = pst.executeQuery();
            if (rs.next()) {
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(UserDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
}
