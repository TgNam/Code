/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Day4;

/**
 *
 * @author TgNam
 */
public class Student {
    private String user;
    private double diem;
    private String major;
    private String hocluc;
    private int thuong;

    public Student() {
    }

    public Student(String user, double diem, String major, String hocluc, int thuong) {
        this.user = user;
        this.diem = diem;
        this.major = major;
        this.hocluc = hocluc;
        this.thuong = thuong;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public double getDiem() {
        return diem;
    }

    public void setDiem(double diem) {
        this.diem = diem;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getHocluc() {
        return hocluc;
    }

    public void setHocluc(String hocluc) {
        this.hocluc = hocluc;
    }

    public int getThuong() {
        return thuong;
    }

    public void setThuong(int thuong) {
        this.thuong = thuong;
    }
    
    public String HTthuong(){
        if (thuong==0) {
            return "True";
        }
        else{
            return "false";
        }
    }
    
}
