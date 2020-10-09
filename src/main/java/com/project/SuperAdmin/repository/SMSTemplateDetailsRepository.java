package com.project.SuperAdmin.repository;

import com.project.SuperAdmin.entity.SMSTemplateDetails;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SMSTemplateDetailsRepository extends JpaRepository<SMSTemplateDetails, Long> {
    List<SMSTemplateDetails> findByInstitutionName(String institutionName);
}
