// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.domains;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

@Generated
public class ListDomainsRequest {
  /** */
  @JsonIgnore
  @QueryParam("page_size")
  private Long pageSize;

  /** */
  @JsonIgnore
  @QueryParam("page_token")
  private String pageToken;

  /**
   * Filter by parent domain. - Absent: return all domains regardless of hierarchy. - Present:
   * return only direct children of the specified domain.
   */
  @JsonIgnore
  @QueryParam("parent_domain_id")
  private String parentDomainId;

  public ListDomainsRequest setPageSize(Long pageSize) {
    this.pageSize = pageSize;
    return this;
  }

  public Long getPageSize() {
    return pageSize;
  }

  public ListDomainsRequest setPageToken(String pageToken) {
    this.pageToken = pageToken;
    return this;
  }

  public String getPageToken() {
    return pageToken;
  }

  public ListDomainsRequest setParentDomainId(String parentDomainId) {
    this.parentDomainId = parentDomainId;
    return this;
  }

  public String getParentDomainId() {
    return parentDomainId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ListDomainsRequest that = (ListDomainsRequest) o;
    return Objects.equals(pageSize, that.pageSize)
        && Objects.equals(pageToken, that.pageToken)
        && Objects.equals(parentDomainId, that.parentDomainId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pageSize, pageToken, parentDomainId);
  }

  @Override
  public String toString() {
    return new ToStringer(ListDomainsRequest.class)
        .add("pageSize", pageSize)
        .add("pageToken", pageToken)
        .add("parentDomainId", parentDomainId)
        .toString();
  }
}
