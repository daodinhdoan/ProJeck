package com.example.BaiPhieuThu_Projeck.Repo;

import com.example.BaiPhieuThu_Projeck.Models.ChiTietPhieuThu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface ChiTietPhieuThuRepo  extends JpaRepository<ChiTietPhieuThu, Integer> {
}
