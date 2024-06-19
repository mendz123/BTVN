/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;


public abstract class Engineer extends Persson {
      private String aBout;

      public Engineer(String aBout, String name, int age, String job) {
            super(name, age, job);
            this.aBout = aBout;
      }

      public String getaBout() {
            return aBout;
      }

      public void setaBout(String aBout) {
            this.aBout = aBout;
      }
      @Override
      public void level(){
            System.out.println("Co 5 level tu A den E(A,B,C,D,E)");
      }
      @Override
      public String toString() {
            return "Engineer{" + "aBout=" + aBout + '}';
      }
      
      
}
