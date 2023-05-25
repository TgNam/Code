/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package THI;

/**
 *
 * @author TgNam
 */
public class SanPham {
    private  String Ten;
    private String Masv;
    private String DanhMuc;
    private int trangthai;
    private double dongia;

    public SanPham() {
    }

    public SanPham(String Ten, String Masv, String DanhMuc, int trangthai, double dongia) {
        this.Ten = Ten;
        this.Masv = Masv;
        this.DanhMuc = DanhMuc;
        this.trangthai = trangthai;
        this.dongia = dongia;
    }

    public String getTen() {
        return Ten;
    }

    public void setTen(String Ten) {
        this.Ten = Ten;
    }

    public String getMasv() {
        return Masv;
    }

    public void setMasv(String Masv) {
        this.Masv = Masv;
    }

    public String getDanhMuc() {
        return DanhMuc;
    }

    public void setDanhMuc(String DanhMuc) {
        this.DanhMuc = DanhMuc;
    }

    public int getTrangthai() {
        return trangthai;
    }

    public void setTrangthai(int trangthai) {
        this.trangthai = trangthai;
    }

    public double getDongia() {
        return dongia;
    }

    public void setDongia(double dongia) {
        this.dongia = dongia;
    }
    public String HTtrangthai(){
        if (trangthai==0) {
            return "Còn Hàng";
        }
        else{
            return "Hết Hàng";
        }
    }
}
