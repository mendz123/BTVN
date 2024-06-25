/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

public class Nguoi {
      private String hoVaTen;
      private int tuoi;
      private String cMND;

      public Nguoi(String hoVaTen, int tuoi, String cMND) {
            this.hoVaTen = hoVaTen;
            this.tuoi = tuoi;
            this.cMND = cMND;
      }

      public String getHoVaTen() {
            return hoVaTen;
      }

      public void setHoVaTen(String hoVaTen) {
            this.hoVaTen = hoVaTen;
      }

      public int getTuoi() {
            return tuoi;
      }

      public void setTuoi(int tuoi) {
            this.tuoi = tuoi;
      }

      public String getcMND() {
            return cMND;
      }

      public void setcMND(String cMND) {
            this.cMND = cMND;
      }

      @Override
      public String toString() {
            return "--" + " Ho Va Ten: " + hoVaTen + ", Tuoi: " + tuoi + ", CCCD: " + cMND ;
      }
      
}
