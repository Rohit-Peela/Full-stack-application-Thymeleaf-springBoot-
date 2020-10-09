/********************************************************************
 * CreditSnap
 * All Rights Reserved
 *
 * File: CampaignDetails.java
 ********************************************************************
 *
 *  Ver   Date              Author             Description
 *  ====  ========          ============       ==================
 *  1.0  Dec 20, 2018       KulaSekhar            Created
 / ********************************************************************/
package com.project.SuperAdmin.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Getter
@Setter
@Table(name = "SMS_TEMPLATE_DETAILS")
public class SMSTemplateDetails extends AuditableEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	 private Long smsTemplateId;
	 private String institutionName;
	 private String channel;
	 private String loanPurpose;
	 private String communicationType;
	 private String smsText;
	 private Boolean activeIndicator;
	 private Integer day;
	 private String fromPhoneNUmber;
	 private String twilioAccountSid;
	 private String twilioAccountToken;


//	public Long getSmsTemplateId() {
//		return smsTemplateId;
//	}
//
//	public void setSmsTemplateId(Long smsTemplateId) {
//		this.smsTemplateId = smsTemplateId;
//	}
//
//	public String getInstitutionName() {
//		return institutionName;
//	}
//
//	public void setInstitutionName(String institutionName) {
//		this.institutionName = institutionName;
//	}
//
//	public String getChannel() {
//		return channel;
//	}
//
//	public void setChannel(String channel) {
//		this.channel = channel;
//	}
//
//	public String getLoanPurpose() {
//		return loanPurpose;
//	}
//
//	public void setLoanPurpose(String loanPurpose) {
//		this.loanPurpose = loanPurpose;
//	}
//
//	public String getCommunicationType() {
//		return communicationType;
//	}
//
//	public void setCommunicationType(String communicationType) {
//		this.communicationType = communicationType;
//	}
//
//	public String getSmsText() {
//		return smsText;
//	}
//
//	public void setSmsText(String smsText) {
//		this.smsText = smsText;
//	}
//
//	public Boolean getActiveIndicator() {
//		return activeIndicator;
//	}
//
//	public void setActiveIndicator(Boolean activeIndicator) {
//		this.activeIndicator = activeIndicator;
//	}
//
//	public Integer getDay() {
//		return day;
//	}
//
//	public void setDay(Integer day) {
//		this.day = day;
//	}
//
//	public String getFromPhoneNUmber() {
//		return fromPhoneNUmber;
//	}
//
//	public void setFromPhoneNUmber(String fromPhoneNUmber) {
//		this.fromPhoneNUmber = fromPhoneNUmber;
//	}
//
//	public String getTwilioAccountSid() {
//		return twilioAccountSid;
//	}
//
//	public void setTwilioAccountSid(String twilioAccountSid) {
//		this.twilioAccountSid = twilioAccountSid;
//	}
//
//	public String getTwilioAccountToken() {
//		return twilioAccountToken;
//	}
//
//	public void setTwilioAccountToken(String twilioAccountToken) {
//		this.twilioAccountToken = twilioAccountToken;
//	}
//
//	@Override
//	public boolean equals(Object o) {
//		if (this == o) return true;
//		if (o == null || getClass() != o.getClass()) return false;
//		SMSTemplateDetails that = (SMSTemplateDetails) o;
//		return Objects.equals(smsTemplateId, that.smsTemplateId) &&
//				Objects.equals(institutionName, that.institutionName) &&
//				Objects.equals(channel, that.channel) &&
//				Objects.equals(loanPurpose, that.loanPurpose) &&
//				Objects.equals(communicationType, that.communicationType) &&
//				Objects.equals(smsText, that.smsText) &&
//				Objects.equals(activeIndicator, that.activeIndicator) &&
//				Objects.equals(day, that.day) &&
//				Objects.equals(fromPhoneNUmber, that.fromPhoneNUmber);
//	}
//
//	@Override
//	public int hashCode() {
//		return Objects.hash(smsTemplateId, institutionName, channel, loanPurpose, communicationType, smsText, activeIndicator, day, fromPhoneNUmber);
//	}
}
