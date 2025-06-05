// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
class WarehouseAccessControlResponsePb {
  @JsonProperty("all_permissions")
  private Collection<WarehousePermission> allPermissions;

  @JsonProperty("display_name")
  private String displayName;

  @JsonProperty("group_name")
  private String groupName;

  @JsonProperty("service_principal_name")
  private String servicePrincipalName;

  @JsonProperty("user_name")
  private String userName;

  public WarehouseAccessControlResponsePb setAllPermissions(
      Collection<WarehousePermission> allPermissions) {
    this.allPermissions = allPermissions;
    return this;
  }

  public Collection<WarehousePermission> getAllPermissions() {
    return allPermissions;
  }

  public WarehouseAccessControlResponsePb setDisplayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

  public String getDisplayName() {
    return displayName;
  }

  public WarehouseAccessControlResponsePb setGroupName(String groupName) {
    this.groupName = groupName;
    return this;
  }

  public String getGroupName() {
    return groupName;
  }

  public WarehouseAccessControlResponsePb setServicePrincipalName(String servicePrincipalName) {
    this.servicePrincipalName = servicePrincipalName;
    return this;
  }

  public String getServicePrincipalName() {
    return servicePrincipalName;
  }

  public WarehouseAccessControlResponsePb setUserName(String userName) {
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
    WarehouseAccessControlResponsePb that = (WarehouseAccessControlResponsePb) o;
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
    return new ToStringer(WarehouseAccessControlResponsePb.class)
        .add("allPermissions", allPermissions)
        .add("displayName", displayName)
        .add("groupName", groupName)
        .add("servicePrincipalName", servicePrincipalName)
        .add("userName", userName)
        .toString();
  }
}
