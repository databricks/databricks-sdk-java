// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.cleanrooms;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.io.IOException;
import java.util.Objects;

@Generated
@JsonSerialize(using = CleanRoomNotebookReview.CleanRoomNotebookReviewSerializer.class)
@JsonDeserialize(using = CleanRoomNotebookReview.CleanRoomNotebookReviewDeserializer.class)
public class CleanRoomNotebookReview {
  /** review comment */
  private String comment;

  /** timestamp of when the review was submitted */
  private Long createdAtMillis;

  /** review outcome */
  private CleanRoomNotebookReviewNotebookReviewState reviewState;

  /** specified when the review was not explicitly made by a user */
  private CleanRoomNotebookReviewNotebookReviewSubReason reviewSubReason;

  /** collaborator alias of the reviewer */
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

  CleanRoomNotebookReviewPb toPb() {
    CleanRoomNotebookReviewPb pb = new CleanRoomNotebookReviewPb();
    pb.setComment(comment);
    pb.setCreatedAtMillis(createdAtMillis);
    pb.setReviewState(reviewState);
    pb.setReviewSubReason(reviewSubReason);
    pb.setReviewerCollaboratorAlias(reviewerCollaboratorAlias);

    return pb;
  }

  static CleanRoomNotebookReview fromPb(CleanRoomNotebookReviewPb pb) {
    CleanRoomNotebookReview model = new CleanRoomNotebookReview();
    model.setComment(pb.getComment());
    model.setCreatedAtMillis(pb.getCreatedAtMillis());
    model.setReviewState(pb.getReviewState());
    model.setReviewSubReason(pb.getReviewSubReason());
    model.setReviewerCollaboratorAlias(pb.getReviewerCollaboratorAlias());

    return model;
  }

  public static class CleanRoomNotebookReviewSerializer
      extends JsonSerializer<CleanRoomNotebookReview> {
    @Override
    public void serialize(
        CleanRoomNotebookReview value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      CleanRoomNotebookReviewPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class CleanRoomNotebookReviewDeserializer
      extends JsonDeserializer<CleanRoomNotebookReview> {
    @Override
    public CleanRoomNotebookReview deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      CleanRoomNotebookReviewPb pb = mapper.readValue(p, CleanRoomNotebookReviewPb.class);
      return CleanRoomNotebookReview.fromPb(pb);
    }
  }
}
