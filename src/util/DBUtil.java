/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;
import java.text.SimpleDateFormat;
import com.sun.rowset.CachedRowSetImpl;
import java.sql.*;
import User.User;
import java.util.concurrent.Executors;
/**
 *
 * @author Timothy
 */
public class DBUtil {
    //Declare JDBC Driver
    private static final String MYSQL_DRIVER = "com.mysql.jdbc.Driver";

    //Connection
    private static Connection conn = null;
    private static final String DRIVER = "com.mysql.jdbc.Driver";
    private static final String DB = "U03wXf";
    private static final String URL = "jdbc:mysql://52.206.157.109/" + DB +"";
    private static String user = "U03wXf";
    private static String pass = "53688106517";


    //Connect to DB
    public static Connection dbConnect() throws Exception, ClassNotFoundException{
        //Setting MySql JDBC Driver
        try {
            Class.forName(MYSQL_DRIVER).newInstance();
            System.out.println("MySql JDBC Driver Registered!");
            conn = DriverManager.getConnection(URL,user,pass);
            conn.setNetworkTimeout(Executors.newFixedThreadPool(5) , 1000);
        } catch (SQLException e) {
            System.out.println("Connection Failed! Check output console" + e);
            e.printStackTrace();
            throw e;
        }
        return conn;

        

        //Establish the MySql Connection using Connection String

    }

    //Close Connection
    public static void dbDisconnect() throws SQLException {
        try {
            if (conn != null && !conn.isClosed()) {
                conn.close();
            }
        } catch (SQLException e){
           throw e;
        }
    }

    //DB Execute Query Operation
    public static ResultSet dbExecuteQuery(String queryStmt) throws Exception, ClassNotFoundException {
        //Declare statement, resultSet and CachedResultSet as null
        Statement stmt = null;
        ResultSet resultSet = null;
        CachedRowSetImpl crs = null;
        try {
            //Connect to DB (Establish Oracle Connection)
            dbConnect();
            System.out.println("Select statement: " + queryStmt + "\n");

            //Create statement
            stmt = conn.createStatement();

            //Execute select (query) operation
            resultSet = stmt.executeQuery(queryStmt);

            //CachedRowSet Implementation
            //In order to prevent "java.sql.SQLRecoverableException: Closed Connection: next" error
            //We are using CachedRowSet
            crs = new CachedRowSetImpl();
            crs.populate(resultSet);
        } catch (SQLException e) {
            System.out.println("Problem occurred at executeQuery operation : " + e);
            throw e;
        } finally {
            if (resultSet != null) {
                //Close resultSet
                resultSet.close();
            }
            if (stmt != null) {
                //Close Statement
                stmt.close();
            }
        }
        //Return CachedRowSet
        return crs;
    }

    //DB Execute Update (For Update/Insert/Delete) Operation
    public static void dbExecuteUpdate(String sql, Object... values) throws Exception, ClassNotFoundException {
        //Declare statement as null
        Statement stmt = null;
        try {
            //Connect to DB (Establish Oracle Connection)
            dbConnect();
            //Create Statement
            
            //Run executeUpdate operation with given sql statement
            
        } catch (SQLException e) {
            System.out.println("Problem occurred at executeUpdate operation : " + e);
            throw e;
        } finally {
            if (stmt != null) {
                //Close statement
                stmt.close();
            }
            //Close connection
            dbDisconnect();
        }
    }
//    public static User dbGetUser(String sql, Object... values) throws Exception, ClassNotFoundException {
//        //Declare statement as null
//        ResultSet results = null;
//        User loginUser = null;
//        try {
//            
//            //Connect to DB (Establish Oracle Connection)
//            dbConnect();
//            //Create Statement
//            PreparedStatement statement = prepareStatement(sql, values);
//            System.out.println(statement);
//            //Run executeUpdate operation with given sql statement
//            results = statement.executeQuery();
//            System.out.println(results);
//            loginUser = loginUser.map(results);
//        } catch (SQLException e) {
//            System.out.println("Problem occurred at executeUpdate operation : " + e);
//            throw e;
//        } finally {
//            System.out.println(loginUser.getpassword());
//            //else results = null;
//            //Close connection
//            dbDisconnect();
//        }
//        return loginUser;
//    }
    public static PreparedStatement prepareStatement(Connection connection, String sql, Object... values)
            throws SQLException
    {
        PreparedStatement statement = conn.prepareStatement(sql);
        setValues(statement, values);
        System.out.println(statement);
        return statement;
    }
    public static void setValues(PreparedStatement statement, Object... values)
        throws SQLException
    {
        for (int i = 0; i < values.length; i++) {
            System.out.println(values[i].toString());
            if(values[i] instanceof String){
                statement.setString(i + 1, values[i].toString());
            }
            else statement.setObject(i + 1, values[i]);
        }
    }
    public static Date toSqlDate(Date date) {
     return (date != null) ? new Date(date.getTime()) : null;
    }
}
