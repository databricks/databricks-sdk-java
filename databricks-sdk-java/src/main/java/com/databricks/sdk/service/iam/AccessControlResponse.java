// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.iam;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/**
 * <p>AccessControlResponse class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
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

  /**
   * <p>Setter for the field <code>allPermissions</code>.</p>
   *
   * @param allPermissions a {@link java.util.Collection} object
   * @return a {@link com.databricks.sdk.service.iam.AccessControlResponse} object
   */
  public AccessControlResponse setAllPermissions(Collection<Permission> allPermissions) {
    this.allPermissions = allPermissions;
    return this;
  }

  /**
   * <p>Getter for the field <code>allPermissions</code>.</p>
   *
   * @return a {@link java.util.Collection} object
   */
  public Collection<Permission> getAllPermissions() {
    return allPermissions;
  }

  /**
   * <p>Setter for the field <code>groupName</code>.</p>
   *
   * @param groupName a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.iam.AccessControlResponse} object
   */
  public AccessControlResponse setGroupName(String groupName) {
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
   * <p>Setter for the field <code>servicePrincipalName</code>.</p>
   *
   * @param servicePrincipalName a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.iam.AccessControlResponse} object
   */
  public AccessControlResponse setServicePrincipalName(String servicePrincipalName) {
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
   * @return a {@link com.databricks.sdk.service.iam.AccessControlResponse} object
   */
  public AccessControlResponse setUserName(String userName) {
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
    AccessControlResponse that = (AccessControlResponse) o;
    return Objects.equals(allPermissions, that.allPermissions)
        && Objects.equals(groupName, that.groupName)
        && Objects.equals(servicePrincipalName, that.servicePrincipalName)
        && Objects.equals(userName, that.userName);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(allPermissions, groupName, servicePrincipalName, userName);
  }

  /** {@inheritDoc} */
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
