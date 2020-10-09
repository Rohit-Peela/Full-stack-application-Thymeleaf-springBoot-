package com.project.SuperAdmin.repository;

import com.project.SuperAdmin.entity.LenderDocuSignConfig;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LenderDocuSignConfigRepository extends JpaRepository<LenderDocuSignConfig, Long> {
    List<LenderDocuSignConfig> findByInstitutionCode(String institutionCode);
}
