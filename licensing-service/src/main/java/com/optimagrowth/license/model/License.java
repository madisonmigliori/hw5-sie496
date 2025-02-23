package com.optimagrowth.license.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.hateoas.RepresentationModel;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="licenses")
public class License extends RepresentationModel<License> {

    @Id
    @Column(name = "license_id", nullable = false)
    private String licenseId;
    
    private String description;
    
    @Column(name = "organization_id", nullable = false)
    private String organizationId;
    
    @Column(name = "product_name", nullable = false)
    private String productName;
    
    @Column(name = "license_type", nullable = false)
    private String licenseType;
    
    @Column(name="comment")
    private String comment;

    // Getter and Setter for licenseId
    public String getLicenseId() {
        return licenseId;
    }
    
    public void setLicenseId(String licenseId) {
        this.licenseId = licenseId;
    }

    // Getter and Setter for description
    public String getDescription() {
        return description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }

    // Getter and Setter for organizationId
    public String getOrganizationId() {
        return organizationId;
    }
    
    public void setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
    }

    // Getter and Setter for productName
    public String getProductName() {
        return productName;
    }
    
    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getLicenseType() {
        return licenseType;
    }
    
    public void setLicenseType(String licenseType) {
        this.licenseType = licenseType;
    }

    public String getComment() {
        return comment;
    }
    
    public void setComment(String comment) {
        this.comment = comment;
    }

    public License withComment(String comment) {
        this.setComment(comment);
        return this;
    }
}
