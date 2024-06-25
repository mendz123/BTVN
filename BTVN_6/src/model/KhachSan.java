/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

public class KhachSan {
      private String loaiPhong;
      private int soNgayThue;
      private Nguoi in4CusTomer;

      public KhachSan(String loaiPhong, int soNgayThue, Nguoi in4CusTomer) {
            this.loaiPhong = loaiPhong;
            this.soNgayThue = soNgayThue;
            this.in4CusTomer = in4CusTomer;
      }

      public String getLoaiPhong() {
            return loaiPhong;
      }

      public void setLoaiPhong(String loaiPhong) {
            this.loaiPhong = loaiPhong;
      }

      public int getSoNgayThue() {
            return soNgayThue;
      }

      public void setSoNgayThue(int soNgayThue) {
            this.soNgayThue = soNgayThue;
      }

      public Nguoi getIn4CusTomer() {
            return in4CusTomer;
      }

      public void setIn4CusTomer(Nguoi in4CusTomer) {
            this.in4CusTomer = in4CusTomer;
      }

      
      @Override
      public String toString() {
            return "KhachSan{" + " Thong Tin Khach Hang:" + in4CusTomer + "---Loai Phong: " + loaiPhong + ", So Ngay Thue: " + soNgayThue + '}';
      }

      
      
}
