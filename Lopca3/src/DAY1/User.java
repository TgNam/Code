/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package DAY1;

import java.io.Serializable;

/**
 *
 * @author TgNam
 */
public class User implements Serializable{
 private String user;
 private String Password;
 private String Rdo;

    public User() {
    }

    public User(String user, String Password, String Rdo) {
        this.user = user;
        this.Password = Password;
        this.Rdo = Rdo;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public String getRdo() {
        return Rdo;
    }

    public void setRdo(String Rdo) {
        this.Rdo = Rdo;
    }
 
}
