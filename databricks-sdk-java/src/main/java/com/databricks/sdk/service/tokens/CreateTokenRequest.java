// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.tokens;

import java.util.Map;

import javax.annotation.Generated;
import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



@Generated("databricks-sdk-generator")
public class CreateTokenRequest {
    /**
     * Optional description to attach to the token.
     */
    @JsonProperty("comment")
    private String comment;
    
    /**
     * The lifetime of the token, in seconds.
     * 
     * If the ifetime is not specified, this token remains valid indefinitely.
     */
    @JsonProperty("lifetime_seconds")
    private Long lifetimeSeconds;
    
    public CreateTokenRequest setComment(String comment) {
        this.comment = comment;
        return this;
    }

    public String getComment() {
        return comment;
    }
    
    public CreateTokenRequest setLifetimeSeconds(Long lifetimeSeconds) {
        this.lifetimeSeconds = lifetimeSeconds;
        return this;
    }

    public Long getLifetimeSeconds() {
        return lifetimeSeconds;
    }
    
}
