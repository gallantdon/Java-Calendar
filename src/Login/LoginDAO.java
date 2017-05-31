/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Login;
import static util.DBUtil.*;
import java.sql.ResultSet;
import java.sql.*;
import User.User;
import util.DBUtil;

/**
 *
 * @author Timothy
 */
public class LoginDAO {
    public static User getUser (String userName, String password) throws Exception, ClassNotFoundException {
        User user = null;
        //Declare a INSERT statement
        String SQL_Query =
        "SELECT * FROM U03wXf.user WHERE userName = ? AND password = ?";

        Object[] values = {
            userName,
            password,                
        };
        //Execute Instrt operation
        try {
            Connection conn = DBUtil.dbConnect();
            PreparedStatement statement = prepareStatement(conn, SQL_Query, values);
            ResultSet resultSet = statement.executeQuery();
            
            if (resultSet.next()) {
                user = map(resultSet);
            }
        } 
        catch (NullPointerException e) {
            System.out.print("Error occurred while Query Operation: " + e);
        }
        catch (Exception e) {
            System.out.print("Error occurred while Query Operation: " + e);
            throw e;
        }
        return user;
    }
    private static User map(ResultSet resultSet) throws SQLException {
        User user = new User();
        
        user.setUserId(resultSet.getInt("userId"));
        user.setUserName(resultSet.getString("userName"));
        user.setPassword(resultSet.getString("password"));
        user.setCreateBy(resultSet.getString("createBy"));
        user.setLastUpdatedBy(resultSet.getString("lastUpdatedBy"));
        return user;
    }
    
}
