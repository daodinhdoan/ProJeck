package com.example.CongThucMonAn_projeck.Sevices;

import com.example.CongThucMonAn_projeck.Models.CongThuc;
import com.example.CongThucMonAn_projeck.Models.MonAn;
import com.example.CongThucMonAn_projeck.Reponsitory.CongThucRepo;
import com.example.CongThucMonAn_projeck.Reponsitory.LoaiMonAnRepo;
import com.example.CongThucMonAn_projeck.Reponsitory.MonAnRepo;
import com.example.CongThucMonAn_projeck.Reponsitory.NguyenLieuRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.w3c.dom.ls.LSInput;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@Service
public class MonAnImp implements MonAnSevice {
    @Autowired
    private MonAnRepo monAnRepo;
    @Autowired
    private LoaiMonAnRepo loaiMonAnRepo;
    @Autowired
    private CongThucRepo congThucRepo;
    @Autowired
    private NguyenLieuRepo nguyenLieuRepo;
    @Autowired
    private CongThucImp congThucImp;


    @Override
    public MonAn themMonAn(MonAn monAn) {
        MonAn monAn1 = new MonAn();
        monAn1.setTenMonAn(monAn.getTenMonAn());
        monAn1.setPrice(monAn.getPrice());
        monAn1.setCachLamMonAn(monAn.getCachLamMonAn());
        monAn1.setGioiThieuMonAn(monAn.getGioiThieuMonAn());
        return monAnRepo.save(monAn1);
    }

    @Override
    public MonAn uppdateMonAn(MonAn monAn) {
        Optional<MonAn> optionalMonAn = monAnRepo.findById(monAn.getIdMonAn());
        MonAn monAn1 = optionalMonAn.get();
        monAn1.setTenMonAn(monAn.getTenMonAn());
        monAn1.setPrice(monAn.getPrice());
        monAn1.setCachLamMonAn(monAn.getCachLamMonAn());
        return monAnRepo.save(monAn1);
    }

    @Override
    public MonAn deteleMonAn(int idMonAn) {
        Optional<MonAn> optionalMonAn = monAnRepo.findById(idMonAn);
        if (optionalMonAn.isPresent()) {
            return null;
        }
        monAnRepo.deleteById(idMonAn);
        return  monAnRepo.findById(idMonAn).get();
    }


    @Override
    public List<MonAn> timKiemMonAnTheoTenVaNguyenLieu(String tenMonAn, String tenNguyenLieu) {
        return List.of();
    }
}
