/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DoiTuong;


public class Teacher extends DoiTuong{
      protected String monDay, trinhDo;

      public Teacher(String monDay, String trinhDo, String maDoiTuong, String tenDoiTuong, String jobDoiTuong, boolean gioiTinh) {
            super(maDoiTuong, tenDoiTuong, jobDoiTuong, gioiTinh);
            this.monDay = monDay;
            this.trinhDo = trinhDo;
      }

      public String getMonDay() {
            return monDay;
      }

      public void setMonDay(String monDay) {
            this.monDay = monDay;
      }

      public String getTrinhDo() {
            return trinhDo;
      }

      public void setTrinhDo(String trinhDo) {
            this.trinhDo = trinhDo;
      }

      @Override
      public String toString() {
            return "Teacher{"+"Ma giao vien: "+maDoiTuong +"--Ten giao vien: "+ tenDoiTuong+"--Gioi tinh: "+gioiTinh+"--Cong viec: "+jobDoiTuong+ "--Mon day: " + monDay + "--Trinh Do: " + trinhDo + '}';
      }
            
}
