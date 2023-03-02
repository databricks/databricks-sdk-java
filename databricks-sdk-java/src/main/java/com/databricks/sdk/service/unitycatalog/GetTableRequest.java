// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.unitycatalog;

import java.util.Map;

import javax.annotation.Generated;
import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Get a table
 */
@Generated("databricks-sdk-generator")
public class GetTableRequest {
    /**
     * Full name of the table.
     */
    
    private String fullName;
    
    /**
     * Whether delta metadata should be included in the response.
     */
    @QueryParam("include_delta_metadata")
    private Boolean includeDeltaMetadata;
    
    public GetTableRequest setFullName(String fullName) {
        this.fullName = fullName;
        return this;
    }

    public String getFullName() {
        return fullName;
    }
    
    public GetTableRequest setIncludeDeltaMetadata(Boolean includeDeltaMetadata) {
        this.includeDeltaMetadata = includeDeltaMetadata;
        return this;
    }

    public Boolean getIncludeDeltaMetadata() {
        return includeDeltaMetadata;
    }
    
}
