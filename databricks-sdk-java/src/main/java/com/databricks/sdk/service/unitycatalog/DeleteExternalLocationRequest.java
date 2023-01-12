// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.unitycatalog;

import java.util.Map;

import javax.annotation.Generated;
import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Delete an external location
 */
@Generated("databricks-sdk-generator")
public class DeleteExternalLocationRequest {
    /**
     * Force deletion even if there are dependent external tables or mounts.
     */
    @QueryParam("force")
    private Boolean force;
    
    /**
     * Required. Name of the storage credential.
     */
    
    private String name;
    
    public DeleteExternalLocationRequest setForce(Boolean force) {
        this.force = force;
        return this;
    }

    public Boolean getForce() {
        return force;
    }
    
    public DeleteExternalLocationRequest setName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return name;
    }
    
}
