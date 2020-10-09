package com.project.SuperAdmin.repository;

import com.project.SuperAdmin.entity.InstitutionCrossProductDetails;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface InstitutionCrossProductDetailsRepository extends JpaRepository<InstitutionCrossProductDetails, Long> {
    List<InstitutionCrossProductDetails> findByInstitutionCode(String institutionCode);
}
