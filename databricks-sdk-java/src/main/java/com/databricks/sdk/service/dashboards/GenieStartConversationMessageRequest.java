// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.dashboards;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class GenieStartConversationMessageRequest {
  /** The text of the message that starts the conversation. */
  @JsonProperty("content")
  private String content;

  /** The ID associated with the Genie space where you want to start a conversation. */
  private String spaceId;

  public GenieStartConversationMessageRequest setContent(String content) {
    this.content = content;
    return this;
  }

  public String getContent() {
    return content;
  }

  public GenieStartConversationMessageRequest setSpaceId(String spaceId) {
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
    GenieStartConversationMessageRequest that = (GenieStartConversationMessageRequest) o;
    return Objects.equals(content, that.content) && Objects.equals(spaceId, that.spaceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(content, spaceId);
  }

  @Override
  public String toString() {
    return new ToStringer(GenieStartConversationMessageRequest.class)
        .add("content", content)
        .add("spaceId", spaceId)
        .toString();
  }
}
