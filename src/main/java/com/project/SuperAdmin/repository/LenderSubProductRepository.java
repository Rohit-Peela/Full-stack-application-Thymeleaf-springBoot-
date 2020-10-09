package com.project.SuperAdmin.repository;

import com.project.SuperAdmin.entity.LenderSubProduct;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LenderSubProductRepository extends JpaRepository<LenderSubProduct, Long> {
    List<LenderSubProduct> findByInstitutionCode(String institutionCode);
}
