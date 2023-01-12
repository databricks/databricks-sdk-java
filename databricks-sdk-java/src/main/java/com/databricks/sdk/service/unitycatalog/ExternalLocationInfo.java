// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.unitycatalog;

import java.util.Map;

import javax.annotation.Generated;
import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



@Generated("databricks-sdk-generator")
public class ExternalLocationInfo {
    /**
     * User-provided free-form text description.
     */
    @JsonProperty("comment")
    private String comment;
    
    /**
     * Time at which this External Location was created, in epoch milliseconds.
     */
    @JsonProperty("created_at")
    private Long createdAt;
    
    /**
     * Username of External Location creator.
     */
    @JsonProperty("created_by")
    private String createdBy;
    
    /**
     * Unique ID of the location's Storage Credential.
     */
    @JsonProperty("credential_id")
    private String credentialId;
    
    /**
     * Current name of the Storage Credential this location uses.
     */
    @JsonProperty("credential_name")
    private String credentialName;
    
    /**
     * Unique identifier of Metastore hosting the External Location.
     */
    @JsonProperty("metastore_id")
    private String metastoreId;
    
    /**
     * Name of the External Location.
     */
    @JsonProperty("name")
    private String name;
    
    /**
     * The owner of the External Location.
     */
    @JsonProperty("owner")
    private String owner;
    
    /**
     * Indicates whether the external location is read-only.
     */
    @JsonProperty("read_only")
    private Boolean readOnly;
    
    /**
     * Time at which External Location this was last modified, in epoch
     * milliseconds.
     */
    @JsonProperty("updated_at")
    private Long updatedAt;
    
    /**
     * Username of user who last modified the External Location.
     */
    @JsonProperty("updated_by")
    private String updatedBy;
    
    /**
     * Path URL of the External Location.
     */
    @JsonProperty("url")
    private String url;
    
    public ExternalLocationInfo setComment(String comment) {
        this.comment = comment;
        return this;
    }

    public String getComment() {
        return comment;
    }
    
    public ExternalLocationInfo setCreatedAt(Long createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public Long getCreatedAt() {
        return createdAt;
    }
    
    public ExternalLocationInfo setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    public String getCreatedBy() {
        return createdBy;
    }
    
    public ExternalLocationInfo setCredentialId(String credentialId) {
        this.credentialId = credentialId;
        return this;
    }

    public String getCredentialId() {
        return credentialId;
    }
    
    public ExternalLocationInfo setCredentialName(String credentialName) {
        this.credentialName = credentialName;
        return this;
    }

    public String getCredentialName() {
        return credentialName;
    }
    
    public ExternalLocationInfo setMetastoreId(String metastoreId) {
        this.metastoreId = metastoreId;
        return this;
    }

    public String getMetastoreId() {
        return metastoreId;
    }
    
    public ExternalLocationInfo setName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return name;
    }
    
    public ExternalLocationInfo setOwner(String owner) {
        this.owner = owner;
        return this;
    }

    public String getOwner() {
        return owner;
    }
    
    public ExternalLocationInfo setReadOnly(Boolean readOnly) {
        this.readOnly = readOnly;
        return this;
    }

    public Boolean getReadOnly() {
        return readOnly;
    }
    
    public ExternalLocationInfo setUpdatedAt(Long updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    public Long getUpdatedAt() {
        return updatedAt;
    }
    
    public ExternalLocationInfo setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
        return this;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }
    
    public ExternalLocationInfo setUrl(String url) {
        this.url = url;
        return this;
    }

    public String getUrl() {
        return url;
    }
    
}
