// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.secrets;

import java.util.Map;

import javax.annotation.Generated;
import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * List secret keys
 */
@Generated("databricks-sdk-generator")
public class ListSecrets {
    /**
     * The name of the scope to list secrets within.
     */
    @QueryParam("scope")
    private String scope;
    
    public ListSecrets setScope(String scope) {
        this.scope = scope;
        return this;
    }

    public String getScope() {
        return scope;
    }
    
}
