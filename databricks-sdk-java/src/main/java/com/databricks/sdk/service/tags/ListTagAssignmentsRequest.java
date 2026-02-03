// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.tags;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

@Generated
public class ListTagAssignmentsRequest {
  /** The identifier of the entity to which the tag is assigned */
  @JsonIgnore private String entityId;

  /**
   * The type of entity to which the tag is assigned. Allowed values are apps, dashboards,
   * geniespaces
   */
  @JsonIgnore private String entityType;

  /** Optional. Maximum number of tag assignments to return in a single page */
  @JsonIgnore
  @QueryParam("page_size")
  private Long pageSize;

  /** Pagination token to go to the next page of tag assignments. Requests first page if absent. */
  @JsonIgnore
  @QueryParam("page_token")
  private String pageToken;

  public ListTagAssignmentsRequest setEntityId(String entityId) {
    this.entityId = entityId;
    return this;
  }

  public String getEntityId() {
    return entityId;
  }

  public ListTagAssignmentsRequest setEntityType(String entityType) {
    this.entityType = entityType;
    return this;
  }

  public String getEntityType() {
    return entityType;
  }

  public ListTagAssignmentsRequest setPageSize(Long pageSize) {
    this.pageSize = pageSize;
    return this;
  }

  public Long getPageSize() {
    return pageSize;
  }

  public ListTagAssignmentsRequest setPageToken(String pageToken) {
    this.pageToken = pageToken;
    return this;
  }

  public String getPageToken() {
    return pageToken;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListTagAssignmentsRequest that = (ListTagAssignmentsRequest) o;
    return Objects.equals(entityId, that.entityId)
        && Objects.equals(entityType, that.entityType)
        && Objects.equals(pageSize, that.pageSize)
        && Objects.equals(pageToken, that.pageToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entityId, entityType, pageSize, pageToken);
  }

  @Override
  public String toString() {
    return new ToStringer(ListTagAssignmentsRequest.class)
        .add("entityId", entityId)
        .add("entityType", entityType)
        .add("pageSize", pageSize)
        .add("pageToken", pageToken)
        .toString();
  }
}
