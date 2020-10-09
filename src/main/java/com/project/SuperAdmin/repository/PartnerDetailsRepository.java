package com.project.SuperAdmin.repository;

import com.project.SuperAdmin.entity.PartnerDetails;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PartnerDetailsRepository extends JpaRepository<PartnerDetails, Long> {
    List<PartnerDetails> findByInstitutionCode(String institutionCode);
}
