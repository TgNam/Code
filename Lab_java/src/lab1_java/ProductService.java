/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab1_java;

import java.util.ArrayList;

/**
 *
 * @author TgNam
 */
public class ProductService implements DAO{
    private ArrayList<Product> list;
    
    public ProductService() {
        this.list = new ArrayList<>();
    }
    @Override
    public void insert(Product p) {
        list.add(p);
    }

    @Override
    public void update(int viTri, Product p) {
        list.set(viTri, p);
    }

    @Override
    public void delete(int viTri) {
        list.remove(viTri);
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
