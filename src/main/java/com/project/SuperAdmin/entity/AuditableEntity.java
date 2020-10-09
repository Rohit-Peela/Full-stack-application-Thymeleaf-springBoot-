package com.project.SuperAdmin.entity;



import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import java.util.Date;

@MappedSuperclass
public abstract class AuditableEntity {
    protected Date createdDate;
    private String createdBy;
    private Date updateDate;
    private String updatedBy;

    @Column(name = "ADDED_BY", length = 20)
    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    @Column(name = "ADDED_TS")
    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    @Column(name = "MODIFIED_BY", length = 20)
    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    @Column(name = "MODIFIED_TS")
    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    @PrePersist
    public void setCreationDate() {
        this.updateDate = new Date();
        this.createdDate = new Date();
    }

    @PreUpdate
    public void setChangeDate() {
        this.updateDate = new Date();
    }
}

