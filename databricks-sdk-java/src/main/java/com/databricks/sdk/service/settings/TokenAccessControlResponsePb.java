// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.settings;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
class TokenAccessControlResponsePb {
  @JsonProperty("all_permissions")
  private Collection<TokenPermission> allPermissions;

  @JsonProperty("display_name")
  private String displayName;

  @JsonProperty("group_name")
  private String groupName;

  @JsonProperty("service_principal_name")
  private String servicePrincipalName;

  @JsonProperty("user_name")
  private String userName;

  public TokenAccessControlResponsePb setAllPermissions(
      Collection<TokenPermission> allPermissions) {
    this.allPermissions = allPermissions;
    return this;
  }

  public Collection<TokenPermission> getAllPermissions() {
    return allPermissions;
  }

  public TokenAccessControlResponsePb setDisplayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

  public String getDisplayName() {
    return displayName;
  }

  public TokenAccessControlResponsePb setGroupName(String groupName) {
    this.groupName = groupName;
    return this;
  }

  public String getGroupName() {
    return groupName;
  }

  public TokenAccessControlResponsePb setServicePrincipalName(String servicePrincipalName) {
    this.servicePrincipalName = servicePrincipalName;
    return this;
  }

  public String getServicePrincipalName() {
    return servicePrincipalName;
  }

  public TokenAccessControlResponsePb setUserName(String userName) {
    this.userName = userName;
    return this;
  }

  public String getUserName() {
    return userName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    TokenAccessControlResponsePb that = (TokenAccessControlResponsePb) o;
    return Objects.equals(allPermissions, that.allPermissions)
        && Objects.equals(displayName, that.displayName)
        && Objects.equals(groupName, that.groupName)
        && Objects.equals(servicePrincipalName, that.servicePrincipalName)
        && Objects.equals(userName, that.userName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allPermissions, displayName, groupName, servicePrincipalName, userName);
  }

  @Override
  public String toString() {
    return new ToStringer(TokenAccessControlResponsePb.class)
        .add("allPermissions", allPermissions)
        .add("displayName", displayName)
        .add("groupName", groupName)
        .add("servicePrincipalName", servicePrincipalName)
        .add("userName", userName)
        .toString();
  }
}
