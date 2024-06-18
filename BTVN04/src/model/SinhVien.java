/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package model;

public class SinhVien {

      private String idSv;
      private String nameSV;
      private boolean genderSV;
      private String majorOfSV;

      public SinhVien(String idSv, String nameSV, boolean genderSV, String majorOfSV) {
            this.idSv = idSv;
            this.nameSV = nameSV;
            this.genderSV = genderSV;
            this.majorOfSV = majorOfSV;
      }

      public String getIdSv() {
            return idSv;
      }

      public void setIdSv(String idSv) {
            this.idSv = idSv;
      }

      public String getNameSV() {
            return nameSV;
      }

      public void setNameSV(String nameSV) {
            this.nameSV = nameSV;
      }

      public boolean isGenderSV() {
            return genderSV;
      }

      public void setGenderSV(boolean genderSV) {
            this.genderSV = genderSV;
      }

      public String getMajorOfSV() {
            return majorOfSV;
      }

      public void setMajorOfSV(String majorOfSV) {
            this.majorOfSV = majorOfSV;
      }

      @Override
      public String toString() {
            return "SinhVien{" + "idSv=" + idSv + ", nameSV=" + nameSV + ", genderSV=" + genderSV + ", majorOfSV=" + majorOfSV + '}' + "\n";
      }

}
