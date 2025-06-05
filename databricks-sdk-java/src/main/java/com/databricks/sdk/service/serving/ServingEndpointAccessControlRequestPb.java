// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.serving;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class ServingEndpointAccessControlRequestPb {
  @JsonProperty("group_name")
  private String groupName;

  @JsonProperty("permission_level")
  private ServingEndpointPermissionLevel permissionLevel;

  @JsonProperty("service_principal_name")
  private String servicePrincipalName;

  @JsonProperty("user_name")
  private String userName;

  public ServingEndpointAccessControlRequestPb setGroupName(String groupName) {
    this.groupName = groupName;
    return this;
  }

  public String getGroupName() {
    return groupName;
  }

  public ServingEndpointAccessControlRequestPb setPermissionLevel(
      ServingEndpointPermissionLevel permissionLevel) {
    this.permissionLevel = permissionLevel;
    return this;
  }

  public ServingEndpointPermissionLevel getPermissionLevel() {
    return permissionLevel;
  }

  public ServingEndpointAccessControlRequestPb setServicePrincipalName(
      String servicePrincipalName) {
    this.servicePrincipalName = servicePrincipalName;
    return this;
  }

  public String getServicePrincipalName() {
    return servicePrincipalName;
  }

  public ServingEndpointAccessControlRequestPb setUserName(String userName) {
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
    ServingEndpointAccessControlRequestPb that = (ServingEndpointAccessControlRequestPb) o;
    return Objects.equals(groupName, that.groupName)
        && Objects.equals(permissionLevel, that.permissionLevel)
        && Objects.equals(servicePrincipalName, that.servicePrincipalName)
        && Objects.equals(userName, that.userName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(groupName, permissionLevel, servicePrincipalName, userName);
  }

  @Override
  public String toString() {
    return new ToStringer(ServingEndpointAccessControlRequestPb.class)
        .add("groupName", groupName)
        .add("permissionLevel", permissionLevel)
        .add("servicePrincipalName", servicePrincipalName)
        .add("userName", userName)
        .toString();
  }
}
