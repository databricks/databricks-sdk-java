// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class CreateCommentResponse {
  /** Comment details. */
  @JsonProperty("comment")
  private CommentObject comment;

  public CreateCommentResponse setComment(CommentObject comment) {
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
    CreateCommentResponse that = (CreateCommentResponse) o;
    return Objects.equals(comment, that.comment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(comment);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateCommentResponse.class).add("comment", comment).toString();
  }
}
