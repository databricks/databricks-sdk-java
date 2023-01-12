// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.unitycatalog;

import java.util.Map;

import javax.annotation.Generated;
import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



@Generated("databricks-sdk-generator")
public class RotateRecipientToken {
    /**
     * Required. This will set the expiration_time of existing token only to a
     * smaller timestamp, it cannot extend the expiration_time. Use 0 to expire
     * the existing token immediately, negative number will return an error.
     */
    @JsonProperty("existing_token_expire_in_seconds")
    private Long existingTokenExpireInSeconds;
    
    /**
     * Required. The name of the recipient.
     */
    
    private String name;
    
    public RotateRecipientToken setExistingTokenExpireInSeconds(Long existingTokenExpireInSeconds) {
        this.existingTokenExpireInSeconds = existingTokenExpireInSeconds;
        return this;
    }

    public Long getExistingTokenExpireInSeconds() {
        return existingTokenExpireInSeconds;
    }
    
    public RotateRecipientToken setName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return name;
    }
    
}
