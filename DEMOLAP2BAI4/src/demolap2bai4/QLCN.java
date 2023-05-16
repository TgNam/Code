/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package demolap2bai4;

import java.util.ArrayList;

/**
 *
 * @author TgNam
 */
public class QLCN implements QLUser{
private ArrayList<User> list;

    public QLCN() {
        this.list = new ArrayList<>();
        list.add(new User("U01","123","User","Ha noi"));
        list.add(new User("U02","123","User","Tuyen Quang"));
        list.add(new User("U03","123","Admin","Thai Binh"));
        list.add(new User("U04","123","Admin","Hoa Binh"));
    }

    @Override
    public ArrayList<User> getlist() {
        return list;
    }

    @Override
    public String add(User user) {
        if (user != null) {
            list.add(user);
            return "Da them thanh cong";
        }
        else{
            return "Khong luu thanh cong";
        }
    }

    @Override
    public String update(int index, User user) {
        list.set(index, user);
        return "Update thanh cong";
    }

    @Override
    public String remove(int index) {
        list.remove(index);
        return "Remove thanh cong";
    }
    
}
