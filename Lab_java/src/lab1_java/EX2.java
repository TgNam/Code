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
public class EX2 {
    static Scanner sc = new Scanner(System.in);
    static List<Product> list = new ArrayList<>(); 
    public static void main(String[] args) {
            do {            
            System.out.println("+-------------------------------------------------------+");
            System.out.println("1. Nhập sản phẩm");
            System.out.println("2. Xuất danh sách");
            System.out.println("0. Kết thúc chương trình");
            System.out.println("+-------------------------------------------------------+");
            System.out.print("Nhập chương trình cần chạy:");
            String menu = sc.nextLine();
            switch (menu) {
                case "1":
                    for (int i = 0; i < 5; i++) {
                        Product sp = new Product();
                        System.out.println("Nhap ten:");
                        sp.setName(sc.nextLine());
                        System.out.println("Nhap gia:");
                        sp.setPrice(Double.parseDouble(sc.nextLine()));
                        list.add(sp);
                    }
                    break;
                case "2":
                    for (Product product : list) {
                        System.out.println(product.toString());
                    }
                    break;
                case "0":
                    System.exit(0);
                    break;
                default:
                    System.out.println("Nhập sai chương trình");
                
            }
        } while (true);
    }
}
