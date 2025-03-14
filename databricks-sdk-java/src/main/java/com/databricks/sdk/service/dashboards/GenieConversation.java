// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.dashboards;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class GenieConversation {
  /** Conversation ID */
  @JsonProperty("conversation_id")
  private String conversationId;

  /** Timestamp when the message was created */
  @JsonProperty("created_timestamp")
  private Long createdTimestamp;

  /** Conversation ID. Legacy identifier, use conversation_id instead */
  @JsonProperty("id")
  private String id;

  /** Timestamp when the message was last updated */
  @JsonProperty("last_updated_timestamp")
  private Long lastUpdatedTimestamp;

  /** Genie space ID */
  @JsonProperty("space_id")
  private String spaceId;

  /** Conversation title */
  @JsonProperty("title")
  private String title;

  /** ID of the user who created the conversation */
  @JsonProperty("user_id")
  private Long userId;

  public GenieConversation setConversationId(String conversationId) {
    this.conversationId = conversationId;
    return this;
  }

  public String getConversationId() {
    return conversationId;
  }

  public GenieConversation setCreatedTimestamp(Long createdTimestamp) {
    this.createdTimestamp = createdTimestamp;
    return this;
  }

  public Long getCreatedTimestamp() {
    return createdTimestamp;
  }

  public GenieConversation setId(String id) {
    this.id = id;
    return this;
  }

  public String getId() {
    return id;
  }

  public GenieConversation setLastUpdatedTimestamp(Long lastUpdatedTimestamp) {
    this.lastUpdatedTimestamp = lastUpdatedTimestamp;
    return this;
  }

  public Long getLastUpdatedTimestamp() {
    return lastUpdatedTimestamp;
  }

  public GenieConversation setSpaceId(String spaceId) {
    this.spaceId = spaceId;
    return this;
  }

  public String getSpaceId() {
    return spaceId;
  }

  public GenieConversation setTitle(String title) {
    this.title = title;
    return this;
  }

  public String getTitle() {
    return title;
  }

  public GenieConversation setUserId(Long userId) {
    this.userId = userId;
    return this;
  }

  public Long getUserId() {
    return userId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GenieConversation that = (GenieConversation) o;
    return Objects.equals(conversationId, that.conversationId)
        && Objects.equals(createdTimestamp, that.createdTimestamp)
        && Objects.equals(id, that.id)
        && Objects.equals(lastUpdatedTimestamp, that.lastUpdatedTimestamp)
        && Objects.equals(spaceId, that.spaceId)
        && Objects.equals(title, that.title)
        && Objects.equals(userId, that.userId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        conversationId, createdTimestamp, id, lastUpdatedTimestamp, spaceId, title, userId);
  }

  @Override
  public String toString() {
    return new ToStringer(GenieConversation.class)
        .add("conversationId", conversationId)
        .add("createdTimestamp", createdTimestamp)
        .add("id", id)
        .add("lastUpdatedTimestamp", lastUpdatedTimestamp)
        .add("spaceId", spaceId)
        .add("title", title)
        .add("userId", userId)
        .toString();
  }
}
