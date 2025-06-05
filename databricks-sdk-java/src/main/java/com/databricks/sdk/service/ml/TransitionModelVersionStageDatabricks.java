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
@JsonSerialize(
    using =
        TransitionModelVersionStageDatabricks.TransitionModelVersionStageDatabricksSerializer.class)
@JsonDeserialize(
    using =
        TransitionModelVersionStageDatabricks.TransitionModelVersionStageDatabricksDeserializer
            .class)
public class TransitionModelVersionStageDatabricks {
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

  public TransitionModelVersionStageDatabricks setArchiveExistingVersions(
      Boolean archiveExistingVersions) {
    this.archiveExistingVersions = archiveExistingVersions;
    return this;
  }

  public Boolean getArchiveExistingVersions() {
    return archiveExistingVersions;
  }

  public TransitionModelVersionStageDatabricks setComment(String comment) {
    this.comment = comment;
    return this;
  }

  public String getComment() {
    return comment;
  }

  public TransitionModelVersionStageDatabricks setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public TransitionModelVersionStageDatabricks setStage(Stage stage) {
    this.stage = stage;
    return this;
  }

  public Stage getStage() {
    return stage;
  }

  public TransitionModelVersionStageDatabricks setVersion(String version) {
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
    TransitionModelVersionStageDatabricks that = (TransitionModelVersionStageDatabricks) o;
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
    return new ToStringer(TransitionModelVersionStageDatabricks.class)
        .add("archiveExistingVersions", archiveExistingVersions)
        .add("comment", comment)
        .add("name", name)
        .add("stage", stage)
        .add("version", version)
        .toString();
  }

  TransitionModelVersionStageDatabricksPb toPb() {
    TransitionModelVersionStageDatabricksPb pb = new TransitionModelVersionStageDatabricksPb();
    pb.setArchiveExistingVersions(archiveExistingVersions);
    pb.setComment(comment);
    pb.setName(name);
    pb.setStage(stage);
    pb.setVersion(version);

    return pb;
  }

  static TransitionModelVersionStageDatabricks fromPb(TransitionModelVersionStageDatabricksPb pb) {
    TransitionModelVersionStageDatabricks model = new TransitionModelVersionStageDatabricks();
    model.setArchiveExistingVersions(pb.getArchiveExistingVersions());
    model.setComment(pb.getComment());
    model.setName(pb.getName());
    model.setStage(pb.getStage());
    model.setVersion(pb.getVersion());

    return model;
  }

  public static class TransitionModelVersionStageDatabricksSerializer
      extends JsonSerializer<TransitionModelVersionStageDatabricks> {
    @Override
    public void serialize(
        TransitionModelVersionStageDatabricks value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      TransitionModelVersionStageDatabricksPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class TransitionModelVersionStageDatabricksDeserializer
      extends JsonDeserializer<TransitionModelVersionStageDatabricks> {
    @Override
    public TransitionModelVersionStageDatabricks deserialize(
        JsonParser p, DeserializationContext ctxt) throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      TransitionModelVersionStageDatabricksPb pb =
          mapper.readValue(p, TransitionModelVersionStageDatabricksPb.class);
      return TransitionModelVersionStageDatabricks.fromPb(pb);
    }
  }
}
