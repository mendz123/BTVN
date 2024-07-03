/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Scanner;

public class House {

      private String type;
      private int area;

      public House() {
      }

      public House(String type, int area) {
            this.type = type;
            this.area = area;
      }

      public String getType() {
            if (type == null) {
                  return type;
            }
            String reverseString = "";

            for (int i = type.length() - 1; i >= 0; i--) {

                  reverseString = reverseString + type.charAt(i);
                  if (i == type.length() - 3) {
                        break;
                  }
            }
            return reverseString;

      }

      public void setType(String type) {
            this.type = type;
      }

      public int getArea() {
            return area;
      }

      public void setArea(int area) {
            this.area = 3 * area;
      }

      @Override
      public String toString() {
            return "Area=" + area;
      }

      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Type:");
            String type = sc.nextLine();
            System.out.println("Enter area:");
            int area = Integer.parseInt(sc.nextLine());
            int n;
            do {
                  System.out.println("1.Test getType()");
                  System.out.println("2.Test setArea()");
                  System.out.println("0.Exit");
                  System.out.println("Enter n:");

                  n = Integer.parseInt(sc.nextLine());

                  House hs = new House(type, area);
                  hs.setArea(area);
                  switch (n) {

                        case 1 -> System.out.println(hs.getType());
                        case 2 -> System.out.println(hs.toString());
                        case 0 -> System.exit(0);
                  }

                  // System.out.println(hs.getType());
            } while (n > 0 && n < 3);
      }
}
