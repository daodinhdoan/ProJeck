package com.example.CongThucMonAn_projeck.Sevices;

import com.example.CongThucMonAn_projeck.Models.LoaiMonAn;

public interface LoaiMonAnSevice {
    LoaiMonAn xoaLoaiMonAnImp(int idLoaiMonAn);

    LoaiMonAn create(LoaiMonAn loaiMonAn);

    LoaiMonAn update(LoaiMonAn loaiMonAn);

}
