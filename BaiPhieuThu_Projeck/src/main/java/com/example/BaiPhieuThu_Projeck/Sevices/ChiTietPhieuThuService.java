package com.example.BaiPhieuThu_Projeck.Sevices;

import com.example.BaiPhieuThu_Projeck.Models.ChiTietPhieuThu;
import com.example.BaiPhieuThu_Projeck.Models.PhieuThu;

import java.util.List;

public interface ChiTietPhieuThuService {
    void themDanhSachPhieuThu(List<ChiTietPhieuThu> chiTietPhieuThus, PhieuThu phieuthu);
}

