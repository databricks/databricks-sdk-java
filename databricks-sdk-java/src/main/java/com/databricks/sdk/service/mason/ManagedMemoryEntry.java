// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.mason;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.protobuf.Timestamp;
import java.util.Objects;

/** A workspace-scoped entry in a managed memory store. */
@Generated
public class ManagedMemoryEntry {
  /** Customer-provided identifier for the actor whose memory this entry represents. */
  @JsonProperty("actor_id")
  private String actorId;

  /** Optional free-form memory content. */
  @JsonProperty("content")
  private String content;

  /** Time when the entry was created. */
  @JsonProperty("create_time")
  private Timestamp createTime;

  /** Human-readable description of the memory entry. */
  @JsonProperty("description")
  private String description;

  /**
   * Resource name in the form
   * `memory-stores/{managed_memory_store_id}/entries/{managed_memory_entry_id}`.
   */
  @JsonProperty("name")
  private String name;

  /**
   * Absolute, case-sensitive path identifying the entry within its actor and optional session.
   * Paths must begin with `/` and must not contain empty, `.` or `..` segments.
   */
  @JsonProperty("path")
  private String path;

  /**
   * Optional identifier for the session associated with this memory entry. When omitted, the entry
   * applies across the actor's sessions.
   */
  @JsonProperty("session_id")
  private String sessionId;

  /** Which writer created this entry. Caller sets this on Create; immutable after creation. */
  @JsonProperty("source_type")
  private ManagedMemoryEntrySourceType sourceType;

  /** Time when the entry was last updated. */
  @JsonProperty("update_time")
  private Timestamp updateTime;

  public ManagedMemoryEntry setActorId(String actorId) {
    this.actorId = actorId;
    return this;
  }

  public String getActorId() {
    return actorId;
  }

  public ManagedMemoryEntry setContent(String content) {
    this.content = content;
    return this;
  }

  public String getContent() {
    return content;
  }

  public ManagedMemoryEntry setCreateTime(Timestamp createTime) {
    this.createTime = createTime;
    return this;
  }

  public Timestamp getCreateTime() {
    return createTime;
  }

  public ManagedMemoryEntry setDescription(String description) {
    this.description = description;
    return this;
  }

  public String getDescription() {
    return description;
  }

  public ManagedMemoryEntry setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public ManagedMemoryEntry setPath(String path) {
    this.path = path;
    return this;
  }

  public String getPath() {
    return path;
  }

  public ManagedMemoryEntry setSessionId(String sessionId) {
    this.sessionId = sessionId;
    return this;
  }

  public String getSessionId() {
    return sessionId;
  }

  public ManagedMemoryEntry setSourceType(ManagedMemoryEntrySourceType sourceType) {
    this.sourceType = sourceType;
    return this;
  }

  public ManagedMemoryEntrySourceType getSourceType() {
    return sourceType;
  }

  public ManagedMemoryEntry setUpdateTime(Timestamp updateTime) {
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
    ManagedMemoryEntry that = (ManagedMemoryEntry) o;
    return Objects.equals(actorId, that.actorId)
        && Objects.equals(content, that.content)
        && Objects.equals(createTime, that.createTime)
        && Objects.equals(description, that.description)
        && Objects.equals(name, that.name)
        && Objects.equals(path, that.path)
        && Objects.equals(sessionId, that.sessionId)
        && Objects.equals(sourceType, that.sourceType)
        && Objects.equals(updateTime, that.updateTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        actorId, content, createTime, description, name, path, sessionId, sourceType, updateTime);
  }

  @Override
  public String toString() {
    return new ToStringer(ManagedMemoryEntry.class)
        .add("actorId", actorId)
        .add("content", content)
        .add("createTime", createTime)
        .add("description", description)
        .add("name", name)
        .add("path", path)
        .add("sessionId", sessionId)
        .add("sourceType", sourceType)
        .add("updateTime", updateTime)
        .toString();
  }
}
