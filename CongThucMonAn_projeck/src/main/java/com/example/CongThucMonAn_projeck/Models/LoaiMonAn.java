package com.example.CongThucMonAn_projeck.Models;

import jakarta.persistence.*;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Entity
public class LoaiMonAn {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idLoaiMonAn;

    private String tenLoaiMonAn;

    private String motaLoaiMonAn;

    @OneToMany(mappedBy = "loaimonan", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<MonAn> monAns;

    public int getIdLoaiMonAn() {
        return idLoaiMonAn;
    }

    public void setIdLoaiMonAn(int idLoaiMonAn) {
        this.idLoaiMonAn = idLoaiMonAn;
    }

    public String getTenLoaiMonAn() {
        return tenLoaiMonAn;
    }

    public void setTenLoaiMonAn(String tenLoaiMonAn) {
        this.tenLoaiMonAn = tenLoaiMonAn;
    }

    public String getMotaLoaiMonAn() {
        return motaLoaiMonAn;
    }

    public void setMotaLoaiMonAn(String motaLoaiMonAn) {
        this.motaLoaiMonAn = motaLoaiMonAn;
    }
}
