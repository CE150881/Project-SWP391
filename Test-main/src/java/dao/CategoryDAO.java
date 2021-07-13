/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import Entity.Category;
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
public class CategoryDAO {
    public static ResultSet getAllCategory(){
        try {
            Statement st = DBConnection.getConnection().createStatement();
            ResultSet rs = st.executeQuery("select * from category");
            return rs;
        } catch (SQLException ex) {
            Logger.getLogger(CategoryDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public static Category getCategoryByID(int categoryID){
        Category c = null;
        try {
            Connection conn = DBConnection.getConnection();
            PreparedStatement st = conn.prepareStatement("Select * from category where categoryID=?");
            st.setInt(1, categoryID);
            ResultSet rs = st.executeQuery();            
            if(rs.next()){
                c = new Category();
                c.setCategoryID(categoryID);
                c.setCategoryName(rs.getString("categoryName"));                
            }
        } catch (SQLException ex) {
            Logger.getLogger(FoodDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return c;
    }
    
    public static int addCategory(Category c){
        int rs = 0;
        Connection conn;
        try {
            conn = DBConnection.getConnection();
            PreparedStatement st = conn.prepareCall("INSERT INTO `category` VALUES (NULL, ?);");
            
            st.setString(1, c.getCategoryName());
                 
            rs = st.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(FoodDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
    }
    
    public static int editCategory(Category c){
        int rs = 0;
        Connection conn;
        try {
            conn = DBConnection.getConnection();
            PreparedStatement st = conn.prepareCall("UPDATE `category` SET `categoryName` = ? WHERE `category`.`categoryID` = ?;");
            
            st.setString(1, c.getCategoryName());
            st.setInt(2, c.getCategoryID());
            
            rs = st.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(FoodDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
    }
    
    public static int deleteCategory(int categoryID){
        int rs = 0;
        Connection conn;
        try {
            conn = DBConnection.getConnection();
            PreparedStatement st = conn.prepareCall("Delete from category where categoryID=?");
            st.setInt(1, categoryID);    
            rs = st.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(FoodDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
    }
}


