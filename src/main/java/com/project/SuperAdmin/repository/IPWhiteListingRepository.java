package com.project.SuperAdmin.repository;

import com.project.SuperAdmin.entity.IPWhiteListing;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IPWhiteListingRepository extends JpaRepository<IPWhiteListing,Long> {
    List<IPWhiteListing> findByInstitutionCode(String institutionCode);
}
