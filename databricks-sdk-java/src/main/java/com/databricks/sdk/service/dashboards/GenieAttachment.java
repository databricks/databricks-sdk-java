// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.dashboards;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** Genie AI Response */
@Generated
public class GenieAttachment {
  /** Attachment ID */
  @JsonProperty("attachment_id")
  private String attachmentId;

  /** Follow-up questions suggested by Genie */
  @JsonProperty("followup_questions")
  private GenieFollowupQuestionsAttachment followupQuestions;

  /** Query Attachment if Genie responds with a SQL query */
  @JsonProperty("query")
  private GenieQueryAttachment query;

  /** Text Attachment if Genie responds with text */
  @JsonProperty("text")
  private TextAttachment text;

  public GenieAttachment setAttachmentId(String attachmentId) {
    this.attachmentId = attachmentId;
    return this;
  }

  public String getAttachmentId() {
    return attachmentId;
  }

  public GenieAttachment setFollowupQuestions(GenieFollowupQuestionsAttachment followupQuestions) {
    this.followupQuestions = followupQuestions;
    return this;
  }

  public GenieFollowupQuestionsAttachment getFollowupQuestions() {
    return followupQuestions;
  }

  public GenieAttachment setQuery(GenieQueryAttachment query) {
    this.query = query;
    return this;
  }

  public GenieQueryAttachment getQuery() {
    return query;
  }

  public GenieAttachment setText(TextAttachment text) {
    this.text = text;
    return this;
  }

  public TextAttachment getText() {
    return text;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GenieAttachment that = (GenieAttachment) o;
    return Objects.equals(attachmentId, that.attachmentId)
        && Objects.equals(followupQuestions, that.followupQuestions)
        && Objects.equals(query, that.query)
        && Objects.equals(text, that.text);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attachmentId, followupQuestions, query, text);
  }

  @Override
  public String toString() {
    return new ToStringer(GenieAttachment.class)
        .add("attachmentId", attachmentId)
        .add("followupQuestions", followupQuestions)
        .add("query", query)
        .add("text", text)
        .toString();
  }
}
