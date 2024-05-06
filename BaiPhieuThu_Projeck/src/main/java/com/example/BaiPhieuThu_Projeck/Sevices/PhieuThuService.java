package com.example.BaiPhieuThu_Projeck.Sevices;

import com.example.BaiPhieuThu_Projeck.Models.ChiTietPhieuThu;
import com.example.BaiPhieuThu_Projeck.Models.PhieuThu;

import java.util.List;

public interface PhieuThuService {
    PhieuThu ThemPhieuThu(PhieuThu phieuThu, List<ChiTietPhieuThu> chiTietPhieuThus);
    PhieuThu xoaPhieuThu(int idPhieuThu);
    List<PhieuThu> danhSachPhieuThuTheoThoiGian();
}
