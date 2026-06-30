// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.dashboards;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** A comment on a Genie conversation message. */
@Generated
public class GenieMessageComment {
  /** Comment text content */
  @JsonProperty("content")
  private String content;

  /** Conversation ID */
  @JsonProperty("conversation_id")
  private String conversationId;

  /** Timestamp when the comment was created */
  @JsonProperty("created_timestamp")
  private Long createdTimestamp;

  /** Comment ID */
  @JsonProperty("message_comment_id")
  private String messageCommentId;

  /** Message ID */
  @JsonProperty("message_id")
  private String messageId;

  /** Genie space ID */
  @JsonProperty("space_id")
  private String spaceId;

  /** ID of the user who created the comment */
  @JsonProperty("user_id")
  private Long userId;

  public GenieMessageComment setContent(String content) {
    this.content = content;
    return this;
  }

  public String getContent() {
    return content;
  }

  public GenieMessageComment setConversationId(String conversationId) {
    this.conversationId = conversationId;
    return this;
  }

  public String getConversationId() {
    return conversationId;
  }

  public GenieMessageComment setCreatedTimestamp(Long createdTimestamp) {
    this.createdTimestamp = createdTimestamp;
    return this;
  }

  public Long getCreatedTimestamp() {
    return createdTimestamp;
  }

  public GenieMessageComment setMessageCommentId(String messageCommentId) {
    this.messageCommentId = messageCommentId;
    return this;
  }

  public String getMessageCommentId() {
    return messageCommentId;
  }

  public GenieMessageComment setMessageId(String messageId) {
    this.messageId = messageId;
    return this;
  }

  public String getMessageId() {
    return messageId;
  }

  public GenieMessageComment setSpaceId(String spaceId) {
    this.spaceId = spaceId;
    return this;
  }

  public String getSpaceId() {
    return spaceId;
  }

  public GenieMessageComment setUserId(Long userId) {
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
    GenieMessageComment that = (GenieMessageComment) o;
    return Objects.equals(content, that.content)
        && Objects.equals(conversationId, that.conversationId)
        && Objects.equals(createdTimestamp, that.createdTimestamp)
        && Objects.equals(messageCommentId, that.messageCommentId)
        && Objects.equals(messageId, that.messageId)
        && Objects.equals(spaceId, that.spaceId)
        && Objects.equals(userId, that.userId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        content, conversationId, createdTimestamp, messageCommentId, messageId, spaceId, userId);
  }

  @Override
  public String toString() {
    return new ToStringer(GenieMessageComment.class)
        .add("content", content)
        .add("conversationId", conversationId)
        .add("createdTimestamp", createdTimestamp)
        .add("messageCommentId", messageCommentId)
        .add("messageId", messageId)
        .add("spaceId", spaceId)
        .add("userId", userId)
        .toString();
  }
}
