// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.dashboards;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * A text response on a conversation message: the answer, the final summary, or a clarifying
 * follow-up question, along with optional phase and verification metadata.
 */
@Generated
public class TextAttachment {
  /** AI generated message */
  @JsonProperty("content")
  private String content;

  /** */
  @JsonProperty("id")
  private String id;

  /**
   * Purpose of this text attachment. A completed message may contain more than one text attachment
   * (for example a clarifying follow-up question alongside the final answer); use this field to
   * tell them apart. `TEXT_ATTACHMENT_PURPOSE_ANSWER` marks the final answer/summary and
   * `FOLLOW_UP_QUESTION` marks a clarifying question.
   */
  @JsonProperty("purpose")
  private TextAttachmentPurpose purpose;

  public TextAttachment setContent(String content) {
    this.content = content;
    return this;
  }

  public String getContent() {
    return content;
  }

  public TextAttachment setId(String id) {
    this.id = id;
    return this;
  }

  public String getId() {
    return id;
  }

  public TextAttachment setPurpose(TextAttachmentPurpose purpose) {
    this.purpose = purpose;
    return this;
  }

  public TextAttachmentPurpose getPurpose() {
    return purpose;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    TextAttachment that = (TextAttachment) o;
    return Objects.equals(content, that.content)
        && Objects.equals(id, that.id)
        && Objects.equals(purpose, that.purpose);
  }

  @Override
  public int hashCode() {
    return Objects.hash(content, id, purpose);
  }

  @Override
  public String toString() {
    return new ToStringer(TextAttachment.class)
        .add("content", content)
        .add("id", id)
        .add("purpose", purpose)
        .toString();
  }
}
