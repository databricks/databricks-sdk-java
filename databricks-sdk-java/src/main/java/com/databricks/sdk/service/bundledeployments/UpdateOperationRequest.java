// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.bundledeployments;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.protobuf.FieldMask;
import java.util.Objects;

@Generated
public class UpdateOperationRequest {
  /**
   * Resource name of the operation. Format:
   * deployments/{deployment_id}/versions/{version_id}/operations/{resource_key}
   */
  @JsonIgnore private String name;

  /**
   * The operation to update. Its `name` selects the operation; the fields named in `update_mask`
   * carry the new values; and `sequence_id` carries the optimistic-concurrency precondition (see
   * the field docs on Operation). All other fields are ignored.
   */
  @JsonProperty("operation")
  private Operation operation;

  /**
   * The set of fields to update. Required; supported paths are `state`, `error_message`,
   * `resource_id`, `status`, and `dashboard_metadata`. An empty mask or any other path is rejected
   * with INVALID_PARAMETER_VALUE.
   */
  @JsonIgnore
  @QueryParam("update_mask")
  private FieldMask updateMask;

  public UpdateOperationRequest setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public UpdateOperationRequest setOperation(Operation operation) {
    this.operation = operation;
    return this;
  }

  public Operation getOperation() {
    return operation;
  }

  public UpdateOperationRequest setUpdateMask(FieldMask updateMask) {
    this.updateMask = updateMask;
    return this;
  }

  public FieldMask getUpdateMask() {
    return updateMask;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    UpdateOperationRequest that = (UpdateOperationRequest) o;
    return Objects.equals(name, that.name)
        && Objects.equals(operation, that.operation)
        && Objects.equals(updateMask, that.updateMask);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, operation, updateMask);
  }

  @Override
  public String toString() {
    return new ToStringer(UpdateOperationRequest.class)
        .add("name", name)
        .add("operation", operation)
        .add("updateMask", updateMask)
        .toString();
  }
}
