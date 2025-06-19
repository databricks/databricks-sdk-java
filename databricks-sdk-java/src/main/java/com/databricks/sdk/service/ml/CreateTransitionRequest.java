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
@JsonSerialize(using = CreateTransitionRequest.CreateTransitionRequestSerializer.class)
@JsonDeserialize(using = CreateTransitionRequest.CreateTransitionRequestDeserializer.class)
public class CreateTransitionRequest {
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

  public CreateTransitionRequest setComment(String comment) {
    this.comment = comment;
    return this;
  }

  public String getComment() {
    return comment;
  }

  public CreateTransitionRequest setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public CreateTransitionRequest setStage(Stage stage) {
    this.stage = stage;
    return this;
  }

  public Stage getStage() {
    return stage;
  }

  public CreateTransitionRequest setVersion(String version) {
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
    CreateTransitionRequest that = (CreateTransitionRequest) o;
    return Objects.equals(comment, that.comment)
        && Objects.equals(name, that.name)
        && Objects.equals(stage, that.stage)
        && Objects.equals(version, that.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(comment, name, stage, version);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateTransitionRequest.class)
        .add("comment", comment)
        .add("name", name)
        .add("stage", stage)
        .add("version", version)
        .toString();
  }

  CreateTransitionRequestPb toPb() {
    CreateTransitionRequestPb pb = new CreateTransitionRequestPb();
    pb.setComment(comment);
    pb.setName(name);
    pb.setStage(stage);
    pb.setVersion(version);

    return pb;
  }

  static CreateTransitionRequest fromPb(CreateTransitionRequestPb pb) {
    CreateTransitionRequest model = new CreateTransitionRequest();
    model.setComment(pb.getComment());
    model.setName(pb.getName());
    model.setStage(pb.getStage());
    model.setVersion(pb.getVersion());

    return model;
  }

  public static class CreateTransitionRequestSerializer
      extends JsonSerializer<CreateTransitionRequest> {
    @Override
    public void serialize(
        CreateTransitionRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      CreateTransitionRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class CreateTransitionRequestDeserializer
      extends JsonDeserializer<CreateTransitionRequest> {
    @Override
    public CreateTransitionRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      CreateTransitionRequestPb pb = mapper.readValue(p, CreateTransitionRequestPb.class);
      return CreateTransitionRequest.fromPb(pb);
    }
  }
}
