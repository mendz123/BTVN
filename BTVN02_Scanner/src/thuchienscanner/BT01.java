package thuchienscanner;


import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

public class BT01 {

      static int soHoanHao(int a) {
            int sum = 0;
            for (int i = 1; i <= a / 2; i++) {
                  if (a % i == 0) {
                        sum += i;
                  }
            }
            if (sum == a && a != 0) {
                  return 1;
            } else {
                  return 0;
            }
      }
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Nhap mot so bat ki (Neu la so hoan hao thi true, so binh thuong thi false) : ");
            int n = sc.nextInt();
            if(soHoanHao(n)==1){
                  System.out.println("true");
            }else System.out.println(+n+"false");
            
      }
}
