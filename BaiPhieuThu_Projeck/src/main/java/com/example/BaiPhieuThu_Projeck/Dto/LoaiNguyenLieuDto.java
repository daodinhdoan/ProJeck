package com.example.BaiPhieuThu_Projeck.Dto;

import com.example.BaiPhieuThu_Projeck.Models.NguyenLieu;

import java.util.List;

public class LoaiNguyenLieuDto {
    private int loaiNguyenLieuId;
    private NguyenLieu nguyenlieu;
    private String tenLoai;
    private String moTa;
    private List<NguyenLieu> nguyenLieus;

    public int getLoaiNguyenLieuId() {
        return loaiNguyenLieuId;
    }

    public void setLoaiNguyenLieuId(int loaiNguyenLieuId) {
        this.loaiNguyenLieuId = loaiNguyenLieuId;
    }

    public NguyenLieu getNguyenlieu() {
        return nguyenlieu;
    }

    public void setNguyenlieu(NguyenLieu nguyenlieu) {
        this.nguyenlieu = nguyenlieu;
    }

    public String getTenLoai() {
        return tenLoai;
    }

    public void setTenLoai(String tenLoai) {
        this.tenLoai = tenLoai;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public List<NguyenLieu> getNguyenLieus() {
        return nguyenLieus;
    }

    public void setNguyenLieus(List<NguyenLieu> nguyenLieus) {
        this.nguyenLieus = nguyenLieus;
    }
}
