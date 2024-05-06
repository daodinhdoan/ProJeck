package com.example.BaiPhieuThu_Projeck.Models;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;
@Entity
@Table(name = "phieuthu")
public class PhieuThu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int phieuThuId;
    @Column(name = "ngaylap")
    private Date ngayLap;
    @Column(name = "nhanvienlap")
    private String nhanVienLap;
    @Column(name = "ghichu")
    private String ghiChu;
    @Column(name = "thanhtien")
    private double thanhTien;
    @OneToMany(mappedBy = "phieuThu", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<ChiTietPhieuThu> chiTietPhieuThus;

    public int getPhieuThuId() {
        return phieuThuId;
    }

    public void setPhieuThuId(int phieuThuId) {
        this.phieuThuId = phieuThuId;
    }

    public Date getNgayLap() {
        return ngayLap;
    }

    public void setNgayLap(Date ngayLap) {
        this.ngayLap = ngayLap;
    }

    public String getNhanVienLap() {
        return nhanVienLap;
    }

    public void setNhanVienLap(String nhanVienLap) {
        this.nhanVienLap = nhanVienLap;
    }

    public double getThanhTien() {
        return thanhTien;
    }

    public void setThanhTien(double thanhTien) {
        this.thanhTien = thanhTien;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }

    public List<ChiTietPhieuThu> getChiTietPhieuThus() {
        return chiTietPhieuThus;
    }

    public void setChiTietPhieuThus(List<ChiTietPhieuThu> chiTietPhieuThus) {
        this.chiTietPhieuThus = chiTietPhieuThus;
    }
}
