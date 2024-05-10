package com.example.CongThucMonAn_projeck.Reponsitory;

import com.example.CongThucMonAn_projeck.Models.CongThuc;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RestController;

@Repository
public interface CongThucRepo extends JpaRepository<CongThuc, Integer> {
    CongThuc findByMonAnId(int monAnId);
}
