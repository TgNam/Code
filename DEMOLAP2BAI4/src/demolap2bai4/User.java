/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package demolap2bai4;

import java.io.Serializable;

/**
 *
 * @author TgNam
 */
public class User implements Serializable{
    private String user;
    private String password;
    private String Rdo;
    private String country;

    public User() {
    }

    public User(String user, String password, String Rdo, String country) {
        this.user = user;
        this.password = password;
        this.Rdo = Rdo;
        this.country = country;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRdo() {
        return Rdo;
    }

    public void setRdo(String Rdo) {
        this.Rdo = Rdo;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
    
}
