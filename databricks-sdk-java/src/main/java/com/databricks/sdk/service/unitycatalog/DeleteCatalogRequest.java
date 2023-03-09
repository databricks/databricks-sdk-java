// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.unitycatalog;

import java.util.Map;

import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Delete a catalog
 */
public class DeleteCatalogRequest {
    /**
     * Force deletion even if the catalog is not empty.
     */
    @QueryParam("force")
    private Boolean force;
    
    /**
     * The name of the catalog.
     */
    
    private String name;
    
    public DeleteCatalogRequest setForce(Boolean force) {
        this.force = force;
        return this;
    }

    public Boolean getForce() {
        return force;
    }
    
    public DeleteCatalogRequest setName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return name;
    }
    
}
