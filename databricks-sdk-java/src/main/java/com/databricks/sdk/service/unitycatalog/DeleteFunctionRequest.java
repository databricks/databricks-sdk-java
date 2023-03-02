// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.unitycatalog;

import java.util.Map;

import javax.annotation.Generated;
import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Delete a function
 */
@Generated("databricks-sdk-generator")
public class DeleteFunctionRequest {
    /**
     * Force deletion even if the function is notempty.
     */
    @QueryParam("force")
    private Boolean force;
    
    /**
     * The fully-qualified name of the function (of the form
     * __catalog_name__.__schema_name__.__function__name__).
     */
    
    private String name;
    
    public DeleteFunctionRequest setForce(Boolean force) {
        this.force = force;
        return this;
    }

    public Boolean getForce() {
        return force;
    }
    
    public DeleteFunctionRequest setName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return name;
    }
    
}
