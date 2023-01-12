// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.tokenmanagement;

import java.util.Map;

import javax.annotation.Generated;
import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



@Generated("databricks-sdk-generator")
public class CreateOboTokenResponse {
    /**
     
     */
    @JsonProperty("token_info")
    private TokenInfo tokenInfo;
    
    /**
     * Value of the token.
     */
    @JsonProperty("token_value")
    private String tokenValue;
    
    public CreateOboTokenResponse setTokenInfo(TokenInfo tokenInfo) {
        this.tokenInfo = tokenInfo;
        return this;
    }

    public TokenInfo getTokenInfo() {
        return tokenInfo;
    }
    
    public CreateOboTokenResponse setTokenValue(String tokenValue) {
        this.tokenValue = tokenValue;
        return this;
    }

    public String getTokenValue() {
        return tokenValue;
    }
    
}
