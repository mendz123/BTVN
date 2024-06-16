/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package demoscanner;

import java.util.Scanner;

public class demo2 {
      public static String getValue(String input) {
            Scanner sc = new Scanner(System.in);
            System.out.println(input);
            return sc.nextLine();

      }
      public static int checkInt(String s){
            int num = 0;
            while(true){
                  try {
                        num = Integer.parseInt(getValue(s));
                        if(num>0) return num;
                  }catch (Exception e){
                        System.err.println("Nhap mot so hop le");
                  }
            }
      }
      public static void main(String[] args) {
            int age = Integer.parseInt(getValue("Nhap vao tuoi cua ban: "));
            System.out.println("Tuoi cua ban la: "+age);
      }
}
