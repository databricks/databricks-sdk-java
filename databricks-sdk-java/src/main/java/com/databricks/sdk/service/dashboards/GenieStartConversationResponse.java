// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.dashboards;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class GenieStartConversationResponse {
  /** */
  @JsonProperty("conversation")
  private GenieConversation conversation;

  /** Conversation ID */
  @JsonProperty("conversation_id")
  private String conversationId;

  /** */
  @JsonProperty("message")
  private GenieMessage message;

  /** Message ID */
  @JsonProperty("message_id")
  private String messageId;

  public GenieStartConversationResponse setConversation(GenieConversation conversation) {
    this.conversation = conversation;
    return this;
  }

  public GenieConversation getConversation() {
    return conversation;
  }

  public GenieStartConversationResponse setConversationId(String conversationId) {
    this.conversationId = conversationId;
    return this;
  }

  public String getConversationId() {
    return conversationId;
  }

  public GenieStartConversationResponse setMessage(GenieMessage message) {
    this.message = message;
    return this;
  }

  public GenieMessage getMessage() {
    return message;
  }

  public GenieStartConversationResponse setMessageId(String messageId) {
    this.messageId = messageId;
    return this;
  }

  public String getMessageId() {
    return messageId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GenieStartConversationResponse that = (GenieStartConversationResponse) o;
    return Objects.equals(conversation, that.conversation)
        && Objects.equals(conversationId, that.conversationId)
        && Objects.equals(message, that.message)
        && Objects.equals(messageId, that.messageId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(conversation, conversationId, message, messageId);
  }

  @Override
  public String toString() {
    return new ToStringer(GenieStartConversationResponse.class)
        .add("conversation", conversation)
        .add("conversationId", conversationId)
        .add("message", message)
        .add("messageId", messageId)
        .toString();
  }
}
