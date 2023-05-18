/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Day2;

import java.io.Serializable;

/**
 *
 * @author TgNam
 */
public class Student implements Serializable{
    private String user;
    private String id;
    private String email;
    private String password;
    private int gioitinh;
    private int trangthai;
    private String major;

    public Student() {
    }

    public Student(String user, String id, String email, String password, int gioitinh, int trangthai, String major) {
        this.user = user;
        this.id = id;
        this.email = email;
        this.password = password;
        this.gioitinh = gioitinh;
        this.trangthai = trangthai;
        this.major = major;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(int gioitinh) {
        this.gioitinh = gioitinh;
    }

    public int getTrangthai() {
        return trangthai;
    }

    public void setTrangthai(int trangthai) {
        this.trangthai = trangthai;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    
    public String hienThiGT() {
        if (gioitinh == 1) {
            return "Nam";
        }
        else {
            return "Nữ";
        }
    }
    public String TrangThai(){
        if (trangthai == 1) {
            return "Đang học";
        }
        else{
            return "";
        }
    }
}
