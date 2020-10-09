package com.project.SuperAdmin.repository;

import com.project.SuperAdmin.entity.BureauConfigDetails;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface BureauConfigDetailsRepository extends JpaRepository<BureauConfigDetails, Long > {

    List<BureauConfigDetails> findByInstitutionCode(String institutionCode);
}
