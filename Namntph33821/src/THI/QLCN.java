/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package THI;

import java.util.ArrayList;

/**
 *
 * @author TgNam
 */
public class QLCN implements QLSanPham{
    private ArrayList<SanPham> list;

    public QLCN() {
    this.list=new ArrayList<>();
    list.add(new SanPham("Macbook Air 2020","LT1012","Laptop",0,29999));
    list.add(new SanPham("iPhone 11","SP2012","SmartPhone",0,30999));
    list.add(new SanPham("iPhone XS Max","SP3021","SmartPhone",1,15999));
    }
    
    @Override
    public ArrayList<SanPham> getList() {
         return list;
    }

    @Override
    public String add(SanPham sanPham) {
        list.add(sanPham);
        return "Thêm thành công!";
    }

    @Override
    public String update(int index, SanPham sanPham) {
       list.set(index, sanPham);
       return "Sửa thành công!";
    }

    @Override
    public String remove(int index) {
       list.remove(index);
       return "Xóa thành công!";
    }
    
}
