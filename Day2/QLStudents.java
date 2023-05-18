/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Day2;

import java.util.ArrayList;

/**
 *
 * @author TgNam
 */
public interface QLStudents {
    ArrayList<Student> getlist();
    String add(Student student);
    String update(int index , Student student);
    String remove(int index);
}
