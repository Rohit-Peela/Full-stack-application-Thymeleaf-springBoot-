package com.project.SuperAdmin.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "BUREAU_CONFIG_DETAILS")
@Getter
@Setter
public class BureauConfigDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long  bureauConfigId;
    private String institutionCode;
    private String bureauName;
    private String bureauScoreCode;
    private String bureauAdditionalScoreCode;
    private String inquiryType;
    private String endPoint;
    private String userName;
    private String password;
    private String cbcCustomerId;
    private String tuSubscriberPrefixCode;
    private String tuKeyStoreLocation;
    private String tuCertPassword;
    private String tuIndustryCode;
    private String tuProductCode;

//    public BureauConfigDetailsVO populateToVO() {
//        BureauConfigDetailsVO bureauConfigDetailsVO  = new BureauConfigDetailsVO();
//        bureauConfigDetailsVO.setBureauAdditionalScoreCode(this.bureauAdditionalScoreCode);
//        bureauConfigDetailsVO.setBureauConfigId(this.bureauConfigId);
//        bureauConfigDetailsVO.setBureauName(this.bureauName);
//        bureauConfigDetailsVO.setBureauScoreCode(this.bureauScoreCode);
//        bureauConfigDetailsVO.setCbcCustomerId(this.cbcCustomerId);
//        bureauConfigDetailsVO.setEndPoint(this.endPoint);
//        bureauConfigDetailsVO.setInquiryType(this.inquiryType);
//        bureauConfigDetailsVO.setPassword(this.password);
//        bureauConfigDetailsVO.setTuCertPassword(this.tuCertPassword);
//        bureauConfigDetailsVO.setTuKeyStoreLocation(this.tuKeyStoreLocation);
//        bureauConfigDetailsVO.setTuSubscriberPrefixCode(this.tuSubscriberPrefixCode);
//        bureauConfigDetailsVO.setInstitutionCode(this.institutionCode);
//        bureauConfigDetailsVO.setUserName(this.userName);
//        bureauConfigDetailsVO.setTuProductCode(this.tuProductCode);
//        bureauConfigDetailsVO.setTuIndustryCode(this.tuIndustryCode);
//        return bureauConfigDetailsVO;
//
//    }
}
