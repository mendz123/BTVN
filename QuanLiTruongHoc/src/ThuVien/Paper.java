/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ThuVien;

public class Paper extends ThuVien {

      protected int taiBan;

      public Paper( String maTL, String tenTL, String NXB,int taiBan) {
            super(maTL, tenTL, NXB);
            this.taiBan = taiBan;
      }

      public int getTaiBan() {
            return taiBan;
      }

      public void setTaiBan(int taiBan) {
            this.taiBan = taiBan;
      }

      @Override
      public String toString() {
            return "Book{" + " Ma Tai Lieu: " + maTL + "--Ten Tai Lieu: " + tenTL + "--Nha Xuat Ban: " + NXB + "--Tai Ban: " + taiBan + '}';
      }

}
