// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import java.util.Objects;

/**
 * Delete a catalog
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class DeleteCatalogRequest {
  /** Force deletion even if the catalog is not empty. */
  @QueryParam("force")
  private Boolean force;

  /** The name of the catalog. */
  private String name;

  /**
   * <p>Setter for the field <code>force</code>.</p>
   *
   * @param force a {@link java.lang.Boolean} object
   * @return a {@link com.databricks.sdk.service.catalog.DeleteCatalogRequest} object
   */
  public DeleteCatalogRequest setForce(Boolean force) {
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
   * @return a {@link com.databricks.sdk.service.catalog.DeleteCatalogRequest} object
   */
  public DeleteCatalogRequest setName(String name) {
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
    DeleteCatalogRequest that = (DeleteCatalogRequest) o;
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
    return new ToStringer(DeleteCatalogRequest.class)
        .add("force", force)
        .add("name", name)
        .toString();
  }
}
