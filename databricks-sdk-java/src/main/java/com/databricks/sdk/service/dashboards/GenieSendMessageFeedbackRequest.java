// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.dashboards;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class GenieSendMessageFeedbackRequest {
  /** Optional text feedback that will be stored as a comment. */
  @JsonProperty("comment")
  private String comment;

  /** The ID associated with the conversation. */
  @JsonIgnore private String conversationId;

  /** The ID associated with the message to provide feedback for. */
  @JsonIgnore private String messageId;

  /** The rating (POSITIVE, NEGATIVE, or NONE). */
  @JsonProperty("rating")
  private GenieFeedbackRating rating;

  /** The ID associated with the Genie space where the message is located. */
  @JsonIgnore private String spaceId;

  public GenieSendMessageFeedbackRequest setComment(String comment) {
    this.comment = comment;
    return this;
  }

  public String getComment() {
    return comment;
  }

  public GenieSendMessageFeedbackRequest setConversationId(String conversationId) {
    this.conversationId = conversationId;
    return this;
  }

  public String getConversationId() {
    return conversationId;
  }

  public GenieSendMessageFeedbackRequest setMessageId(String messageId) {
    this.messageId = messageId;
    return this;
  }

  public String getMessageId() {
    return messageId;
  }

  public GenieSendMessageFeedbackRequest setRating(GenieFeedbackRating rating) {
    this.rating = rating;
    return this;
  }

  public GenieFeedbackRating getRating() {
    return rating;
  }

  public GenieSendMessageFeedbackRequest setSpaceId(String spaceId) {
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
    GenieSendMessageFeedbackRequest that = (GenieSendMessageFeedbackRequest) o;
    return Objects.equals(comment, that.comment)
        && Objects.equals(conversationId, that.conversationId)
        && Objects.equals(messageId, that.messageId)
        && Objects.equals(rating, that.rating)
        && Objects.equals(spaceId, that.spaceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(comment, conversationId, messageId, rating, spaceId);
  }

  @Override
  public String toString() {
    return new ToStringer(GenieSendMessageFeedbackRequest.class)
        .add("comment", comment)
        .add("conversationId", conversationId)
        .add("messageId", messageId)
        .add("rating", rating)
        .add("spaceId", spaceId)
        .toString();
  }
}
