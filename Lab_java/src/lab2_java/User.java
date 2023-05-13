/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab2_java;

import java.io.Serializable;

/**
 *
 * @author TgNam
 */
public class User implements Serializable{
     private String user;
     private String pass;
     private String Rdo;
     private String Major;

    public User() {
    }

    public User(String user, String pass, String Rdo, String Major) {
        this.user = user;
        this.pass = pass;
        this.Rdo = Rdo;
        this.Major = Major;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getRdo() {
        return Rdo;
    }

    public void setRdo(String Rdo) {
        this.Rdo = Rdo;
    }

    public String getMajor() {
        return Major;
    }

    public void setMajor(String Major) {
        this.Major = Major;
    }
     
    
}
