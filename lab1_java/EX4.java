/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab1_java;

import java.util.Scanner;

/**
 *
 * @author TgNam
 */
public class EX4 {
    static Scanner sc = new Scanner(System.in);
    static int nhaptiep;
    static int viTri;
    static ProductService ps = new ProductService();
    public static void main(String[] args) {
            do {            
            System.out.println("+-------------------------------------------------------+");
            System.out.println("1. Nhập sản phẩm");
            System.out.println("2. Xuất danh sách");
            System.out.println("3. Chỉnh sửa sản phẩm");
            System.out.println("4. Xóa Sản Phẩm");
            System.out.println("0. Kết thúc chương trình");
            System.out.println("+-------------------------------------------------------+");
            System.out.print("Nhập chương trình cần chạy:");
            String menu = sc.nextLine();
            switch (menu) {
                case "1":
                    do {
                        Product p = new Product();
                        System.out.println("Nhap ten:");
                        p.setName(sc.nextLine());
                        System.out.println("Nhap gia:");
                        p.setPrice(Double.parseDouble(sc.nextLine()));
                        //Gửi dữ liệu của đối tượng p vào mảng list bên ProductService
                        ps.insert(p);
                        System.out.println("Ban co muon nhap tiep(1-co/2-khong)");
                        nhaptiep=Integer.parseInt(sc.nextLine());
                    } while (nhaptiep==1);                                         
                    break;
                case "2":
                    //Lấy giá trị thông qua phương thức getList();
                    for (Product product : ps.getList()) {
                        System.out.println(product);
                    }                  
                    break;
                case "3":   
                    System.out.println("Nhap vi tri can sua");
                    viTri = Integer.parseInt(sc.nextLine());
                    Product p = new Product();
                    System.out.println("Nhap ten:");
                    p.setName(sc.nextLine());
                    System.out.println("Nhap gia:");           
                    p.setPrice(Double.parseDouble(sc.nextLine()));
                    //Gọi hàm update và truyền giá trị cho hàm 
                    ps.update(viTri, p);                   
                    break;
                 case "4":
                     System.out.println("Nhap vi tri xoa");
                     viTri = Integer.parseInt(sc.nextLine());
                     ps.delete(viTri);
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
