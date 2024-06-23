/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ThuVien;


public class Book extends ThuVien{
      protected int soTrang;

      public Book( String maTL, String tenTL, String NXB,int soTrang) {
            super(maTL, tenTL, NXB);
            this.soTrang = soTrang;
      }

      public int getSoTrang() {
            return soTrang;
      }

      public void setSoTrang(int soTrang) {
            this.soTrang = soTrang;
      }

      @Override
      public String toString() {
            return "Book{" + " Ma Tai Lieu: "+ maTL + "--Ten Tai Lieu: "+tenTL+"--Nha Xuat Ban: "+NXB +"--So Trang: " + soTrang + '}';
      }
      

      
}
