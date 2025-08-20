// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.dashboards;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

@Generated
public class GenieListConversationsRequest {
  /**
   * Include all conversations in the space across all users. Requires "Can Manage" permission on
   * the space.
   */
  @JsonIgnore
  @QueryParam("include_all")
  private Boolean includeAll;

  /** Maximum number of conversations to return per page */
  @JsonIgnore
  @QueryParam("page_size")
  private Long pageSize;

  /** Token to get the next page of results */
  @JsonIgnore
  @QueryParam("page_token")
  private String pageToken;

  /** The ID of the Genie space to retrieve conversations from. */
  @JsonIgnore private String spaceId;

  public GenieListConversationsRequest setIncludeAll(Boolean includeAll) {
    this.includeAll = includeAll;
    return this;
  }

  public Boolean getIncludeAll() {
    return includeAll;
  }

  public GenieListConversationsRequest setPageSize(Long pageSize) {
    this.pageSize = pageSize;
    return this;
  }

  public Long getPageSize() {
    return pageSize;
  }

  public GenieListConversationsRequest setPageToken(String pageToken) {
    this.pageToken = pageToken;
    return this;
  }

  public String getPageToken() {
    return pageToken;
  }

  public GenieListConversationsRequest setSpaceId(String spaceId) {
    this.spaceId = spaceId;
    return this;
  }

  public String getSpaceId() {
    return spaceId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GenieListConversationsRequest that = (GenieListConversationsRequest) o;
    return Objects.equals(includeAll, that.includeAll)
        && Objects.equals(pageSize, that.pageSize)
        && Objects.equals(pageToken, that.pageToken)
        && Objects.equals(spaceId, that.spaceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(includeAll, pageSize, pageToken, spaceId);
  }

  @Override
  public String toString() {
    return new ToStringer(GenieListConversationsRequest.class)
        .add("includeAll", includeAll)
        .add("pageSize", pageSize)
        .add("pageToken", pageToken)
        .add("spaceId", spaceId)
        .toString();
  }
}
