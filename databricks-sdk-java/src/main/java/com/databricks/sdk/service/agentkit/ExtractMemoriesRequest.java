// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.agentkit;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** Request to synchronously extract memories from a single session. */
@Generated
public class ExtractMemoriesRequest {
  /**
   * When true, extract and return the entries without writing them to the memory store. Defaults to
   * false, which persists the extracted entries and returns them.
   */
  @JsonProperty("dry_run")
  private Boolean dryRun;

  /** Instructions steering what is extracted from the session. */
  @JsonProperty("instructions")
  private String instructions;

  /**
   * Managed memory store the extracted entries are written to, in the form
   * `memory-stores/{managed_memory_store_id}`.
   */
  @JsonProperty("memory_store")
  private String memoryStore;

  /** Identifier of the session whose transcript is distilled into memories. */
  @JsonIgnore private String sessionId;

  /** Session store containing the session, in the form `session-stores/{session_store_id}`. */
  @JsonIgnore private String sessionStore;

  public ExtractMemoriesRequest setDryRun(Boolean dryRun) {
    this.dryRun = dryRun;
    return this;
  }

  public Boolean getDryRun() {
    return dryRun;
  }

  public ExtractMemoriesRequest setInstructions(String instructions) {
    this.instructions = instructions;
    return this;
  }

  public String getInstructions() {
    return instructions;
  }

  public ExtractMemoriesRequest setMemoryStore(String memoryStore) {
    this.memoryStore = memoryStore;
    return this;
  }

  public String getMemoryStore() {
    return memoryStore;
  }

  public ExtractMemoriesRequest setSessionId(String sessionId) {
    this.sessionId = sessionId;
    return this;
  }

  public String getSessionId() {
    return sessionId;
  }

  public ExtractMemoriesRequest setSessionStore(String sessionStore) {
    this.sessionStore = sessionStore;
    return this;
  }

  public String getSessionStore() {
    return sessionStore;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ExtractMemoriesRequest that = (ExtractMemoriesRequest) o;
    return Objects.equals(dryRun, that.dryRun)
        && Objects.equals(instructions, that.instructions)
        && Objects.equals(memoryStore, that.memoryStore)
        && Objects.equals(sessionId, that.sessionId)
        && Objects.equals(sessionStore, that.sessionStore);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dryRun, instructions, memoryStore, sessionId, sessionStore);
  }

  @Override
  public String toString() {
    return new ToStringer(ExtractMemoriesRequest.class)
        .add("dryRun", dryRun)
        .add("instructions", instructions)
        .add("memoryStore", memoryStore)
        .add("sessionId", sessionId)
        .add("sessionStore", sessionStore)
        .toString();
  }
}
