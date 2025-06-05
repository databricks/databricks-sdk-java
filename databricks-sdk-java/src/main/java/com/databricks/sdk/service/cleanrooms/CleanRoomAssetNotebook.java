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
import java.util.Collection;
import java.util.Objects;

@Generated
@JsonSerialize(using = CleanRoomAssetNotebook.CleanRoomAssetNotebookSerializer.class)
@JsonDeserialize(using = CleanRoomAssetNotebook.CleanRoomAssetNotebookDeserializer.class)
public class CleanRoomAssetNotebook {
  /** Server generated etag that represents the notebook version. */
  private String etag;

  /**
   * Base 64 representation of the notebook contents. This is the same format as returned by
   * :method:workspace/export with the format of **HTML**.
   */
  private String notebookContent;

  /** top-level status derived from all reviews */
  private CleanRoomNotebookReviewNotebookReviewState reviewState;

  /** All existing approvals or rejections */
  private Collection<CleanRoomNotebookReview> reviews;

  /** collaborators that can run the notebook */
  private Collection<String> runnerCollaboratorAliases;

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
    return new ToStringer(CleanRoomAssetNotebook.class)
        .add("etag", etag)
        .add("notebookContent", notebookContent)
        .add("reviewState", reviewState)
        .add("reviews", reviews)
        .add("runnerCollaboratorAliases", runnerCollaboratorAliases)
        .toString();
  }

  CleanRoomAssetNotebookPb toPb() {
    CleanRoomAssetNotebookPb pb = new CleanRoomAssetNotebookPb();
    pb.setEtag(etag);
    pb.setNotebookContent(notebookContent);
    pb.setReviewState(reviewState);
    pb.setReviews(reviews);
    pb.setRunnerCollaboratorAliases(runnerCollaboratorAliases);

    return pb;
  }

  static CleanRoomAssetNotebook fromPb(CleanRoomAssetNotebookPb pb) {
    CleanRoomAssetNotebook model = new CleanRoomAssetNotebook();
    model.setEtag(pb.getEtag());
    model.setNotebookContent(pb.getNotebookContent());
    model.setReviewState(pb.getReviewState());
    model.setReviews(pb.getReviews());
    model.setRunnerCollaboratorAliases(pb.getRunnerCollaboratorAliases());

    return model;
  }

  public static class CleanRoomAssetNotebookSerializer
      extends JsonSerializer<CleanRoomAssetNotebook> {
    @Override
    public void serialize(
        CleanRoomAssetNotebook value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      CleanRoomAssetNotebookPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class CleanRoomAssetNotebookDeserializer
      extends JsonDeserializer<CleanRoomAssetNotebook> {
    @Override
    public CleanRoomAssetNotebook deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      CleanRoomAssetNotebookPb pb = mapper.readValue(p, CleanRoomAssetNotebookPb.class);
      return CleanRoomAssetNotebook.fromPb(pb);
    }
  }
}
