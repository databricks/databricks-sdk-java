// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.unitycatalog;

import java.util.Map;

import javax.annotation.Generated;
import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



@Generated("databricks-sdk-generator")
public class UpdateExternalLocation {
    /**
     * User-provided free-form text description.
     */
    @JsonProperty("comment")
    private String comment;
    
    /**
     * Current name of the Storage Credential this location uses.
     */
    @JsonProperty("credential_name")
    private String credentialName;
    
    /**
     * Force update even if changing url invalidates dependent external tables
     * or mounts.
     */
    @JsonProperty("force")
    private Boolean force;
    
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
     * Skips validation of the storage credential associated with the external
     * location.
     */
    @JsonProperty("skip_validation")
    private Boolean skipValidation;
    
    /**
     * Path URL of the External Location.
     */
    @JsonProperty("url")
    private String url;
    
    public UpdateExternalLocation setComment(String comment) {
        this.comment = comment;
        return this;
    }

    public String getComment() {
        return comment;
    }
    
    public UpdateExternalLocation setCredentialName(String credentialName) {
        this.credentialName = credentialName;
        return this;
    }

    public String getCredentialName() {
        return credentialName;
    }
    
    public UpdateExternalLocation setForce(Boolean force) {
        this.force = force;
        return this;
    }

    public Boolean getForce() {
        return force;
    }
    
    public UpdateExternalLocation setName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return name;
    }
    
    public UpdateExternalLocation setOwner(String owner) {
        this.owner = owner;
        return this;
    }

    public String getOwner() {
        return owner;
    }
    
    public UpdateExternalLocation setReadOnly(Boolean readOnly) {
        this.readOnly = readOnly;
        return this;
    }

    public Boolean getReadOnly() {
        return readOnly;
    }
    
    public UpdateExternalLocation setSkipValidation(Boolean skipValidation) {
        this.skipValidation = skipValidation;
        return this;
    }

    public Boolean getSkipValidation() {
        return skipValidation;
    }
    
    public UpdateExternalLocation setUrl(String url) {
        this.url = url;
        return this;
    }

    public String getUrl() {
        return url;
    }
    
}
