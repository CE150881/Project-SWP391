/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package context;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import static javax.swing.text.html.FormSubmitEvent.MethodType.POST;

/**
 *
 * @author msi-pc
 */
public class DBConnection {

    private static final String HOST = "localhost";
    private static final String PORT ="10";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "";
    private static final String DBNAME = "letrangdb-2";

//    public static Connection getConnection() throws SQLException, ClassNotFoundException {
//        Class.forName("com.mysql.cj.jdbc.Driver");
//        String url = "jdbc:mysql://" + HOST + ':' + PORT + '/' + DBNAME;
//        return DriverManager.getConnection(url, USERNAME, PASSWORD);
//
//    }

    public static ResultSet querySet(String query) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try {
            connection = getConnection();
            preparedStatement = connection.prepareStatement(query);
            resultSet = preparedStatement.executeQuery();
        } catch (Exception e) {
        }
        return resultSet;
    }
    
    
        public static Connection getConnection() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://"+ HOST +":"+ PORT +"/"+ DBNAME , USERNAME, PASSWORD);
            return conn;
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
 
 
    public static void main(String[] args) {

        try {
            String query = "select * from product";
            ResultSet resultSet = querySet(query);
            System.out.println(getConnection());
        } catch (Exception e) {
        }
    }
}
