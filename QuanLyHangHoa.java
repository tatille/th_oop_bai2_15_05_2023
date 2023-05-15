/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thuchanh3_15_05_23.newpackage;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ADMIN
 */
class QuanLyHangHoa {
    private List<HangHoa> danhSachHangHoa;

    public QuanLyHangHoa() {
         danhSachHangHoa = new ArrayList<>();
    }

    public void themHangHoa(HangHoa hangHoa) {
        danhSachHangHoa.add(hangHoa);
        System.out.println("Đã thêm hàng hóa vào danh sách.");
    }

    public void inDanhSachHangHoa() {
        if (danhSachHangHoa.isEmpty()) {
            System.out.println("Danh sách hàng hóa trống.");
        } else {
            System.out.println("----- DANH SÁCH HÀNG HÓA -----");
            for (HangHoa hangHoa : danhSachHangHoa) {
                if (hangHoa instanceof HangThucPham) {
                    System.out.println("Loại hàng: Thực phẩm");
                }
                else if (hangHoa instanceof HangSanhSu) {
                    System.out.println("Loại hàng: Sành sứ");
                } else if (hangHoa instanceof HangDienMay) {
                    System.out.println("Loại hàng: Điện máy");
                }

                System.out.println("Mã hàng: " + hangHoa.maHang);
                System.out.println("Tên hàng: " + hangHoa.tenHang);
                System.out.println("Số lượng tồn: " + hangHoa.soLuongTon);
                System.out.println("Đơn giá: " + hangHoa.donGia);
                System.out.println("--------------------------------");
            }
        }
    }

    public HangHoa timHangHoa(String maHang) {
        for (HangHoa hangHoa : danhSachHangHoa) {
            if (hangHoa.maHang.equals(maHang)) {
                return hangHoa;
            }
        }
        return null;
    }
}