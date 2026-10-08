// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.agentkit;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;
import java.util.Objects;

/** Request to fork a session. */
@Generated
public class ForkSessionRequest {
  /**
   * Opaque caller-provided identifier for the application actor associated with the forked session.
   */
  @JsonProperty("actor_id")
  private String actorId;

  /** Optional metadata for the fork. */
  @JsonProperty("metadata")
  private Map<String, String> metadata;

  /**
   * Resource name of the containing session store, in the form `session-stores/{session_store_id}`.
   */
  @JsonIgnore private String parent;

  /** Optional unique ID for the forked session. A collision returns `ALREADY_EXISTS`. */
  @JsonProperty("session_id")
  private String sessionId;

  /** ID of the session to copy. */
  @JsonProperty("source_session_id")
  private String sourceSessionId;

  /**
   * Optional last item ID to copy through, inclusively. When omitted, the fork atomically copies
   * all items committed before the fork operation begins.
   */
  @JsonProperty("up_to_item_id")
  private String upToItemId;

  public ForkSessionRequest setActorId(String actorId) {
    this.actorId = actorId;
    return this;
  }

  public String getActorId() {
    return actorId;
  }

  public ForkSessionRequest setMetadata(Map<String, String> metadata) {
    this.metadata = metadata;
    return this;
  }

  public Map<String, String> getMetadata() {
    return metadata;
  }

  public ForkSessionRequest setParent(String parent) {
    this.parent = parent;
    return this;
  }

  public String getParent() {
    return parent;
  }

  public ForkSessionRequest setSessionId(String sessionId) {
    this.sessionId = sessionId;
    return this;
  }

  public String getSessionId() {
    return sessionId;
  }

  public ForkSessionRequest setSourceSessionId(String sourceSessionId) {
    this.sourceSessionId = sourceSessionId;
    return this;
  }

  public String getSourceSessionId() {
    return sourceSessionId;
  }

  public ForkSessionRequest setUpToItemId(String upToItemId) {
    this.upToItemId = upToItemId;
    return this;
  }

  public String getUpToItemId() {
    return upToItemId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ForkSessionRequest that = (ForkSessionRequest) o;
    return Objects.equals(actorId, that.actorId)
        && Objects.equals(metadata, that.metadata)
        && Objects.equals(parent, that.parent)
        && Objects.equals(sessionId, that.sessionId)
        && Objects.equals(sourceSessionId, that.sourceSessionId)
        && Objects.equals(upToItemId, that.upToItemId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actorId, metadata, parent, sessionId, sourceSessionId, upToItemId);
  }

  @Override
  public String toString() {
    return new ToStringer(ForkSessionRequest.class)
        .add("actorId", actorId)
        .add("metadata", metadata)
        .add("parent", parent)
        .add("sessionId", sessionId)
        .add("sourceSessionId", sourceSessionId)
        .add("upToItemId", upToItemId)
        .toString();
  }
}
