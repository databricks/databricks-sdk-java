// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/**
 * <p>UpdatePermissions class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class UpdatePermissions {
  /** Array of permissions change objects. */
  @JsonProperty("changes")
  private Collection<PermissionsChange> changes;

  /** Full name of securable. */
  private String fullName;

  /** Type of securable. */
  private SecurableType securableType;

  /**
   * <p>Setter for the field <code>changes</code>.</p>
   *
   * @param changes a {@link java.util.Collection} object
   * @return a {@link com.databricks.sdk.service.catalog.UpdatePermissions} object
   */
  public UpdatePermissions setChanges(Collection<PermissionsChange> changes) {
    this.changes = changes;
    return this;
  }

  /**
   * <p>Getter for the field <code>changes</code>.</p>
   *
   * @return a {@link java.util.Collection} object
   */
  public Collection<PermissionsChange> getChanges() {
    return changes;
  }

  /**
   * <p>Setter for the field <code>fullName</code>.</p>
   *
   * @param fullName a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.catalog.UpdatePermissions} object
   */
  public UpdatePermissions setFullName(String fullName) {
    this.fullName = fullName;
    return this;
  }

  /**
   * <p>Getter for the field <code>fullName</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getFullName() {
    return fullName;
  }

  /**
   * <p>Setter for the field <code>securableType</code>.</p>
   *
   * @param securableType a {@link com.databricks.sdk.service.catalog.SecurableType} object
   * @return a {@link com.databricks.sdk.service.catalog.UpdatePermissions} object
   */
  public UpdatePermissions setSecurableType(SecurableType securableType) {
    this.securableType = securableType;
    return this;
  }

  /**
   * <p>Getter for the field <code>securableType</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.catalog.SecurableType} object
   */
  public SecurableType getSecurableType() {
    return securableType;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    UpdatePermissions that = (UpdatePermissions) o;
    return Objects.equals(changes, that.changes)
        && Objects.equals(fullName, that.fullName)
        && Objects.equals(securableType, that.securableType);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(changes, fullName, securableType);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(UpdatePermissions.class)
        .add("changes", changes)
        .add("fullName", fullName)
        .add("securableType", securableType)
        .toString();
  }
}
