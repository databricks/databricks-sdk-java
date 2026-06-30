// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.supervisoragents;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

@Generated
public class ListExamplesRequest {
  /**
   * The maximum number of examples to return. If unspecified, at most 100 examples will be
   * returned. The maximum value is 100; values above 100 will be coerced to 100.
   */
  @JsonIgnore
  @QueryParam("page_size")
  private Long pageSize;

  /**
   * A page token, received from a previous `ListExamples` call. Provide this to retrieve the
   * subsequent page. If unspecified, the first page will be returned.
   */
  @JsonIgnore
  @QueryParam("page_token")
  private String pageToken;

  /** Parent resource to list from. Format: supervisor-agents/{supervisor_agent_id} */
  @JsonIgnore private String parent;

  public ListExamplesRequest setPageSize(Long pageSize) {
    this.pageSize = pageSize;
    return this;
  }

  public Long getPageSize() {
    return pageSize;
  }

  public ListExamplesRequest setPageToken(String pageToken) {
    this.pageToken = pageToken;
    return this;
  }

  public String getPageToken() {
    return pageToken;
  }

  public ListExamplesRequest setParent(String parent) {
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
    ListExamplesRequest that = (ListExamplesRequest) o;
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
    return new ToStringer(ListExamplesRequest.class)
        .add("pageSize", pageSize)
        .add("pageToken", pageToken)
        .add("parent", parent)
        .toString();
  }
}
