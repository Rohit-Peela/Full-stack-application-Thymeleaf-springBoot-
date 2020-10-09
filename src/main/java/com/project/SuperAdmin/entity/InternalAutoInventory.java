package com.project.SuperAdmin.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "INTERNAL_AUTO_INVENTORY")
@Getter
@Setter
public class InternalAutoInventory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long internalAutoInventoryId;
    private String year;
    private String make;
    private String model;
    private String series;
    private Timestamp effectiveDate;
    private Timestamp endDate;
    private String institutionCode;
    private String loanPurpose;
    private String imageUrl;
    private int displayOrder;
    private double displayPrice;
    private double msrp;
    private double invoicePrice;

//    public InternalAutoInventoryVO populateToVO() {
//        InternalAutoInventoryVO inventoryVO = new InternalAutoInventoryVO();
//        inventoryVO.setInternalAutoInventoryId(this.internalAutoInventoryId);
//        inventoryVO.setYear(this.year);
//        inventoryVO.setMake(this.make);
//        inventoryVO.setModel(this.model);
//        inventoryVO.setSeries(this.series);
//        inventoryVO.setEffectiveDate(this.effectiveDate);
//        inventoryVO.setEndDate(this.endDate);
//        inventoryVO.setInstitutionCode(this.institutionCode);
//        inventoryVO.setLoanPurpose(this.loanPurpose);
//        inventoryVO.setImageUrl(this.imageUrl);
//        inventoryVO.setDisplayOrder(this.displayOrder);
//        inventoryVO.setDisplayPrice(this.displayPrice);
//        inventoryVO.setRetailValue(this.msrp);
//        inventoryVO.setTradeIn(this.invoicePrice);
//        return inventoryVO;
//    }
}
