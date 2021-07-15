/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import Entity.Category;
import Entity.Food;
import Entity.User;
import context.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author msi-pc
 */
public class DAO {

    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;

    //get list of user
    public List<User> getAllUser() {
        List<User> list = new ArrayList<>();
        ResultSet resultSet = DBConnection.querySet("select * from user");
        if (resultSet != null) {
            try {
                while (resultSet.next()) {
                    list.add(new User(
                            resultSet.getString(1),
                            resultSet.getString(2),
                            resultSet.getString(3),
                            resultSet.getString(4),
                            resultSet.getString(5),
                            resultSet.getInt(6),
                            resultSet.getInt(7)
                    ));
                }
            } catch (Exception e) {
            }
        }
        return list;

    }

    //get list of food
    public List<Food> getAllFood() {
        List<Food> list = new ArrayList<>();
        ResultSet resultSet = DBConnection.querySet("select * from food");
        if (resultSet != null) {
            try {
                while (resultSet.next()) {
                    list.add(new Food(
                            resultSet.getInt(1),
                            resultSet.getString(2),
                            resultSet.getString(3),
                            resultSet.getInt(4),
                            resultSet.getInt(5)
                    ));
                }
            } catch (Exception e) {
            }
        }
        return list;

    }

    public List<Category> getAllCategory() {
        List<Category> list = new ArrayList<>();
        ResultSet resultSet = DBConnection.querySet("select * from category");
        if (resultSet != null) {
            try {
                while (resultSet.next()) {
                    list.add(new Category(
                            resultSet.getInt(1),
                            resultSet.getString(2)
                    ));
                }
            } catch (Exception e) {
            }
        }
        return list;

    }
    //get food with id

    public Food getFoodByID(String id) {
        String query = "SELECT * FROM Food WHERE FoodID = ?";
        try {
            conn = new DBConnection().getConnection();//mo ket noi voi sql
            ps = conn.prepareStatement(query);
            ps.setString(1, id);
            rs = ps.executeQuery();
            while (rs.next()) {
                return new Food(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getInt(4),
                        rs.getInt(5)
                );
            }
        } catch (Exception e) {
        }
        return null;
    }

