package com.project.SuperAdmin.repository;

import com.project.SuperAdmin.entity.Lender;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LenderRepository extends JpaRepository<Lender,Long> {
    List<Lender> findByInstitutionCode(String institutionCode);
}
