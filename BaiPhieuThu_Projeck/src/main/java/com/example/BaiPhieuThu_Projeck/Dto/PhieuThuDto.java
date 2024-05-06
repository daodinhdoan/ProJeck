package com.example.BaiPhieuThu_Projeck.Dto;

import com.example.BaiPhieuThu_Projeck.Models.ChiTietPhieuThu;

import java.util.Date;
import java.util.List;

public class PhieuThuDto {
    private int phieuThuId;
    private Date ngayLap;
    private String nhanVienLap;
    private String ghiChu;
    private double thanhTien;
    private List<ChiTietPhieuThu> chitietphieuthuList;

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

    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }

    public double getThanhTien() {
        return thanhTien;
    }

    public void setThanhTien(double thanhTien) {
        this.thanhTien = thanhTien;
    }

    public List<ChiTietPhieuThu> getChitietphieuthuList() {
        return chitietphieuthuList;
    }

    public void setChitietphieuthuList(List<ChiTietPhieuThu> chitietphieuthuList) {
        this.chitietphieuthuList = chitietphieuthuList;
    }

}
