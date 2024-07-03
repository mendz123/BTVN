/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import model.ILift;

public abstract class MyLift implements ILift {

      private boolean checkSoNguyento(int n) {
            if (n <= 1) {
                  return false;// số nguyên tố là số >=2
            }
            for (int i = 2; i <= Math.sqrt(n); i++) {
                  if (n % i == 0) {
                        return false;
                  }
            }
            return true;
      }

      @Override
      public int f1(List<SpecLift> lifts) {
            int maxLoad = Integer.MIN_VALUE; //gắn max = giá trị nhỏ nhất là min_value(Min value= -2^31)
            for (SpecLift lift : lifts) {
                  if (checkSoNguyento(lift.getLabel().length())) { // điều kiện nếu độ dài của getLabel() là một số nguyên tố thì mới thực hiện lệnh trong if         
                        maxLoad = Math.max(maxLoad, lift.getLoad());/* so sánh max ban đầu với getLoad() đã được khai báo
                                                            Nếu getLoad lớn hơn max thì gắn nó cho biến maxLoad
                                                            sau đó trả về maxLoad*/
                  }
            }
            return maxLoad;
      }

      @Override
      public void f2(List<SpecLift> lifts) {
            int n = Math.min(5, lifts.size());/* so sánh số lượng phần tử theo yêu cầu với kích thước của danh sách truyền vào
                                          Nếu kích thước danh sách nhỏ hơn 5 thì gắn n bằng kích thước danh sách                              
                                          Nếu kích thước danh sách lớn hơn 5 thì nó vẫn chỉ lấy 5 phần tử đầu của danh sách theo đề bài(n=5)
             */
            for (int i = 0; i < n / 2; i++) {
                  SpecLift temp = lifts.get(i);//lấy phần tử đầu tại vị trí 0 của danh sách rồi lưu nó vào biến temp
                  lifts.set(i, lifts.get(n - 1 - i));/*Giả sử n=5 thì vòng lặp đầu i=0 nó sẽ lấy phần tử ở vị trí thứ 4(phần tử đếm từ cơ số 0)
                                                sau đó gắn vào vị trí thứ i là vị trí 0 đầu tiên*/
                  lifts.set(n - 1 - i, temp);// tiếp tục gắn ptu lưu lúc đầu vào vị trí thứ 4 còn trống sau khi gắn ptu tại vị trí 4 đó vào vị trí 0
            }
      }

      @Override
      public void f3(List<SpecLift> lifts) {
            int count = 0;//gắn biến đếm =0
            for (int i = 0; i < lifts.size(); i++) {
                  if (lifts.get(i).getLoad() < 20) {
                        count++;
                        if (count == 2) {
                              lifts.remove(i);
                              break;
                        }
                  }
            }
      }

      public static void main(String[] args) {
            List<SpecLift> lifts = new ArrayList<>();
            lifts.add(new SpecLift(10, "modern1", 1));
            lifts.add(new SpecLift(15, "modern12", 1));
            lifts.add(new SpecLift(25, "modern123", 1));
            lifts.add(new SpecLift(30, "modern1234", 1));
            lifts.add(new SpecLift(20, "modern 12345", 1));
            lifts.add(new SpecLift(5, "modern", 1));

            MyLift myLift = new MyLift() {
            };
            System.out.println(lifts);
            System.out.println();
            System.out.println("Enter TC(1-f1; 2-f2; 3-f3; 0-Exit");
            int n;
            do {
                  Scanner sc = new Scanner(System.in);
                   n = Integer.parseInt(sc.nextLine());
                  switch (n) {
                        case 1 : {
                              myLift.f1(lifts);
                              System.out.println(myLift.f1(lifts));
                        }
                        case 2 : {
                              myLift.f2(lifts);
                              System.out.println("List after f2: " + lifts);
                        }
                        case 3 : {
                              myLift.f3(lifts);
                              System.out.println("List after f3: " + lifts);
                        }
                  }

            } while (n > 0 && n < 4);
      }
}
