// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.unitycatalog;

import java.util.Map;

import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



public class UpdateRecipient {
    /**
     * Description about the recipient.
     */
    @JsonProperty("comment")
    private String comment;
    
    /**
     * IP Access List
     */
    @JsonProperty("ip_access_list")
    private IpAccessList ipAccessList;
    
    /**
     * Name of Recipient.
     */
    @JsonProperty("name")
    private String name;
    
    /**
     * Username of the recipient owner.
     */
    @JsonProperty("owner")
    private String owner;
    
    /**
     * Recipient properties as map of string key-value pairs.
     * 
     * When provided in update request, the specified properties will override
     * the existing properties. To add and remove properties, one would need to
     * perform a read-modify-write.
     */
    @JsonProperty("properties_kvpairs")
    private Object /* MISSING TYPE */ propertiesKvpairs;
    
    public UpdateRecipient setComment(String comment) {
        this.comment = comment;
        return this;
    }

    public String getComment() {
        return comment;
    }
    
    public UpdateRecipient setIpAccessList(IpAccessList ipAccessList) {
        this.ipAccessList = ipAccessList;
        return this;
    }

    public IpAccessList getIpAccessList() {
        return ipAccessList;
    }
    
    public UpdateRecipient setName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return name;
    }
    
    public UpdateRecipient setOwner(String owner) {
        this.owner = owner;
        return this;
    }

    public String getOwner() {
        return owner;
    }
    
    public UpdateRecipient setPropertiesKvpairs(Object /* MISSING TYPE */ propertiesKvpairs) {
        this.propertiesKvpairs = propertiesKvpairs;
        return this;
    }

    public Object /* MISSING TYPE */ getPropertiesKvpairs() {
        return propertiesKvpairs;
    }
    
}
