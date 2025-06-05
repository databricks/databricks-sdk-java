// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.dashboards;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** Genie AI Response */
@Generated
class GenieAttachmentPb {
  @JsonProperty("attachment_id")
  private String attachmentId;

  @JsonProperty("query")
  private GenieQueryAttachment query;

  @JsonProperty("text")
  private TextAttachment text;

  public GenieAttachmentPb setAttachmentId(String attachmentId) {
    this.attachmentId = attachmentId;
    return this;
  }

  public String getAttachmentId() {
    return attachmentId;
  }

  public GenieAttachmentPb setQuery(GenieQueryAttachment query) {
    this.query = query;
    return this;
  }

  public GenieQueryAttachment getQuery() {
    return query;
  }

  public GenieAttachmentPb setText(TextAttachment text) {
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
    GenieAttachmentPb that = (GenieAttachmentPb) o;
    return Objects.equals(attachmentId, that.attachmentId)
        && Objects.equals(query, that.query)
        && Objects.equals(text, that.text);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attachmentId, query, text);
  }

  @Override
  public String toString() {
    return new ToStringer(GenieAttachmentPb.class)
        .add("attachmentId", attachmentId)
        .add("query", query)
        .add("text", text)
        .toString();
  }
}
