/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;


public abstract class Teacher extends Persson {
      private String maJor;

      public Teacher(String maJor, String name, int age, String job) {
            super(name, age, job);
            this.maJor = maJor;
      }

      public String getMaJor() {
            return maJor;
      }

      public void setMaJor(String maJor) {
            this.maJor = maJor;
      }
      @Override
      public void level(){
            System.out.println("Co 5 level tu 1->5");
      }

      @Override
      public String toString() {
            return "Teacher{" + "--Ten: " + getName() + "--Tuoi: "+getAge()+'}';
      }
      
}
