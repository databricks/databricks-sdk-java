// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.ToStringer;
import java.util.Objects;

/**
 * Delete a schema
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class DeleteSchemaRequest {
  /** Full name of the schema. */
  private String fullName;

  /**
   * <p>Setter for the field <code>fullName</code>.</p>
   *
   * @param fullName a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.catalog.DeleteSchemaRequest} object
   */
  public DeleteSchemaRequest setFullName(String fullName) {
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

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DeleteSchemaRequest that = (DeleteSchemaRequest) o;
    return Objects.equals(fullName, that.fullName);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(fullName);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(DeleteSchemaRequest.class).add("fullName", fullName).toString();
  }
}
