// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.dashboards;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import java.util.Objects;

/** Execute SQL query in a conversation message */
@Generated
public class ExecuteMessageQueryRequest {
  /** Conversation ID */
  private String conversationId;

  /** Message ID */
  private String messageId;

  /** Genie space ID */
  private String spaceId;

  public ExecuteMessageQueryRequest setConversationId(String conversationId) {
    this.conversationId = conversationId;
    return this;
  }

  public String getConversationId() {
    return conversationId;
  }

  public ExecuteMessageQueryRequest setMessageId(String messageId) {
    this.messageId = messageId;
    return this;
  }

  public String getMessageId() {
    return messageId;
  }

  public ExecuteMessageQueryRequest setSpaceId(String spaceId) {
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
    ExecuteMessageQueryRequest that = (ExecuteMessageQueryRequest) o;
    return Objects.equals(conversationId, that.conversationId)
        && Objects.equals(messageId, that.messageId)
        && Objects.equals(spaceId, that.spaceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(conversationId, messageId, spaceId);
  }

  @Override
  public String toString() {
    return new ToStringer(ExecuteMessageQueryRequest.class)
        .add("conversationId", conversationId)
        .add("messageId", messageId)
        .add("spaceId", spaceId)
        .toString();
  }
}
