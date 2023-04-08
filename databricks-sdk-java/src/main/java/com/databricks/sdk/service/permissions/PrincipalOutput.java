// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.permissions;

import java.util.Map;

import com.databricks.sdk.annotation.QueryParam;
import com.fasterxml.jackson.annotation.JsonProperty;



public class PrincipalOutput {
    /**
     * The display name of the principal.
     */
    @JsonProperty("display_name")
    private String displayName;
    
    /**
     * The group name of the groupl. Present only if the principal is a group.
     */
    @JsonProperty("group_name")
    private String groupName;
    
    /**
     * The unique, opaque id of the principal.
     */
    @JsonProperty("principal_id")
    private Long principalId;
    
    /**
     * The name of the service principal. Present only if the principal is a
     * service principal.
     */
    @JsonProperty("service_principal_name")
    private String servicePrincipalName;
    
    /**
     * The username of the user. Present only if the principal is a user.
     */
    @JsonProperty("user_name")
    private String userName;
    
    public PrincipalOutput setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    public String getDisplayName() {
        return displayName;
    }
    
    public PrincipalOutput setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }

    public String getGroupName() {
        return groupName;
    }
    
    public PrincipalOutput setPrincipalId(Long principalId) {
        this.principalId = principalId;
        return this;
    }

    public Long getPrincipalId() {
        return principalId;
    }
    
    public PrincipalOutput setServicePrincipalName(String servicePrincipalName) {
        this.servicePrincipalName = servicePrincipalName;
        return this;
    }

    public String getServicePrincipalName() {
        return servicePrincipalName;
    }
    
    public PrincipalOutput setUserName(String userName) {
        this.userName = userName;
        return this;
    }

    public String getUserName() {
        return userName;
    }
    
}
