package com.project.SuperAdmin.entity;



import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name = "LENDER_MENU")
public class LenderMenu extends AuditableEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long menuId;
    private Long lenderId;
    private String title;
    private String link;
    private Long parentMenuId;
    private Boolean internal;
    private String icon;
    private Boolean href;
    private String institutionCode;


//    public Long getMenuId() {
//        return menuId;
//    }
//
//    public void setMenuId(Long menuId) {
//        this.menuId = menuId;
//    }
//
//    public Long getLenderId() {
//        return lenderId;
//    }
//
//    public void setLenderId(Long lenderId) {
//        this.lenderId = lenderId;
//    }
//
//    public boolean isInternal() {
//        return internal;
//    }
//
//    public void setInternal(boolean internal) {
//        this.internal = internal;
//    }
//
//    public String getTitle() {
//        return title;
//    }
//
//    public void setTitle(String title) {
//        this.title = title;
//    }
//
//    public String getLink() {
//        return link;
//    }
//
//    public void setLink(String link) {
//        this.link = link;
//    }
//
//    public Long getParentMenuId() {
//        return parentMenuId;
//    }
//
//    public void setParentMenuId(Long parentMenuId) {
//        this.parentMenuId = parentMenuId;
//    }
//
//    public String getIcon() {
//        return icon;
//    }
//
//    public void setIcon(String icon) {
//        this.icon = icon;
//    }
//
//    public boolean isHref() {
//        return href;
//    }
//
//    public void setHref(boolean href) {
//        this.href = href;
//    }
//
////    public LenderMenuVO populateToVO() {
////        LenderMenuVO lenderMenuVO = new LenderMenuVO();
////        lenderMenuVO.setMenuId(this.getMenuId());
////        lenderMenuVO.setInternal(this.isInternal());
////        lenderMenuVO.setLenderId(this.getLenderId());
////        lenderMenuVO.setPage(this.getLink());
////        lenderMenuVO.setParentMenuId(this.getParentMenuId());
////        lenderMenuVO.setTitle(this.getTitle());
////        lenderMenuVO.setHref(this.isHref());
////        lenderMenuVO.setIcon(this.getIcon());
////         return lenderMenuVO;
////    }
////
////    public void populateFromVO(LenderMenuVO lenderMenuVO) {
////        this.setMenuId(lenderMenuVO.getMenuId());
////        this.setLenderId(lenderMenuVO.getLenderId());
////        this.setTitle(lenderMenuVO.getTitle());
////        this.setLink(lenderMenuVO.getPage());
////        this.setInternal(lenderMenuVO.isInternal());
////    }
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
