/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAY3;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author TgNam
 */
public class QLSanPham implements QLCN{
    private ArrayList<SanPham> list ;
    public QLSanPham() {
        this.list=new ArrayList<>();
        list.add(new SanPham("IPhone5",2000,2,0,"Hàng trưng bày"));
        list.add(new SanPham("IPhone7",3000,1,1,"Hàng cũ"));
        list.add(new SanPham("IPhone13",7000,1,1,"Hàng đổi trả bảo hành"));
        list.add(new SanPham("IPhone14",9000,2,0,"Hàng mới"));
    }
    
    @Override
    public ArrayList<SanPham> getList() {
       return list;
    }

    @Override
    public String add(SanPham sanPham) {
        list.add(sanPham);
        return "Thêm sản phẩm thành công!";
    }

    @Override
    public String update(int index, SanPham sanPham) {
        list.set(index, sanPham);
        return "Update thành công!";
    }

    @Override
    public String remove(int index) {
        list.remove(index);
        return "Đã xóa!";
    }
    
}
