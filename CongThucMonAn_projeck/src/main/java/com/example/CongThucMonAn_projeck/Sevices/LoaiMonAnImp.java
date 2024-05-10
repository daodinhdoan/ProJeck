package com.example.CongThucMonAn_projeck.Sevices;

import com.example.CongThucMonAn_projeck.Models.LoaiMonAn;
import com.example.CongThucMonAn_projeck.Reponsitory.CongThucRepo;
import com.example.CongThucMonAn_projeck.Reponsitory.LoaiMonAnRepo;
import com.example.CongThucMonAn_projeck.Reponsitory.MonAnRepo;
import com.example.CongThucMonAn_projeck.Reponsitory.NguyenLieuRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LoaiMonAnImp implements LoaiMonAnSevice {
    @Autowired
    private LoaiMonAnRepo loaiMonAnRepo;
    @Autowired
    private CongThucRepo congThucRepo;
    @Autowired
    private MonAnRepo monAnRepo;
    @Autowired
    private NguyenLieuRepo nguyenLieuRepo;


    @Override
    public LoaiMonAn xoaLoaiMonAnImp(int idLoaiMonAn) {
        Optional<LoaiMonAn> loaiMonAnOptional = loaiMonAnRepo.findById(idLoaiMonAn);
        LoaiMonAn loaiMonAn = loaiMonAnOptional.get();
        if (loaiMonAnOptional.isEmpty()) {
            return null;
        }
        loaiMonAnRepo.delete(loaiMonAn);
        return loaiMonAnOptional.get();
    }

    @Override
    public LoaiMonAn create(LoaiMonAn loaiMonAn) {
        LoaiMonAn loaiMonAn1 = new LoaiMonAn();
        loaiMonAn1.setTenLoaiMonAn(loaiMonAn.getTenLoaiMonAn());
        return loaiMonAnRepo.save(loaiMonAn1);
    }

    @Override
    public LoaiMonAn update(LoaiMonAn loaiMonAn) {
        Optional<LoaiMonAn> loaiMonAnOptional = loaiMonAnRepo.findById(loaiMonAn.getIdLoaiMonAn());
        LoaiMonAn loaiMonAn2 = loaiMonAnOptional.get();
        loaiMonAn2.setTenLoaiMonAn(loaiMonAn.getTenLoaiMonAn());
        return loaiMonAnRepo.save(loaiMonAn2);
    }
}
