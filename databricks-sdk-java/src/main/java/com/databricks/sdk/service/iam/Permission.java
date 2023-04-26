// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.iam;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/**
 * <p>Permission class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class Permission {
  /** */
  @JsonProperty("inherited")
  private Boolean inherited;

  /** */
  @JsonProperty("inherited_from_object")
  private Collection<String> inheritedFromObject;

  /** Permission level */
  @JsonProperty("permission_level")
  private PermissionLevel permissionLevel;

  /**
   * <p>Setter for the field <code>inherited</code>.</p>
   *
   * @param inherited a {@link java.lang.Boolean} object
   * @return a {@link com.databricks.sdk.service.iam.Permission} object
   */
  public Permission setInherited(Boolean inherited) {
    this.inherited = inherited;
    return this;
  }

  /**
   * <p>Getter for the field <code>inherited</code>.</p>
   *
   * @return a {@link java.lang.Boolean} object
   */
  public Boolean getInherited() {
    return inherited;
  }

  /**
   * <p>Setter for the field <code>inheritedFromObject</code>.</p>
   *
   * @param inheritedFromObject a {@link java.util.Collection} object
   * @return a {@link com.databricks.sdk.service.iam.Permission} object
   */
  public Permission setInheritedFromObject(Collection<String> inheritedFromObject) {
    this.inheritedFromObject = inheritedFromObject;
    return this;
  }

  /**
   * <p>Getter for the field <code>inheritedFromObject</code>.</p>
   *
   * @return a {@link java.util.Collection} object
   */
  public Collection<String> getInheritedFromObject() {
    return inheritedFromObject;
  }

  /**
   * <p>Setter for the field <code>permissionLevel</code>.</p>
   *
   * @param permissionLevel a {@link com.databricks.sdk.service.iam.PermissionLevel} object
   * @return a {@link com.databricks.sdk.service.iam.Permission} object
   */
  public Permission setPermissionLevel(PermissionLevel permissionLevel) {
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

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Permission that = (Permission) o;
    return Objects.equals(inherited, that.inherited)
        && Objects.equals(inheritedFromObject, that.inheritedFromObject)
        && Objects.equals(permissionLevel, that.permissionLevel);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(inherited, inheritedFromObject, permissionLevel);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(Permission.class)
        .add("inherited", inherited)
        .add("inheritedFromObject", inheritedFromObject)
        .add("permissionLevel", permissionLevel)
        .toString();
  }
}
