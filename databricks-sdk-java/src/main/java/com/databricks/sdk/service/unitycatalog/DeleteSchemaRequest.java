// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.unitycatalog;

import java.util.Map;

import javax.annotation.Generated;
import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Delete a schema
 */
@Generated("databricks-sdk-generator")
public class DeleteSchemaRequest {
    /**
     * Required. Full name of the schema (from URL).
     */
    
    private String fullName;
    
    public DeleteSchemaRequest setFullName(String fullName) {
        this.fullName = fullName;
        return this;
    }

    public String getFullName() {
        return fullName;
    }
    
}
