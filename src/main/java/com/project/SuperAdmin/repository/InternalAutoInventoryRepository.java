package com.project.SuperAdmin.repository;

import com.project.SuperAdmin.entity.InternalAutoInventory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface InternalAutoInventoryRepository extends JpaRepository<InternalAutoInventory,Long> {

    List<InternalAutoInventory> findByInstitutionCode(String institutionCode);
}
