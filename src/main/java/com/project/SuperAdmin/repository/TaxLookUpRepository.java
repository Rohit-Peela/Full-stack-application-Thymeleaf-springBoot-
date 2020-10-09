package com.project.SuperAdmin.repository;

import com.project.SuperAdmin.entity.TaxLookUp;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TaxLookUpRepository extends JpaRepository<TaxLookUp,Long> {
    List<TaxLookUp> findByInstitutionCode(String institutionCode);
}
