package com.project.SuperAdmin.repository;

import com.project.SuperAdmin.entity.LenderMenu;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LenderMenuRepository extends JpaRepository<LenderMenu, Long> {
    List<LenderMenu> findByInstitutionCode(String institutionCode);
}
