// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.scim;

import java.util.Map;

import javax.annotation.Generated;
import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



@Generated("databricks-sdk-generator")
public class ServicePrincipal {
    /**
     * If this user is active
     */
    @JsonProperty("active")
    private Boolean active;
    
    /**
     * UUID relating to the service principal
     */
    @JsonProperty("applicationId")
    private String applicationId;
    
    /**
     * String that represents a concatenation of given and family names.
     */
    @JsonProperty("displayName")
    private String displayName;
    
    /**
     
     */
    @JsonProperty("entitlements")
    private java.util.List<ComplexValue> entitlements;
    
    /**
     
     */
    @JsonProperty("externalId")
    private String externalId;
    
    /**
     
     */
    @JsonProperty("groups")
    private java.util.List<ComplexValue> groups;
    
    /**
     * Databricks service principal ID.
     */
    @JsonProperty("id")
    private String id;
    
    /**
     
     */
    @JsonProperty("roles")
    private java.util.List<ComplexValue> roles;
    
    public ServicePrincipal setActive(Boolean active) {
        this.active = active;
        return this;
    }

    public Boolean getActive() {
        return active;
    }
    
    public ServicePrincipal setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }

    public String getApplicationId() {
        return applicationId;
    }
    
    public ServicePrincipal setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    public String getDisplayName() {
        return displayName;
    }
    
    public ServicePrincipal setEntitlements(java.util.List<ComplexValue> entitlements) {
        this.entitlements = entitlements;
        return this;
    }

    public java.util.List<ComplexValue> getEntitlements() {
        return entitlements;
    }
    
    public ServicePrincipal setExternalId(String externalId) {
        this.externalId = externalId;
        return this;
    }

    public String getExternalId() {
        return externalId;
    }
    
    public ServicePrincipal setGroups(java.util.List<ComplexValue> groups) {
        this.groups = groups;
        return this;
    }

    public java.util.List<ComplexValue> getGroups() {
        return groups;
    }
    
    public ServicePrincipal setId(String id) {
        this.id = id;
        return this;
    }

    public String getId() {
        return id;
    }
    
    public ServicePrincipal setRoles(java.util.List<ComplexValue> roles) {
        this.roles = roles;
        return this;
    }

    public java.util.List<ComplexValue> getRoles() {
        return roles;
    }
    
}
