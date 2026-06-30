// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.tags;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

@Generated
public class ListTagPoliciesRequest {
  /**
   * The maximum number of results to return in this request. Fewer results may be returned than
   * requested. If unspecified or set to 0, this defaults to 1000. The maximum value is 1000; values
   * above 1000 will be coerced down to 1000.
   */
  @JsonIgnore
  @QueryParam("page_size")
  private Long pageSize;

  /** An optional page token received from a previous list tag policies call. */
  @JsonIgnore
  @QueryParam("page_token")
  private String pageToken;

  public ListTagPoliciesRequest setPageSize(Long pageSize) {
    this.pageSize = pageSize;
    return this;
  }

  public Long getPageSize() {
    return pageSize;
  }

  public ListTagPoliciesRequest setPageToken(String pageToken) {
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
    ListTagPoliciesRequest that = (ListTagPoliciesRequest) o;
    return Objects.equals(pageSize, that.pageSize) && Objects.equals(pageToken, that.pageToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pageSize, pageToken);
  }

  @Override
  public String toString() {
    return new ToStringer(ListTagPoliciesRequest.class)
        .add("pageSize", pageSize)
        .add("pageToken", pageToken)
        .toString();
  }
}
