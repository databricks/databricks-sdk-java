// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.unitycatalog;

import java.util.Map;

import javax.annotation.Generated;
import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



@Generated("databricks-sdk-generator")
public class UpdateCatalog {
    /**
     * User-provided free-form text description.
     */
    @JsonProperty("comment")
    private String comment;
    
    /**
     * Name of catalog.
     */
    @JsonProperty("name")
    private String name;
    
    /**
     * Username of current owner of catalog.
     */
    @JsonProperty("owner")
    private String owner;
    
    /**
     * A map of key-value properties attached to the securable.
     */
    @JsonProperty("properties")
    private Map<String,String> properties;
    
    public UpdateCatalog setComment(String comment) {
        this.comment = comment;
        return this;
    }

    public String getComment() {
        return comment;
    }
    
    public UpdateCatalog setName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return name;
    }
    
    public UpdateCatalog setOwner(String owner) {
        this.owner = owner;
        return this;
    }

    public String getOwner() {
        return owner;
    }
    
    public UpdateCatalog setProperties(Map<String,String> properties) {
        this.properties = properties;
        return this;
    }

    public Map<String,String> getProperties() {
        return properties;
    }
    
}
