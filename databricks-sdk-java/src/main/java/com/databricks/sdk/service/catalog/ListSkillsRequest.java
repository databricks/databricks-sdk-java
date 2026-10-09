// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

@Generated
public class ListSkillsRequest {
  /**
   * Maximum number of skills to return. Defaults to 100 when unset or 0; the maximum is 200. Use
   * `page_token` to retrieve additional pages.
   */
  @JsonIgnore
  @QueryParam("page_size")
  private Long pageSize;

  /** Opaque pagination token from a previous request. */
  @JsonIgnore
  @QueryParam("page_token")
  private String pageToken;

  /**
   * Name of the parent schema. Format: `schemas/{catalog}.{schema}`. Each `{...}` component is
   * capped at 255 characters individually.
   *
   * <p>Required: skill listing is schema-scoped, so `parent` must be set; an unset or empty
   * `parent` is rejected with INVALID_PARAMETER_VALUE.
   */
  @JsonIgnore
  @QueryParam("parent")
  private String parent;

  public ListSkillsRequest setPageSize(Long pageSize) {
    this.pageSize = pageSize;
    return this;
  }

  public Long getPageSize() {
    return pageSize;
  }

  public ListSkillsRequest setPageToken(String pageToken) {
    this.pageToken = pageToken;
    return this;
  }

  public String getPageToken() {
    return pageToken;
  }

  public ListSkillsRequest setParent(String parent) {
    this.parent = parent;
    return this;
  }

  public String getParent() {
    return parent;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListSkillsRequest that = (ListSkillsRequest) o;
    return Objects.equals(pageSize, that.pageSize)
        && Objects.equals(pageToken, that.pageToken)
        && Objects.equals(parent, that.parent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pageSize, pageToken, parent);
  }

  @Override
  public String toString() {
    return new ToStringer(ListSkillsRequest.class)
        .add("pageSize", pageSize)
        .add("pageToken", pageToken)
        .add("parent", parent)
        .toString();
  }
}
