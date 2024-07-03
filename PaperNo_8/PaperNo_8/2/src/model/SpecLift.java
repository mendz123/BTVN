/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Arrays;
import java.util.Scanner;

public class SpecLift extends Lift {

      private int load;

      public SpecLift() {
      }

      public SpecLift(int load, String label, int type) {
            super(label, type);
            this.load = load;
      }

      @Override
      public String toString() {
            return "" + label + ", " + load + ", " + type ;
      }

      public void setData() {
            StringBuilder newLabel = new StringBuilder();
            for (int i = 1; i <= getLabel().length(); i++) {
                  if (i % 2 != 0) {
                        newLabel.append(getLabel().charAt(i - 1));
                  }
            }
            setLabel(newLabel.toString());
      }

      public int getValue() {
            //char conVert = (char) getType();
            char conVert = Character.forDigit(getType(), 10);
            System.out.println(conVert);
            for (int i = 0; i < getLabel().length(); i++) {
                  if (getLabel().charAt(i) == conVert) {
                        return load + getType();
                  }
            }
            return load;
      }

      public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            System.out.print("Enter Label: ");
            String label = sc.nextLine();

            System.out.print("Enter type: ");
            int type = Integer.parseInt(sc.nextLine());

            System.out.print("Enter load: ");
            int load = Integer.parseInt(sc.nextLine());
            String[] menu = {"1. Test toString\n",
                  "2. Test setData\n",
                  "3. Test getValue\n",
                  "0.Exit"

            };
            System.out.println(Arrays.toString(menu));
            Lift li = new Lift(label, type);
            SpecLift sp = new SpecLift(load, label, type);
            int n;
            do {
                  System.out.print("Pick: ");
                  n = Integer.parseInt(sc.nextLine());
                  switch (n) {
                        case 1 -> {
                              System.out.println(li.toString());
                              System.out.println(sp.toString());
                        }
                        case 2 -> {
                              sp.setData();
                              System.out.println(sp.getLabel());
                        }
                        case 3 -> {
                              SpecLift sp1 = new SpecLift(load, label, type);
                              System.out.println(sp1.getValue());
                        }
                        case 0 ->
                              System.exit(0);
                  }

            } while (n > 0 && n < 4);
      }

}
