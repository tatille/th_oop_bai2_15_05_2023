/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thuchanh3_15_05_23.newpackage;

/**
 *
 * @author ADMIN
 */
class HangThucPham extends HangHoa {
    private String ngaySanXuat;
    private String ngayHetHan;
    private String nhaCungCap;

    public HangThucPham(String maHang, String tenHang, int soLuongTon, double donGia, String ngaySanXuat, String ngayHetHan, String nhaCungCap) {
        super(maHang, tenHang, soLuongTon, donGia);
        this.ngaySanXuat = ngaySanXuat;
        this.ngayHetHan = ngayHetHan;
        this.nhaCungCap = nhaCungCap;
    }

    @Override
    public double tinhTienVAT() {
        return donGia * soLuongTon * 0.05;
    }

    @Override
    public void danhGia() {
        System.out.println("----- ĐÁNH GIÁ HÀNG THỰC PHẨM -----");
        System.out.println("Mã hàng: " + maHang);
        System.out.println("Tên hàng: " + tenHang);
        System.out.println("Số lượng tồn: " + soLuongTon);
        System.out.println("Đơn giá: " + donGia);
        System.out.println("Tiền VAT: " + tinhTienVAT());
        if (soLuongTon > 0 && ngayHetHan.compareTo(ngaySanXuat) > 0) {
            System.out.println("Hàng thực phẩm còn tồn kho và chưa hết hạn.");
            System.out.println("Đánh giá: Bán được");
        } else {
            System.out.println("Hàng thực phẩm đã hết hạn hoặc hết hàng.");
            System.out.println("Đánh giá: Khó bán");
        }
        System.out.println("--------------------------------------");
    }
}