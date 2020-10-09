package com.project.SuperAdmin.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Getter
@Setter
@Table(name = "INSTITUTION_CROSS_PRODUCT_DETAILS")
public class InstitutionCrossProductDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long institutionCrossProductDetailsId;
    private String institutionCode;
    private String loanPurpose;
    private Long minFICO;
    private Long maxFICO;
    private Timestamp effectiveDate;
    private Timestamp endDate;

    private String eligibleChannels;
    private String eligibleApplicationTypes;
    private String isPreApprovalConsidered;
    private String eligibleStates;

    private String crossSellLoanPurpose;
    private String crossSellProductType;
    private String isCrossSellLoanPurposeRefinance;
    private Double crossSellDefaultLoanAmount;
}
