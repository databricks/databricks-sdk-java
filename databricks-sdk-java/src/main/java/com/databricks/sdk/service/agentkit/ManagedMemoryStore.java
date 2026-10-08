// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.agentkit;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.protobuf.Timestamp;
import java.util.Objects;

/** A workspace-scoped managed memory store backed by service-managed storage. */
@Generated
public class ManagedMemoryStore {
  /** Time when the store was created. */
  @JsonProperty("create_time")
  private Timestamp createTime;

  /**
   * Workspace-local user ID of the authenticated principal that created the store. This is
   * immutable server-set attribution and does not grant access; authorization is evaluated from the
   * authenticated request context.
   */
  @JsonProperty("creator_user_id")
  private String creatorUserId;

  /** Human-readable description of the memory store. */
  @JsonProperty("description")
  private String description;

  /**
   * Deprecated compatibility alias for the caller-provided managed memory store ID. Canonical
   * clients provide the ID through `CreateMemoryStoreRequest.managed_memory_store_id` and use
   * `name` as the resource identifier.
   */
  @JsonProperty("display_name")
  private String displayName;

  /** Resource name in the form `memory-stores/{managed_memory_store_id}`. */
  @JsonProperty("name")
  private String name;

  /**
   * Deprecated alias for `creator_user_id`. This identifies the original creator, not a
   * transferable owner. Use `creator_user_id` instead.
   */
  @JsonProperty("owner_user_id")
  private String ownerUserId;

  /** Service-managed storage backing this memory store. */
  @JsonProperty("storage_backend")
  private StorageBackend storageBackend;

  /** Time when the store was last updated. */
  @JsonProperty("update_time")
  private Timestamp updateTime;

  /** Workspace that owns the memory store. */
  @JsonProperty("workspace_id")
  private Long workspaceId;

  public ManagedMemoryStore setCreateTime(Timestamp createTime) {
    this.createTime = createTime;
    return this;
  }

  public Timestamp getCreateTime() {
    return createTime;
  }

  public ManagedMemoryStore setCreatorUserId(String creatorUserId) {
    this.creatorUserId = creatorUserId;
    return this;
  }

  public String getCreatorUserId() {
    return creatorUserId;
  }

  public ManagedMemoryStore setDescription(String description) {
    this.description = description;
    return this;
  }

  public String getDescription() {
    return description;
  }

  public ManagedMemoryStore setDisplayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

  public String getDisplayName() {
    return displayName;
  }

  public ManagedMemoryStore setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public ManagedMemoryStore setOwnerUserId(String ownerUserId) {
    this.ownerUserId = ownerUserId;
    return this;
  }

  public String getOwnerUserId() {
    return ownerUserId;
  }

  public ManagedMemoryStore setStorageBackend(StorageBackend storageBackend) {
    this.storageBackend = storageBackend;
    return this;
  }

  public StorageBackend getStorageBackend() {
    return storageBackend;
  }

  public ManagedMemoryStore setUpdateTime(Timestamp updateTime) {
    this.updateTime = updateTime;
    return this;
  }

  public Timestamp getUpdateTime() {
    return updateTime;
  }

  public ManagedMemoryStore setWorkspaceId(Long workspaceId) {
    this.workspaceId = workspaceId;
    return this;
  }

  public Long getWorkspaceId() {
    return workspaceId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ManagedMemoryStore that = (ManagedMemoryStore) o;
    return Objects.equals(createTime, that.createTime)
        && Objects.equals(creatorUserId, that.creatorUserId)
        && Objects.equals(description, that.description)
        && Objects.equals(displayName, that.displayName)
        && Objects.equals(name, that.name)
        && Objects.equals(ownerUserId, that.ownerUserId)
        && Objects.equals(storageBackend, that.storageBackend)
        && Objects.equals(updateTime, that.updateTime)
        && Objects.equals(workspaceId, that.workspaceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        createTime,
        creatorUserId,
        description,
        displayName,
        name,
        ownerUserId,
        storageBackend,
        updateTime,
        workspaceId);
  }

  @Override
  public String toString() {
    return new ToStringer(ManagedMemoryStore.class)
        .add("createTime", createTime)
        .add("creatorUserId", creatorUserId)
        .add("description", description)
        .add("displayName", displayName)
        .add("name", name)
        .add("ownerUserId", ownerUserId)
        .add("storageBackend", storageBackend)
        .add("updateTime", updateTime)
        .add("workspaceId", workspaceId)
        .toString();
  }
}
