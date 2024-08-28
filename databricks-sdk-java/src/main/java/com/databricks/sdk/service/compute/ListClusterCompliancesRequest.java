// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import java.util.Objects;

/** List cluster policy compliance */
@Generated
public class ListClusterCompliancesRequest {
  /**
   * Use this field to specify the maximum number of results to be returned by the server. The
   * server may further constrain the maximum number of results returned in a single page.
   */
  @QueryParam("page_size")
  private Long pageSize;

  /**
   * A page token that can be used to navigate to the next page or previous page as returned by
   * `next_page_token` or `prev_page_token`.
   */
  @QueryParam("page_token")
  private String pageToken;

  /** Canonical unique identifier for the cluster policy. */
  @QueryParam("policy_id")
  private String policyId;

  public ListClusterCompliancesRequest setPageSize(Long pageSize) {
    this.pageSize = pageSize;
    return this;
  }

  public Long getPageSize() {
    return pageSize;
  }

  public ListClusterCompliancesRequest setPageToken(String pageToken) {
    this.pageToken = pageToken;
    return this;
  }

  public String getPageToken() {
    return pageToken;
  }

  public ListClusterCompliancesRequest setPolicyId(String policyId) {
    this.policyId = policyId;
    return this;
  }

  public String getPolicyId() {
    return policyId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListClusterCompliancesRequest that = (ListClusterCompliancesRequest) o;
    return Objects.equals(pageSize, that.pageSize)
        && Objects.equals(pageToken, that.pageToken)
        && Objects.equals(policyId, that.policyId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pageSize, pageToken, policyId);
  }

  @Override
  public String toString() {
    return new ToStringer(ListClusterCompliancesRequest.class)
        .add("pageSize", pageSize)
        .add("pageToken", pageToken)
        .add("policyId", policyId)
        .toString();
  }
}
