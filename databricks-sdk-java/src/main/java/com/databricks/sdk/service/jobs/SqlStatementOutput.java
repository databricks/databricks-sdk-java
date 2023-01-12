// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import java.util.Map;

import javax.annotation.Generated;
import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



@Generated("databricks-sdk-generator")
public class SqlStatementOutput {
    /**
     * A key that can be used to look up query details.
     */
    @JsonProperty("lookup_key")
    private String lookupKey;
    
    public SqlStatementOutput setLookupKey(String lookupKey) {
        this.lookupKey = lookupKey;
        return this;
    }

    public String getLookupKey() {
        return lookupKey;
    }
    
}
