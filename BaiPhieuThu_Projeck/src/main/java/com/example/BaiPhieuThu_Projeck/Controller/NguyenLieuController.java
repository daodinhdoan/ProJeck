package com.example.BaiPhieuThu_Projeck.Controller;

import com.example.BaiPhieuThu_Projeck.Dto.NguyenLieuDto;
import com.example.BaiPhieuThu_Projeck.Dto.ResultInfoDto;
import com.example.BaiPhieuThu_Projeck.Sevices.NguyenLieuServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NguyenLieuController {
    @Autowired
    private NguyenLieuServiceImpl nguyenLieuSeviecs;

    @PostMapping(value = "/themNguyenLieu")
    public ResponseEntity themNguyenLieuVaoLoaiNguyenLieu(@RequestBody NguyenLieuDto dto) {
        ResultInfoDto resultInfoDTO = new ResultInfoDto();
        try {
            resultInfoDTO.setData(nguyenLieuSeviecs.create(dto));
        }catch (Exception e){
            resultInfoDTO.setMessage(e.getMessage());
        }
        return new ResponseEntity(resultInfoDTO, HttpStatus.OK);
    }
}
