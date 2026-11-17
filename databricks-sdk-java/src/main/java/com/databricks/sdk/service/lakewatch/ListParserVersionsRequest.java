// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.lakewatch;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

@Generated
public class ListParserVersionsRequest {
  /**
   * Maximum number of results to return in one page. This is a best-effort upper bound, not a
   * guarantee: the server may return fewer items than requested (even zero) while more results
   * still exist. If unset or 0, the server picks a default.
   */
  @JsonIgnore
  @QueryParam("page_size")
  private Long pageSize;

  /**
   * Page token from a previous `ListParserVersions` response, used to fetch the next page of
   * results. Send the same `parent` when requesting later pages; a token from a request for a
   * different parser is rejected.
   */
  @JsonIgnore
  @QueryParam("page_token")
  private String pageToken;

  /** Resource name of the parser whose versions are listed. Format: `parsers/{parser_id}`. */
  @JsonIgnore private String parent;

  public ListParserVersionsRequest setPageSize(Long pageSize) {
    this.pageSize = pageSize;
    return this;
  }

  public Long getPageSize() {
    return pageSize;
  }

  public ListParserVersionsRequest setPageToken(String pageToken) {
    this.pageToken = pageToken;
    return this;
  }

  public String getPageToken() {
    return pageToken;
  }

  public ListParserVersionsRequest setParent(String parent) {
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
    ListParserVersionsRequest that = (ListParserVersionsRequest) o;
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
    return new ToStringer(ListParserVersionsRequest.class)
        .add("pageSize", pageSize)
        .add("pageToken", pageToken)
        .add("parent", parent)
        .toString();
  }
}
