/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab1_java;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author TgNam
 */
public class EX3 {
    static Scanner sc = new Scanner(System.in);
    static List<Product> list = new ArrayList<>();          
    public static void main(String[] args) {
       for (int i = 0; i < 3; i++) {
            Product sp;
            if (i == 0) {
               sp = new NoTaxSanpham();
            } else {
               sp = new Product(); 
            }
            System.out.println("Nhap ten:");
            sp.setName(sc.nextLine());
            System.out.println("Nhap gia:");
            sp.setPrice(Double.parseDouble(sc.nextLine()));
            list.add(sp);
        }
        for (Product sp : list) {
            System.out.println("Ten: " + sp.getName() + ", gia: " + sp.getPrice()+",Thue"+sp.getImportTax());
        }
    }
}

