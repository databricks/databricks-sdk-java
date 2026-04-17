// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.dashboards;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class GenieCreateMessageCommentRequest {
  /** Comment text content. */
  @JsonProperty("content")
  private String content;

  /** The ID associated with the conversation. */
  @JsonIgnore private String conversationId;

  /** The ID associated with the message. */
  @JsonIgnore private String messageId;

  /** The ID associated with the Genie space. */
  @JsonIgnore private String spaceId;

  public GenieCreateMessageCommentRequest setContent(String content) {
    this.content = content;
    return this;
  }

  public String getContent() {
    return content;
  }

  public GenieCreateMessageCommentRequest setConversationId(String conversationId) {
    this.conversationId = conversationId;
    return this;
  }

  public String getConversationId() {
    return conversationId;
  }

  public GenieCreateMessageCommentRequest setMessageId(String messageId) {
    this.messageId = messageId;
    return this;
  }

  public String getMessageId() {
    return messageId;
  }

  public GenieCreateMessageCommentRequest setSpaceId(String spaceId) {
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
    GenieCreateMessageCommentRequest that = (GenieCreateMessageCommentRequest) o;
    return Objects.equals(content, that.content)
        && Objects.equals(conversationId, that.conversationId)
        && Objects.equals(messageId, that.messageId)
        && Objects.equals(spaceId, that.spaceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(content, conversationId, messageId, spaceId);
  }

  @Override
  public String toString() {
    return new ToStringer(GenieCreateMessageCommentRequest.class)
        .add("content", content)
        .add("conversationId", conversationId)
        .add("messageId", messageId)
        .add("spaceId", spaceId)
        .toString();
  }
}
