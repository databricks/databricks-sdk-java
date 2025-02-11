// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.dashboards;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

/** Get conversation message SQL query result by attachment id */
@Generated
public class GenieGetQueryResultByAttachmentRequest {
  /** Attachment ID */
  @JsonIgnore private String attachmentId;

  /** Conversation ID */
  @JsonIgnore private String conversationId;

  /** Message ID */
  @JsonIgnore private String messageId;

  /** Genie space ID */
  @JsonIgnore private String spaceId;

  public GenieGetQueryResultByAttachmentRequest setAttachmentId(String attachmentId) {
    this.attachmentId = attachmentId;
    return this;
  }

  public String getAttachmentId() {
    return attachmentId;
  }

  public GenieGetQueryResultByAttachmentRequest setConversationId(String conversationId) {
    this.conversationId = conversationId;
    return this;
  }

  public String getConversationId() {
    return conversationId;
  }

  public GenieGetQueryResultByAttachmentRequest setMessageId(String messageId) {
    this.messageId = messageId;
    return this;
  }

  public String getMessageId() {
    return messageId;
  }

  public GenieGetQueryResultByAttachmentRequest setSpaceId(String spaceId) {
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
    GenieGetQueryResultByAttachmentRequest that = (GenieGetQueryResultByAttachmentRequest) o;
    return Objects.equals(attachmentId, that.attachmentId)
        && Objects.equals(conversationId, that.conversationId)
        && Objects.equals(messageId, that.messageId)
        && Objects.equals(spaceId, that.spaceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attachmentId, conversationId, messageId, spaceId);
  }

  @Override
  public String toString() {
    return new ToStringer(GenieGetQueryResultByAttachmentRequest.class)
        .add("attachmentId", attachmentId)
        .add("conversationId", conversationId)
        .add("messageId", messageId)
        .add("spaceId", spaceId)
        .toString();
  }
}
