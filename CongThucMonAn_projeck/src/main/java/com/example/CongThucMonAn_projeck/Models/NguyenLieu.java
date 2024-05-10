package com.example.CongThucMonAn_projeck.Models;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "NguyenLieu")
public class NguyenLieu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idNguyenLieu;


    @Column(name = "TenNguyenLieu")
    private String tenNguyenLieu;
    @Column(name = "GhiChu")
    private String ghiChu;
    @OneToMany(mappedBy = "nguyenLieu", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<CongThuc> congThucs;

    public List<CongThuc> getCongThucs() {
        return congThucs;
    }

    public void setCongThucs(List<CongThuc> congThucs) {
        this.congThucs = congThucs;
    }

    public int getIdNguyenLieu() {
        return idNguyenLieu;
    }

    public void setIdNguyenLieu(int idNguyenLieu) {
        this.idNguyenLieu = idNguyenLieu;
    }

    public String getTenNguyenLieu() {
        return tenNguyenLieu;
    }

    public void setTenNguyenLieu(String tenNguyenLieu) {
        this.tenNguyenLieu = tenNguyenLieu;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }
}
