// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.iam;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class PrincipalOutput {
  /** The display name of the principal. */
  @JsonProperty("display_name")
  private String displayName;

  /** The group name of the group. Present only if the principal is a group. */
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

  @Override
  public int hashCode() {
    return Objects.hash(displayName, groupName, principalId, servicePrincipalName, userName);
  }

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
