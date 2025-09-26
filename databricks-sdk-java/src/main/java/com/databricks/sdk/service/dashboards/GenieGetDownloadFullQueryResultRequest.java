// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.dashboards;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;

@Generated
public class GenieGetDownloadFullQueryResultRequest {
  /** Attachment ID */
  @JsonIgnore private String attachmentId;

  /** Conversation ID */
  @JsonIgnore private String conversationId;

  /**
   * Download ID. This ID is provided by the [Generate Download
   * endpoint](:method:genie/generateDownloadFullQueryResult)
   */
  @JsonIgnore private String downloadId;

  /** Message ID */
  @JsonIgnore private String messageId;

  /** Genie space ID */
  @JsonIgnore private String spaceId;

  public GenieGetDownloadFullQueryResultRequest setAttachmentId(String attachmentId) {
    this.attachmentId = attachmentId;
    return this;
  }

  public String getAttachmentId() {
    return attachmentId;
  }

  public GenieGetDownloadFullQueryResultRequest setConversationId(String conversationId) {
    this.conversationId = conversationId;
    return this;
  }

  public String getConversationId() {
    return conversationId;
  }

  public GenieGetDownloadFullQueryResultRequest setDownloadId(String downloadId) {
    this.downloadId = downloadId;
    return this;
  }

  public String getDownloadId() {
    return downloadId;
  }

  public GenieGetDownloadFullQueryResultRequest setMessageId(String messageId) {
    this.messageId = messageId;
    return this;
  }

  public String getMessageId() {
    return messageId;
  }

  public GenieGetDownloadFullQueryResultRequest setSpaceId(String spaceId) {
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
    GenieGetDownloadFullQueryResultRequest that = (GenieGetDownloadFullQueryResultRequest) o;
    return Objects.equals(attachmentId, that.attachmentId)
        && Objects.equals(conversationId, that.conversationId)
        && Objects.equals(downloadId, that.downloadId)
        && Objects.equals(messageId, that.messageId)
        && Objects.equals(spaceId, that.spaceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attachmentId, conversationId, downloadId, messageId, spaceId);
  }

  @Override
  public String toString() {
    return new ToStringer(GenieGetDownloadFullQueryResultRequest.class)
        .add("attachmentId", attachmentId)
        .add("conversationId", conversationId)
        .add("downloadId", downloadId)
        .add("messageId", messageId)
        .add("spaceId", spaceId)
        .toString();
  }
}
