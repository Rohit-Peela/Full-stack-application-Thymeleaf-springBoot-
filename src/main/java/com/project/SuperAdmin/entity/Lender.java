package com.project.SuperAdmin.entity;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.sql.Timestamp;

@Getter
@Setter
@Entity
@Table(name = "LENDER")
@ToString
public class Lender extends AuditableEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long lenderId;
    private String bankIcon;
    private String institutionCode;
    private String dba;
    private String contact;
    private String contactPerson;
    private String email;
    private Long addressId;
    private String type;
    private String name;
    private Double achDiscountRate;
    private Double discountedPrice;
    private Boolean isLenderOfferAch;
    private String valueType;
    private String loanPurpose;
    private Boolean termBasedLoan;
    private Double minLoanAmount;
    private Double maxLoanAmount;
    private Double relevanceScore;
    private Double variableBaseRate;
    private Double fixedBaseRate;
    private Timestamp effectiveDate;
    private Timestamp expirationDate;
    private String finalSubmitChannel;
    private String finalSubmitEmailId;
    private String finalSubmitMessage;
    private String finalSubmitWebForwardLink;
    private String crossSellEnabled;

//    public LenderVO populateToVO() {
//        LenderVO lenderVO = new LenderVO();
//        lenderVO.setLenderId(this.lenderId);
//        lenderVO.setName(this.name);
//        lenderVO.setBankIcon(this.bankIcon);
//        lenderVO.setContact(this.contact);
//        lenderVO.setContactPerson(this.contactPerson);
//        lenderVO.setDba(this.dba);
//        lenderVO.setEmail(this.email);
//        lenderVO.setFixedBaseRate(this.fixedBaseRate);
//        lenderVO.setVariableBaseRate(this.variableBaseRate);
//        lenderVO.setInstitution(this.institutionCode);
//        if(this.type != null) {
//            lenderVO.setType(LENDER_TYPE.valueOf(this.type));
//        }
//        lenderVO.setRelevanceScore(this.relevanceScore);
//        lenderVO.setEffectiveDate(this.effectiveDate);
//        lenderVO.setExpirationDate(this.expirationDate);
//        lenderVO.setFinalSubmitChannel(this.finalSubmitChannel);
//        lenderVO.setFinalSubmitEmailId(this.finalSubmitEmailId);
//        lenderVO.setFinalSubmitMessage(this.finalSubmitMessage);
//        lenderVO.setCrossSellEnabled(this.crossSellEnabled);
//        lenderVO.setTermBasedLoan(this.termBasedLoan);
//        return lenderVO;
//    }
}
