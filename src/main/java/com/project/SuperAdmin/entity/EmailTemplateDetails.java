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
@Table(name = "EMAIL_TEMPLATE_DETAILS")
public class EmailTemplateDetails extends AuditableEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	 private Long emailTemplateId;
	 private String institutionName;
	 private String channel;
	 private String loanPurpose;
	 private String communicationType;
	 private String templateName;
	 private String templateDesc;
	 private Boolean activeIndicator;
	 private Integer day;
	 private String fromEmail;
	 private String sendGridApiKey;
	 private String subject;


//	public Long getEmailTemplateId() {
//		return emailTemplateId;
//	}
//
//	public void setEmailTemplateId(Long emailTemplateId) {
//		this.emailTemplateId = emailTemplateId;
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
//	public String getTemplateName() {
//		return templateName;
//	}
//
//	public void setTemplateName(String templateName) {
//		this.templateName = templateName;
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
//	public String getFromEmail() {
//		return fromEmail;
//	}
//
//	public void setFromEmail(String fromEmail) {
//		this.fromEmail = fromEmail;
//	}
//
//	public String getSendGridApiKey() {
//		return sendGridApiKey;
//	}
//
//	public void setSendGridApiKey(String sendGridApiKey) {
//		this.sendGridApiKey = sendGridApiKey;
//	}
//
//	public String getSubject() {
//		return subject;
//	}
//
//	public void setSubject(String subject) {
//		this.subject = subject;
//	}
//
//	@Override
//	public boolean equals(Object o) {
//		if (this == o) return true;
//		if (o == null || getClass() != o.getClass()) return false;
//		EmailTemplateDetails that = (EmailTemplateDetails) o;
//		return Objects.equals(emailTemplateId, that.emailTemplateId) &&
//				Objects.equals(institutionName, that.institutionName) &&
//				Objects.equals(channel, that.channel) &&
//				Objects.equals(loanPurpose, that.loanPurpose) &&
//				Objects.equals(communicationType, that.communicationType) &&
//				Objects.equals(templateName, that.templateName) &&
//				Objects.equals(activeIndicator, that.activeIndicator);
//	}
//
//	@Override
//	public int hashCode() {
//		return Objects.hash(emailTemplateId, institutionName, channel, loanPurpose, communicationType, templateName, activeIndicator);
//	}
}
