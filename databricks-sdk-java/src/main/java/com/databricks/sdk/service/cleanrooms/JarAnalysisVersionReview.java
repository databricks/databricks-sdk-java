// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.cleanrooms;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class JarAnalysisVersionReview {
  /** Review comment */
  @JsonProperty("comment")
  private String comment;

  /**
   * Etag identifying the jar analysis version, with its value being a hash of an
   * internally-generated UUID
   */
  @JsonProperty("etag")
  private String etag;

  /** Review outcome */
  @JsonProperty("review_state")
  private CleanRoomJarAnalysisReviewJarAnalysisReviewState reviewState;

  public JarAnalysisVersionReview setComment(String comment) {
    this.comment = comment;
    return this;
  }

  public String getComment() {
    return comment;
  }

  public JarAnalysisVersionReview setEtag(String etag) {
    this.etag = etag;
    return this;
  }

  public String getEtag() {
    return etag;
  }

  public JarAnalysisVersionReview setReviewState(
      CleanRoomJarAnalysisReviewJarAnalysisReviewState reviewState) {
    this.reviewState = reviewState;
    return this;
  }

  public CleanRoomJarAnalysisReviewJarAnalysisReviewState getReviewState() {
    return reviewState;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    JarAnalysisVersionReview that = (JarAnalysisVersionReview) o;
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
    return new ToStringer(JarAnalysisVersionReview.class)
        .add("comment", comment)
        .add("etag", etag)
        .add("reviewState", reviewState)
        .toString();
  }
}
