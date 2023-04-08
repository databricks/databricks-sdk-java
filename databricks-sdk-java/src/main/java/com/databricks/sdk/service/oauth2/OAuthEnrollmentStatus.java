// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.oauth2;

import java.util.Map;

import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



public class OAuthEnrollmentStatus {
    /**
     * Is OAuth enrolled for the account.
     */
    @JsonProperty("is_enabled")
    private Boolean isEnabled;
    
    public OAuthEnrollmentStatus setIsEnabled(Boolean isEnabled) {
        this.isEnabled = isEnabled;
        return this;
    }

    public Boolean getIsEnabled() {
        return isEnabled;
    }
    
}
