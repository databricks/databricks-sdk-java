// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.bundle;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.JsonNode;
import com.google.protobuf.Timestamp;
import java.util.Objects;

/**
 * An operation on a single resource performed during a version. Operations are append-only and
 * record the result of applying a resource change to the workspace.
 */
@Generated
public class Operation {
  /** The type of operation performed on this resource. */
  @JsonProperty("action_type")
  private OperationActionType actionType;

  /** When the operation was recorded. */
  @JsonProperty("create_time")
  private Timestamp createTime;

  /**
   * Error message if the operation failed. Set when status is OPERATION_STATUS_FAILED. Captures the
   * error encountered while applying the resource to the workspace.
   */
  @JsonProperty("error_message")
  private String errorMessage;

  /**
   * Resource name of the operation. Format:
   * deployments/{deployment_id}/versions/{version_id}/operations/{resource_key}
   */
  @JsonProperty("name")
  private String name;

  /** ID reference for the actual resource in the workspace (e.g. the job ID, pipeline ID). */
  @JsonProperty("resource_id")
  private String resourceId;

  /**
   * Resource identifier within the bundle (e.g. "jobs.foo", "pipelines.bar",
   * "jobs.foo.permissions", "files.<rel-path>"). Can be an arbitrary UTF-8 encoded string key. This
   * key links the operation to the corresponding deployment-level Resource.
   */
  @JsonProperty("resource_key")
  private String resourceKey;

  /** Serialized local config state after the operation. Should be unset for delete operations. */
  @JsonProperty("state")
  private JsonNode state;

  /** Whether the operation succeeded or failed. */
  @JsonProperty("status")
  private OperationStatus status;

  public Operation setActionType(OperationActionType actionType) {
    this.actionType = actionType;
    return this;
  }

  public OperationActionType getActionType() {
    return actionType;
  }

  public Operation setCreateTime(Timestamp createTime) {
    this.createTime = createTime;
    return this;
  }

  public Timestamp getCreateTime() {
    return createTime;
  }

  public Operation setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
    return this;
  }

  public String getErrorMessage() {
    return errorMessage;
  }

  public Operation setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public Operation setResourceId(String resourceId) {
    this.resourceId = resourceId;
    return this;
  }

  public String getResourceId() {
    return resourceId;
  }

  public Operation setResourceKey(String resourceKey) {
    this.resourceKey = resourceKey;
    return this;
  }

  public String getResourceKey() {
    return resourceKey;
  }

  public Operation setState(JsonNode state) {
    this.state = state;
    return this;
  }

  public JsonNode getState() {
    return state;
  }

  public Operation setStatus(OperationStatus status) {
    this.status = status;
    return this;
  }

  public OperationStatus getStatus() {
    return status;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Operation that = (Operation) o;
    return Objects.equals(actionType, that.actionType)
        && Objects.equals(createTime, that.createTime)
        && Objects.equals(errorMessage, that.errorMessage)
        && Objects.equals(name, that.name)
        && Objects.equals(resourceId, that.resourceId)
        && Objects.equals(resourceKey, that.resourceKey)
        && Objects.equals(state, that.state)
        && Objects.equals(status, that.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        actionType, createTime, errorMessage, name, resourceId, resourceKey, state, status);
  }

  @Override
  public String toString() {
    return new ToStringer(Operation.class)
        .add("actionType", actionType)
        .add("createTime", createTime)
        .add("errorMessage", errorMessage)
        .add("name", name)
        .add("resourceId", resourceId)
        .add("resourceKey", resourceKey)
        .add("state", state)
        .add("status", status)
        .toString();
  }
}
