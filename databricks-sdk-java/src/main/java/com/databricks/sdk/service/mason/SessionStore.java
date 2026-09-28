// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.mason;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.protobuf.Timestamp;
import java.util.Map;
import java.util.Objects;

/** A workspace-scoped session store. */
@Generated
public class SessionStore {
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

  /** Human-readable description of the session store. */
  @JsonProperty("description")
  private String description;

  /** Mutable caller-defined string labels. */
  @JsonProperty("metadata")
  private Map<String, String> metadata;

  /** Resource name in the form `session-stores/{session_store_id}`. */
  @JsonProperty("name")
  private String name;

  /** Time when the store was last updated. */
  @JsonProperty("update_time")
  private Timestamp updateTime;

  public SessionStore setCreateTime(Timestamp createTime) {
    this.createTime = createTime;
    return this;
  }

  public Timestamp getCreateTime() {
    return createTime;
  }

  public SessionStore setCreatorUserId(String creatorUserId) {
    this.creatorUserId = creatorUserId;
    return this;
  }

  public String getCreatorUserId() {
    return creatorUserId;
  }

  public SessionStore setDescription(String description) {
    this.description = description;
    return this;
  }

  public String getDescription() {
    return description;
  }

  public SessionStore setMetadata(Map<String, String> metadata) {
    this.metadata = metadata;
    return this;
  }

  public Map<String, String> getMetadata() {
    return metadata;
  }

  public SessionStore setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public SessionStore setUpdateTime(Timestamp updateTime) {
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
    SessionStore that = (SessionStore) o;
    return Objects.equals(createTime, that.createTime)
        && Objects.equals(creatorUserId, that.creatorUserId)
        && Objects.equals(description, that.description)
        && Objects.equals(metadata, that.metadata)
        && Objects.equals(name, that.name)
        && Objects.equals(updateTime, that.updateTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createTime, creatorUserId, description, metadata, name, updateTime);
  }

  @Override
  public String toString() {
    return new ToStringer(SessionStore.class)
        .add("createTime", createTime)
        .add("creatorUserId", creatorUserId)
        .add("description", description)
        .add("metadata", metadata)
        .add("name", name)
        .add("updateTime", updateTime)
        .toString();
  }
}
