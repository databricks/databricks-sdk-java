// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.unitycatalog;

import java.util.Map;

import javax.annotation.Generated;
import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



@Generated("databricks-sdk-generator")
public class CreateProvider {
    /**
     * The delta sharing authentication type.
     */
    @JsonProperty("authentication_type")
    private AuthenticationType authenticationType;
    
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
    
    public CreateProvider setAuthenticationType(AuthenticationType authenticationType) {
        this.authenticationType = authenticationType;
        return this;
    }

    public AuthenticationType getAuthenticationType() {
        return authenticationType;
    }
    
    public CreateProvider setComment(String comment) {
        this.comment = comment;
        return this;
    }

    public String getComment() {
        return comment;
    }
    
    public CreateProvider setName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return name;
    }
    
    public CreateProvider setOwner(String owner) {
        this.owner = owner;
        return this;
    }

    public String getOwner() {
        return owner;
    }
    
    public CreateProvider setRecipientProfileStr(String recipientProfileStr) {
        this.recipientProfileStr = recipientProfileStr;
        return this;
    }

    public String getRecipientProfileStr() {
        return recipientProfileStr;
    }
    
}
