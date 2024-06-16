/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package btvn;

import static java.lang.Math.sqrt;

/**
 *
 * @author ADMIN
 */
public class Baitap1 {

      static boolean soNguyenTo(int a) {
            if (a < 2) {
                  return false;
            }
            for (int i = 2; i < sqrt(a); i++) {
                  if (a % i == 0) {
                        return false;
                  }
            }
            return true;
      }
      static boolean soLe(int b){
            if(b%2==0){
                  return false;
            }
            return true;
      }

      public static void main(String[] args) {
            int a=23;
            int b =11;
            if(soNguyenTo(a)){
                  System.out.println(+a+" la so nguyen to");
            }else System.out.println(+a+" khong phai la so nguyen to");
            if(soLe(b)){
                  System.out.println(+b+" la so le");
            }else System.out.println(+b+" la so chan");
      }

}
