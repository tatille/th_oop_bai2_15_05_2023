/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thuchanh3_15_05_23.newpackage;

/**
 *
 * @author ADMIN
 */
class HangSanhSu extends HangHoa {
    private String nhaSanXuat;
    private String ngayNhapKho;

    public HangSanhSu(String maHang, String tenHang, int soLuongTon, double donGia, String nhaSanXuat, String ngayNhapKho) {
        super(maHang, tenHang, soLuongTon, donGia);
        this.nhaSanXuat = nhaSanXuat;
        this.ngayNhapKho = ngayNhapKho;
    }

    @Override
    public double tinhTienVAT() {
        return donGia * soLuongTon * 0.1;
    }

    @Override
    public void danhGia() {
        System.out.println("----- ĐÁNH GIÁ HÀNG SÀNH SỨ -----");
        System.out.println("Mã hàng: " + maHang);
        System.out.println("Tên hàng: " + tenHang);
                System.out.println("Số lượng tồn: " + soLuongTon);
        System.out.println("Đơn giá: " + donGia);
        System.out.println("Tiền VAT: " + tinhTienVAT());
        if (soLuongTon > 50 && ngayNhapKho.compareTo("10 ngày trước") > 0) {
            System.out.println("Hàng sành sứ có số lượng tồn lớn và thời gian lưu kho lâu.");
            System.out.println("Đánh giá: Bán chậm");
        } else {
            System.out.println("Hàng sành sứ không có đánh giá đặc biệt.");
            System.out.println("Đánh giá: Không đánh giá");
        }
        System.out.println("----------------------------------");
    }
}
