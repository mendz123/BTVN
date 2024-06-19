/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import model.Student;
import model.Teacher;
import model.Engineer;


public class Main {
      public static void main(String[] args) {
            Student stD = new Student("ABC", "Minh", 19, "Hoc Sinh") {
                  @Override
                  public void level() {
                
                  }
            };
            Teacher tC = new Teacher("CNTT", "Funny", 19, "Giao Vien") {
            };
            System.out.println(stD.toString());
            System.out.println(tC.toString());
      }
}
