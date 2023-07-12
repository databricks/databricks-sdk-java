// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.iam;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class AccessControlResponse {
  /** All permissions. */
  @JsonProperty("all_permissions")
  private Collection<Permission> allPermissions;

  /** name of the group */
  @JsonProperty("group_name")
  private String groupName;

  /** name of the service principal */
  @JsonProperty("service_principal_name")
  private String servicePrincipalName;

  /** name of the user */
  @JsonProperty("user_name")
  private String userName;

  public AccessControlResponse setAllPermissions(Collection<Permission> allPermissions) {
    this.allPermissions = allPermissions;
    return this;
  }

  public Collection<Permission> getAllPermissions() {
    return allPermissions;
  }

  public AccessControlResponse setGroupName(String groupName) {
    this.groupName = groupName;
    return this;
  }

  public String getGroupName() {
    return groupName;
  }

  public AccessControlResponse setServicePrincipalName(String servicePrincipalName) {
    this.servicePrincipalName = servicePrincipalName;
    return this;
  }

  public String getServicePrincipalName() {
    return servicePrincipalName;
  }

  public AccessControlResponse setUserName(String userName) {
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
    AccessControlResponse that = (AccessControlResponse) o;
    return Objects.equals(allPermissions, that.allPermissions)
        && Objects.equals(groupName, that.groupName)
        && Objects.equals(servicePrincipalName, that.servicePrincipalName)
        && Objects.equals(userName, that.userName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allPermissions, groupName, servicePrincipalName, userName);
  }

  @Override
  public String toString() {
    return new ToStringer(AccessControlResponse.class)
        .add("allPermissions", allPermissions)
        .add("groupName", groupName)
        .add("servicePrincipalName", servicePrincipalName)
        .add("userName", userName)
        .toString();
  }
}
