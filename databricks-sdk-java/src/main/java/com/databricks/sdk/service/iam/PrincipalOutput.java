// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.iam;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * <p>PrincipalOutput class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class PrincipalOutput {
  /** The display name of the principal. */
  @JsonProperty("display_name")
  private String displayName;

  /** The group name of the groupl. Present only if the principal is a group. */
  @JsonProperty("group_name")
  private String groupName;

  /** The unique, opaque id of the principal. */
  @JsonProperty("principal_id")
  private Long principalId;

  /** The name of the service principal. Present only if the principal is a service principal. */
  @JsonProperty("service_principal_name")
  private String servicePrincipalName;

  /** The username of the user. Present only if the principal is a user. */
  @JsonProperty("user_name")
  private String userName;

  /**
   * <p>Setter for the field <code>displayName</code>.</p>
   *
   * @param displayName a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.iam.PrincipalOutput} object
   */
  public PrincipalOutput setDisplayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * <p>Getter for the field <code>displayName</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getDisplayName() {
    return displayName;
  }

  /**
   * <p>Setter for the field <code>groupName</code>.</p>
   *
   * @param groupName a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.iam.PrincipalOutput} object
   */
  public PrincipalOutput setGroupName(String groupName) {
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
   * <p>Setter for the field <code>principalId</code>.</p>
   *
   * @param principalId a {@link java.lang.Long} object
   * @return a {@link com.databricks.sdk.service.iam.PrincipalOutput} object
   */
  public PrincipalOutput setPrincipalId(Long principalId) {
    this.principalId = principalId;
    return this;
  }

  /**
   * <p>Getter for the field <code>principalId</code>.</p>
   *
   * @return a {@link java.lang.Long} object
   */
  public Long getPrincipalId() {
    return principalId;
  }

  /**
   * <p>Setter for the field <code>servicePrincipalName</code>.</p>
   *
   * @param servicePrincipalName a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.iam.PrincipalOutput} object
   */
  public PrincipalOutput setServicePrincipalName(String servicePrincipalName) {
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
   * @return a {@link com.databricks.sdk.service.iam.PrincipalOutput} object
   */
  public PrincipalOutput setUserName(String userName) {
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
    PrincipalOutput that = (PrincipalOutput) o;
    return Objects.equals(displayName, that.displayName)
        && Objects.equals(groupName, that.groupName)
        && Objects.equals(principalId, that.principalId)
        && Objects.equals(servicePrincipalName, that.servicePrincipalName)
        && Objects.equals(userName, that.userName);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(displayName, groupName, principalId, servicePrincipalName, userName);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(PrincipalOutput.class)
        .add("displayName", displayName)
        .add("groupName", groupName)
        .add("principalId", principalId)
        .add("servicePrincipalName", servicePrincipalName)
        .add("userName", userName)
        .toString();
  }
}
