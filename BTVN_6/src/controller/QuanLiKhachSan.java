/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import model.KhachSan;
import model.Nguoi;

public class QuanLiKhachSan {

      ArrayList<Nguoi> customer = new ArrayList<>();

      ArrayList<KhachSan> hoTel = new ArrayList<>();

      public static void main(String[] args) {

            QuanLiKhachSan hotelManager = new QuanLiKhachSan();
            Nguoi hm1 = new Nguoi("Nguyen Van A", 23, "0843872231");
            hotelManager.customer.add(hm1);

            KhachSan ks1 = new KhachSan("A", 2, hm1);
            hotelManager.hoTel.add(ks1);

            hotelManager.menu();

            Scanner sc = new Scanner(System.in);
            int n;
            do {
                  System.out.println("Nhap n");
                  n = sc.nextInt();
                  switch (n) {
                        case 1:
                              hotelManager.addCusTomer();
                              break;
                        case 2:
                              hotelManager.inDanhSachKhachHang();
                              break;
                        case 3:
                              hotelManager.xoaKhachHang();
                              break;
                        case 4: hotelManager.tinhtien();
                              break;
                        case 0:
                              System.exit(0);
                  }
            } while (n > 0 && n < 5);

      }

      public void menu() {
            String[] menu = {"1.Them Khach Hang\n",
                  "2.In ra Danh Sach Khach Hang\n",
                  "3.Xoa Khach Hang\n",
                  "4.Tinh Tien Khach Hang Theo CCCD\n",
                  "0.Exit\n"

            };
            System.out.println(Arrays.toString(menu));
      }

      public KhachSan checkCCCD(String cccd) {
            for (KhachSan ks : hoTel) {
                  if (ks.getIn4CusTomer().getcMND().equals(cccd)) {
                        return ks;
                  }
            }
            return null;
      }

      public void addCusTomer() {

            Scanner sc = new Scanner(System.in);
            System.out.println("Nhap Ho Ten khach hang: ");
            String name = sc.nextLine();

            System.out.println("Nhap tuoi cua khach hang:");
            int age = Integer.parseInt(sc.nextLine());

            System.out.println("Nhap so CCCD khach hang:");
            String cCCD = sc.nextLine();

            System.out.println("Nhap loai phong muon thue:");
            String room = sc.nextLine();

            System.out.println("Nhap so ngay thue Khach San: ");
            int day = Integer.parseInt(sc.nextLine());

            Nguoi hm2 = new Nguoi(name, age, cCCD);
            customer.add(hm2);

            KhachSan ks2 = new KhachSan(room, day, hm2);
            hoTel.add(ks2);

            System.out.println("Them Khach Hang Thanh Cong");

      }

      public void inDanhSachKhachHang() {
            for (KhachSan ks : hoTel) {
                  System.out.println(ks.toString());
            }
      }

      public void xoaKhachHang() {
            Scanner sc = new Scanner(System.in);
            System.out.println("Nhap CCCD cua khach hang muon xoa:");
            String xoaXo = sc.nextLine();
            KhachSan remove = null;
            for (KhachSan ks : hoTel) {
                  if (ks.getIn4CusTomer().getcMND().equals(xoaXo)) {
                        remove = ks;
                  }

            }
            if (remove != null) {
                  hoTel.remove(remove);
                  System.out.println("Xoa Khach Hang Thanh Cong");
            } else {
                  System.out.println("Khong Tim Thay Khach Hang");
            }
      }

      public void tinhtien() {
            Scanner sc = new Scanner(System.in);
            int tongTien = 0;
            System.out.println("Nhap CCCD cua khach hang tinh tien:");
            String xoaXo = sc.nextLine();
            for (KhachSan khachSan : hoTel) {
                  if (khachSan.getIn4CusTomer().getcMND().equals(xoaXo)) {
                        if (khachSan.getLoaiPhong().equals("A")) {
                              tongTien = 500 * khachSan.getSoNgayThue();
                              System.out.println(khachSan.toString()+" Thanh Tien: "+tongTien);
                        }
                        if (khachSan.getLoaiPhong().equals("B")) {
                              tongTien = 300 * khachSan.getSoNgayThue();
                              System.out.println(khachSan.toString()+" Thanh Tien: "+tongTien);
                        }
                        if (khachSan.getLoaiPhong().equals("C")) {
                              tongTien = 100 * khachSan.getSoNgayThue();
                              System.out.println(khachSan.toString()+" Thanh Tien: "+tongTien);
                        }

                  }

            }
      }
}