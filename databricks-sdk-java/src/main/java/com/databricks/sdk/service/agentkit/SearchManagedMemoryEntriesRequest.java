// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.agentkit;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.protobuf.FieldMask;
import java.util.Objects;

/**
 * Request to search managed memory entries by text query for one actor. Search returns a
 * relevance-ranked top-N result set and does not currently paginate.
 */
@Generated
public class SearchManagedMemoryEntriesRequest {
  /** Customer-provided identifier for the actor whose entries are searched. */
  @JsonProperty("actor_id")
  private String actorId;

  /** Deprecated alias for `page_size`. When both fields are set, their values must match. */
  @JsonProperty("limit")
  private Long limit;

  /**
   * Maximum number of relevance-ranked entries to return. Defaults to 10 and must be between 1 and
   * 100.
   */
  @JsonProperty("page_size")
  private Long pageSize;

  /**
   * Reserved for pagination compatibility. The server currently ignores this field because Search
   * returns a ranked top-N result set.
   */
  @JsonProperty("page_token")
  private String pageToken;

  /**
   * Managed memory store whose entries are searched, in the form
   * `memory-stores/{managed_memory_store_id}`.
   */
  @JsonIgnore private String parent;

  /**
   * Optional absolute, case-sensitive path prefix used to restrict searched entries within the
   * actor partition. The prefix must begin with `/` and must not contain empty, `.` or `..`
   * segments.
   */
  @JsonProperty("path_prefix")
  private String pathPrefix;

  /** Free-form search query. */
  @JsonProperty("query")
  private String query;

  /**
   * Fields to return in each matching entry, using proto field names such as `content` (not
   * `contents`). An omitted or empty mask returns each full entry, including `content`; a non-empty
   * mask returns only the requested fields. Search scores are always returned.
   *
   * <p>The field mask must be a single string, with multiple fields separated by commas (no
   * spaces). The field path is relative to the resource object, using a dot (`.`) to navigate
   * sub-fields (e.g., `author.given_name`). Specification of elements in sequence or map fields is
   * not allowed, as only the entire collection field can be specified. Field names must exactly
   * match the resource field names.
   */
  @JsonProperty("read_mask")
  private FieldMask readMask;

  /**
   * Optional session identifier. When set, only entries with this exact `session_id` are searched.
   * Omitted-session (cross-session) entries are not included.
   */
  @JsonProperty("session_id")
  private String sessionId;

  public SearchManagedMemoryEntriesRequest setActorId(String actorId) {
    this.actorId = actorId;
    return this;
  }

  public String getActorId() {
    return actorId;
  }

  public SearchManagedMemoryEntriesRequest setLimit(Long limit) {
    this.limit = limit;
    return this;
  }

  public Long getLimit() {
    return limit;
  }

  public SearchManagedMemoryEntriesRequest setPageSize(Long pageSize) {
    this.pageSize = pageSize;
    return this;
  }

  public Long getPageSize() {
    return pageSize;
  }

  public SearchManagedMemoryEntriesRequest setPageToken(String pageToken) {
    this.pageToken = pageToken;
    return this;
  }

  public String getPageToken() {
    return pageToken;
  }

  public SearchManagedMemoryEntriesRequest setParent(String parent) {
    this.parent = parent;
    return this;
  }

  public String getParent() {
    return parent;
  }

  public SearchManagedMemoryEntriesRequest setPathPrefix(String pathPrefix) {
    this.pathPrefix = pathPrefix;
    return this;
  }

  public String getPathPrefix() {
    return pathPrefix;
  }

  public SearchManagedMemoryEntriesRequest setQuery(String query) {
    this.query = query;
    return this;
  }

  public String getQuery() {
    return query;
  }

  public SearchManagedMemoryEntriesRequest setReadMask(FieldMask readMask) {
    this.readMask = readMask;
    return this;
  }

  public FieldMask getReadMask() {
    return readMask;
  }

  public SearchManagedMemoryEntriesRequest setSessionId(String sessionId) {
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
    SearchManagedMemoryEntriesRequest that = (SearchManagedMemoryEntriesRequest) o;
    return Objects.equals(actorId, that.actorId)
        && Objects.equals(limit, that.limit)
        && Objects.equals(pageSize, that.pageSize)
        && Objects.equals(pageToken, that.pageToken)
        && Objects.equals(parent, that.parent)
        && Objects.equals(pathPrefix, that.pathPrefix)
        && Objects.equals(query, that.query)
        && Objects.equals(readMask, that.readMask)
        && Objects.equals(sessionId, that.sessionId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        actorId, limit, pageSize, pageToken, parent, pathPrefix, query, readMask, sessionId);
  }

  @Override
  public String toString() {
    return new ToStringer(SearchManagedMemoryEntriesRequest.class)
        .add("actorId", actorId)
        .add("limit", limit)
        .add("pageSize", pageSize)
        .add("pageToken", pageToken)
        .add("parent", parent)
        .add("pathPrefix", pathPrefix)
        .add("query", query)
        .add("readMask", readMask)
        .add("sessionId", sessionId)
        .toString();
  }
}
