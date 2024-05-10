package com.example.CongThucMonAn_projeck.Models;

import jakarta.persistence.*;
import jakarta.websocket.ClientEndpoint;

import java.util.ArrayList;
import java.util.List;

@Entity
public class MonAn {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idMonAn;

    @Column(name = "TenMonAn")
    private String tenMonAn;
    @Column(name = "Price")
    private double price;
    @Column(name = "GioiThieuMonAn")
    private String gioiThieuMonAn;
    @Column(name = "CachLamMonAn")
    private String cachLamMonAn;

    @ManyToOne
    @JoinColumn(name = "idLoaiMonAn")
    private LoaiMonAn loaimonan;


    public LoaiMonAn getLoaimonan() {
        return loaimonan;
    }

    public void setLoaimonan(LoaiMonAn loaimonan) {
        this.loaimonan = loaimonan;
    }

    public int getIdMonAn() {
        return idMonAn;
    }

    public void setIdMonAn(int idMonAn) {
        this.idMonAn = idMonAn;
    }

    public String getTenMonAn() {
        return tenMonAn;
    }

    public void setTenMonAn(String tenMonAn) {
        this.tenMonAn = tenMonAn;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getGioiThieuMonAn() {
        return gioiThieuMonAn;
    }

    public void setGioiThieuMonAn(String gioiThieuMonAn) {
        this.gioiThieuMonAn = gioiThieuMonAn;
    }

    public String getCachLamMonAn() {
        return cachLamMonAn;
    }

    public void setCachLamMonAn(String cachLamMonAn) {
        this.cachLamMonAn = cachLamMonAn;
    }
}
