// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.iam;

import com.databricks.sdk.support.ToStringer;
import java.util.Objects;

/**
 * Delete a group
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class DeleteGroupRequest {
  /** Unique ID for a group in the Databricks Workspace. */
  private String id;

  /**
   * <p>Setter for the field <code>id</code>.</p>
   *
   * @param id a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.iam.DeleteGroupRequest} object
   */
  public DeleteGroupRequest setId(String id) {
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
    DeleteGroupRequest that = (DeleteGroupRequest) o;
    return Objects.equals(id, that.id);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(id);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(DeleteGroupRequest.class).add("id", id).toString();
  }
}
