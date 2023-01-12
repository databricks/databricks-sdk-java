// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.unitycatalog;

import java.util.Map;

import javax.annotation.Generated;
import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



@Generated("databricks-sdk-generator")
public class UpdateShare {
    /**
     * User-provided free-form text description.
     */
    @JsonProperty("comment")
    private String comment;
    
    /**
     * Name of the Share.
     */
    @JsonProperty("name")
    private String name;
    
    /**
     * Username of current owner of Share.
     */
    @JsonProperty("owner")
    private String owner;
    
    /**
     * Array of shared data object updates.
     */
    @JsonProperty("updates")
    private java.util.List<SharedDataObjectUpdate> updates;
    
    public UpdateShare setComment(String comment) {
        this.comment = comment;
        return this;
    }

    public String getComment() {
        return comment;
    }
    
    public UpdateShare setName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return name;
    }
    
    public UpdateShare setOwner(String owner) {
        this.owner = owner;
        return this;
    }

    public String getOwner() {
        return owner;
    }
    
    public UpdateShare setUpdates(java.util.List<SharedDataObjectUpdate> updates) {
        this.updates = updates;
        return this;
    }

    public java.util.List<SharedDataObjectUpdate> getUpdates() {
        return updates;
    }
    
}
