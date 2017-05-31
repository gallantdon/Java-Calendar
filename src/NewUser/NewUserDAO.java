/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NewUser;

/**
 *
 * @author Timothy
 */
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.TimeZone;
import static util.DBUtil.*;
import java.sql.SQLException;
import util.DBUtil;
 
public class NewUserDAO {
 
 
    //*************************************
    //INSERT new user
    //*************************************
    public static void insertNewUser (String userName, String password, String createdBy) throws Exception, ClassNotFoundException {
        //Declare a INSERT statement
        String SQL_INSERT =
            "INSERT INTO user (userName, password, createBy, active, createDate, lastUpdatedBy) VALUES (?, ?, ?, ?, ?, ?)";

        java.util.Date dt = new java.util.Date();

        java.text.SimpleDateFormat sdf = 
             new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        sdf.setTimeZone(TimeZone.getTimeZone("GMT"));
        String currentTime = sdf.format(dt);
        Object[] values = {
            userName,
            password,
            createdBy,
            1,
            currentTime,
            userName
                
        };
        //Execute Instrt operation
        try {
            Connection conn = DBUtil.dbConnect();
            PreparedStatement statement = prepareStatement(conn, SQL_INSERT, values);
            statement.executeUpdate();
            conn.close();
        } catch (SQLException e) {
            System.out.print("Error occurred while DELETE Operation: " + e);
            throw e;
        }
    }
    
}
