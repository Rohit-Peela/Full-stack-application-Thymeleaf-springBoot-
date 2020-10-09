package com.project.SuperAdmin.repository;

import com.project.SuperAdmin.entity.LenderMaxDTILookup;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LenderMaxDTILookupRepository extends JpaRepository<LenderMaxDTILookup, Long> {
    List<LenderMaxDTILookup> findByInstitutionCode(String institutionCode);
}
