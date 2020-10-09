package com.project.SuperAdmin.repository;

import com.project.SuperAdmin.entity.InstitutionDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface InstitutionDetailsRepository extends JpaRepository<InstitutionDetails, Long> {
    List<InstitutionDetails> findByInstitutionCode(String institutionCode);
}