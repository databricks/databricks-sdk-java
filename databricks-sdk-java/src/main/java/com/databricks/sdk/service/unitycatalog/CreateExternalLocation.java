// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.unitycatalog;

import java.util.Map;

import javax.annotation.Generated;
import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



@Generated("databricks-sdk-generator")
public class CreateExternalLocation {
    /**
     * User-provided free-form text description.
     */
    @JsonProperty("comment")
    private String comment;
    
    /**
     * Name of the storage credential used with this location.
     */
    @JsonProperty("credential_name")
    private String credentialName;
    
    /**
     * Name of the external location.
     */
    @JsonProperty("name")
    private String name;
    
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
     * Path URL of the external location.
     */
    @JsonProperty("url")
    private String url;
    
    public CreateExternalLocation setComment(String comment) {
        this.comment = comment;
        return this;
    }

    public String getComment() {
        return comment;
    }
    
    public CreateExternalLocation setCredentialName(String credentialName) {
        this.credentialName = credentialName;
        return this;
    }

    public String getCredentialName() {
        return credentialName;
    }
    
    public CreateExternalLocation setName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return name;
    }
    
    public CreateExternalLocation setReadOnly(Boolean readOnly) {
        this.readOnly = readOnly;
        return this;
    }

    public Boolean getReadOnly() {
        return readOnly;
    }
    
    public CreateExternalLocation setSkipValidation(Boolean skipValidation) {
        this.skipValidation = skipValidation;
        return this;
    }

    public Boolean getSkipValidation() {
        return skipValidation;
    }
    
    public CreateExternalLocation setUrl(String url) {
        this.url = url;
        return this;
    }

    public String getUrl() {
        return url;
    }
    
}
