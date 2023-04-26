// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.iam;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * <p>AccessControlRequest class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class AccessControlRequest {
  /** name of the group */
  @JsonProperty("group_name")
  private String groupName;

  /** Permission level */
  @JsonProperty("permission_level")
  private PermissionLevel permissionLevel;

  /** name of the service principal */
  @JsonProperty("service_principal_name")
  private String servicePrincipalName;

  /** name of the user */
  @JsonProperty("user_name")
  private String userName;

  /**
   * <p>Setter for the field <code>groupName</code>.</p>
   *
   * @param groupName a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.iam.AccessControlRequest} object
   */
  public AccessControlRequest setGroupName(String groupName) {
    this.groupName = groupName;
    return this;
  }

  /**
   * <p>Getter for the field <code>groupName</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getGroupName() {
    return groupName;
  }

  /**
   * <p>Setter for the field <code>permissionLevel</code>.</p>
   *
   * @param permissionLevel a {@link com.databricks.sdk.service.iam.PermissionLevel} object
   * @return a {@link com.databricks.sdk.service.iam.AccessControlRequest} object
   */
  public AccessControlRequest setPermissionLevel(PermissionLevel permissionLevel) {
    this.permissionLevel = permissionLevel;
    return this;
  }

  /**
   * <p>Getter for the field <code>permissionLevel</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.iam.PermissionLevel} object
   */
  public PermissionLevel getPermissionLevel() {
    return permissionLevel;
  }

  /**
   * <p>Setter for the field <code>servicePrincipalName</code>.</p>
   *
   * @param servicePrincipalName a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.iam.AccessControlRequest} object
   */
  public AccessControlRequest setServicePrincipalName(String servicePrincipalName) {
    this.servicePrincipalName = servicePrincipalName;
    return this;
  }

  /**
   * <p>Getter for the field <code>servicePrincipalName</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getServicePrincipalName() {
    return servicePrincipalName;
  }

  /**
   * <p>Setter for the field <code>userName</code>.</p>
   *
   * @param userName a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.iam.AccessControlRequest} object
   */
  public AccessControlRequest setUserName(String userName) {
    this.userName = userName;
    return this;
  }

  /**
   * <p>Getter for the field <code>userName</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getUserName() {
    return userName;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AccessControlRequest that = (AccessControlRequest) o;
    return Objects.equals(groupName, that.groupName)
        && Objects.equals(permissionLevel, that.permissionLevel)
        && Objects.equals(servicePrincipalName, that.servicePrincipalName)
        && Objects.equals(userName, that.userName);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(groupName, permissionLevel, servicePrincipalName, userName);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(AccessControlRequest.class)
        .add("groupName", groupName)
        .add("permissionLevel", permissionLevel)
        .add("servicePrincipalName", servicePrincipalName)
        .add("userName", userName)
        .toString();
  }
}
