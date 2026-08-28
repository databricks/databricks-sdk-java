// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.bundledeployments;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * A resource operation to record when a version is created. Each staged operation identifies the
 * resource it applies to and the action planned for it; the server records the operation in
 * `OPERATION_STATUS_PENDING`, and its outcome is filled in later via UpdateOperation.
 */
@Generated
public class StagedOperation {
  /** The type of operation planned for this resource. */
  @JsonProperty("action_type")
  private OperationActionType actionType;

  /**
   * The key identifying the resource this operation applies to (e.g. "jobs.foo", "pipelines.bar").
   * Becomes the final component of the operation's name and must be unique among the operations in
   * the version.
   */
  @JsonProperty("resource_key")
  private String resourceKey;

  public StagedOperation setActionType(OperationActionType actionType) {
    this.actionType = actionType;
    return this;
  }

  public OperationActionType getActionType() {
    return actionType;
  }

  public StagedOperation setResourceKey(String resourceKey) {
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
    StagedOperation that = (StagedOperation) o;
    return Objects.equals(actionType, that.actionType)
        && Objects.equals(resourceKey, that.resourceKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actionType, resourceKey);
  }

  @Override
  public String toString() {
    return new ToStringer(StagedOperation.class)
        .add("actionType", actionType)
        .add("resourceKey", resourceKey)
        .toString();
  }
}
