// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.cleanrooms;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class CleanRoomNotebookReview {
  /** review comment */
  @JsonProperty("comment")
  private String comment;

  /** timestamp of when the review was submitted */
  @JsonProperty("created_at_millis")
  private Long createdAtMillis;

  /** review outcome */
  @JsonProperty("review_state")
  private CleanRoomNotebookReviewNotebookReviewState reviewState;

  /** specified when the review was not explicitly made by a user */
  @JsonProperty("review_sub_reason")
  private CleanRoomNotebookReviewNotebookReviewSubReason reviewSubReason;

  /** collaborator alias of the reviewer */
  @JsonProperty("reviewer_collaborator_alias")
  private String reviewerCollaboratorAlias;

  public CleanRoomNotebookReview setComment(String comment) {
    this.comment = comment;
    return this;
  }

  public String getComment() {
    return comment;
  }

  public CleanRoomNotebookReview setCreatedAtMillis(Long createdAtMillis) {
    this.createdAtMillis = createdAtMillis;
    return this;
  }

  public Long getCreatedAtMillis() {
    return createdAtMillis;
  }

  public CleanRoomNotebookReview setReviewState(
      CleanRoomNotebookReviewNotebookReviewState reviewState) {
    this.reviewState = reviewState;
    return this;
  }

  public CleanRoomNotebookReviewNotebookReviewState getReviewState() {
    return reviewState;
  }

  public CleanRoomNotebookReview setReviewSubReason(
      CleanRoomNotebookReviewNotebookReviewSubReason reviewSubReason) {
    this.reviewSubReason = reviewSubReason;
    return this;
  }

  public CleanRoomNotebookReviewNotebookReviewSubReason getReviewSubReason() {
    return reviewSubReason;
  }

  public CleanRoomNotebookReview setReviewerCollaboratorAlias(String reviewerCollaboratorAlias) {
    this.reviewerCollaboratorAlias = reviewerCollaboratorAlias;
    return this;
  }

  public String getReviewerCollaboratorAlias() {
    return reviewerCollaboratorAlias;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CleanRoomNotebookReview that = (CleanRoomNotebookReview) o;
    return Objects.equals(comment, that.comment)
        && Objects.equals(createdAtMillis, that.createdAtMillis)
        && Objects.equals(reviewState, that.reviewState)
        && Objects.equals(reviewSubReason, that.reviewSubReason)
        && Objects.equals(reviewerCollaboratorAlias, that.reviewerCollaboratorAlias);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        comment, createdAtMillis, reviewState, reviewSubReason, reviewerCollaboratorAlias);
  }

  @Override
  public String toString() {
    return new ToStringer(CleanRoomNotebookReview.class)
        .add("comment", comment)
        .add("createdAtMillis", createdAtMillis)
        .add("reviewState", reviewState)
        .add("reviewSubReason", reviewSubReason)
        .add("reviewerCollaboratorAlias", reviewerCollaboratorAlias)
        .toString();
  }
}
