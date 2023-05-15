/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thuchanh3_15_05_23.newpackage;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        QuanLyHangHoa quanLy = new QuanLyHangHoa();

        int choice = 0;
        while (choice != 4) {
            System.out.println("*|--------------- MENU ----------------------|*");
            System.out.println("*|----------------1. Thêm hàng hóa-----------|*");
            System.out.println("*|----------------2. In danh sách hàng hóa---|*");
            System.out.println("*|----------------3. Đánh giá hàng hóa-------|*");
            System.out.println("*|----------------4. Thoát-------------------|*");
            System.out.print("Nhập lựa chọn: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Đọc bỏ dòng new line

            switch (choice) {
                case 1:
                    themHangHoa(scanner, quanLy);
                    break;
                case 2:
                    quanLy.inDanhSachHangHoa();
                    break;
                case 3:
                    danhGiaHangHoa(scanner, quanLy);
                    break;
                case 4:
                    System.out.println("Thoát chương trình.");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
            }
        }

        scanner.close();
    }

    public static void themHangHoa(Scanner scanner, QuanLyHangHoa quanLy) {
        System.out.println("*----------- THÊM HÀNG HÓA ---------------*");
        System.out.println("*------------1. Hàng thực phẩm------------*");
        System.out.println("*------------2. Hàng sành sứ--------------*");
        System.out.println("*------------3. Hàng điện máy-------------*");
        System.out.print("Chọn loại hàng hóa:");
        int loaiHang = scanner.nextInt();
        scanner.nextLine(); // Đọc bỏ dòng new line

        System.out.print("Nhập mã hàng: ");
        String maHang = scanner.nextLine();
        System.out.print("Nhập tên hàng: ");
        String tenHang = scanner.nextLine();
        System.out.print("Nhập số lượng tồn: ");
        int soLuongTon = scanner.nextInt();
        System.out.print("Nhập đơn giá: ");
        double donGia = scanner.nextDouble();

        switch (loaiHang) {
            case 1:
                System.out.print("Nhập ngày sản xuất: ");
                String ngaySanXuat = scanner.next();
                System.out.print("Nhập ngày hết hạn: ");
                String ngayHetHan = scanner.next();
                scanner.nextLine(); //
                System.out.print("Nhập nhà cung cấp: ");
                String nhaCungCap = scanner.nextLine();
                HangThucPham hangThucPham = new HangThucPham(maHang, tenHang, soLuongTon, donGia, ngaySanXuat, ngayHetHan, nhaCungCap);
                quanLy.themHangHoa(hangThucPham);
                break;
            case 2:
                System.out.print("Nhập nhà sản xuất: ");
                String nhaSanXuat = scanner.next();
                System.out.print("Nhập ngày nhập kho: ");
                String ngayNhapKho = scanner.next();
                scanner.nextLine(); // Đọc bỏ dòng new line
                HangSanhSu hangSanhSu = new HangSanhSu(maHang, tenHang, soLuongTon, donGia, nhaSanXuat, ngayNhapKho);
                quanLy.themHangHoa(hangSanhSu);
                break;
            case 3:
                System.out.print("Nhập thời gian bảo hành: ");
                int thoiGianBaoHanh = scanner.nextInt();
                System.out.print("Nhập công suất: ");
                double congSuat = scanner.nextDouble();
                HangDienMay hangDienMay = new HangDienMay(maHang, tenHang, soLuongTon, donGia, thoiGianBaoHanh, congSuat);
                quanLy.themHangHoa(hangDienMay);
                break;
            default:
                System.out.println("Lựa chọn không hợp lệ. Không thêm hàng hóa.");
        }
    }

    public static void danhGiaHangHoa(Scanner scanner, QuanLyHangHoa quanLy) {
        System.out.print("Nhập mã hàng hóa cần đánh giá: ");
        String maHang = scanner.nextLine();
        HangHoa hangHoa = quanLy.timHangHoa(maHang);
        if (hangHoa != null) {
            hangHoa.danhGia();
        } else {
            System.out.println("Không tìm thấy hàng hóa với mã " + maHang);
        }
    }
}
