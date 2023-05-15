/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package DAY1;

import java.util.ArrayList;

/**
 *
 * @author TgNam
 */
public interface QLuser {
    ArrayList<User> getlist();
    String add(User user);
    String update(int index , User user);
    String remove(int index);
}
