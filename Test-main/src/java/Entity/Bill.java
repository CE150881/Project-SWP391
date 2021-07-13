/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import java.sql.Timestamp;

/**
 *
 * @author NguyenQuocHung
 */
public class Bill {
    public Bill()
    {
        
    }
    
    private int billID;
    private String userName;
    private double total;
    private String address;
    private String date;

    public Bill(int billID, String userName, double total, String address, String date) {
        this.billID = billID;
        this.userName = userName;
        this.total = total;
        this.address = address;
        this.date = date;
    }

    public int getBillID() {
        return billID;
    }

    public void setBillID(int billID) {
        this.billID = billID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserID(String userName) {
        this.userName = userName;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    
    
}

