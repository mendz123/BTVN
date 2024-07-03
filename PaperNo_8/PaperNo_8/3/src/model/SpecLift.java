/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Arrays;
import java.util.Scanner;
import model.Lift;

public class SpecLift extends Lift {

      private int load;

      public SpecLift() {
      }

      public SpecLift(int load, String label, int type) {
            super(label, type);
            this.load = load;
      }

      public int getLoad() {
            return load;
      }

      public void setLoad(int load) {
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

}
