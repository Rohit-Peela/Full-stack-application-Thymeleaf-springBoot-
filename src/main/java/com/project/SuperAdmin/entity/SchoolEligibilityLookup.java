package com.project.SuperAdmin.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Getter
@Setter
@Table(name = "SCHOOL_ELIGIBILITY_LOOKUP")
public class SchoolEligibilityLookup extends AuditableEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long schoolEligibilityLookupId;
    private String institutionCode;
    private String lender;
    private String schoolName;
    private Timestamp effectiveDate;
    private Timestamp expirationDate;


//    public Long getSchoolEligibilityLookupId() {
//        return schoolEligibilityLookupId;
//    }
//
//    public void setSchoolEligibilityLookupId(Long schoolEligibilityLookupId) {
//        this.schoolEligibilityLookupId = schoolEligibilityLookupId;
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
//    public String getLender() {
//        return lender;
//    }
//
//    public void setLender(String lender) {
//        this.lender = lender;
//    }
//
//    public String getSchoolName() {
//        return schoolName;
//    }
//
//    public void setSchoolName(String schoolName) {
//        this.schoolName = schoolName;
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
}
