// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class AccessControl {
  /** */
  @JsonProperty("group_name")
  private String groupName;

  /** This describes an enum */
  @JsonProperty("permission_level")
  private PermissionLevel permissionLevel;

  /** */
  @JsonProperty("user_name")
  private String userName;

  public AccessControl setGroupName(String groupName) {
    this.groupName = groupName;
    return this;
  }

  public String getGroupName() {
    return groupName;
  }

  public AccessControl setPermissionLevel(PermissionLevel permissionLevel) {
    this.permissionLevel = permissionLevel;
    return this;
  }

  public PermissionLevel getPermissionLevel() {
    return permissionLevel;
  }

  public AccessControl setUserName(String userName) {
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
    AccessControl that = (AccessControl) o;
    return Objects.equals(groupName, that.groupName)
        && Objects.equals(permissionLevel, that.permissionLevel)
        && Objects.equals(userName, that.userName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(groupName, permissionLevel, userName);
  }

  @Override
  public String toString() {
    return new ToStringer(AccessControl.class)
        .add("groupName", groupName)
        .add("permissionLevel", permissionLevel)
        .add("userName", userName)
        .toString();
  }
}
