// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.deployment;

import java.util.Map;

import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Get a private access settings object
 */
public class GetPrivateAccesRequest {
    /**
     * Databricks Account API private access settings ID.
     */
    
    private String privateAccessSettingsId;
    
    public GetPrivateAccesRequest setPrivateAccessSettingsId(String privateAccessSettingsId) {
        this.privateAccessSettingsId = privateAccessSettingsId;
        return this;
    }

    public String getPrivateAccessSettingsId() {
        return privateAccessSettingsId;
    }
    
}
