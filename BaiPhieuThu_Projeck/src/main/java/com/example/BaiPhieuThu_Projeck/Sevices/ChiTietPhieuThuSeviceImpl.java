package com.example.BaiPhieuThu_Projeck.Sevices;

import com.example.BaiPhieuThu_Projeck.Models.ChiTietPhieuThu;
import com.example.BaiPhieuThu_Projeck.Models.PhieuThu;
import com.example.BaiPhieuThu_Projeck.Repo.ChiTietPhieuThuRepo;
import com.example.BaiPhieuThu_Projeck.Repo.NguyenLieuRepo;
import com.example.BaiPhieuThu_Projeck.Repo.PhieuThuRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ChiTietPhieuThuSeviceImpl implements ChiTietPhieuThuService {
    @Autowired
    private ChiTietPhieuThuRepo loaiNguyenLieuRepo;
    @Autowired
    private NguyenLieuRepo nguyenLieuRepo;

    @Autowired
    private PhieuThuRepo phieuThuRepo;
    @Autowired
    private ChiTietPhieuThuRepo chiTietPhieuThuRepo;

    @Override
    public void themDanhSachPhieuThu(List<ChiTietPhieuThu> chiTietPhieuThus, PhieuThu phieuthu) {
        for (ChiTietPhieuThu chiTietPhieuThu : chiTietPhieuThus) {
            chiTietPhieuThu.setPhieuThu(phieuthu);
        }
        chiTietPhieuThuRepo.saveAll(chiTietPhieuThus);
    }

}
