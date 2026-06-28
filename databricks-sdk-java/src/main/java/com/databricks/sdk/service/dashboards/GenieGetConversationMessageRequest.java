// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.dashboards;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

@Generated
public class GenieGetConversationMessageRequest {
  /** The ID associated with the target conversation. */
  @JsonIgnore private String conversationId;

  /** The ID associated with the target message from the identified conversation. */
  @JsonIgnore private String messageId;

  /** The ID associated with the Genie space where the target conversation is located. */
  @JsonIgnore private String spaceId;

  public GenieGetConversationMessageRequest setConversationId(String conversationId) {
    this.conversationId = conversationId;
    return this;
  }

  public String getConversationId() {
    return conversationId;
  }

  public GenieGetConversationMessageRequest setMessageId(String messageId) {
    this.messageId = messageId;
    return this;
  }

  public String getMessageId() {
    return messageId;
  }

  public GenieGetConversationMessageRequest setSpaceId(String spaceId) {
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
    GenieGetConversationMessageRequest that = (GenieGetConversationMessageRequest) o;
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
    return new ToStringer(GenieGetConversationMessageRequest.class)
        .add("conversationId", conversationId)
        .add("messageId", messageId)
        .add("spaceId", spaceId)
        .toString();
  }
}
