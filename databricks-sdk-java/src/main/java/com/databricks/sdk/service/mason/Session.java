// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.mason;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.protobuf.Timestamp;
import java.util.Map;
import java.util.Objects;

/** A durable logical interaction stored within a Session Store. */
@Generated
public class Session {
  /**
   * Opaque caller-provided identifier for the application actor associated with the session.
   *
   * <p>This is application data and has no Databricks authentication or authorization semantics.
   * Use the same value as the Managed Memory Entry `actor_id` when storing memories associated with
   * this actor. Every session must set it. A child session must use the same value as its parent.
   */
  @JsonProperty("actor_id")
  private String actorId;

  /** Time when the session was created. */
  @JsonProperty("create_time")
  private Timestamp createTime;

  /** Time when the session's item history was last mutated. */
  @JsonProperty("last_activity_time")
  private Timestamp lastActivityTime;

  /** Mutable caller-defined string labels. */
  @JsonProperty("metadata")
  private Map<String, String> metadata;

  /** Resource name in the form `session-stores/{session_store_id}/sessions/{session_id}`. */
  @JsonProperty("name")
  private String name;

  /**
   * Immediate parent session ID. Set only at creation for child sessions, immutable thereafter, and
   * restricted to the same store.
   */
  @JsonProperty("parent_session_id")
  private String parentSessionId;

  /**
   * Top-level session ID in the spawn tree. This equals `session_id` for a root or fork and is
   * inherited transitively by child sessions.
   */
  @JsonProperty("root_session_id")
  private String rootSessionId;

  /**
   * Unique session ID. The service generates a UUID unless the caller supplies
   * `CreateSessionRequest.session_id`.
   */
  @JsonProperty("session_id")
  private String sessionId;

  /** Time when session resource fields last changed. */
  @JsonProperty("update_time")
  private Timestamp updateTime;

  public Session setActorId(String actorId) {
    this.actorId = actorId;
    return this;
  }

  public String getActorId() {
    return actorId;
  }

  public Session setCreateTime(Timestamp createTime) {
    this.createTime = createTime;
    return this;
  }

  public Timestamp getCreateTime() {
    return createTime;
  }

  public Session setLastActivityTime(Timestamp lastActivityTime) {
    this.lastActivityTime = lastActivityTime;
    return this;
  }

  public Timestamp getLastActivityTime() {
    return lastActivityTime;
  }

  public Session setMetadata(Map<String, String> metadata) {
    this.metadata = metadata;
    return this;
  }

  public Map<String, String> getMetadata() {
    return metadata;
  }

  public Session setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public Session setParentSessionId(String parentSessionId) {
    this.parentSessionId = parentSessionId;
    return this;
  }

  public String getParentSessionId() {
    return parentSessionId;
  }

  public Session setRootSessionId(String rootSessionId) {
    this.rootSessionId = rootSessionId;
    return this;
  }

  public String getRootSessionId() {
    return rootSessionId;
  }

  public Session setSessionId(String sessionId) {
    this.sessionId = sessionId;
    return this;
  }

  public String getSessionId() {
    return sessionId;
  }

  public Session setUpdateTime(Timestamp updateTime) {
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
    Session that = (Session) o;
    return Objects.equals(actorId, that.actorId)
        && Objects.equals(createTime, that.createTime)
        && Objects.equals(lastActivityTime, that.lastActivityTime)
        && Objects.equals(metadata, that.metadata)
        && Objects.equals(name, that.name)
        && Objects.equals(parentSessionId, that.parentSessionId)
        && Objects.equals(rootSessionId, that.rootSessionId)
        && Objects.equals(sessionId, that.sessionId)
        && Objects.equals(updateTime, that.updateTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        actorId,
        createTime,
        lastActivityTime,
        metadata,
        name,
        parentSessionId,
        rootSessionId,
        sessionId,
        updateTime);
  }

  @Override
  public String toString() {
    return new ToStringer(Session.class)
        .add("actorId", actorId)
        .add("createTime", createTime)
        .add("lastActivityTime", lastActivityTime)
        .add("metadata", metadata)
        .add("name", name)
        .add("parentSessionId", parentSessionId)
        .add("rootSessionId", rootSessionId)
        .add("sessionId", sessionId)
        .add("updateTime", updateTime)
        .toString();
  }
}
