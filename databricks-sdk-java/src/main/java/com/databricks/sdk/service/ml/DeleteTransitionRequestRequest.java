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

/** Delete a transition request */
@Generated
@JsonSerialize(
    using = DeleteTransitionRequestRequest.DeleteTransitionRequestRequestSerializer.class)
@JsonDeserialize(
    using = DeleteTransitionRequestRequest.DeleteTransitionRequestRequestDeserializer.class)
public class DeleteTransitionRequestRequest {
  /** User-provided comment on the action. */
  private String comment;

  /**
   * Username of the user who created this request. Of the transition requests matching the
   * specified details, only the one transition created by this user will be deleted.
   */
  private String creator;

  /** Name of the model. */
  private String name;

  /**
   * Target stage of the transition request. Valid values are:
   *
   * <p>* `None`: The initial stage of a model version.
   *
   * <p>* `Staging`: Staging or pre-production stage.
   *
   * <p>* `Production`: Production stage.
   *
   * <p>* `Archived`: Archived stage.
   */
  private DeleteTransitionRequestStage stage;

  /** Version of the model. */
  private String version;

  public DeleteTransitionRequestRequest setComment(String comment) {
    this.comment = comment;
    return this;
  }

  public String getComment() {
    return comment;
  }

  public DeleteTransitionRequestRequest setCreator(String creator) {
    this.creator = creator;
    return this;
  }

  public String getCreator() {
    return creator;
  }

  public DeleteTransitionRequestRequest setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public DeleteTransitionRequestRequest setStage(DeleteTransitionRequestStage stage) {
    this.stage = stage;
    return this;
  }

  public DeleteTransitionRequestStage getStage() {
    return stage;
  }

  public DeleteTransitionRequestRequest setVersion(String version) {
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
    DeleteTransitionRequestRequest that = (DeleteTransitionRequestRequest) o;
    return Objects.equals(comment, that.comment)
        && Objects.equals(creator, that.creator)
        && Objects.equals(name, that.name)
        && Objects.equals(stage, that.stage)
        && Objects.equals(version, that.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(comment, creator, name, stage, version);
  }

  @Override
  public String toString() {
    return new ToStringer(DeleteTransitionRequestRequest.class)
        .add("comment", comment)
        .add("creator", creator)
        .add("name", name)
        .add("stage", stage)
        .add("version", version)
        .toString();
  }

  DeleteTransitionRequestRequestPb toPb() {
    DeleteTransitionRequestRequestPb pb = new DeleteTransitionRequestRequestPb();
    pb.setComment(comment);
    pb.setCreator(creator);
    pb.setName(name);
    pb.setStage(stage);
    pb.setVersion(version);

    return pb;
  }

  static DeleteTransitionRequestRequest fromPb(DeleteTransitionRequestRequestPb pb) {
    DeleteTransitionRequestRequest model = new DeleteTransitionRequestRequest();
    model.setComment(pb.getComment());
    model.setCreator(pb.getCreator());
    model.setName(pb.getName());
    model.setStage(pb.getStage());
    model.setVersion(pb.getVersion());

    return model;
  }

  public static class DeleteTransitionRequestRequestSerializer
      extends JsonSerializer<DeleteTransitionRequestRequest> {
    @Override
    public void serialize(
        DeleteTransitionRequestRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      DeleteTransitionRequestRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class DeleteTransitionRequestRequestDeserializer
      extends JsonDeserializer<DeleteTransitionRequestRequest> {
    @Override
    public DeleteTransitionRequestRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      DeleteTransitionRequestRequestPb pb =
          mapper.readValue(p, DeleteTransitionRequestRequestPb.class);
      return DeleteTransitionRequestRequest.fromPb(pb);
    }
  }
}
