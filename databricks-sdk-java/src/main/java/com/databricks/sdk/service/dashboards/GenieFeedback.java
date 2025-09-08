// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.dashboards;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** Feedback containing rating and optional comment */
@Generated
public class GenieFeedback {
  /** Optional feedback comment text */
  @JsonProperty("comment")
  private String comment;

  /** The feedback rating */
  @JsonProperty("rating")
  private GenieFeedbackRating rating;

  public GenieFeedback setComment(String comment) {
    this.comment = comment;
    return this;
  }

  public String getComment() {
    return comment;
  }

  public GenieFeedback setRating(GenieFeedbackRating rating) {
    this.rating = rating;
    return this;
  }

  public GenieFeedbackRating getRating() {
    return rating;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GenieFeedback that = (GenieFeedback) o;
    return Objects.equals(comment, that.comment) && Objects.equals(rating, that.rating);
  }

  @Override
  public int hashCode() {
    return Objects.hash(comment, rating);
  }

  @Override
  public String toString() {
    return new ToStringer(GenieFeedback.class)
        .add("comment", comment)
        .add("rating", rating)
        .toString();
  }
}
