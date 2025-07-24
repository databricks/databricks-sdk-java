// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.cleanrooms;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class CreateCleanRoomAssetReviewResponse {
  /** top-level status derived from all reviews */
  @JsonProperty("notebook_review_state")
  private CleanRoomNotebookReviewNotebookReviewState notebookReviewState;

  /** All existing notebook approvals or rejections */
  @JsonProperty("notebook_reviews")
  private Collection<CleanRoomNotebookReview> notebookReviews;

  public CreateCleanRoomAssetReviewResponse setNotebookReviewState(
      CleanRoomNotebookReviewNotebookReviewState notebookReviewState) {
    this.notebookReviewState = notebookReviewState;
    return this;
  }

  public CleanRoomNotebookReviewNotebookReviewState getNotebookReviewState() {
    return notebookReviewState;
  }

  public CreateCleanRoomAssetReviewResponse setNotebookReviews(
      Collection<CleanRoomNotebookReview> notebookReviews) {
    this.notebookReviews = notebookReviews;
    return this;
  }

  public Collection<CleanRoomNotebookReview> getNotebookReviews() {
    return notebookReviews;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CreateCleanRoomAssetReviewResponse that = (CreateCleanRoomAssetReviewResponse) o;
    return Objects.equals(notebookReviewState, that.notebookReviewState)
        && Objects.equals(notebookReviews, that.notebookReviews);
  }

  @Override
  public int hashCode() {
    return Objects.hash(notebookReviewState, notebookReviews);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateCleanRoomAssetReviewResponse.class)
        .add("notebookReviewState", notebookReviewState)
        .add("notebookReviews", notebookReviews)
        .toString();
  }
}
