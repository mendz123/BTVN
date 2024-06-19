/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

public abstract class Persson {
      protected String name;
      protected int age;
      protected String job;

      public Persson(String name, int age, String job) {
            this.name = name;
            this.age = age;
            this.job = job;
      }

      public String getName() {
            return name;
      }

      public void setName(String name) {
            this.name = name;
      }

      public int getAge() {
            return age;
      }

      public void setAge(int age) {
            this.age = age;
      }

      public String getJob() {
            return job;
      }

      public void setJob(String job) {
            this.job = job;
      }
      
      public abstract void level();
      
}
