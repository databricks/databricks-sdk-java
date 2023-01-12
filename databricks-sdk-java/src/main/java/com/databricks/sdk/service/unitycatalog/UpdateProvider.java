// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.unitycatalog;

import java.util.Map;

import javax.annotation.Generated;
import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



@Generated("databricks-sdk-generator")
public class UpdateProvider {
    /**
     * Description about the provider.
     */
    @JsonProperty("comment")
    private String comment;
    
    /**
     * The name of the Provider.
     */
    @JsonProperty("name")
    private String name;
    
    /**
     * Username of Provider owner.
     */
    @JsonProperty("owner")
    private String owner;
    
    /**
     * This field is required when the authentication_type is `TOKEN` or not
     * provided.
     */
    @JsonProperty("recipient_profile_str")
    private String recipientProfileStr;
    
    public UpdateProvider setComment(String comment) {
        this.comment = comment;
        return this;
    }

    public String getComment() {
        return comment;
    }
    
    public UpdateProvider setName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return name;
    }
    
    public UpdateProvider setOwner(String owner) {
        this.owner = owner;
        return this;
    }

    public String getOwner() {
        return owner;
    }
    
    public UpdateProvider setRecipientProfileStr(String recipientProfileStr) {
        this.recipientProfileStr = recipientProfileStr;
        return this;
    }

    public String getRecipientProfileStr() {
        return recipientProfileStr;
    }
    
}
