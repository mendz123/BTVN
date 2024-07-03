/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;


public class Lift {
      protected String label;
      protected int type;

      public Lift() {
      }

      public Lift(String label, int type) {
            this.label = label;
            this.type = type;
      }
      

      public String getLabel() {
            return label;
      }

      public void setLabel(String label) {
            this.label = label;
      }
      
      

      public int getType() {
            return type;
      }

      @Override
      public String toString() {
            return "" + label + "," + type ;
      }
      
}
