package com.project.SuperAdmin.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Getter
@Setter
@Table(name = "LENDER_MAX_DTI_LOOKUP")
public class LenderMaxDTILookup {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long lenderMaxDTILookupId;
    private String institutionCode;
    private String lenderName;
    private String loanPurpose;
    private Double maxDti;
    private Double maxPti;
    private Double minIncome;
    private Double maxIncome;
    private Timestamp effectiveDate;
    private Timestamp expirationDate;


//    public Long getLenderMaxDTILookupId() {
//        return lenderMaxDTILookupId;
//    }
//
//    public void setLenderMaxDTILookupId(Long lenderMaxDTILookupId) {
//        this.lenderMaxDTILookupId = lenderMaxDTILookupId;
//    }
//
//    public String getInstitutionCode() {
//        return institutionCode;
//    }
//
//    public void setInstitutionCode(String institutionCode) {
//        this.institutionCode = institutionCode;
//    }
//
//    public String getLenderName() {
//        return lenderName;
//    }
//
//    public void setLenderName(String lenderName) {
//        this.lenderName = lenderName;
//    }
//
//    public String getLoanPurpose() {
//        return loanPurpose;
//    }
//
//    public void setLoanPurpose(String loanPurpose) {
//        this.loanPurpose = loanPurpose;
//    }
//
//    public Double getMaxPti() {
//        return maxPti;
//    }
//
//    public void setMaxPti(Double maxPti) {
//        this.maxPti = maxPti;
//    }
//
//    public Double getMaxDti() {
//        return maxDti;
//    }
//
//    public void setMaxDti(Double maxDti) {
//        this.maxDti = maxDti;
//    }
//
//    public Double getMinIncome() {
//        return minIncome;
//    }
//
//    public void setMinIncome(Double minIncome) {
//        this.minIncome = minIncome;
//    }
//
//    public Double getMaxIncome() {
//        return maxIncome;
//    }
//
//    public void setMaxIncome(Double maxIncome) {
//        this.maxIncome = maxIncome;
//    }
//
//    public Timestamp getEffectiveDate() {
//        return effectiveDate;
//    }
//
//    public void setEffectiveDate(Timestamp effectiveDate) {
//        this.effectiveDate = effectiveDate;
//    }
//
//    public Timestamp getExpirationDate() {
//        return expirationDate;
//    }
//
//    public void setExpirationDate(Timestamp expirationDate) {
//        this.expirationDate = expirationDate;
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        LenderMaxDTILookup that = (LenderMaxDTILookup) o;
//        return Objects.equals(lenderMaxDTILookupId, that.lenderMaxDTILookupId) &&
//                Objects.equals(institutionCode, that.institutionCode) &&
//                Objects.equals(lenderName, that.lenderName) &&
//                Objects.equals(loanPurpose, that.loanPurpose) &&
//                Objects.equals(maxDti, that.maxDti) &&
//                Objects.equals(maxPti, that.maxPti) &&
//                Objects.equals(minIncome, that.minIncome) &&
//                Objects.equals(maxIncome, that.maxIncome) &&
//                Objects.equals(effectiveDate, that.effectiveDate) &&
//                Objects.equals(expirationDate, that.expirationDate);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(lenderMaxDTILookupId, institutionCode, lenderName, loanPurpose, maxDti, maxPti, minIncome, maxIncome, effectiveDate, expirationDate);
//    }
}
