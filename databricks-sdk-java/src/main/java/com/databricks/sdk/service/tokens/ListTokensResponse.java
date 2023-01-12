// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.tokens;

import java.util.Map;

import javax.annotation.Generated;
import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



@Generated("databricks-sdk-generator")
public class ListTokensResponse {
    /**
     * The information for each token.
     */
    @JsonProperty("token_infos")
    private java.util.List<PublicTokenInfo> tokenInfos;
    
    public ListTokensResponse setTokenInfos(java.util.List<PublicTokenInfo> tokenInfos) {
        this.tokenInfos = tokenInfos;
        return this;
    }

    public java.util.List<PublicTokenInfo> getTokenInfos() {
        return tokenInfos;
    }
    
}
