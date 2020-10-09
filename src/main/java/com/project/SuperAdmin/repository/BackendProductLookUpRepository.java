package com.project.SuperAdmin.repository;

import com.project.SuperAdmin.entity.BackendProductLookUp;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BackendProductLookUpRepository extends JpaRepository<BackendProductLookUp,Long> {
    List<BackendProductLookUp> findByInstitutionCode(String institutionCode);
}
