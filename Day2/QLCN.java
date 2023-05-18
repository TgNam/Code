/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Day2;

import java.util.ArrayList;

/**
 *
 * @author TgNam
 */
public class QLCN implements QLStudents{
    private ArrayList<Student> list;

    public QLCN() {
        this.list=new ArrayList<>();
        list.add(new Student("U01","01","U01@gmail.com","123",1,1,"Graphic design"));
        list.add(new Student("U02","02","U02@gmail.com","123",1,1,"Software Development"));
        list.add(new Student("U03","03","U03@gmail.com","123",0,0,"Maketing"));
        list.add(new Student("U04","04","U04@gmail.com","123",0,0,"Web design"));
    }

    @Override
    public ArrayList<Student> getlist() {
        return list;
    }

    @Override
    public String add(Student student) {
        list.add(student);
        return"Đã thêm đối tương thành công!";
    }

    @Override
    public String update(int index, Student student) {
        list.set(index, student);
        return "Đã update thành công!";
    }

    @Override
    public String remove(int index) {
        list.remove(index);
        return "Bạn muốn xóa";
    }
    
    
}
