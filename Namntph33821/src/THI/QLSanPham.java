/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package THI;

import java.util.ArrayList;

/**
 *
 * @author TgNam
 */
public interface QLSanPham {
    ArrayList<SanPham> getList();
    String add(SanPham sanPham);
    String update(int index,SanPham sanPham);
    String remove(int index);
}
