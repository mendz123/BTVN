/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import model.SinhVien;

public class Main {

      public static void main(String[] args) {
            ArrayList<SinhVien> student = new ArrayList();
            student.add(new SinhVien("De180XX", "Nguyen Van A", true, "CNTT"));
            student.add(new SinhVien("De182XX", "Nguyen Van B", true, "CNTT"));
            student.add(new SinhVien("De181XX", "Nguyen Thi C", false, "MKT"));
            student.add(new SinhVien("De184XX", "Nguyen D", true, "CNTT"));
            student.add(new SinhVien("De187XX", "Tran Thi A", false, "MKT"));
            Scanner sc = new Scanner(System.in);

            String[] arr = {
                  "1.In ra danh sach cac sinh vien\n",
                  "2.Xoa sinh vien\n",
                  "3.Chinh sua sinh vien theo ma so sinh vien\n",
                  "4.In ra thong tin sinh vien Nam(true)\n",
                  "5.In ra thong tin sinh vien Nu(false)\n",
                  "0.Exit"
            };
            System.out.println(Arrays.toString(arr));
            int n;
            do {
                  n = sc.nextInt();
                  switch (n) {

                        case 1:
                              System.out.println(student.toString());
                              break;
                        case 2:
                              student.remove(2);
                              System.out.println(student.toString());
                              break;
                        case 3:
                              System.out.print("Nhap ma so sinh vien can sua: ");                             
                              String idToEdit = sc.nextLine();
                             
                              for (SinhVien sv : student) {
                                    if (sv.getIdSv().equals(idToEdit)) {
                                          System.out.print("Nhap ten moi: ");
                                          sv.setNameSV(sc.nextLine());
                                          System.out.print("Nhap gioi tinh moi (true/false): ");
                                          sv.setGenderSV(sc.nextBoolean());
                                          sc.nextLine(); 
                                          System.out.print("Nhap chuyen nganh moi: ");
                                          sv.setMajorOfSV(sc.nextLine());
                                          break;
                                    }
                              }
                              System.out.println("danh sach sinh vien sau khi sua " + student.toString());
                              break;
                              
                        case 4:
                              for (SinhVien sv : student) {
                                    if (sv.isGenderSV()) {
                                          System.out.println(sv);
                                    }
                              }
                              break;
                        case 5:
                              for (SinhVien sv : student) {
                                    if (sv.isGenderSV() == false) {
                                          System.out.println(sv);
                                    }
                              }
                              break;
                        case 0:
                              break;

                  }
            } while (n > 0 && n < 6);

      }

}
