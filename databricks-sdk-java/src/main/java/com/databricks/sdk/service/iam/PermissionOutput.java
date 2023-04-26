// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.iam;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * <p>PermissionOutput class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class PermissionOutput {
  /** The results of a permissions query. */
  @JsonProperty("description")
  private String description;

  /** */
  @JsonProperty("permission_level")
  private WorkspacePermission permissionLevel;

  /**
   * <p>Setter for the field <code>description</code>.</p>
   *
   * @param description a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.iam.PermissionOutput} object
   */
  public PermissionOutput setDescription(String description) {
    this.description = description;
    return this;
  }

  /**
   * <p>Getter for the field <code>description</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getDescription() {
    return description;
  }

  /**
   * <p>Setter for the field <code>permissionLevel</code>.</p>
   *
   * @param permissionLevel a {@link com.databricks.sdk.service.iam.WorkspacePermission} object
   * @return a {@link com.databricks.sdk.service.iam.PermissionOutput} object
   */
  public PermissionOutput setPermissionLevel(WorkspacePermission permissionLevel) {
    this.permissionLevel = permissionLevel;
    return this;
  }

  /**
   * <p>Getter for the field <code>permissionLevel</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.iam.WorkspacePermission} object
   */
  public WorkspacePermission getPermissionLevel() {
    return permissionLevel;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PermissionOutput that = (PermissionOutput) o;
    return Objects.equals(description, that.description)
        && Objects.equals(permissionLevel, that.permissionLevel);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(description, permissionLevel);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(PermissionOutput.class)
        .add("description", description)
        .add("permissionLevel", permissionLevel)
        .toString();
  }
}
