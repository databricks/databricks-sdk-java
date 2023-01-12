// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.unitycatalog;

import java.util.Map;

import javax.annotation.Generated;
import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Get an access token
 */
@Generated("databricks-sdk-generator")
public class RetrieveTokenRequest {
    /**
     * Required. The one time activation url. It also accepts activation token.
     */
    
    private String activationUrl;
    
    public RetrieveTokenRequest setActivationUrl(String activationUrl) {
        this.activationUrl = activationUrl;
        return this;
    }

    public String getActivationUrl() {
        return activationUrl;
    }
    
}
