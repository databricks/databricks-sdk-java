// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * <p>CreateCommentResponse class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class CreateCommentResponse {
  /** Comment details. */
  @JsonProperty("comment")
  private CommentObject comment;

  /**
   * <p>Setter for the field <code>comment</code>.</p>
   *
   * @param comment a {@link com.databricks.sdk.service.ml.CommentObject} object
   * @return a {@link com.databricks.sdk.service.ml.CreateCommentResponse} object
   */
  public CreateCommentResponse setComment(CommentObject comment) {
    this.comment = comment;
    return this;
  }

  /**
   * <p>Getter for the field <code>comment</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.ml.CommentObject} object
   */
  public CommentObject getComment() {
    return comment;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CreateCommentResponse that = (CreateCommentResponse) o;
    return Objects.equals(comment, that.comment);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(comment);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(CreateCommentResponse.class).add("comment", comment).toString();
  }
}
