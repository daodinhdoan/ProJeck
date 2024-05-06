package com.example.BaiPhieuThu_Projeck.Models;

import jakarta.persistence.*;
@Entity
@Table(name = "loainguyenlieu")
public class LoaiNguyenLieu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int loaiNguyenLieuId;
    @ManyToOne
    @JoinColumn(name = "nguyenLieuId", nullable=false)
    private NguyenLieu nguyenlieu;
    @Column(name = "tenLoai")
    private String tenLoai;
    @Column(name = "moTa")
    private String moTa;

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
}
