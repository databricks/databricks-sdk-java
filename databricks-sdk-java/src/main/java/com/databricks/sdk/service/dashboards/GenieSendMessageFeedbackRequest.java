// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.dashboards;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class GenieSendMessageFeedbackRequest {
  /** The ID associated with the conversation. */
  @JsonIgnore private String conversationId;

  /** The rating (POSITIVE, NEGATIVE, or NONE). */
  @JsonProperty("feedback_rating")
  private GenieFeedbackRating feedbackRating;

  /** Optional text feedback that will be stored as a comment. */
  @JsonProperty("feedback_text")
  private String feedbackText;

  /** The ID associated with the message to provide feedback for. */
  @JsonIgnore private String messageId;

  /** The ID associated with the Genie space where the message is located. */
  @JsonIgnore private String spaceId;

  public GenieSendMessageFeedbackRequest setConversationId(String conversationId) {
    this.conversationId = conversationId;
    return this;
  }

  public String getConversationId() {
    return conversationId;
  }

  public GenieSendMessageFeedbackRequest setFeedbackRating(GenieFeedbackRating feedbackRating) {
    this.feedbackRating = feedbackRating;
    return this;
  }

  public GenieFeedbackRating getFeedbackRating() {
    return feedbackRating;
  }

  public GenieSendMessageFeedbackRequest setFeedbackText(String feedbackText) {
    this.feedbackText = feedbackText;
    return this;
  }

  public String getFeedbackText() {
    return feedbackText;
  }

  public GenieSendMessageFeedbackRequest setMessageId(String messageId) {
    this.messageId = messageId;
    return this;
  }

  public String getMessageId() {
    return messageId;
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
    return Objects.equals(conversationId, that.conversationId)
        && Objects.equals(feedbackRating, that.feedbackRating)
        && Objects.equals(feedbackText, that.feedbackText)
        && Objects.equals(messageId, that.messageId)
        && Objects.equals(spaceId, that.spaceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(conversationId, feedbackRating, feedbackText, messageId, spaceId);
  }

  @Override
  public String toString() {
    return new ToStringer(GenieSendMessageFeedbackRequest.class)
        .add("conversationId", conversationId)
        .add("feedbackRating", feedbackRating)
        .add("feedbackText", feedbackText)
        .add("messageId", messageId)
        .add("spaceId", spaceId)
        .toString();
  }
}
