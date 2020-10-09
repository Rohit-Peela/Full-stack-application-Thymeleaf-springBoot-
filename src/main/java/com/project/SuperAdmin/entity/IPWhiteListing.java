/********************************************************************
 * CreditSnap
 * All Rights Reserved
 *
 * File: IPWhiteListing.java
 ********************************************************************
 *
 *  Ver   Date              Author             Description
 *  ====  ========          ============       ==================
 *  1.0  Jan 09, 2019       Rama Ganesh            Created
 / ********************************************************************/
package com.project.SuperAdmin.entity;

import javax.persistence.*;

@Entity
@Table(name = "IP_WHITE_LISTING")
public class IPWhiteListing extends AuditableEntity {
	
	private Long ipId;
	private String institutionCode;
	private String idAddress;
	private String apiName;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long getIpId() {
		return ipId;
	}

	public void setIpId(Long ipId) {
		this.ipId = ipId;
	}

	public String getInstitutionCode() {
		return institutionCode;
	}

	public void setInstitutionCode(String institutionCode) {
		this.institutionCode = institutionCode;
	}

	public String getIdAddress() {
		return idAddress;
	}

	public void setIdAddress(String idAddress) {
		this.idAddress = idAddress;
	}

	public String getApiName() {
		return apiName;
	}

	public void setApiName(String apiName) {
		this.apiName = apiName;
	}

}
