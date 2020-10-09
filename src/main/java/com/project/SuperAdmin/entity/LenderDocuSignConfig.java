package com.project.SuperAdmin.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "LENDER_DOCUSIGN_CONFIG")
@Getter
@Setter
public class LenderDocuSignConfig {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long lenderDocuSignConfigId;
    private String institutionCode;
    private String lenderName;
    private String serviceProvider;
    private String applicationType;
    private String loanPurpose;
    private String integrationKey;
    private String userGuid;
    private String brandId;
    private String edocControlid;
    private String edocUser;
    private String edocEKey;
    private String templateName;
    private Timestamp effectiveDate;
    private Timestamp expirationDate;

}
