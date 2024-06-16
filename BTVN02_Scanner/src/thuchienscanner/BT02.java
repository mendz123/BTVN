/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thuchienscanner;

import java.util.Scanner;

public class BT02 {
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Nhap mot so nguyen bat ki: ");
            int n = sc.nextInt();
            if(n%2==0){
                  for(int i=0;i<n;i++){
                        for (int j=0;j<n;j++){
                              System.out.print("* ");
                        }
                        System.out.printf("\n");
                  }
            }
            if(n%2!=0){
                  for (int i = 1; i < n-1; i++) {
                        for (int j=0;j<n-i;j++){
                              System.out.print("  ");
                        }
                        for (int k = 0;k<2*i-1;k++){
                              System.out.print("* ");
                        }
                        System.out.printf("\n");
                  }
                  
            }
      }
}

