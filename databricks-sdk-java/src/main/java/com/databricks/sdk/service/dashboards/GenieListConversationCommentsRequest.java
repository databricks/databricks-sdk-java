// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.dashboards;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

@Generated
public class GenieListConversationCommentsRequest {
  /** The ID associated with the conversation. */
  @JsonIgnore private String conversationId;

  /** Maximum number of comments to return per page. */
  @JsonIgnore
  @QueryParam("page_size")
  private Long pageSize;

  /** Pagination token for getting the next page of results. */
  @JsonIgnore
  @QueryParam("page_token")
  private String pageToken;

  /** The ID associated with the Genie space. */
  @JsonIgnore private String spaceId;

  public GenieListConversationCommentsRequest setConversationId(String conversationId) {
    this.conversationId = conversationId;
    return this;
  }

  public String getConversationId() {
    return conversationId;
  }

  public GenieListConversationCommentsRequest setPageSize(Long pageSize) {
    this.pageSize = pageSize;
    return this;
  }

  public Long getPageSize() {
    return pageSize;
  }

  public GenieListConversationCommentsRequest setPageToken(String pageToken) {
    this.pageToken = pageToken;
    return this;
  }

  public String getPageToken() {
    return pageToken;
  }

  public GenieListConversationCommentsRequest setSpaceId(String spaceId) {
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
    GenieListConversationCommentsRequest that = (GenieListConversationCommentsRequest) o;
    return Objects.equals(conversationId, that.conversationId)
        && Objects.equals(pageSize, that.pageSize)
        && Objects.equals(pageToken, that.pageToken)
        && Objects.equals(spaceId, that.spaceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(conversationId, pageSize, pageToken, spaceId);
  }

  @Override
  public String toString() {
    return new ToStringer(GenieListConversationCommentsRequest.class)
        .add("conversationId", conversationId)
        .add("pageSize", pageSize)
        .add("pageToken", pageToken)
        .add("spaceId", spaceId)
        .toString();
  }
}
