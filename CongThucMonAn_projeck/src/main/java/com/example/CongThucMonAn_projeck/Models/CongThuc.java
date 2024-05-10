package com.example.CongThucMonAn_projeck.Models;

import jakarta.persistence.*;

@Entity
@Table(name = "CongThuc")
public class CongThuc {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idCongThuc;


    @ManyToOne
    @JoinColumn(name = "idMonAn")
    private MonAn MonAn;


    @ManyToOne
    @JoinColumn(name = "idNguyenLieu")
    private NguyenLieu nguyenLieu;



    @Column(name = "SoLuong")
    private int soLuong;
    @Column(name = "DonViTinh")
    private String donViTinh;
    private int monAnId;

    public int getIdCongThuc() {
        return idCongThuc;
    }

    public void setIdCongThuc(int idCongThuc) {
        this.idCongThuc = idCongThuc;
    }

    public com.example.CongThucMonAn_projeck.Models.MonAn getMonAn() {
        return MonAn;
    }

    public void setMonAn(com.example.CongThucMonAn_projeck.Models.MonAn monAn) {
        MonAn = monAn;
    }

    public NguyenLieu getNguyenLieu() {
        return nguyenLieu;
    }

    public void setNguyenLieu(NguyenLieu nguyenLieu) {
        this.nguyenLieu = nguyenLieu;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public String getDonViTinh() {
        return donViTinh;
    }

    public void setDonViTinh(String donViTinh) {
        this.donViTinh = donViTinh;
    }
}
