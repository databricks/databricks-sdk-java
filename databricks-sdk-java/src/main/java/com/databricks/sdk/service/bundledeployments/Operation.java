// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.bundledeployments;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.JsonNode;
import com.google.protobuf.Timestamp;
import java.util.Objects;

/**
 * An operation on a single resource performed during a version. Operations record the result of
 * applying a resource change to the workspace. Most fields are immutable once recorded; `state`,
 * `error_message`, `resource_id`, and `status` may be updated afterwards (via UpdateOperation),
 * guarded by `sequence_id` for optimistic concurrency control.
 */
@Generated
public class Operation {
  /** The type of operation performed on this resource. */
  @JsonProperty("action_type")
  private OperationActionType actionType;

  /** When the operation was recorded. */
  @JsonProperty("create_time")
  private Timestamp createTime;

  /** Dashboard-specific metadata; set only for dashboard resources. */
  @JsonProperty("dashboard_metadata")
  private DashboardMetadata dashboardMetadata;

  /**
   * Error message if the operation failed. Set when status is OPERATION_STATUS_FAILED. Captures the
   * error encountered while applying the resource to the workspace. Mutable: may be updated after
   * creation via UpdateOperation; setting it to an empty string clears it. After an update is
   * applied, an operation whose status is OPERATION_STATUS_SUCCEEDED cannot carry an error_message.
   */
  @JsonProperty("error_message")
  private String errorMessage;

  /**
   * Resource name of the operation. Format:
   * deployments/{deployment_id}/versions/{version_id}/operations/{resource_key}
   */
  @JsonProperty("name")
  private String name;

  /**
   * ID of the actual resource in the workspace (e.g. the job ID, pipeline ID). Optional at
   * creation: CREATE and RECREATE operations produce a new resource whose ID is not yet known when
   * the operation is recorded. Mutable: may be filled in (or corrected) later via UpdateOperation
   * once the ID is known.
   */
  @JsonProperty("resource_id")
  private String resourceId;

  /**
   * Resource identifier within the bundle (e.g. "jobs.foo", "pipelines.bar",
   * "jobs.foo.permissions", "files.<rel-path>"). Can be an arbitrary UTF-8 encoded string key. This
   * key links the operation to the corresponding deployment-level Resource.
   */
  @JsonProperty("resource_key")
  private String resourceKey;

  /**
   * The type of the deployment resource this operation applies to. Derived from the `resource_key`
   * prefix (e.g. "jobs" → JOB); the caller does not set this field.
   */
  @JsonProperty("resource_type")
  private DeploymentResourceType resourceType;

  /**
   * Monotonically increasing revision used for optimistic concurrency control (the AIP-154
   * concurrency token for this resource, realized as a sequence number rather than an opaque etag).
   * The server assigns 1 on creation and increments it on every successful UpdateOperation. It is
   * OPTIONAL rather than OUTPUT_ONLY because it is dual-purpose: CreateOperation/GetOperation
   * return the current value, and UpdateOperation reads the caller-supplied value as a
   * precondition. The caller must echo the value it last observed; if it no longer matches the
   * server's value, the update is rejected with ABORTED so the caller can re-read and retry.
   * Ignored on CreateOperation.
   */
  @JsonProperty("sequence_id")
  private Long sequenceId;

  /**
   * Serialized local config state after the operation. Should be unset for delete operations.
   * Mutable: may be updated after creation via UpdateOperation. When updating, the caller must echo
   * the last-observed `sequence_id` as a concurrency precondition.
   */
  @JsonProperty("state")
  private JsonNode state;

  /**
   * Whether the operation succeeded or failed. Mutable: may be updated after creation via
   * UpdateOperation, e.g. when an operation recorded as failed is retried and eventually succeeds.
   * A succeeded operation cannot carry an `error_message`.
   */
  @JsonProperty("status")
  private OperationStatus status;

  /**
   * When the operation was last updated. Set to `create_time` when the operation is created and to
   * the server timestamp on each successful UpdateOperation.
   */
  @JsonProperty("update_time")
  private Timestamp updateTime;

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

  public Operation setDashboardMetadata(DashboardMetadata dashboardMetadata) {
    this.dashboardMetadata = dashboardMetadata;
    return this;
  }

  public DashboardMetadata getDashboardMetadata() {
    return dashboardMetadata;
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

  public Operation setResourceType(DeploymentResourceType resourceType) {
    this.resourceType = resourceType;
    return this;
  }

  public DeploymentResourceType getResourceType() {
    return resourceType;
  }

  public Operation setSequenceId(Long sequenceId) {
    this.sequenceId = sequenceId;
    return this;
  }

  public Long getSequenceId() {
    return sequenceId;
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

  public Operation setUpdateTime(Timestamp updateTime) {
    this.updateTime = updateTime;
    return this;
  }

  public Timestamp getUpdateTime() {
    return updateTime;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Operation that = (Operation) o;
    return Objects.equals(actionType, that.actionType)
        && Objects.equals(createTime, that.createTime)
        && Objects.equals(dashboardMetadata, that.dashboardMetadata)
        && Objects.equals(errorMessage, that.errorMessage)
        && Objects.equals(name, that.name)
        && Objects.equals(resourceId, that.resourceId)
        && Objects.equals(resourceKey, that.resourceKey)
        && Objects.equals(resourceType, that.resourceType)
        && Objects.equals(sequenceId, that.sequenceId)
        && Objects.equals(state, that.state)
        && Objects.equals(status, that.status)
        && Objects.equals(updateTime, that.updateTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        actionType,
        createTime,
        dashboardMetadata,
        errorMessage,
        name,
        resourceId,
        resourceKey,
        resourceType,
        sequenceId,
        state,
        status,
        updateTime);
  }

  @Override
  public String toString() {
    return new ToStringer(Operation.class)
        .add("actionType", actionType)
        .add("createTime", createTime)
        .add("dashboardMetadata", dashboardMetadata)
        .add("errorMessage", errorMessage)
        .add("name", name)
        .add("resourceId", resourceId)
        .add("resourceKey", resourceKey)
        .add("resourceType", resourceType)
        .add("sequenceId", sequenceId)
        .add("state", state)
        .add("status", status)
        .add("updateTime", updateTime)
        .toString();
  }
}
