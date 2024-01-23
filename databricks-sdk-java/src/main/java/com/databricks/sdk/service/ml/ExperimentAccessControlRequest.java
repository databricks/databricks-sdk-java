// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class ExperimentAccessControlRequest {
  /** name of the group */
  @JsonProperty("group_name")
  private String groupName;

  /** Permission level */
  @JsonProperty("permission_level")
  private ExperimentPermissionLevel permissionLevel;

  /** application ID of a service principal */
  @JsonProperty("service_principal_name")
  private String servicePrincipalName;

  /** name of the user */
  @JsonProperty("user_name")
  private String userName;

  public ExperimentAccessControlRequest setGroupName(String groupName) {
    this.groupName = groupName;
    return this;
  }

  public String getGroupName() {
    return groupName;
  }

  public ExperimentAccessControlRequest setPermissionLevel(
      ExperimentPermissionLevel permissionLevel) {
    this.permissionLevel = permissionLevel;
    return this;
  }

  public ExperimentPermissionLevel getPermissionLevel() {
    return permissionLevel;
  }

  public ExperimentAccessControlRequest setServicePrincipalName(String servicePrincipalName) {
    this.servicePrincipalName = servicePrincipalName;
    return this;
  }

  public String getServicePrincipalName() {
    return servicePrincipalName;
  }

  public ExperimentAccessControlRequest setUserName(String userName) {
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
    ExperimentAccessControlRequest that = (ExperimentAccessControlRequest) o;
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
    return new ToStringer(ExperimentAccessControlRequest.class)
        .add("groupName", groupName)
        .add("permissionLevel", permissionLevel)
        .add("servicePrincipalName", servicePrincipalName)
        .add("userName", userName)
        .toString();
  }
}
