// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.serving;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class ServingEndpointAccessControlRequest {
  /** name of the group */
  @JsonProperty("group_name")
  private String groupName;

  /** Permission level */
  @JsonProperty("permission_level")
  private ServingEndpointPermissionLevel permissionLevel;

  /** name of the service principal */
  @JsonProperty("service_principal_name")
  private String servicePrincipalName;

  /** name of the user */
  @JsonProperty("user_name")
  private String userName;

  public ServingEndpointAccessControlRequest setGroupName(String groupName) {
    this.groupName = groupName;
    return this;
  }

  public String getGroupName() {
    return groupName;
  }

  public ServingEndpointAccessControlRequest setPermissionLevel(
      ServingEndpointPermissionLevel permissionLevel) {
    this.permissionLevel = permissionLevel;
    return this;
  }

  public ServingEndpointPermissionLevel getPermissionLevel() {
    return permissionLevel;
  }

  public ServingEndpointAccessControlRequest setServicePrincipalName(String servicePrincipalName) {
    this.servicePrincipalName = servicePrincipalName;
    return this;
  }

  public String getServicePrincipalName() {
    return servicePrincipalName;
  }

  public ServingEndpointAccessControlRequest setUserName(String userName) {
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
    ServingEndpointAccessControlRequest that = (ServingEndpointAccessControlRequest) o;
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
    return new ToStringer(ServingEndpointAccessControlRequest.class)
        .add("groupName", groupName)
        .add("permissionLevel", permissionLevel)
        .add("servicePrincipalName", servicePrincipalName)
        .add("userName", userName)
        .toString();
  }
}
