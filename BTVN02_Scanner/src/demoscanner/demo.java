/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package demoscanner;

import java.util.Scanner;

public class demo {

      public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            System.out.print("Nhap Ten : ");
            String ten = sc.nextLine();

            System.out.print("Nhap tuoi: ");
            int tuoi = sc.nextInt();
            sc.nextLine();
            System.out.print("Dia chi: ");
            String diaChi = sc.nextLine();

            System.out.print("Nhập số điện thoại: ");
            String phoneNumber = sc.nextLine();

            System.out.print("Chuyen nganh dang hoc: ");
            String chuyenNganh = sc.nextLine();

            System.out.println("Ten cua ban la: " + ten);
            System.out.println("Tuoi cua ban la: " + tuoi);
            System.out.println("Dia chi cua ban: " + diaChi);
            System.out.println("So Dien Thoai: " + phoneNumber);
            System.out.println("Chuyen Nganh : " + chuyenNganh);
      }

}
