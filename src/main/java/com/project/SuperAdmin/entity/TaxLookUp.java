package com.project.SuperAdmin.entity;


import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "TAX_LOOKUP")
public class TaxLookUp {

    private Long id;
    private String zip;
    private String city;
    private String county;
    private String state;
    private String country;
    private String taxType;
    private String loanPurpose;
    private String institutionCode;
    private String basis;
    private double fixedTax;
    private double variableTax;
    private Timestamp effectiveDate;
    private Timestamp endDate;


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getBasis() {
        return basis;
    }

    public void setBasis(String basis) {
        this.basis = basis;
    }

    public void setTaxType(String taxType) {
        this.taxType = taxType;
    }

    public String getTaxType() {
        return taxType;
    }

    public String getInstitutionCode() {
        return institutionCode;
    }

    public void setInstitutionCode(String institutionCode) {
        this.institutionCode = institutionCode;
    }

    public String getLoanPurpose() {
        return loanPurpose;
    }

    public void setLoanPurpose(String loanPurpose) {
        this.loanPurpose = loanPurpose;
    }

    public double getFixedTax() {
        return fixedTax;
    }

    public void setFixedTax(double fixedTax) {
        this.fixedTax = fixedTax;
    }

    public double getVariableTax() {
        return variableTax;
    }

    public void setVariableTax(double variableTax) {
        this.variableTax = variableTax;
    }

    public Timestamp getEffectiveDate() {
        return effectiveDate;
    }

    public void setEffectiveDate(Timestamp effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    public Timestamp getEndDate() {
        return endDate;
    }

    public void setEndDate(Timestamp endDate) {
        this.endDate = endDate;
    }

//    public void populateFromVO(TaxLookUpVO taxLookUpVO) {
//        this.setCity(taxLookUpVO.getCity());
//        this.setZip(taxLookUpVO.getZip());
//        this.setCounty(taxLookUpVO.getCounty());
//        this.setState(taxLookUpVO.getState());
//        this.setCountry(taxLookUpVO.getCountry());
//        this.setTaxType(taxLookUpVO.getTaxType());
//        this.setLoanPurpose(taxLookUpVO.getLoanPurpose());
//        this.setInstitutionCode(taxLookUpVO.getInstitutionCode());
//        this.setBasis(taxLookUpVO.getBasis());
//        this.setEffectiveDate(taxLookUpVO.getEffectiveDate());
//        this.setEndDate(taxLookUpVO.getEndDate());
//        this.setFixedTax(taxLookUpVO.getFixedTax());
//        this.setVariableTax(taxLookUpVO.getVariableTax());
//    }
//    public TaxLookUpVO populateToVO() {
//        TaxLookUpVO taxLookUpVO=new TaxLookUpVO();
//        taxLookUpVO.setId(this.id);
//        taxLookUpVO.setCity(this.city);
//        taxLookUpVO.setBasis(this.basis);
//        taxLookUpVO.setCountry(this.country);
//        taxLookUpVO.setFixedTax(this.fixedTax);
//        taxLookUpVO.setCounty(this.county);
//        taxLookUpVO.setInstitutionCode(this.institutionCode);
//        taxLookUpVO.setLoanPurpose(this.loanPurpose);
//        taxLookUpVO.setVariableTax(this.variableTax);
//        taxLookUpVO.setTaxType(this.taxType);
//        taxLookUpVO.setZip(this.zip);
//        taxLookUpVO.setEffectiveDate(this.effectiveDate);
//        taxLookUpVO.setEndDate(this.endDate);
//        taxLookUpVO.setZip(this.zip);
//        taxLookUpVO.setState(this.state);
//        return taxLookUpVO;
//    }
}
