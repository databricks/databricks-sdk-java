// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.secrets;

import java.util.Map;

import javax.annotation.Generated;
import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



@Generated("databricks-sdk-generator")
public class ListScopesResponse {
    /**
     * The available secret scopes.
     */
    @JsonProperty("scopes")
    private java.util.List<SecretScope> scopes;
    
    public ListScopesResponse setScopes(java.util.List<SecretScope> scopes) {
        this.scopes = scopes;
        return this;
    }

    public java.util.List<SecretScope> getScopes() {
        return scopes;
    }
    
}
