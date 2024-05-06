package com.example.BaiPhieuThu_Projeck.Models;

import jakarta.persistence.*;

@Entity
@Table(name = "nguyenlieu")
public class NguyenLieu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //  id tự tăng
    private int nguyenLieuId;
    @Column(name = "tennguyenlieu")
    private String tenNguyenLieu;
    @Column(name = "giaban")
    private int giaban;
    @Column(name = "donvitinh")
    private String donViTinh;
    @Column(name = "soluongkho")
    private int soLuongKho;

    public int getNguyenLieuId() {
        return nguyenLieuId;
    }

    public void setNguyenLieuId(int nguyenLieuId) {
        this.nguyenLieuId = nguyenLieuId;
    }

    public String getTenNguyenLieu() {
        return tenNguyenLieu;
    }

    public void setTenNguyenLieu(String tenNguyenLieu) {
        this.tenNguyenLieu = tenNguyenLieu;
    }

    public int getGiaban() {
        return giaban;
    }

    public void setGiaban(int giaban) {
        this.giaban = giaban;
    }

    public String getDonViTinh() {
        return donViTinh;
    }

    public void setDonViTinh(String donViTinh) {
        this.donViTinh = donViTinh;
    }

    public int getSoLuongKho() {
        return soLuongKho;
    }

    public void setSoLuongKho(int soLuongKho) {
        this.soLuongKho = soLuongKho;
    }
}
