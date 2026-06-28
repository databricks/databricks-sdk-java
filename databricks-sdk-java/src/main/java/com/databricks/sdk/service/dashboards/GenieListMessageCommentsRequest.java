// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.dashboards;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

@Generated
public class GenieListMessageCommentsRequest {
  /** The ID associated with the conversation. */
  @JsonIgnore private String conversationId;

  /** The ID associated with the message. */
  @JsonIgnore private String messageId;

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

  public GenieListMessageCommentsRequest setConversationId(String conversationId) {
    this.conversationId = conversationId;
    return this;
  }

  public String getConversationId() {
    return conversationId;
  }

  public GenieListMessageCommentsRequest setMessageId(String messageId) {
    this.messageId = messageId;
    return this;
  }

  public String getMessageId() {
    return messageId;
  }

  public GenieListMessageCommentsRequest setPageSize(Long pageSize) {
    this.pageSize = pageSize;
    return this;
  }

  public Long getPageSize() {
    return pageSize;
  }

  public GenieListMessageCommentsRequest setPageToken(String pageToken) {
    this.pageToken = pageToken;
    return this;
  }

  public String getPageToken() {
    return pageToken;
  }

  public GenieListMessageCommentsRequest setSpaceId(String spaceId) {
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
    GenieListMessageCommentsRequest that = (GenieListMessageCommentsRequest) o;
    return Objects.equals(conversationId, that.conversationId)
        && Objects.equals(messageId, that.messageId)
        && Objects.equals(pageSize, that.pageSize)
        && Objects.equals(pageToken, that.pageToken)
        && Objects.equals(spaceId, that.spaceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(conversationId, messageId, pageSize, pageToken, spaceId);
  }

  @Override
  public String toString() {
    return new ToStringer(GenieListMessageCommentsRequest.class)
        .add("conversationId", conversationId)
        .add("messageId", messageId)
        .add("pageSize", pageSize)
        .add("pageToken", pageToken)
        .add("spaceId", spaceId)
        .toString();
  }
}
