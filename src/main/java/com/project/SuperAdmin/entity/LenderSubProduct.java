package com.project.SuperAdmin.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.sql.Timestamp;

@Getter
@Setter
@Entity
@Table(name = "LENDER_SUB_PRODUCT")
@ToString
public class LenderSubProduct extends AuditableEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long lenderSubProductId;
    private String institutionCode;
    private String lenderName;
    private String loanPurpose;
    private String subProductName;
    private Timestamp effectiveDate;
    private Timestamp expirationDate;
}
