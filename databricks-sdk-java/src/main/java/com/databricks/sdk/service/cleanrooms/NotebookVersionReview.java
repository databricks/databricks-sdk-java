// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.cleanrooms;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class NotebookVersionReview {
  /** review comment */
  @JsonProperty("comment")
  private String comment;

  /** etag that identifies the notebook version */
  @JsonProperty("etag")
  private String etag;

  /** review outcome */
  @JsonProperty("review_state")
  private CleanRoomNotebookReviewNotebookReviewState reviewState;

  public NotebookVersionReview setComment(String comment) {
    this.comment = comment;
    return this;
  }

  public String getComment() {
    return comment;
  }

  public NotebookVersionReview setEtag(String etag) {
    this.etag = etag;
    return this;
  }

  public String getEtag() {
    return etag;
  }

  public NotebookVersionReview setReviewState(
      CleanRoomNotebookReviewNotebookReviewState reviewState) {
    this.reviewState = reviewState;
    return this;
  }

  public CleanRoomNotebookReviewNotebookReviewState getReviewState() {
    return reviewState;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    NotebookVersionReview that = (NotebookVersionReview) o;
    return Objects.equals(comment, that.comment)
        && Objects.equals(etag, that.etag)
        && Objects.equals(reviewState, that.reviewState);
  }

  @Override
  public int hashCode() {
    return Objects.hash(comment, etag, reviewState);
  }

  @Override
  public String toString() {
    return new ToStringer(NotebookVersionReview.class)
        .add("comment", comment)
        .add("etag", etag)
        .add("reviewState", reviewState)
        .toString();
  }
}
