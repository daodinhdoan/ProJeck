package com.example.CongThucMonAn_projeck.Sevices;

import com.example.CongThucMonAn_projeck.Reponsitory.CongThucRepo;
import com.example.CongThucMonAn_projeck.Reponsitory.LoaiMonAnRepo;
import com.example.CongThucMonAn_projeck.Reponsitory.MonAnRepo;
import com.example.CongThucMonAn_projeck.Reponsitory.NguyenLieuRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CongThucImp implements CongThucSevice {
    @Autowired
    private LoaiMonAnRepo loaiMonAnRepo ;
    @Autowired
    private MonAnRepo monAnRepo;
    @Autowired
    private CongThucRepo congThucRepo;
    @Autowired
    private NguyenLieuRepo nguyenLieuRepo;
}
