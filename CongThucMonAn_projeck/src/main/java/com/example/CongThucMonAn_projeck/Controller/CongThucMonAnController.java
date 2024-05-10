package com.example.CongThucMonAn_projeck.Controller;

import com.example.CongThucMonAn_projeck.Models.CongThuc;
import com.example.CongThucMonAn_projeck.Models.LoaiMonAn;
import com.example.CongThucMonAn_projeck.Models.MonAn;
import com.example.CongThucMonAn_projeck.Sevices.CongThucSevice;
import com.example.CongThucMonAn_projeck.Sevices.LoaiMonAnSevice;
import com.example.CongThucMonAn_projeck.Sevices.MonAnSevice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping(value = "/api")
@RestController
public class CongThucMonAnController {
    @Autowired
    LoaiMonAnSevice loaiMonAnSevice;

    @Autowired
    MonAnSevice monAnSevice;

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public MonAn themmonan(@RequestBody(required = false) MonAn monAn) {
        MonAn monAn1 = monAnSevice.themMonAn(monAn);
        return monAn1;
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public MonAn update(@RequestBody(required = false) MonAn monAn) {
        MonAn monAn1 = monAnSevice.uppdateMonAn(monAn);
        return monAn1;
    }

    @RequestMapping(value = "/detele", method = RequestMethod.POST)
    public MonAn detele(@RequestBody(required = false) MonAn monAn) {
        MonAn monAn1 = monAnSevice.deteleMonAn(monAn.getIdMonAn());
        return monAn1;
    }


}
