package com.example.BaiPhieuThu_Projeck.Sevices;

import com.example.BaiPhieuThu_Projeck.Dto.LoaiNguyenLieuDto;
import com.example.BaiPhieuThu_Projeck.Models.LoaiNguyenLieu;
import com.example.BaiPhieuThu_Projeck.Repo.LoaiNguyenLieuRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoaiNguyenLieuServiceImpl implements LoaiNguyenLieuService {
    @Autowired
    private LoaiNguyenLieuRepo loaiNguyenLieuRepo;

    @Override
    public LoaiNguyenLieu themLoaiNguyenLieu(LoaiNguyenLieuDto dto) {
        LoaiNguyenLieu loainguyenlieu = new LoaiNguyenLieu();
        loainguyenlieu.setTenLoai(dto.getTenLoai());
        loainguyenlieu.setMoTa(dto.getMoTa());
        return loaiNguyenLieuRepo.save(loainguyenlieu);
    }
}
