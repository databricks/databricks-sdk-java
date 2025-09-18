// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.iam;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class PatchAccountUserRequest {
  /** Unique ID in the Databricks workspace. */
  @JsonIgnore private String id;

  /** */
  @JsonProperty("Operations")
  private Collection<Patch> operations;

  /** The schema of the patch request. Must be ["urn:ietf:params:scim:api:messages:2.0:PatchOp"]. */
  @JsonProperty("schemas")
  private Collection<PatchSchema> schemas;

  public PatchAccountUserRequest setId(String id) {
    this.id = id;
    return this;
  }

  public String getId() {
    return id;
  }

  public PatchAccountUserRequest setOperations(Collection<Patch> operations) {
    this.operations = operations;
    return this;
  }

  public Collection<Patch> getOperations() {
    return operations;
  }

  public PatchAccountUserRequest setSchemas(Collection<PatchSchema> schemas) {
    this.schemas = schemas;
    return this;
  }

  public Collection<PatchSchema> getSchemas() {
    return schemas;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PatchAccountUserRequest that = (PatchAccountUserRequest) o;
    return Objects.equals(id, that.id)
        && Objects.equals(operations, that.operations)
        && Objects.equals(schemas, that.schemas);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, operations, schemas);
  }

  @Override
  public String toString() {
    return new ToStringer(PatchAccountUserRequest.class)
        .add("id", id)
        .add("operations", operations)
        .add("schemas", schemas)
        .toString();
  }
}
