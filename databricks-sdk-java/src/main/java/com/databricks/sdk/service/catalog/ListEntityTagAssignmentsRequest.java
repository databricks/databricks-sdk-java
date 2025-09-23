// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

@Generated
public class ListEntityTagAssignmentsRequest {
  /** The fully qualified name of the entity to which the tag is assigned */
  @JsonIgnore private String entityName;

  /**
   * The type of the entity to which the tag is assigned. Allowed values are: catalogs, schemas,
   * tables, columns, volumes.
   */
  @JsonIgnore private String entityType;

  /** Optional. Maximum number of tag assignments to return in a single page */
  @JsonIgnore
  @QueryParam("max_results")
  private Long maxResults;

  /** Optional. Pagination token to retrieve the next page of results */
  @JsonIgnore
  @QueryParam("page_token")
  private String pageToken;

  public ListEntityTagAssignmentsRequest setEntityName(String entityName) {
    this.entityName = entityName;
    return this;
  }

  public String getEntityName() {
    return entityName;
  }

  public ListEntityTagAssignmentsRequest setEntityType(String entityType) {
    this.entityType = entityType;
    return this;
  }

  public String getEntityType() {
    return entityType;
  }

  public ListEntityTagAssignmentsRequest setMaxResults(Long maxResults) {
    this.maxResults = maxResults;
    return this;
  }

  public Long getMaxResults() {
    return maxResults;
  }

  public ListEntityTagAssignmentsRequest setPageToken(String pageToken) {
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
    ListEntityTagAssignmentsRequest that = (ListEntityTagAssignmentsRequest) o;
    return Objects.equals(entityName, that.entityName)
        && Objects.equals(entityType, that.entityType)
        && Objects.equals(maxResults, that.maxResults)
        && Objects.equals(pageToken, that.pageToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entityName, entityType, maxResults, pageToken);
  }

  @Override
  public String toString() {
    return new ToStringer(ListEntityTagAssignmentsRequest.class)
        .add("entityName", entityName)
        .add("entityType", entityType)
        .add("maxResults", maxResults)
        .add("pageToken", pageToken)
        .toString();
  }
}
