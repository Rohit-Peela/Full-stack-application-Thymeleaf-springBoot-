package com.project.SuperAdmin.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Objects;

@Entity
//@Table(name = "INSTITUTION_DETAILS")
@Getter
@Setter
public class InstitutionDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long  institutionDetailsId;
    private String institutionName;
    private String institutionCode;
    private String ssnUpdateModel;
    private String returnUrl;
    private Double thresholdRelevanceScore;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        InstitutionDetails that = (InstitutionDetails) o;
        return Objects.equals(institutionDetailsId, that.institutionDetailsId) &&
                Objects.equals(institutionName, that.institutionName) &&
                Objects.equals(institutionCode, that.institutionCode) &&
                Objects.equals(thresholdRelevanceScore, that.thresholdRelevanceScore);
    }

    @Override
    public int hashCode() {
        return Objects.hash(institutionDetailsId, institutionName, institutionCode, thresholdRelevanceScore);
    }
}
