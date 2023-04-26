// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import java.util.Objects;

/**
 * Delete a metastore
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class DeleteMetastoreRequest {
  /** Force deletion even if the metastore is not empty. Default is false. */
  @QueryParam("force")
  private Boolean force;

  /** Unique ID of the metastore. */
  private String id;

  /**
   * <p>Setter for the field <code>force</code>.</p>
   *
   * @param force a {@link java.lang.Boolean} object
   * @return a {@link com.databricks.sdk.service.catalog.DeleteMetastoreRequest} object
   */
  public DeleteMetastoreRequest setForce(Boolean force) {
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
   * <p>Setter for the field <code>id</code>.</p>
   *
   * @param id a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.catalog.DeleteMetastoreRequest} object
   */
  public DeleteMetastoreRequest setId(String id) {
    this.id = id;
    return this;
  }

  /**
   * <p>Getter for the field <code>id</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getId() {
    return id;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DeleteMetastoreRequest that = (DeleteMetastoreRequest) o;
    return Objects.equals(force, that.force) && Objects.equals(id, that.id);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(force, id);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(DeleteMetastoreRequest.class)
        .add("force", force)
        .add("id", id)
        .toString();
  }
}
