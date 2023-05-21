/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAY3;

import java.io.Serializable;

/**
 *
 * @author TgNam
 */
public class SanPham implements Serializable{
    private String ten;
    private double Gia;
    private int soluong;
    private int trangthai;
    private String danhmuc;

    public SanPham() {
    }

    public SanPham(String ten, double Gia, int soluong, int trangthai, String danhmuc) {
        this.ten = ten;
        this.Gia = Gia;
        this.soluong = soluong;
        this.trangthai = trangthai;
        this.danhmuc = danhmuc;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public double getGia() {
        return Gia;
    }

    public void setGia(double Gia) {
        this.Gia = Gia;
    }

    public double getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    public int getTrangthai() {
        return trangthai;
    }

    public void setTrangthai(int trangthai) {
        this.trangthai = trangthai;
    }

    public String getDanhmuc() {
        return danhmuc;
    }

    public void setDanhmuc(String danhmuc) {
        this.danhmuc = danhmuc;
    }
     public String HTTrangThai(){
         if (trangthai==0) {
             return "Còn hàng";
         }
         else{
             return "Hết hàng";
         }
     }
}
