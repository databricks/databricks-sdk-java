// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.dashboards;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class GenieCreateConversationMessageRequest {
  /** User message content. */
  @JsonProperty("content")
  private String content;

  /** The ID associated with the conversation. */
  private String conversationId;

  /** The ID associated with the Genie space where the conversation is started. */
  private String spaceId;

  public GenieCreateConversationMessageRequest setContent(String content) {
    this.content = content;
    return this;
  }

  public String getContent() {
    return content;
  }

  public GenieCreateConversationMessageRequest setConversationId(String conversationId) {
    this.conversationId = conversationId;
    return this;
  }

  public String getConversationId() {
    return conversationId;
  }

  public GenieCreateConversationMessageRequest setSpaceId(String spaceId) {
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
    GenieCreateConversationMessageRequest that = (GenieCreateConversationMessageRequest) o;
    return Objects.equals(content, that.content)
        && Objects.equals(conversationId, that.conversationId)
        && Objects.equals(spaceId, that.spaceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(content, conversationId, spaceId);
  }

  @Override
  public String toString() {
    return new ToStringer(GenieCreateConversationMessageRequest.class)
        .add("content", content)
        .add("conversationId", conversationId)
        .add("spaceId", spaceId)
        .toString();
  }
}
