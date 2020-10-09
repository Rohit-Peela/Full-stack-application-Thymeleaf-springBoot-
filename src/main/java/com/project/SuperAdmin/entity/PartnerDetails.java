package com.project.SuperAdmin.entity;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name = "PARTNER_DETAILS")
public class PartnerDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long partnerDetailsId;
    private String partnerNumber;
    private String partnerName;
    private String apiKey;
    private String referrerId;
    private String channel;
    private String institutionCode;
    private Boolean defaultIndicator;

//    public Long getPartnerDetailsId() {
//        return partnerDetailsId;
//    }
//
//    public void setPartnerDetailsId(Long partnerDetailsId) {
//        this.partnerDetailsId = partnerDetailsId;
//    }
//
//    public String getPartnerNumber() {
//        return partnerNumber;
//    }
//
//    public void setPartnerNumber(String partnerNumber) {
//        this.partnerNumber = partnerNumber;
//    }
//
//    public String getPartnerName() {
//        return partnerName;
//    }
//
//    public void setPartnerName(String partnerName) {
//        this.partnerName = partnerName;
//    }
//
//    public String getApiKey() {
//        return apiKey;
//    }
//
//    public void setApiKey(String apiKey) {
//        this.apiKey = apiKey;
//    }
//
//    public String getReferrerId() {
//        return referrerId;
//    }
//
//    public void setReferrerId(String referrerId) {
//        this.referrerId = referrerId;
//    }
//
//    public String getChannel() {
//        return channel;
//    }
//
//    public void setChannel(String channel) {
//        this.channel = channel;
//    }
//
//    public Boolean getDefaultIndicator() {
//        return defaultIndicator;
//    }
//
//    public void setDefaultIndicator(Boolean defaultIndicator) {
//        this.defaultIndicator = defaultIndicator;
//    }
//
////    public PartnerDetailsVO populateToVO() {
////    	PartnerDetailsVO partnerDetailsVO = new PartnerDetailsVO();
////    	partnerDetailsVO.setApiKey(this.getApiKey());
////    	partnerDetailsVO.setPartnerName(this.getPartnerName());
////    	partnerDetailsVO.setPartnerNumber(this.getPartnerNumber());
////    	partnerDetailsVO.setReferrerId(this.getReferrerId());
////    	partnerDetailsVO.setChannel(this.getChannel());
////    	partnerDetailsVO.setDefaultIndicator(this.getDefaultIndicator());
////    	partnerDetailsVO.setInstitutionCode(this.getInstitutionCode());
////
////		return partnerDetailsVO;
////	}
//
//	/**
//	 * @return the institutionCode
//	 */
//	public String getInstitutionCode() {
//		return institutionCode;
//	}
//
//	/**
//	 * @param institutionCode the institutionCode to set
//	 */
//	public void setInstitutionCode(String institutionCode) {
//		this.institutionCode = institutionCode;
//	}
}
