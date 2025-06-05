// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.dashboards;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class GenieCreateConversationMessageRequestPb {
  @JsonProperty("content")
  private String content;

  @JsonIgnore private String conversationId;

  @JsonIgnore private String spaceId;

  public GenieCreateConversationMessageRequestPb setContent(String content) {
    this.content = content;
    return this;
  }

  public String getContent() {
    return content;
  }

  public GenieCreateConversationMessageRequestPb setConversationId(String conversationId) {
    this.conversationId = conversationId;
    return this;
  }

  public String getConversationId() {
    return conversationId;
  }

  public GenieCreateConversationMessageRequestPb setSpaceId(String spaceId) {
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
    GenieCreateConversationMessageRequestPb that = (GenieCreateConversationMessageRequestPb) o;
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
    return new ToStringer(GenieCreateConversationMessageRequestPb.class)
        .add("content", content)
        .add("conversationId", conversationId)
        .add("spaceId", spaceId)
        .toString();
  }
}
