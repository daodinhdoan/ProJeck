package com.example.CongThucMonAn_projeck.Sevices;

import com.example.CongThucMonAn_projeck.Models.CongThuc;
import com.example.CongThucMonAn_projeck.Models.MonAn;

import java.util.List;

public interface MonAnSevice {
    MonAn themMonAn( MonAn monAn);
    MonAn uppdateMonAn( MonAn monAn);
    MonAn deteleMonAn( int idMonAn);

    List<MonAn> timKiemMonAnTheoTenVaNguyenLieu(String tenMonAn, String tenNguyenLieu);
}
