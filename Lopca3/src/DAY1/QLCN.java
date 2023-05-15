/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAY1;

import java.util.ArrayList;

public class QLCN implements QLuser{
    private ArrayList<User> list;
    public QLCN(){
        this.list = new ArrayList<>();
        list.add(new User("U01","123","User"));
        list.add(new User("U02","123","User"));
        list.add(new User("U03","123","Admin"));
        list.add(new User("U04","123","Admin"));
    }
    @Override
    public ArrayList<User> getlist() {
        return list;
    }

    @Override
    public String add(User user) {
        if (user != null) {
            list.add(user);
            return "Đã lưu thành công";            
        }
        else{
            return "Lưu Không Thành công";
        }
    }

    @Override
    public String update(int index, User user) {
       list.set(index, user);
       return "Đã Update Thành công";
    }

    @Override
    public String remove(int index) {
        list.remove(index);
        return "Đã Xóa";
    }
    
}
