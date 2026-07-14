// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.cleanrooms;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

@Generated
public class CleanRoomAssetNotebook {
  /** Optional description of the notebook shown to all collaborators. */
  @JsonProperty("description")
  private String description;

  /**
   * The serverless environment version used to execute the notebook (e.g. "4"). Defaults to "2" if
   * not specified.
   */
  @JsonProperty("environment_version")
  private String environmentVersion;

  /** Server generated etag that represents the notebook version. */
  @JsonProperty("etag")
  private String etag;

  /**
   * Base 64 representation of the notebook contents. This is the same format as returned by
   * [workspace/export] with the format of **HTML**.
   *
   * <p>[workspace/export]: https://docs.databricks.com/api/workspace/workspace/export
   */
  @JsonProperty("notebook_content")
  private String notebookContent;

  /** Top-level status derived from all reviews */
  @JsonProperty("review_state")
  private CleanRoomNotebookReviewNotebookReviewState reviewState;

  /** All existing approvals or rejections */
  @JsonProperty("reviews")
  private Collection<CleanRoomNotebookReview> reviews;

  /** Aliases of collaborators that can run the notebook. */
  @JsonProperty("runner_collaborator_aliases")
  private Collection<String> runnerCollaboratorAliases;

  public CleanRoomAssetNotebook setDescription(String description) {
    this.description = description;
    return this;
  }

  public String getDescription() {
    return description;
  }

  public CleanRoomAssetNotebook setEnvironmentVersion(String environmentVersion) {
    this.environmentVersion = environmentVersion;
    return this;
  }

  public String getEnvironmentVersion() {
    return environmentVersion;
  }

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

  public CleanRoomAssetNotebook setRunnerCollaboratorAliases(
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
    CleanRoomAssetNotebook that = (CleanRoomAssetNotebook) o;
    return Objects.equals(description, that.description)
        && Objects.equals(environmentVersion, that.environmentVersion)
        && Objects.equals(etag, that.etag)
        && Objects.equals(notebookContent, that.notebookContent)
        && Objects.equals(reviewState, that.reviewState)
        && Objects.equals(reviews, that.reviews)
        && Objects.equals(runnerCollaboratorAliases, that.runnerCollaboratorAliases);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        description,
        environmentVersion,
        etag,
        notebookContent,
        reviewState,
        reviews,
        runnerCollaboratorAliases);
  }

  @Override
  public String toString() {
    return new ToStringer(CleanRoomAssetNotebook.class)
        .add("description", description)
        .add("environmentVersion", environmentVersion)
        .add("etag", etag)
        .add("notebookContent", notebookContent)
        .add("reviewState", reviewState)
        .add("reviews", reviews)
        .add("runnerCollaboratorAliases", runnerCollaboratorAliases)
        .toString();
  }
}
