/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DoiTuong;


public class Student extends DoiTuong{
      protected String lopDoiTuong, banHocSinh;

      public Student(String maDoiTuong, String tenDoiTuong, String jobDoiTuong, boolean gioiTinh,String lopDoiTuong, String banHocSinh) {
            super(maDoiTuong, tenDoiTuong, jobDoiTuong, gioiTinh);
            this.lopDoiTuong = lopDoiTuong;
            this.banHocSinh = banHocSinh;
      }

      public String getLopDoiTuong() {
            return lopDoiTuong;
      }

      public void setLopDoiTuong(String lopDoiTuong) {
            this.lopDoiTuong = lopDoiTuong;
      }

      public String getbanHocSinh() {
            return banHocSinh;
      }

      public void setbanHocSinh(String banHocSinh) {
            this.banHocSinh = banHocSinh;
      }

      @Override
      public String toString() {
            return "Student{" + "Ma hoc sinh: "+maDoiTuong +"--Ten hoc sinh: "+ tenDoiTuong+"--Gioi tinh: "+gioiTinh+"--Cong viec: "+jobDoiTuong+"--Lop hoc sinh: " + lopDoiTuong + "--Ban Hoc Sinh: " + banHocSinh + '}';
      }

      
      
      
      
      
}
