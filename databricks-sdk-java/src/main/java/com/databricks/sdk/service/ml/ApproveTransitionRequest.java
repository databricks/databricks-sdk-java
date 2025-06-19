// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

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
@JsonSerialize(using = ApproveTransitionRequest.ApproveTransitionRequestSerializer.class)
@JsonDeserialize(using = ApproveTransitionRequest.ApproveTransitionRequestDeserializer.class)
public class ApproveTransitionRequest {
  /** Specifies whether to archive all current model versions in the target stage. */
  private Boolean archiveExistingVersions;

  /** User-provided comment on the action. */
  private String comment;

  /** Name of the model. */
  private String name;

  /**
   * Target stage of the transition. Valid values are:
   *
   * <p>* `None`: The initial stage of a model version.
   *
   * <p>* `Staging`: Staging or pre-production stage.
   *
   * <p>* `Production`: Production stage.
   *
   * <p>* `Archived`: Archived stage.
   */
  private Stage stage;

  /** Version of the model. */
  private String version;

  public ApproveTransitionRequest setArchiveExistingVersions(Boolean archiveExistingVersions) {
    this.archiveExistingVersions = archiveExistingVersions;
    return this;
  }

  public Boolean getArchiveExistingVersions() {
    return archiveExistingVersions;
  }

  public ApproveTransitionRequest setComment(String comment) {
    this.comment = comment;
    return this;
  }

  public String getComment() {
    return comment;
  }

  public ApproveTransitionRequest setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public ApproveTransitionRequest setStage(Stage stage) {
    this.stage = stage;
    return this;
  }

  public Stage getStage() {
    return stage;
  }

  public ApproveTransitionRequest setVersion(String version) {
    this.version = version;
    return this;
  }

  public String getVersion() {
    return version;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ApproveTransitionRequest that = (ApproveTransitionRequest) o;
    return Objects.equals(archiveExistingVersions, that.archiveExistingVersions)
        && Objects.equals(comment, that.comment)
        && Objects.equals(name, that.name)
        && Objects.equals(stage, that.stage)
        && Objects.equals(version, that.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(archiveExistingVersions, comment, name, stage, version);
  }

  @Override
  public String toString() {
    return new ToStringer(ApproveTransitionRequest.class)
        .add("archiveExistingVersions", archiveExistingVersions)
        .add("comment", comment)
        .add("name", name)
        .add("stage", stage)
        .add("version", version)
        .toString();
  }

  ApproveTransitionRequestPb toPb() {
    ApproveTransitionRequestPb pb = new ApproveTransitionRequestPb();
    pb.setArchiveExistingVersions(archiveExistingVersions);
    pb.setComment(comment);
    pb.setName(name);
    pb.setStage(stage);
    pb.setVersion(version);

    return pb;
  }

  static ApproveTransitionRequest fromPb(ApproveTransitionRequestPb pb) {
    ApproveTransitionRequest model = new ApproveTransitionRequest();
    model.setArchiveExistingVersions(pb.getArchiveExistingVersions());
    model.setComment(pb.getComment());
    model.setName(pb.getName());
    model.setStage(pb.getStage());
    model.setVersion(pb.getVersion());

    return model;
  }

  public static class ApproveTransitionRequestSerializer
      extends JsonSerializer<ApproveTransitionRequest> {
    @Override
    public void serialize(
        ApproveTransitionRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      ApproveTransitionRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class ApproveTransitionRequestDeserializer
      extends JsonDeserializer<ApproveTransitionRequest> {
    @Override
    public ApproveTransitionRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      ApproveTransitionRequestPb pb = mapper.readValue(p, ApproveTransitionRequestPb.class);
      return ApproveTransitionRequest.fromPb(pb);
    }
  }
}
