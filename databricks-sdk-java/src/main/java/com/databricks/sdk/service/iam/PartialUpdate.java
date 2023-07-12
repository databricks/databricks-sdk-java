// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.iam;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;



@Generated
public class PartialUpdate {
  /**
   * Unique ID for a user in the Databricks workspace.
   */
  
  private String id;
  
  /**
   
   */
  @JsonProperty("Operations")
  private Collection<Patch> operations;
  
  /**
   * The schema of the patch request. Must be
   * ["urn:ietf:params:scim:api:messages:2.0:PatchOp"].
   */
  @JsonProperty("schema")
  private Collection<PatchSchema> schema;
  
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
  
  public PartialUpdate setSchema(Collection<PatchSchema> schema) {
    this.schema = schema;
    return this;
  }

  public Collection<PatchSchema> getSchema() {
    return schema;
  }
  

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PartialUpdate that = (PartialUpdate) o;
    return Objects.equals(id, that.id)
    && Objects.equals(operations, that.operations)
    && Objects.equals(schema, that.schema)
    ;
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, operations, schema);
  }

  @Override
  public String toString() {
    return new ToStringer(PartialUpdate.class)
      .add("id", id)
      .add("operations", operations)
      .add("schema", schema).toString();
  }
}
