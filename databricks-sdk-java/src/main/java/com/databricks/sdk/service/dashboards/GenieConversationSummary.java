// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.dashboards;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class GenieConversationSummary {
  /** */
  @JsonProperty("conversation_id")
  private String conversationId;

  /** */
  @JsonProperty("created_timestamp")
  private Long createdTimestamp;

  /** */
  @JsonProperty("title")
  private String title;

  public GenieConversationSummary setConversationId(String conversationId) {
    this.conversationId = conversationId;
    return this;
  }

  public String getConversationId() {
    return conversationId;
  }

  public GenieConversationSummary setCreatedTimestamp(Long createdTimestamp) {
    this.createdTimestamp = createdTimestamp;
    return this;
  }

  public Long getCreatedTimestamp() {
    return createdTimestamp;
  }

  public GenieConversationSummary setTitle(String title) {
    this.title = title;
    return this;
  }

  public String getTitle() {
    return title;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GenieConversationSummary that = (GenieConversationSummary) o;
    return Objects.equals(conversationId, that.conversationId)
        && Objects.equals(createdTimestamp, that.createdTimestamp)
        && Objects.equals(title, that.title);
  }

  @Override
  public int hashCode() {
    return Objects.hash(conversationId, createdTimestamp, title);
  }

  @Override
  public String toString() {
    return new ToStringer(GenieConversationSummary.class)
        .add("conversationId", conversationId)
        .add("createdTimestamp", createdTimestamp)
        .add("title", title)
        .toString();
  }
}
