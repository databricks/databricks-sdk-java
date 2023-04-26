// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * <p>AccessControl class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
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

  /**
   * <p>Setter for the field <code>groupName</code>.</p>
   *
   * @param groupName a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.sql.AccessControl} object
   */
  public AccessControl setGroupName(String groupName) {
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
   * @param permissionLevel a {@link com.databricks.sdk.service.sql.PermissionLevel} object
   * @return a {@link com.databricks.sdk.service.sql.AccessControl} object
   */
  public AccessControl setPermissionLevel(PermissionLevel permissionLevel) {
    this.permissionLevel = permissionLevel;
    return this;
  }

  /**
   * <p>Getter for the field <code>permissionLevel</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.sql.PermissionLevel} object
   */
  public PermissionLevel getPermissionLevel() {
    return permissionLevel;
  }

  /**
   * <p>Setter for the field <code>userName</code>.</p>
   *
   * @param userName a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.sql.AccessControl} object
   */
  public AccessControl setUserName(String userName) {
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
    AccessControl that = (AccessControl) o;
    return Objects.equals(groupName, that.groupName)
        && Objects.equals(permissionLevel, that.permissionLevel)
        && Objects.equals(userName, that.userName);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(groupName, permissionLevel, userName);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(AccessControl.class)
        .add("groupName", groupName)
        .add("permissionLevel", permissionLevel)
        .add("userName", userName)
        .toString();
  }
}
