/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import Entity.Food;
import context.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author msi-pc
 */
public class FoodDAO {
    //    Ham lay thong tin cua tat ca food
//    Input khong co
//    Output thong tin cua tat ca food duoc luu vao rs
    public static ResultSet getAllFood(){
        try {
            Statement st = DBConnection.getConnection().createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM `food` NATURAL JOIN `category`");
            return rs;
        } catch (SQLException ex) {
            Logger.getLogger(FoodDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public static Food getFoodByID (int foodID){
        Food f = null;
        try {
            Connection conn = DBConnection.getConnection();
            PreparedStatement st = conn.prepareStatement("Select * from food where foodID=?");
            st.setInt(1, foodID);
            ResultSet rs = st.executeQuery();            
            if(rs.next()){
                f = new Food();
                f.setFoodID(foodID);
                f.setFoodName(rs.getString("foodName"));
                f.setFoodPrice(rs.getInt("foodPrice"));
                f.setImage(rs.getString("image"));
                f.setCategoryID(rs.getInt("categoryID"));
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(FoodDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return f;
    }
    
    public static int addFood(Food f){
        int rs = 0;
        Connection conn;
        try {
            conn = DBConnection.getConnection();
            PreparedStatement st = conn.prepareCall("INSERT INTO `food` VALUES (NULL, ?, ?, ?, ?);");
            
            st.setString(1, f.getImage());
            st.setString(2, f.getFoodName());
            st.setInt(3, f.getFoodPrice());
            
            st.setInt(4, f.getCategoryID());     
            rs = st.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(FoodDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
    }
    
    public static int editFood(Food f){
        int rs = 0;
        Connection conn;
        try {
            conn = DBConnection.getConnection();
            PreparedStatement st = conn.prepareCall("UPDATE `food` SET `image` = ?, `foodName` = ?, `foodPrice` = ?, `categoryID` = ? WHERE `food`.`foodID` = ?;");
            
            st.setString(1, f.getImage());
            st.setString(2, f.getFoodName());
            st.setInt(3, f.getFoodPrice()); 
             
            st.setInt(4, f.getCategoryID());
            st.setInt(5, f.getFoodID()); 
            rs = st.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(FoodDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
    }
    
    public static int deleteFood(int foodID){
        int rs = 0;
        Connection conn;
        try {
            conn = DBConnection.getConnection();
            PreparedStatement st = conn.prepareCall("Delete from food where foodID=?");
            st.setInt(1, foodID);    
            rs = st.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(FoodDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
    }
    
    public static Food getFoodByCategoryID(int categoryID){
        Food f = null;
        try {
            Connection conn = DBConnection.getConnection();
            PreparedStatement st = conn.prepareStatement("Select * from food where categoryID=?");
            st.setInt(1, categoryID);
            ResultSet rs = st.executeQuery();            
            if(rs.next()){
                f = new Food();
                f.setFoodID(rs.getInt("foodID"));
                f.setFoodName(rs.getString("foodName"));
                f.setFoodPrice(rs.getInt("foodPrice"));
                f.setImage(rs.getString("image"));
                f.setCategoryID(categoryID);
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(FoodDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return f;
    }
}


