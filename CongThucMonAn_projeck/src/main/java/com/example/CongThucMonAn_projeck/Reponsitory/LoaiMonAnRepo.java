package com.example.CongThucMonAn_projeck.Reponsitory;

import com.example.CongThucMonAn_projeck.Models.LoaiMonAn;
import com.example.CongThucMonAn_projeck.Models.MonAn;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoaiMonAnRepo extends JpaRepository<LoaiMonAn, Integer> {

}
