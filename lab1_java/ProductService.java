/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab1_java;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author TgNam
 */
public class ProductService implements DAO{
    Scanner sc = new Scanner(System.in);
    //C1 :private ArrayList<Product> list = new ArrayList<>();
    private ArrayList<Product> list ;
    // Phương thức ProductService() được sử dụng để tạo đối tượng lưu trữ cấp bộ nhớ cho ArayList
    public ProductService() {
        this.list = new ArrayList<>();
    }
    
    @Override
    public void insert(Product p) {
        list.add(p);
    }
    
    @Override
    public void update(int viTri, Product p) {
            
        if (viTri < 0 || viTri >= list.size()) {
            System.out.println("Không tìm thấy sản phẩm cần sửa");
        } else {           
            list.set(viTri, p);
        }
    }

    @Override
    public void delete(int viTri) {       
        list.remove(viTri);
        System.out.println(list.toString());
    }
    
    @Override
    public ArrayList<Product> getList() {
        return list;
    }
    
    @Override
    public void setList(ArrayList<Product> list) {
        this.list=list;
    }   
}
