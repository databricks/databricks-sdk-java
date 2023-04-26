// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.iam;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/**
 * <p>PartialUpdate class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class PartialUpdate {
  /** Unique ID for a group in the Databricks Account. */
  private String id;

  /** */
  @JsonProperty("operations")
  private Collection<Patch> operations;

  /**
   * <p>Setter for the field <code>id</code>.</p>
   *
   * @param id a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.iam.PartialUpdate} object
   */
  public PartialUpdate setId(String id) {
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

  /**
   * <p>Setter for the field <code>operations</code>.</p>
   *
   * @param operations a {@link java.util.Collection} object
   * @return a {@link com.databricks.sdk.service.iam.PartialUpdate} object
   */
  public PartialUpdate setOperations(Collection<Patch> operations) {
    this.operations = operations;
    return this;
  }

  /**
   * <p>Getter for the field <code>operations</code>.</p>
   *
   * @return a {@link java.util.Collection} object
   */
  public Collection<Patch> getOperations() {
    return operations;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PartialUpdate that = (PartialUpdate) o;
    return Objects.equals(id, that.id) && Objects.equals(operations, that.operations);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(id, operations);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(PartialUpdate.class)
        .add("id", id)
        .add("operations", operations)
        .toString();
  }
}
