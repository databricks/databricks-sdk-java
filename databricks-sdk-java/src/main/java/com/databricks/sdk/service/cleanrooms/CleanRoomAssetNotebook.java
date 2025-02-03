// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.cleanrooms;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class CleanRoomAssetNotebook {
  /** Server generated checksum that represents the notebook version. */
  @JsonProperty("etag")
  private String etag;

  /**
   * Base 64 representation of the notebook contents. This is the same format as returned by
   * :method:workspace/export with the format of **HTML**.
   */
  @JsonProperty("notebook_content")
  private String notebookContent;

  /** top-level status derived from all reviews */
  @JsonProperty("review_state")
  private CleanRoomNotebookReviewNotebookReviewState reviewState;

  /** All existing approvals or rejections */
  @JsonProperty("reviews")
  private Collection<CleanRoomNotebookReview> reviews;

  /** collaborators that can run the notebook */
  @JsonProperty("runner_collaborators")
  private Collection<CleanRoomCollaborator> runnerCollaborators;

  public CleanRoomAssetNotebook setEtag(String etag) {
    this.etag = etag;
    return this;
  }

  public String getEtag() {
    return etag;
  }

  public CleanRoomAssetNotebook setNotebookContent(String notebookContent) {
    this.notebookContent = notebookContent;
    return this;
  }

  public String getNotebookContent() {
    return notebookContent;
  }

  public CleanRoomAssetNotebook setReviewState(
      CleanRoomNotebookReviewNotebookReviewState reviewState) {
    this.reviewState = reviewState;
    return this;
  }

  public CleanRoomNotebookReviewNotebookReviewState getReviewState() {
    return reviewState;
  }

  public CleanRoomAssetNotebook setReviews(Collection<CleanRoomNotebookReview> reviews) {
    this.reviews = reviews;
    return this;
  }

  public Collection<CleanRoomNotebookReview> getReviews() {
    return reviews;
  }

  public CleanRoomAssetNotebook setRunnerCollaborators(
      Collection<CleanRoomCollaborator> runnerCollaborators) {
    this.runnerCollaborators = runnerCollaborators;
    return this;
  }

  public Collection<CleanRoomCollaborator> getRunnerCollaborators() {
    return runnerCollaborators;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CleanRoomAssetNotebook that = (CleanRoomAssetNotebook) o;
    return Objects.equals(etag, that.etag)
        && Objects.equals(notebookContent, that.notebookContent)
        && Objects.equals(reviewState, that.reviewState)
        && Objects.equals(reviews, that.reviews)
        && Objects.equals(runnerCollaborators, that.runnerCollaborators);
  }

  @Override
  public int hashCode() {
    return Objects.hash(etag, notebookContent, reviewState, reviews, runnerCollaborators);
  }

  @Override
  public String toString() {
    return new ToStringer(CleanRoomAssetNotebook.class)
        .add("etag", etag)
        .add("notebookContent", notebookContent)
        .add("reviewState", reviewState)
        .add("reviews", reviews)
        .add("runnerCollaborators", runnerCollaborators)
        .toString();
  }
}
