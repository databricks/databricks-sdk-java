// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.agentkit;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.google.protobuf.FieldMask;
import java.util.Objects;

@Generated
public class ListManagedMemoryEntriesRequest {
  /** Customer-provided identifier for the actor whose entries are listed. */
  @JsonIgnore
  @QueryParam("actor_id")
  private String actorId;

  /**
   * Maximum number of entries to return. The service may return fewer entries than requested.
   * Defaults to 10; must be between 1 and 100.
   */
  @JsonIgnore
  @QueryParam("page_size")
  private Long pageSize;

  /** Opaque pagination token from a previous ListManagedMemoryEntries response. */
  @JsonIgnore
  @QueryParam("page_token")
  private String pageToken;

  /**
   * Managed memory store whose entries are listed, in the form
   * `memory-stores/{managed_memory_store_id}`.
   */
  @JsonIgnore private String parent;

  /** Optional path prefix used to restrict entries within the actor partition. */
  @JsonIgnore
  @QueryParam("path_prefix")
  private String pathPrefix;

  /**
   * Fields to return in each entry, using proto field names such as `content` (not `contents`). An
   * omitted or empty mask returns each full entry, including `content`; a non-empty mask returns
   * only the requested fields.
   */
  @JsonIgnore
  @QueryParam("read_mask")
  private FieldMask readMask;

  /**
   * Optional session identifier. When set, only entries with this exact `session_id` are returned.
   * Omitted-session (cross-session) entries are not included. Ignored when path is set.
   */
  @JsonIgnore
  @QueryParam("session_id")
  private String sessionId;

  public ListManagedMemoryEntriesRequest setActorId(String actorId) {
    this.actorId = actorId;
    return this;
  }

  public String getActorId() {
    return actorId;
  }

  public ListManagedMemoryEntriesRequest setPageSize(Long pageSize) {
    this.pageSize = pageSize;
    return this;
  }

  public Long getPageSize() {
    return pageSize;
  }

  public ListManagedMemoryEntriesRequest setPageToken(String pageToken) {
    this.pageToken = pageToken;
    return this;
  }

  public String getPageToken() {
    return pageToken;
  }

  public ListManagedMemoryEntriesRequest setParent(String parent) {
    this.parent = parent;
    return this;
  }

  public String getParent() {
    return parent;
  }

  public ListManagedMemoryEntriesRequest setPathPrefix(String pathPrefix) {
    this.pathPrefix = pathPrefix;
    return this;
  }

  public String getPathPrefix() {
    return pathPrefix;
  }

  public ListManagedMemoryEntriesRequest setReadMask(FieldMask readMask) {
    this.readMask = readMask;
    return this;
  }

  public FieldMask getReadMask() {
    return readMask;
  }

  public ListManagedMemoryEntriesRequest setSessionId(String sessionId) {
    this.sessionId = sessionId;
    return this;
  }

  public String getSessionId() {
    return sessionId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListManagedMemoryEntriesRequest that = (ListManagedMemoryEntriesRequest) o;
    return Objects.equals(actorId, that.actorId)
        && Objects.equals(pageSize, that.pageSize)
        && Objects.equals(pageToken, that.pageToken)
        && Objects.equals(parent, that.parent)
        && Objects.equals(pathPrefix, that.pathPrefix)
        && Objects.equals(readMask, that.readMask)
        && Objects.equals(sessionId, that.sessionId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actorId, pageSize, pageToken, parent, pathPrefix, readMask, sessionId);
  }

  @Override
  public String toString() {
    return new ToStringer(ListManagedMemoryEntriesRequest.class)
        .add("actorId", actorId)
        .add("pageSize", pageSize)
        .add("pageToken", pageToken)
        .add("parent", parent)
        .add("pathPrefix", pathPrefix)
        .add("readMask", readMask)
        .add("sessionId", sessionId)
        .toString();
  }
}
