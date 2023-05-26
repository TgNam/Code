/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Day4;

import java.util.ArrayList;

/**
 *
 * @author TgNam
 */
public class QLCN implements QLStudent{
    private ArrayList<Student> list;

    public QLCN() {
        this.list=new ArrayList<>();
        list.add(new Student("Nguyễn Văn A",9.0,"Thiết Kế Wed","Xuất Xắc",0));
        list.add(new Student("Nguyễn Văn B",8.0,"Thiết Kế Đồ Họa","Giỏi",0));
        list.add(new Student("Nguyễn Thị N",9.5,"Phát triển phần mềm","Xuất Xắc",0));
        list.add(new Student("Nguyễn Thị D",7.0,"Quản trị kinh doanh","Khá",1));
    }
    
    @Override
    public ArrayList<Student> getList() {
        return list;
    }

    @Override
    public String add(Student student) {
        list.add(student);
        return "Thêm thành công";
    }

    @Override
    public String updete(int index, Student student) {
       list.set(index, student);
       return "Đã Cập nhật thành công";
    }

    @Override
    public String remove(int index) {
        list.remove(index);
        return "Đã xóa thành công";
    }
    
}
