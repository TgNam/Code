/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package lab1_java;

import java.util.ArrayList;

/**
 *
 * @author TgNam
 */
public interface DAO {
    public void insert(Product p);
    public void update(int viTri, Product p);
    public void delete(int viTri);
    public ArrayList<Product> getList();
    public void setList(ArrayList<Product> list);
}