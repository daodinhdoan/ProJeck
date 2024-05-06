package com.example.BaiPhieuThu_Projeck.Models;

import jakarta.persistence.*;
@Entity
@Table(name = "chitietphieuthu")
public class ChiTietPhieuThu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int chiTietPhieuThuId;
    @ManyToOne
    @JoinColumn(name = "nguyenLieuId")
    private NguyenLieu nguyenLieu;
    @ManyToOne
    @JoinColumn(name = "phieuThuId", nullable = false)
    private PhieuThu phieuThu;
    @Column(name = "soluongban")
    private int soLuongBan;

    public int getChiTietPhieuThuId() {
        return chiTietPhieuThuId;
    }

    public void setChiTietPhieuThuId(int chiTietPhieuThuId) {
        this.chiTietPhieuThuId = chiTietPhieuThuId;
    }

    public NguyenLieu getNguyenLieu() {
        return nguyenLieu;
    }

    public void setNguyenLieu(NguyenLieu nguyenLieu) {
        this.nguyenLieu = nguyenLieu;
    }

    public PhieuThu getPhieuThu() {
        return phieuThu;
    }

    public void setPhieuThu(PhieuThu phieuThu) {
        this.phieuThu = phieuThu;
    }

    public int getSoLuongBan() {
        return soLuongBan;
    }

    public void setSoLuongBan(int soLuongBan) {
        this.soLuongBan = soLuongBan;
    }
}