    public List<Food> getFoodByCID(String categoryID) {
        List<Food> list = new ArrayList<>();
        String query = "SELECT * FROM Food WHERE categoryID = ?";
        try {
            conn = new DBConnection().getConnection(); // call function form DBconnection
            ps = conn.prepareStatement(query);
            ps.setString(1, categoryID);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Food(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getInt(4),
                        rs.getInt(5)
                ));
            }
        } catch (Exception e) {
        }
        return list;
    }
    // search name of food

    public List<Food> searchFoodByName(String txtSearch) {
        List<Food> list = new ArrayList<>();
        String query = "SELECT * FROM Food WHERE foodName LIKE ?";
        try {
            conn = new DBConnection().getConnection();   // call function form DBconnection
            ps = conn.prepareStatement(query);
            ps.setString(1, "%" + txtSearch + "%");
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Food(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getInt(4),
                        rs.getInt(5)
                ));
            }
        } catch (Exception e) {
        }
        return list;
    }
    //search name of user

    public List<User> searchUserByName(String txtSearch) {
        List<User> list = new ArrayList<>();
        String query = "SELECT * FROM User WHERE userName LIKE ?";
        try {
            conn = new DBConnection().getConnection();   // call function form DBconnection
            ps = conn.prepareStatement(query);
            ps.setString(1, "%" + txtSearch + "%");
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new User(
                        rs.getString(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getInt(6),
                        rs.getInt(7)));
            }
        } catch (Exception e) {
        }
        return list;
    }
    // get newest food

    public List<Food> getLastFood() {
        List<Food> list = new ArrayList<>();
        ResultSet resultSet = DBConnection.querySet("SELECT * FROM `Food` ORDER BY foodID DESC limit 2");
        if (resultSet != null) {
            try {
                while (resultSet.next()) {
                    list.add(new Food(
                            resultSet.getInt(1),
                            resultSet.getString(2),
                            resultSet.getString(3),
                            resultSet.getInt(4),
                            resultSet.getInt(5)
                    ));
                }
            } catch (Exception e) {
            }
        }
        return list;

    }

    // login to webpage
    public User login(String user, String pass) {
        String query = "SELECT * FROM User WHERE userName = ? AND password =?";
        try {
            conn = new DBConnection().getConnection();       // call function form DBconnection
            ps = conn.prepareStatement(query);
            ps.setString(1, user);
            ps.setString(2, pass);
            rs = ps.executeQuery();
            while (rs.next()) {
                return new User(
                        rs.getString(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getInt(6),
                        rs.getInt(7));
            }
        } catch (Exception e) {

        }
        return null;
    }

    //create new account
    public void signup(String userName, String password, String userPhone, String userEmail, String userGender) {
        String query = "INSERT INTO `user` (`userName`, `password`, `userPhone`, `userEmail`, `userGender`, `isSelf`, `isAdmin`) VALUES ( ?, ?, ?, ?, ?, '1', '0')";
        try {
            conn = new DBConnection().getConnection();       // call function form DBconnection
            ps = conn.prepareStatement(query);
            ps.setString(1, userName);
            ps.setString(2, password);
            ps.setString(3, userPhone);
            ps.setString(4, userEmail);
            ps.setString(5, userGender);
            ps.executeUpdate();

        } catch (Exception e) {

        }
    }

    // check if username exist
    public User checkAccountExist(String user) {
        String query = "SELECT * FROM user WHERE userName = ?";
        try {
            conn = new DBConnection().getConnection();       // call function form DBconnection
            ps = conn.prepareStatement(query);
            ps.setString(1, user);
            rs = ps.executeQuery();
            while (rs.next()) {
                return new User(
                        rs.getString(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getInt(6),
                        rs.getInt(7));
            }
        } catch (Exception e) {

        }
        return null;
    }

    public void insertBill(int billID, String userName, double total, String address) throws SQLException, ClassNotFoundException {
        Connection con = null;
        PreparedStatement ps = null;

        try {
            con = DBConnection.getConnection();
            String sql = "Insert into bill "
                    + "(billID, userName, total, address) "
                    + "Values (?,?,?,?)";
            ps = con.prepareStatement(sql);
            ps.setInt(1, billID);
            ps.setString(2, userName);
            ps.setDouble(3, total);
            ps.setString(4, address);
            System.out.println("5");
            ps.execute();
            System.out.println("6");
        } finally {
            if (con != null) {
                con.close();
            }
            if (ps != null) {
                ps.close();
            }
        }
    }

    public int getLastBillID() throws SQLException, ClassNotFoundException {
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            con = DBConnection.getConnection();
            String sql = "Select MAX(billID) "
                    + "From bill ";
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            if (rs.next()) {
                int billID = rs.getInt(1);
                return ++billID;
            }
        } finally {
            if (rs != null) {
                rs.close();
            }
            if (ps != null) {
                ps.close();
            }
            if (con != null) {
                con.close();
            }
        }
        return 0;
    }

    public void insertCart(int billID, int foodID, String foodName, int foodPrice, int quantity) throws SQLException, ClassNotFoundException {
        Connection con = null;
        PreparedStatement ps = null;
        try {
            con = DBConnection.getConnection();
            String sql = "Insert into cart "
                    + "(billID, foodID, foodName, foodPrice, quantity) "
                    + "Values (?,?,?,?,?)";
            ps = con.prepareStatement(sql);
            ps.setInt(1, billID);
            ps.setInt(2, foodID);
            ps.setString(3, foodName);
            ps.setInt(4, foodPrice);
            ps.setInt(5, quantity);
            ps.execute();
        } finally {
            if (ps != null) {
                ps.close();
            }
            if (con != null) {
                con.close();
            }
        }
    }
// get telephone 

    public String getTelephone(String username) throws SQLException, ClassNotFoundException {
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            con = DBConnection.getConnection();
            String sql = "Select userPhone "
                    + "From user "
                    + "Where userName = ?";
            ps = con.prepareStatement(sql);
            ps.setString(1, username);
            rs = ps.executeQuery();
            if (rs.next()) {
                return rs.getString(1);
            }
        } finally {
            if (rs != null) {
                rs.close();
            }
            if (ps != null) {
                ps.close();
            }
            if (con != null) {
                con.close();
            }
        }
        return null;
    }

    public boolean updateUser(String userEmail, String userPhone, String userGender, String userName) throws SQLException, ClassNotFoundException {
        Connection con = null;
        PreparedStatement ps = null;

        try {
            con = DBConnection.getConnection();
            String sql = "UPDATE user "
                    + "SET userEmail = ? , userPhone = ? , userGender = ? "
                    + "WHERE user.`userName` = ?";
            ps = con.prepareStatement(sql);
            ps.setString(1, userEmail);
            ps.setString(2, userPhone);
            ps.setString(3, userGender);
            ps.setString(4, userName);
            int row = ps.executeUpdate();
            if (row > 0) {
                return true;
            }
        } finally {
            if (con != null) {
                con.close();
            }
            if (ps != null) {
                ps.close();
            }
        }
        return false;
    }

    public boolean updatePassword(String password, String userName) throws SQLException, ClassNotFoundException {
        Connection con = null;
        PreparedStatement ps = null;

        try {
            con = DBConnection.getConnection();
            String sql = "UPDATE user "
                    + "SET password = ? "
                    + "WHERE user.`userName` = ?";
            ps = con.prepareStatement(sql);
            ps.setString(1, password);
            ps.setString(2, userName);
            int row = ps.executeUpdate();
            if (row > 0) {
                return true;
            }
        } finally {
            if (con != null) {
                con.close();
            }
            if (ps != null) {
                ps.close();
            }
        }
        return false;
    }
        public User checkAdmin(String user) {
        String query = "SELECT * FROM USER WHERE username = ? AND isSelf = '1' ";
        try {
            conn = new DBConnection().getConnection();       // call function form DBconnection
            ps = conn.prepareStatement(query);
            ps.setString(1, user);
            rs = ps.executeQuery();
            while (rs.next()) {
                return new User(
                
                        rs.getString(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getInt(6),
                        rs.getInt(7));
            }
        } catch (Exception e) {

        }
        return null;
    }

    // check if email exist
    public User checkEmailExist(String mail) {
        String query = "SELECT * FROM USER WHERE userEmail = ?";
        try {
            conn = new DBConnection().getConnection();       // call function form DBconnection
            ps = conn.prepareStatement(query);
            ps.setString(1, mail);
            rs = ps.executeQuery();
            while (rs.next()) {
                return new User(
                       
                        rs.getString(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getInt(6),
                        rs.getInt(7));
            }
        } catch (Exception e) {

        }
        return null;
    }
    // check if username exist

    public User checkPhoneExist(String phone) {
        String query = "SELECT * FROM USER WHERE userPhone = ?";
        try {
            conn = new DBConnection().getConnection();       // call function form DBconnection
            ps = conn.prepareStatement(query);
            ps.setString(1, phone);
            rs = ps.executeQuery();
            while (rs.next()) {
                return new User(
                        
                        rs.getString(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getInt(6),
                        rs.getInt(7));
            }
        } catch (Exception e) {

        }
        return null;
    }
    
//  check trùng PHONE
    public boolean checkExistPhone(String phone) throws SQLException, ClassNotFoundException{
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            con = DBConnection.getConnection();
            String sql = "Select userName "
                    + "From user "
                    + "Where userPhone = ?";
            ps = con.prepareStatement(sql);
            ps.setString(1, phone);
            rs = ps.executeQuery();
            if (rs.next()){
                return true;
            }
        } finally {
            if (rs != null){
                rs.close();
            }
            if (ps != null){
                ps.close();
            }
            if (con != null){
                con.close();
            }
        }
        return false;
    }

//    check trùng email
        public boolean checkExistEmail(String email) throws SQLException, ClassNotFoundException{
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            con = DBConnection.getConnection();
            String sql = "Select userName "
                    + "From user "
                    + "Where userEmail = ?";
            ps = con.prepareStatement(sql);
            ps.setString(1, email);
            rs = ps.executeQuery();
            if (rs.next()){
                return true;
            }
        } finally {
            if (ps != null){
                ps.close();
            }
            if (con != null){
                con.close();
            }
        }
        return false;
    }
    public static void main(String[] args) {
        DAO dao = new DAO();

        System.out.println(dao.getFoodByID("1")); // list user
//        System.out.println(dao.getAllFood()); // list food        
//        System.out.println(dao.searchFoodByName("Food"));  //Search Food name
//        System.out.println(dao.searchUserByName("Test"));  //Search User name
//        System.out.println(dao.getLatestFood()); //list of latest food
        // dao.signup("admin", "123", "0913888777", "gg32131@gmail.com", "Nam", "dhdh"); 
        // User a = dao.login("Tester", "123456");
        //     System.out.println(a.getUserName());
    }
}
