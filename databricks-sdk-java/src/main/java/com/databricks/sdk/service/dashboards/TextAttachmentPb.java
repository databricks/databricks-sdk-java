// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.dashboards;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class TextAttachmentPb {
  @JsonProperty("content")
  private String content;

  @JsonProperty("id")
  private String id;

  public TextAttachmentPb setContent(String content) {
    this.content = content;
    return this;
  }

  public String getContent() {
    return content;
  }

  public TextAttachmentPb setId(String id) {
    this.id = id;
    return this;
  }

  public String getId() {
    return id;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    TextAttachmentPb that = (TextAttachmentPb) o;
    return Objects.equals(content, that.content) && Objects.equals(id, that.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(content, id);
  }

  @Override
  public String toString() {
    return new ToStringer(TextAttachmentPb.class).add("content", content).add("id", id).toString();
  }
}
