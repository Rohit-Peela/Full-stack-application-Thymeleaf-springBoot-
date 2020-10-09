package com.project.SuperAdmin.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Timestamp;
@Getter
@Setter
@Entity
@Table(name = "BACKENDPRODUCT_LOOKUP")
public class BackendProductLookUp {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long backendProductLookUpId;
    private String institutionCode;
    private String productName;
    private String lenderName;
    private Timestamp effectiveDate;
    private Timestamp endDate;
    private String loanPurpose;




//    public BackendProductLookUpVO populateToVO() {
//        BackendProductLookUpVO backendProductLookUpVO = new BackendProductLookUpVO();
//        backendProductLookUpVO.setBackendProductLookUpId(this.backendProductLookUpId);
//        backendProductLookUpVO.setEffectiveDate(this.effectiveDate);
//        backendProductLookUpVO.setEndDate(this.endDate);
//        backendProductLookUpVO.setInstitutionCode(this.institutionCode);
//        backendProductLookUpVO.setLenderName(this.lenderName);
//        backendProductLookUpVO.setProductName(this.productName);
//        backendProductLookUpVO.setLoanPurpose(this.loanPurpose);
//        return backendProductLookUpVO;
//    }
//
//    public void populateFromVO(BackendProductLookUpVO backendProductLookUpVO){
//        this.setProductName(backendProductLookUpVO.getProductName());
//        this.setEffectiveDate(backendProductLookUpVO.getEffectiveDate());
//        this.setLenderName(backendProductLookUpVO.getLenderName());
//        this.setEndDate(backendProductLookUpVO.getEndDate());
//        if(backendProductLookUpVO.getLoanPurpose() !=null)
//            this.setLoanPurpose(backendProductLookUpVO.getLoanPurpose());
//        if(backendProductLookUpVO.getInstitutionCode() !=null)
//            this.setInstitutionCode(backendProductLookUpVO.getInstitutionCode());
//
//    }
}
