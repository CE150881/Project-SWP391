/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

/**
 *
 * @author msi-pc
 */
public class User {

    public User(String userName, String password, String userPhone, String userEmail, String userGender, int isSelf, int isAdmin) {
        
        this.userName = userName;
        this.password = password;
        this.userPhone = userPhone;
        this.userEmail = userEmail;
        this.userGender = userGender;
        this.isSelf = isSelf;
        this.isAdmin = isAdmin;
    }

    

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserGender() {
        return userGender;
    }

    public void setUserGender(String userGender) {
        this.userGender = userGender;
    }

    public int getIsSelf() {
        return isSelf;
    }

    public void setIsSelf(int isSelf) {
        this.isSelf = isSelf;
    }

    public int getIsAdmin() {
        return isAdmin;
    }

    public void setIsAdmin(int isAdmin) {
        this.isAdmin = isAdmin;
    }

    
    

    
    private String userName;
    private String password;
    private String userPhone;
    private String userEmail;
    private String userGender;
    private int isSelf;
    private int isAdmin;

    @Override
    public String toString() {
        return "User{" + "userName=" + userName + ", password=" + password + ", userPhone=" + userPhone + ", userEmail=" + userEmail + ", userGender=" + userGender + ", isSelf=" + isSelf + ", isAdmin=" + isAdmin + '}';
    }


}
