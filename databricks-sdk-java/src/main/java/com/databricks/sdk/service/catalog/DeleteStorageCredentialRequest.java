// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import java.util.Objects;

/**
 * Delete a credential
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class DeleteStorageCredentialRequest {
  /** Force deletion even if there are dependent external locations or external tables. */
  @QueryParam("force")
  private Boolean force;

  /** Name of the storage credential. */
  private String name;

  /**
   * <p>Setter for the field <code>force</code>.</p>
   *
   * @param force a {@link java.lang.Boolean} object
   * @return a {@link com.databricks.sdk.service.catalog.DeleteStorageCredentialRequest} object
   */
  public DeleteStorageCredentialRequest setForce(Boolean force) {
    this.force = force;
    return this;
  }

  /**
   * <p>Getter for the field <code>force</code>.</p>
   *
   * @return a {@link java.lang.Boolean} object
   */
  public Boolean getForce() {
    return force;
  }

  /**
   * <p>Setter for the field <code>name</code>.</p>
   *
   * @param name a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.catalog.DeleteStorageCredentialRequest} object
   */
  public DeleteStorageCredentialRequest setName(String name) {
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
    DeleteStorageCredentialRequest that = (DeleteStorageCredentialRequest) o;
    return Objects.equals(force, that.force) && Objects.equals(name, that.name);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(force, name);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(DeleteStorageCredentialRequest.class)
        .add("force", force)
        .add("name", name)
        .toString();
  }
}
