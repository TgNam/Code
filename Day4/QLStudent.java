/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Day4;

import java.util.ArrayList;

/**
 *
 * @author TgNam
 */
public interface QLStudent {
    ArrayList<Student> getList();
    String add(Student student);
    String updete (int index,Student student);
    String remove (int index);
}
