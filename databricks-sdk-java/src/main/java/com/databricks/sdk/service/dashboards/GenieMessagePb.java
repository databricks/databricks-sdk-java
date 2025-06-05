// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.dashboards;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
class GenieMessagePb {
  @JsonProperty("attachments")
  private Collection<GenieAttachment> attachments;

  @JsonProperty("content")
  private String content;

  @JsonProperty("conversation_id")
  private String conversationId;

  @JsonProperty("created_timestamp")
  private Long createdTimestamp;

  @JsonProperty("error")
  private MessageError error;

  @JsonProperty("id")
  private String id;

  @JsonProperty("last_updated_timestamp")
  private Long lastUpdatedTimestamp;

  @JsonProperty("message_id")
  private String messageId;

  @JsonProperty("query_result")
  private Result queryResult;

  @JsonProperty("space_id")
  private String spaceId;

  @JsonProperty("status")
  private MessageStatus status;

  @JsonProperty("user_id")
  private Long userId;

  public GenieMessagePb setAttachments(Collection<GenieAttachment> attachments) {
    this.attachments = attachments;
    return this;
  }

  public Collection<GenieAttachment> getAttachments() {
    return attachments;
  }

  public GenieMessagePb setContent(String content) {
    this.content = content;
    return this;
  }

  public String getContent() {
    return content;
  }

  public GenieMessagePb setConversationId(String conversationId) {
    this.conversationId = conversationId;
    return this;
  }

  public String getConversationId() {
    return conversationId;
  }

  public GenieMessagePb setCreatedTimestamp(Long createdTimestamp) {
    this.createdTimestamp = createdTimestamp;
    return this;
  }

  public Long getCreatedTimestamp() {
    return createdTimestamp;
  }

  public GenieMessagePb setError(MessageError error) {
    this.error = error;
    return this;
  }

  public MessageError getError() {
    return error;
  }

  public GenieMessagePb setId(String id) {
    this.id = id;
    return this;
  }

  public String getId() {
    return id;
  }

  public GenieMessagePb setLastUpdatedTimestamp(Long lastUpdatedTimestamp) {
    this.lastUpdatedTimestamp = lastUpdatedTimestamp;
    return this;
  }

  public Long getLastUpdatedTimestamp() {
    return lastUpdatedTimestamp;
  }

  public GenieMessagePb setMessageId(String messageId) {
    this.messageId = messageId;
    return this;
  }

  public String getMessageId() {
    return messageId;
  }

  public GenieMessagePb setQueryResult(Result queryResult) {
    this.queryResult = queryResult;
    return this;
  }

  public Result getQueryResult() {
    return queryResult;
  }

  public GenieMessagePb setSpaceId(String spaceId) {
    this.spaceId = spaceId;
    return this;
  }

  public String getSpaceId() {
    return spaceId;
  }

  public GenieMessagePb setStatus(MessageStatus status) {
    this.status = status;
    return this;
  }

  public MessageStatus getStatus() {
    return status;
  }

  public GenieMessagePb setUserId(Long userId) {
    this.userId = userId;
    return this;
  }

  public Long getUserId() {
    return userId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GenieMessagePb that = (GenieMessagePb) o;
    return Objects.equals(attachments, that.attachments)
        && Objects.equals(content, that.content)
        && Objects.equals(conversationId, that.conversationId)
        && Objects.equals(createdTimestamp, that.createdTimestamp)
        && Objects.equals(error, that.error)
        && Objects.equals(id, that.id)
        && Objects.equals(lastUpdatedTimestamp, that.lastUpdatedTimestamp)
        && Objects.equals(messageId, that.messageId)
        && Objects.equals(queryResult, that.queryResult)
        && Objects.equals(spaceId, that.spaceId)
        && Objects.equals(status, that.status)
        && Objects.equals(userId, that.userId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        attachments,
        content,
        conversationId,
        createdTimestamp,
        error,
        id,
        lastUpdatedTimestamp,
        messageId,
        queryResult,
        spaceId,
        status,
        userId);
  }

  @Override
  public String toString() {
    return new ToStringer(GenieMessagePb.class)
        .add("attachments", attachments)
        .add("content", content)
        .add("conversationId", conversationId)
        .add("createdTimestamp", createdTimestamp)
        .add("error", error)
        .add("id", id)
        .add("lastUpdatedTimestamp", lastUpdatedTimestamp)
        .add("messageId", messageId)
        .add("queryResult", queryResult)
        .add("spaceId", spaceId)
        .add("status", status)
        .add("userId", userId)
        .toString();
  }
}
