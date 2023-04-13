// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.scim;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

public class PartialUpdate {
  /** Unique ID for a group in the Databricks Account. */
  private String id;

  /** */
  @JsonProperty("operations")
  private Collection<Patch> operations;

  public PartialUpdate setId(String id) {
    this.id = id;
    return this;
  }

  public String getId() {
    return id;
  }

  public PartialUpdate setOperations(Collection<Patch> operations) {
    this.operations = operations;
    return this;
  }

  public Collection<Patch> getOperations() {
    return operations;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PartialUpdate that = (PartialUpdate) o;
    return Objects.equals(id, that.id) && Objects.equals(operations, that.operations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, operations);
  }

  @Override
  public String toString() {
    return new ToStringer(PartialUpdate.class)
        .add("id", id)
        .add("operations", operations)
        .toString();
  }
}
