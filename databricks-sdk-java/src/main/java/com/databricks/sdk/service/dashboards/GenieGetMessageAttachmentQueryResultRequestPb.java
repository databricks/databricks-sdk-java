// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.dashboards;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

/** Get message attachment SQL query result */
@Generated
class GenieGetMessageAttachmentQueryResultRequestPb {
  @JsonIgnore private String attachmentId;

  @JsonIgnore private String conversationId;

  @JsonIgnore private String messageId;

  @JsonIgnore private String spaceId;

  public GenieGetMessageAttachmentQueryResultRequestPb setAttachmentId(String attachmentId) {
    this.attachmentId = attachmentId;
    return this;
  }

  public String getAttachmentId() {
    return attachmentId;
  }

  public GenieGetMessageAttachmentQueryResultRequestPb setConversationId(String conversationId) {
    this.conversationId = conversationId;
    return this;
  }

  public String getConversationId() {
    return conversationId;
  }

  public GenieGetMessageAttachmentQueryResultRequestPb setMessageId(String messageId) {
    this.messageId = messageId;
    return this;
  }

  public String getMessageId() {
    return messageId;
  }

  public GenieGetMessageAttachmentQueryResultRequestPb setSpaceId(String spaceId) {
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
    GenieGetMessageAttachmentQueryResultRequestPb that =
        (GenieGetMessageAttachmentQueryResultRequestPb) o;
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
    return new ToStringer(GenieGetMessageAttachmentQueryResultRequestPb.class)
        .add("attachmentId", attachmentId)
        .add("conversationId", conversationId)
        .add("messageId", messageId)
        .add("spaceId", spaceId)
        .toString();
  }
}
