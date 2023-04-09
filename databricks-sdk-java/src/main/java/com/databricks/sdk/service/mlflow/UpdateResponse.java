// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.mlflow;

import com.databricks.sdk.mixin.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

public class UpdateResponse {
  /** Comment details. */
  @JsonProperty("comment")
  private CommentObject comment;

  public UpdateResponse setComment(CommentObject comment) {
    this.comment = comment;
    return this;
  }

  public CommentObject getComment() {
    return comment;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    UpdateResponse that = (UpdateResponse) o;
    return Objects.equals(comment, that.comment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(comment);
  }

  @Override
  public String toString() {
    return new ToStringer(UpdateResponse.class).add("comment", comment).toString();
  }
}
