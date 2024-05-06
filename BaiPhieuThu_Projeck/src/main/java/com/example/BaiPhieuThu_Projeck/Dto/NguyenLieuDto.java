package com.example.BaiPhieuThu_Projeck.Dto;

import com.example.BaiPhieuThu_Projeck.Models.LoaiNguyenLieu;

import java.util.List;

public class NguyenLieuDto {
    private int nguyenLieuId;
    private String tenNguyenLieu;
    private int giaban;
    private String donViTinh;
    private int soLuongKho;
    private List<LoaiNguyenLieu> loainguyenlieus;


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

    public List<LoaiNguyenLieu> getLoainguyenlieus() {
        return loainguyenlieus;
    }

    public void setLoainguyenlieus(List<LoaiNguyenLieu> loainguyenlieus) {
        this.loainguyenlieus = loainguyenlieus;
    }
}
