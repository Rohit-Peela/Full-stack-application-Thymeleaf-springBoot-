package com.project.SuperAdmin.repository;

import com.project.SuperAdmin.entity.EmailTemplateDetails;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmailTemplateDetailsRepository extends JpaRepository<EmailTemplateDetails, Long> {

    List<EmailTemplateDetails> findByInstitutionName(String institutionName);
}
