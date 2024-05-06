package com.example.BaiPhieuThu_Projeck.Sevices;

import com.example.BaiPhieuThu_Projeck.Models.ChiTietPhieuThu;
import com.example.BaiPhieuThu_Projeck.Models.NguyenLieu;
import com.example.BaiPhieuThu_Projeck.Models.PhieuThu;
import com.example.BaiPhieuThu_Projeck.Repo.ChiTietPhieuThuRepo;
import com.example.BaiPhieuThu_Projeck.Repo.LoaiNguyenLieuRepo;
import com.example.BaiPhieuThu_Projeck.Repo.NguyenLieuRepo;
import com.example.BaiPhieuThu_Projeck.Repo.PhieuThuRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import java.util.List;
import java.util.Optional;

@Service
public class PhieuThuServiceImpl implements PhieuThuService {
    @Autowired
    private LoaiNguyenLieuRepo loaiNguyenLieuRepo;
    @Autowired
    private NguyenLieuRepo nguyenLieuRepo;

    @Autowired
    private PhieuThuRepo phieuThuRepo;
    @Autowired
    private ChiTietPhieuThuRepo chiTietPhieuThuRepo;


    @Override
    public PhieuThu ThemPhieuThu(PhieuThu phieuThu, List<ChiTietPhieuThu> chiTietPhieuThus) {
        PhieuThu luuPhieuThu = phieuThuRepo.save(phieuThu);
        for (ChiTietPhieuThu chiTietPhieuThu : chiTietPhieuThus) {
            chiTietPhieuThu.setPhieuThu(phieuThu);
            NguyenLieu nguyenLieu = chiTietPhieuThu.getNguyenLieu();
            int soLuongKho = nguyenLieu.getSoLuongKho();
            int soLuongBan = chiTietPhieuThu.getSoLuongBan();
            if (soLuongKho < soLuongBan) {
                System.out.println("Khong du so luong trong kho");
            }
            nguyenLieu.setSoLuongKho(soLuongKho - soLuongBan);
            nguyenLieuRepo.save(nguyenLieu);
        }

        luuPhieuThu.getThanhTien();
        return phieuThuRepo.save(phieuThu);
    }


    @Override
    public PhieuThu xoaPhieuThu(int idPhieuThu) {
        Optional<PhieuThu> phieuThuOptional = phieuThuRepo.findById(idPhieuThu);
        PhieuThu phieuThu = phieuThuOptional.get();
        if (ObjectUtils.isEmpty(idPhieuThu)) {
            System.out.println("Id không tổn tại");
        }
        phieuThuRepo.delete(phieuThu);
        return phieuThuOptional.get();
    }

    @Override
    public List<PhieuThu> danhSachPhieuThuTheoThoiGian() {
        return null;

    }
}
