/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;


public class Student {
     String idS ;
     String nameS;
     String phoneNumberS;
     String addRessS;
     String gioiTinhS;

      public Student(String idS, String nameS, String phoneNumberS, String addRessS, String gioiTinhS) {
            this.idS = idS;
            this.nameS = nameS;
            this.phoneNumberS = phoneNumberS;
            this.addRessS = addRessS;
            this.gioiTinhS = gioiTinhS;
      }

     

      public String getIdS() {
            return idS;
      }

      public void setIdS(String idS) {
            this.idS = idS;
      }

      public String getNameS() {
            return nameS;
      }

      public void setNameS(String nameS) {
            this.nameS = nameS;
      }

      public String getPhoneNumberS() {
            return phoneNumberS;
      }

      public void setPhoneNumberS(String phoneNumberS) {
            this.phoneNumberS = phoneNumberS;
      }

      public String getAddRessS() {
            return addRessS;
      }

      public void setAddRessS(String addRessS) {
            this.addRessS = addRessS;
      }

      public String getGioiTinhS() {
            return gioiTinhS;
      }

      public void setGioiTinhS(String gioiTinhS) {
            this.gioiTinhS = gioiTinhS;
      }

      @Override
      public String toString() {
            return "Student{" + "idS=" + idS + ", nameS=" + nameS + ", phoneNumberS=" + phoneNumberS + ", addRessS=" + addRessS + ", gioiTinhS=" + gioiTinhS + '}';
      }

      public void getNameS(String nguyen_Van_A) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
      }
      
     
}
