/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

public abstract class Student extends Persson{
      private String msSV;
    

      public Student(String msSV, String name, int age, String job) {
            super(name, age, job);
            this.msSV = msSV;
      }

         
      public String getMsSV() {
            return msSV;
      }

      public void setMsSV(String msSV) {
            this.msSV = msSV;
      }
      @Override
      public abstract void level();

      @Override
      public String toString() {
            return "Student{" + "MSSV: " + msSV +"--Ten: " + getName()+"--Tuoi: "+ getAge()+'}';
      }
      
      
      
}
