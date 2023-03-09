// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.scim;

import java.util.Map;

import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



public class User {
    /**
     * If this user is active
     */
    @JsonProperty("active")
    private Boolean active;
    
    /**
     * String that represents a concatenation of given and family names. For
     * example `John Smith`.
     */
    @JsonProperty("displayName")
    private String displayName;
    
    /**
     * All the emails associated with the Databricks user.
     */
    @JsonProperty("emails")
    private java.util.List<ComplexValue> emails;
    
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
     * Databricks user ID.
     */
    @JsonProperty("id")
    private String id;
    
    /**
     
     */
    @JsonProperty("name")
    private Name name;
    
    /**
     
     */
    @JsonProperty("roles")
    private java.util.List<ComplexValue> roles;
    
    /**
     * Email address of the Databricks user.
     */
    @JsonProperty("userName")
    private String userName;
    
    public User setActive(Boolean active) {
        this.active = active;
        return this;
    }

    public Boolean getActive() {
        return active;
    }
    
    public User setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    public String getDisplayName() {
        return displayName;
    }
    
    public User setEmails(java.util.List<ComplexValue> emails) {
        this.emails = emails;
        return this;
    }

    public java.util.List<ComplexValue> getEmails() {
        return emails;
    }
    
    public User setEntitlements(java.util.List<ComplexValue> entitlements) {
        this.entitlements = entitlements;
        return this;
    }

    public java.util.List<ComplexValue> getEntitlements() {
        return entitlements;
    }
    
    public User setExternalId(String externalId) {
        this.externalId = externalId;
        return this;
    }

    public String getExternalId() {
        return externalId;
    }
    
    public User setGroups(java.util.List<ComplexValue> groups) {
        this.groups = groups;
        return this;
    }

    public java.util.List<ComplexValue> getGroups() {
        return groups;
    }
    
    public User setId(String id) {
        this.id = id;
        return this;
    }

    public String getId() {
        return id;
    }
    
    public User setName(Name name) {
        this.name = name;
        return this;
    }

    public Name getName() {
        return name;
    }
    
    public User setRoles(java.util.List<ComplexValue> roles) {
        this.roles = roles;
        return this;
    }

    public java.util.List<ComplexValue> getRoles() {
        return roles;
    }
    
    public User setUserName(String userName) {
        this.userName = userName;
        return this;
    }

    public String getUserName() {
        return userName;
    }
    
}
