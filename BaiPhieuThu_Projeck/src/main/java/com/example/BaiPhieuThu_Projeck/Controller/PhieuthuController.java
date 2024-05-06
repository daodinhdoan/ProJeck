package com.example.BaiPhieuThu_Projeck.Controller;

import com.example.BaiPhieuThu_Projeck.Dto.NguyenLieuDto;
import com.example.BaiPhieuThu_Projeck.Dto.ResultInfoDto;
import com.example.BaiPhieuThu_Projeck.Models.ChiTietPhieuThu;
import com.example.BaiPhieuThu_Projeck.Models.PhieuThu;
import com.example.BaiPhieuThu_Projeck.Sevices.ChiTietPhieuThuSeviceImpl;
import com.example.BaiPhieuThu_Projeck.Sevices.LoaiNguyenLieuServiceImpl;
import com.example.BaiPhieuThu_Projeck.Sevices.NguyenLieuServiceImpl;
import com.example.BaiPhieuThu_Projeck.Sevices.PhieuThuServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping(value = "/api/test")
public class PhieuthuController {
    @Autowired
    private ChiTietPhieuThuSeviceImpl chiTietPhieuThuSeviecs;
    @Autowired
    private LoaiNguyenLieuServiceImpl loaiNguyenLieuSevices ;
    @Autowired
    private PhieuThuServiceImpl phieuthuSevices;


    @PostMapping(value = "/themDanhSachPhieuThu")
    public ResponseEntity<String> themPhieuThu(@RequestBody PhieuThu phieuThu,
                                               @RequestBody List<ChiTietPhieuThu> chiTietPhieuThus) {
        chiTietPhieuThuSeviecs.themDanhSachPhieuThu(chiTietPhieuThus, phieuThu);
        return new ResponseEntity<>("Them Thanh Cong ", HttpStatus.OK);
    }

    @DeleteMapping(value = "/xoaPhieuThu")
    public ResponseEntity<String> xoaPhieuThu(@RequestParam int phieuThuId) {
        phieuthuSevices.xoaPhieuThu(phieuThuId);
        return new ResponseEntity<>("Xoa Thanh Cong ", HttpStatus.OK);
    }


    @GetMapping(value = "/thongTinPhieuThu")
    public ResponseEntity<List<PhieuThu>> thongTinPhieuThuTheoTime() {
        return new ResponseEntity<>(phieuthuSevices.danhSachPhieuThuTheoThoiGian(), HttpStatus.OK);
    }


}
