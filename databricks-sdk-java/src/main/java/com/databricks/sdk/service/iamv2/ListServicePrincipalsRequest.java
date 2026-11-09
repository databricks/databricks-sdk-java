// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.iamv2;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

@Generated
public class ListServicePrincipalsRequest {
  /**
   * Filters service principals by `application_id` or `external_id`, for example `application_id eq
   * "<application-id>"`. Put the value in quotes.
   */
  @JsonIgnore
  @QueryParam("filter")
  private String filter;

  /**
   * The maximum number of service principals to return, up to 1000. The default is 1000. A page can
   * contain fewer service principals.
   */
  @JsonIgnore
  @QueryParam("page_size")
  private Long pageSize;

  /** The `next_page_token` from a previous response, to get the next page. */
  @JsonIgnore
  @QueryParam("page_token")
  private String pageToken;

  /**
   * The resource name of the account to list service principals in, in the format
   * `accounts/{account_id}`.
   */
  @JsonIgnore private String parent;

  public ListServicePrincipalsRequest setFilter(String filter) {
    this.filter = filter;
    return this;
  }

  public String getFilter() {
    return filter;
  }

  public ListServicePrincipalsRequest setPageSize(Long pageSize) {
    this.pageSize = pageSize;
    return this;
  }

  public Long getPageSize() {
    return pageSize;
  }

  public ListServicePrincipalsRequest setPageToken(String pageToken) {
    this.pageToken = pageToken;
    return this;
  }

  public String getPageToken() {
    return pageToken;
  }

  public ListServicePrincipalsRequest setParent(String parent) {
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
    ListServicePrincipalsRequest that = (ListServicePrincipalsRequest) o;
    return Objects.equals(filter, that.filter)
        && Objects.equals(pageSize, that.pageSize)
        && Objects.equals(pageToken, that.pageToken)
        && Objects.equals(parent, that.parent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(filter, pageSize, pageToken, parent);
  }

  @Override
  public String toString() {
    return new ToStringer(ListServicePrincipalsRequest.class)
        .add("filter", filter)
        .add("pageSize", pageSize)
        .add("pageToken", pageToken)
        .add("parent", parent)
        .toString();
  }
}
