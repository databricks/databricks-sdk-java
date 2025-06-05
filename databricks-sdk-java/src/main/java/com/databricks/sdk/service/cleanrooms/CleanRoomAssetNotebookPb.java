// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.cleanrooms;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
class CleanRoomAssetNotebookPb {
  @JsonProperty("etag")
  private String etag;

  @JsonProperty("notebook_content")
  private String notebookContent;

  @JsonProperty("review_state")
  private CleanRoomNotebookReviewNotebookReviewState reviewState;

  @JsonProperty("reviews")
  private Collection<CleanRoomNotebookReview> reviews;

  @JsonProperty("runner_collaborator_aliases")
  private Collection<String> runnerCollaboratorAliases;

  public CleanRoomAssetNotebookPb setEtag(String etag) {
    this.etag = etag;
    return this;
  }

  public String getEtag() {
    return etag;
  }

  public CleanRoomAssetNotebookPb setNotebookContent(String notebookContent) {
    this.notebookContent = notebookContent;
    return this;
  }

  public String getNotebookContent() {
    return notebookContent;
  }

  public CleanRoomAssetNotebookPb setReviewState(
      CleanRoomNotebookReviewNotebookReviewState reviewState) {
    this.reviewState = reviewState;
    return this;
  }

  public CleanRoomNotebookReviewNotebookReviewState getReviewState() {
    return reviewState;
  }

  public CleanRoomAssetNotebookPb setReviews(Collection<CleanRoomNotebookReview> reviews) {
    this.reviews = reviews;
    return this;
  }

  public Collection<CleanRoomNotebookReview> getReviews() {
    return reviews;
  }

  public CleanRoomAssetNotebookPb setRunnerCollaboratorAliases(
      Collection<String> runnerCollaboratorAliases) {
    this.runnerCollaboratorAliases = runnerCollaboratorAliases;
    return this;
  }

  public Collection<String> getRunnerCollaboratorAliases() {
    return runnerCollaboratorAliases;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CleanRoomAssetNotebookPb that = (CleanRoomAssetNotebookPb) o;
    return Objects.equals(etag, that.etag)
        && Objects.equals(notebookContent, that.notebookContent)
        && Objects.equals(reviewState, that.reviewState)
        && Objects.equals(reviews, that.reviews)
        && Objects.equals(runnerCollaboratorAliases, that.runnerCollaboratorAliases);
  }

  @Override
  public int hashCode() {
    return Objects.hash(etag, notebookContent, reviewState, reviews, runnerCollaboratorAliases);
  }

  @Override
  public String toString() {
    return new ToStringer(CleanRoomAssetNotebookPb.class)
        .add("etag", etag)
        .add("notebookContent", notebookContent)
        .add("reviewState", reviewState)
        .add("reviews", reviews)
        .add("runnerCollaboratorAliases", runnerCollaboratorAliases)
        .toString();
  }
}
