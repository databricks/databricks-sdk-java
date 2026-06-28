// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.bundledeployments;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class CreateOperationRequest {
  /** The resource operation to create. */
  @JsonProperty("operation")
  private Operation operation;

  /**
   * The parent version where this operation will be recorded. Format:
   * deployments/{deployment_id}/versions/{version_id}
   */
  @JsonIgnore private String parent;

  /**
   * The key identifying the resource this operation applies to. Becomes the final component of the
   * operation's name.
   */
  @JsonIgnore
  @QueryParam("resource_key")
  private String resourceKey;

  public CreateOperationRequest setOperation(Operation operation) {
    this.operation = operation;
    return this;
  }

  public Operation getOperation() {
    return operation;
  }

  public CreateOperationRequest setParent(String parent) {
    this.parent = parent;
    return this;
  }

  public String getParent() {
    return parent;
  }

  public CreateOperationRequest setResourceKey(String resourceKey) {
    this.resourceKey = resourceKey;
    return this;
  }

  public String getResourceKey() {
    return resourceKey;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CreateOperationRequest that = (CreateOperationRequest) o;
    return Objects.equals(operation, that.operation)
        && Objects.equals(parent, that.parent)
        && Objects.equals(resourceKey, that.resourceKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(operation, parent, resourceKey);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateOperationRequest.class)
        .add("operation", operation)
        .add("parent", parent)
        .add("resourceKey", resourceKey)
        .toString();
  }
}
