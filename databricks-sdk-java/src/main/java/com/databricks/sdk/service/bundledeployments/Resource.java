// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.bundledeployments;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.JsonNode;
import com.google.protobuf.Timestamp;
import java.util.Objects;

/**
 * A resource managed by a deployment. Resources are implicitly created, updated, or deleted when
 * operations are recorded on a version.
 */
@Generated
public class Resource {
  /** The action performed on this resource during the last version. */
  @JsonProperty("last_action_type")
  private OperationActionType lastActionType;

  /** The version_id of the last version where this resource was updated. */
  @JsonProperty("last_version_id")
  private String lastVersionId;

  /** Resource name. Format: deployments/{deployment_id}/resources/{resource_key} */
  @JsonProperty("name")
  private String name;

  /** ID that references the actual resource in the workspace (e.g. the job ID, pipeline ID). */
  @JsonProperty("resource_id")
  private String resourceId;

  /**
   * Resource identifier within the bundle (e.g. "jobs.foo", "pipelines.bar",
   * "jobs.foo.permissions").
   */
  @JsonProperty("resource_key")
  private String resourceKey;

  /** The type of the deployment resource. */
  @JsonProperty("resource_type")
  private DeploymentResourceType resourceType;

  /** Serialized local config state (what the CLI deployed). */
  @JsonProperty("state")
  private JsonNode state;

  /**
   * When the last operation that updated this resource's recorded state was applied. Pairs with
   * last_action_type and last_version_id (all three advance together on that write).
   */
  @JsonProperty("update_time")
  private Timestamp updateTime;

  public Resource setLastActionType(OperationActionType lastActionType) {
    this.lastActionType = lastActionType;
    return this;
  }

  public OperationActionType getLastActionType() {
    return lastActionType;
  }

  public Resource setLastVersionId(String lastVersionId) {
    this.lastVersionId = lastVersionId;
    return this;
  }

  public String getLastVersionId() {
    return lastVersionId;
  }

  public Resource setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public Resource setResourceId(String resourceId) {
    this.resourceId = resourceId;
    return this;
  }

  public String getResourceId() {
    return resourceId;
  }

  public Resource setResourceKey(String resourceKey) {
    this.resourceKey = resourceKey;
    return this;
  }

  public String getResourceKey() {
    return resourceKey;
  }

  public Resource setResourceType(DeploymentResourceType resourceType) {
    this.resourceType = resourceType;
    return this;
  }

  public DeploymentResourceType getResourceType() {
    return resourceType;
  }

  public Resource setState(JsonNode state) {
    this.state = state;
    return this;
  }

  public JsonNode getState() {
    return state;
  }

  public Resource setUpdateTime(Timestamp updateTime) {
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
    Resource that = (Resource) o;
    return Objects.equals(lastActionType, that.lastActionType)
        && Objects.equals(lastVersionId, that.lastVersionId)
        && Objects.equals(name, that.name)
        && Objects.equals(resourceId, that.resourceId)
        && Objects.equals(resourceKey, that.resourceKey)
        && Objects.equals(resourceType, that.resourceType)
        && Objects.equals(state, that.state)
        && Objects.equals(updateTime, that.updateTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        lastActionType,
        lastVersionId,
        name,
        resourceId,
        resourceKey,
        resourceType,
        state,
        updateTime);
  }

  @Override
  public String toString() {
    return new ToStringer(Resource.class)
        .add("lastActionType", lastActionType)
        .add("lastVersionId", lastVersionId)
        .add("name", name)
        .add("resourceId", resourceId)
        .add("resourceKey", resourceKey)
        .add("resourceType", resourceType)
        .add("state", state)
        .add("updateTime", updateTime)
        .toString();
  }
}
