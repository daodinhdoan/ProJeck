package com.example.BaiPhieuThu_Projeck.Sevices;

import com.example.BaiPhieuThu_Projeck.Dto.NguyenLieuDto;
import com.example.BaiPhieuThu_Projeck.Models.NguyenLieu;
import com.example.BaiPhieuThu_Projeck.Repo.ChiTietPhieuThuRepo;
import com.example.BaiPhieuThu_Projeck.Repo.LoaiNguyenLieuRepo;
import com.example.BaiPhieuThu_Projeck.Repo.NguyenLieuRepo;
import com.example.BaiPhieuThu_Projeck.Repo.PhieuThuRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NguyenLieuServiceImpl implements NguyenLieuService{
    @Autowired
    private LoaiNguyenLieuRepo loaiNguyenLieuRepo;
    @Autowired
    private NguyenLieuRepo nguyenLieuRepo;

    @Autowired
    private PhieuThuRepo phieuThuRepo;
    @Autowired
    private ChiTietPhieuThuRepo chiTietPhieuThuRepo;

    @Override
    public NguyenLieu create(NguyenLieuDto dto) {
        NguyenLieu nguyenlieu = new NguyenLieu();
        nguyenlieu.setTenNguyenLieu(dto.getTenNguyenLieu());
        nguyenlieu.setGiaban(dto.getGiaban());
        nguyenlieu.setDonViTinh(dto.getDonViTinh());
        nguyenlieu.setSoLuongKho(dto.getSoLuongKho());
        return nguyenLieuRepo.save(nguyenlieu);
    }
}
