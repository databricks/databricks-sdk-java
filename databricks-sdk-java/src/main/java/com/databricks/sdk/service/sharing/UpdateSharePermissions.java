// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sharing;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/**
 * <p>UpdateSharePermissions class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class UpdateSharePermissions {
  /** Array of permission changes. */
  @JsonProperty("changes")
  private Collection<Object /* MISSING TYPE */> changes;

  /** The name of the share. */
  private String name;

  /**
   * <p>Setter for the field <code>changes</code>.</p>
   *
   * @param changes a {@link java.util.Collection} object
   * @return a {@link com.databricks.sdk.service.sharing.UpdateSharePermissions} object
   */
  public UpdateSharePermissions setChanges(Collection<Object /* MISSING TYPE */> changes) {
    this.changes = changes;
    return this;
  }

  /**
   * <p>Getter for the field <code>changes</code>.</p>
   *
   * @return a {@link java.util.Collection} object
   */
  public Collection<Object /* MISSING TYPE */> getChanges() {
    return changes;
  }

  /**
   * <p>Setter for the field <code>name</code>.</p>
   *
   * @param name a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.sharing.UpdateSharePermissions} object
   */
  public UpdateSharePermissions setName(String name) {
    this.name = name;
    return this;
  }

  /**
   * <p>Getter for the field <code>name</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getName() {
    return name;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    UpdateSharePermissions that = (UpdateSharePermissions) o;
    return Objects.equals(changes, that.changes) && Objects.equals(name, that.name);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(changes, name);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(UpdateSharePermissions.class)
        .add("changes", changes)
        .add("name", name)
        .toString();
  }
}
