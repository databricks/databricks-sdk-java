// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

@Generated
public class ListPoliciesRequest {
  /**
   * Optional. Whether to include policies defined on parent securables. By default, the inherited
   * policies are not included.
   */
  @JsonIgnore
  @QueryParam("include_inherited")
  private Boolean includeInherited;

  /**
   * Optional. Maximum number of policies to return on a single page (page length). - When not set
   * or set to 0, the page length is set to a server configured value (recommended); - When set to a
   * value greater than 0, the page length is the minimum of this value and a server configured
   * value;
   */
  @JsonIgnore
  @QueryParam("max_results")
  private Long maxResults;

  /** Required. The fully qualified name of securable to list policies for. */
  @JsonIgnore private String onSecurableFullname;

  /** Required. The type of the securable to list policies for. */
  @JsonIgnore private String onSecurableType;

  /** Optional. Opaque pagination token to go to next page based on previous query. */
  @JsonIgnore
  @QueryParam("page_token")
  private String pageToken;

  public ListPoliciesRequest setIncludeInherited(Boolean includeInherited) {
    this.includeInherited = includeInherited;
    return this;
  }

  public Boolean getIncludeInherited() {
    return includeInherited;
  }

  public ListPoliciesRequest setMaxResults(Long maxResults) {
    this.maxResults = maxResults;
    return this;
  }

  public Long getMaxResults() {
    return maxResults;
  }

  public ListPoliciesRequest setOnSecurableFullname(String onSecurableFullname) {
    this.onSecurableFullname = onSecurableFullname;
    return this;
  }

  public String getOnSecurableFullname() {
    return onSecurableFullname;
  }

  public ListPoliciesRequest setOnSecurableType(String onSecurableType) {
    this.onSecurableType = onSecurableType;
    return this;
  }

  public String getOnSecurableType() {
    return onSecurableType;
  }

  public ListPoliciesRequest setPageToken(String pageToken) {
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
    ListPoliciesRequest that = (ListPoliciesRequest) o;
    return Objects.equals(includeInherited, that.includeInherited)
        && Objects.equals(maxResults, that.maxResults)
        && Objects.equals(onSecurableFullname, that.onSecurableFullname)
        && Objects.equals(onSecurableType, that.onSecurableType)
        && Objects.equals(pageToken, that.pageToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        includeInherited, maxResults, onSecurableFullname, onSecurableType, pageToken);
  }

  @Override
  public String toString() {
    return new ToStringer(ListPoliciesRequest.class)
        .add("includeInherited", includeInherited)
        .add("maxResults", maxResults)
        .add("onSecurableFullname", onSecurableFullname)
        .add("onSecurableType", onSecurableType)
        .add("pageToken", pageToken)
        .toString();
  }
}
