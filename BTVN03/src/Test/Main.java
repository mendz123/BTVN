/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Test;

import model.GiaoVien;
import model.MonHoc;
import model.Student;

/**
 *
 * @author ADMIN
 */
public class Main {
      public static void main(String[] args) {
            GiaoVien gv = new GiaoVien("We1122","Tran Manh A","0987765890","Viet Nam");
            Student st = new Student("DE1900","Nguyen Van A", "0912564890", "Viet Nam", "Nam");
            MonHoc mh = new MonHoc("PRO192", "Object-Oriented Programming");
            System.out.println("Giao Vien: "+gv.getIdGV()+": "+ gv.getNameGV());
            System.out.println("Student: "+ st.getNameS()+": "+ st.getIdS()+": "+st.getGioiTinhS());
            System.out.println("Mon hoc: "+ mh.getIdMonHoc()+": "+mh.getTenMonHoc());
                    
      }
}
