/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thuchanh3_15_05_23.newpackage;

/**
 *
 * @author ADMIN
 */
class HangDienMay extends HangHoa {
    private int thoiGianBaoHanh;
    private double congSuat;

    public HangDienMay(String maHang, String tenHang, int soLuongTon, double donGia, int thoiGianBaoHanh, double congSuat) {
        super(maHang, tenHang, soLuongTon, donGia);
        this.thoiGianBaoHanh = thoiGianBaoHanh;
        this.congSuat = congSuat;
    }

    @Override
    public double tinhTienVAT() {
        return donGia * soLuongTon * 0.1;
    }

    @Override
    public void danhGia() {
        System.out.println("----- ĐÁNH GIÁ HÀNG ĐIỆN MÁY -----");
        System.out.println("Mã hàng: " + maHang);
        System.out.println("Tên hàng: " + tenHang);
        System.out.println("Số lượng tồn: " + soLuongTon);
        System.out.println("Đơn giá: " + donGia);
        System.out.println("Tiền VAT: " + tinhTienVAT());
        if (soLuongTon < 3) {
            System.out.println("Số lượng tồn ít.");
            System.out.println("Đánh giá: Bán được");
        } else {
            System.out.println("Số lượng tồn nhiều.");
            System.out.println("Đánh giá: Không đánh giá");
        }
        System.out.println("---------------------------------");
    }
}
