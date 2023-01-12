// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.tokenmanagement;

import java.util.Map;

import javax.annotation.Generated;
import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



@Generated("databricks-sdk-generator")
public class ListTokensResponse {
    /**
     
     */
    @JsonProperty("token_infos")
    private java.util.List<TokenInfo> tokenInfos;
    
    public ListTokensResponse setTokenInfos(java.util.List<TokenInfo> tokenInfos) {
        this.tokenInfos = tokenInfos;
        return this;
    }

    public java.util.List<TokenInfo> getTokenInfos() {
        return tokenInfos;
    }
    
}
