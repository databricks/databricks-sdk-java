// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.scim;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PartialUpdate {
  /** Unique ID for a group in the Databricks Account. */
  private String id;

  /** */
  @JsonProperty("operations")
  private java.util.List<Patch> operations;

  public PartialUpdate setId(String id) {
    this.id = id;
    return this;
  }

  public String getId() {
    return id;
  }

  public PartialUpdate setOperations(java.util.List<Patch> operations) {
    this.operations = operations;
    return this;
  }

  public java.util.List<Patch> getOperations() {
    return operations;
  }
}
