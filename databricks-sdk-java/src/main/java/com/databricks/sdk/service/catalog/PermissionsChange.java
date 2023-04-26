// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/**
 * <p>PermissionsChange class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class PermissionsChange {
  /** The set of privileges to add. */
  @JsonProperty("add")
  private Collection<Privilege> add;

  /** The principal whose privileges we are changing. */
  @JsonProperty("principal")
  private String principal;

  /** The set of privileges to remove. */
  @JsonProperty("remove")
  private Collection<Privilege> remove;

  /**
   * <p>Setter for the field <code>add</code>.</p>
   *
   * @param add a {@link java.util.Collection} object
   * @return a {@link com.databricks.sdk.service.catalog.PermissionsChange} object
   */
  public PermissionsChange setAdd(Collection<Privilege> add) {
    this.add = add;
    return this;
  }

  /**
   * <p>Getter for the field <code>add</code>.</p>
   *
   * @return a {@link java.util.Collection} object
   */
  public Collection<Privilege> getAdd() {
    return add;
  }

  /**
   * <p>Setter for the field <code>principal</code>.</p>
   *
   * @param principal a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.catalog.PermissionsChange} object
   */
  public PermissionsChange setPrincipal(String principal) {
    this.principal = principal;
    return this;
  }

  /**
   * <p>Getter for the field <code>principal</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getPrincipal() {
    return principal;
  }

  /**
   * <p>Setter for the field <code>remove</code>.</p>
   *
   * @param remove a {@link java.util.Collection} object
   * @return a {@link com.databricks.sdk.service.catalog.PermissionsChange} object
   */
  public PermissionsChange setRemove(Collection<Privilege> remove) {
    this.remove = remove;
    return this;
  }

  /**
   * <p>Getter for the field <code>remove</code>.</p>
   *
   * @return a {@link java.util.Collection} object
   */
  public Collection<Privilege> getRemove() {
    return remove;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PermissionsChange that = (PermissionsChange) o;
    return Objects.equals(add, that.add)
        && Objects.equals(principal, that.principal)
        && Objects.equals(remove, that.remove);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(add, principal, remove);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(PermissionsChange.class)
        .add("add", add)
        .add("principal", principal)
        .add("remove", remove)
        .toString();
  }
}
