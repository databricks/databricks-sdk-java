// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.unitycatalog;

import java.util.Map;

import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



public class UpdateSchema {
    /**
     * User-provided free-form text description.
     */
    @JsonProperty("comment")
    private String comment;
    
    /**
     * Full name of the schema.
     */
    
    private String fullName;
    
    /**
     * Name of schema, relative to parent catalog.
     */
    @JsonProperty("name")
    private String name;
    
    /**
     * Username of current owner of schema.
     */
    @JsonProperty("owner")
    private String owner;
    
    /**
     * A map of key-value properties attached to the securable.
     */
    @JsonProperty("properties")
    private Map<String,String> properties;
    
    public UpdateSchema setComment(String comment) {
        this.comment = comment;
        return this;
    }

    public String getComment() {
        return comment;
    }
    
    public UpdateSchema setFullName(String fullName) {
        this.fullName = fullName;
        return this;
    }

    public String getFullName() {
        return fullName;
    }
    
    public UpdateSchema setName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return name;
    }
    
    public UpdateSchema setOwner(String owner) {
        this.owner = owner;
        return this;
    }

    public String getOwner() {
        return owner;
    }
    
    public UpdateSchema setProperties(Map<String,String> properties) {
        this.properties = properties;
        return this;
    }

    public Map<String,String> getProperties() {
        return properties;
    }
    
}
