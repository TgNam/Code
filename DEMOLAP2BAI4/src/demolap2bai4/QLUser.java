/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package demolap2bai4;

import java.util.ArrayList;

/**
 *
 * @author TgNam
 */
public interface QLUser {
    ArrayList<User> getlist();
    String add(User user);
    String update(int index , User user);
    String remove(int index);
}
