package com.project.SuperAdmin.repository;

import com.project.SuperAdmin.entity.SchoolEligibilityLookup;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SchoolEligibilityLookupRepository extends JpaRepository<SchoolEligibilityLookup, Long> {
    List<SchoolEligibilityLookup> findByInstitutionCode(String institutionCode);
}
