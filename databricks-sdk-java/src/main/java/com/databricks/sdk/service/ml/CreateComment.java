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
@JsonSerialize(using = CreateComment.CreateCommentSerializer.class)
@JsonDeserialize(using = CreateComment.CreateCommentDeserializer.class)
public class CreateComment {
  /** User-provided comment on the action. */
  private String comment;

  /** Name of the model. */
  private String name;

  /** Version of the model. */
  private String version;

  public CreateComment setComment(String comment) {
    this.comment = comment;
    return this;
  }

  public String getComment() {
    return comment;
  }

  public CreateComment setName(String name) {
    this.name = name;
    return this;
  }

  public String getName() {
    return name;
  }

  public CreateComment setVersion(String version) {
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
    CreateComment that = (CreateComment) o;
    return Objects.equals(comment, that.comment)
        && Objects.equals(name, that.name)
        && Objects.equals(version, that.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(comment, name, version);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateComment.class)
        .add("comment", comment)
        .add("name", name)
        .add("version", version)
        .toString();
  }

  CreateCommentPb toPb() {
    CreateCommentPb pb = new CreateCommentPb();
    pb.setComment(comment);
    pb.setName(name);
    pb.setVersion(version);

    return pb;
  }

  static CreateComment fromPb(CreateCommentPb pb) {
    CreateComment model = new CreateComment();
    model.setComment(pb.getComment());
    model.setName(pb.getName());
    model.setVersion(pb.getVersion());

    return model;
  }

  public static class CreateCommentSerializer extends JsonSerializer<CreateComment> {
    @Override
    public void serialize(CreateComment value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      CreateCommentPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class CreateCommentDeserializer extends JsonDeserializer<CreateComment> {
    @Override
    public CreateComment deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      CreateCommentPb pb = mapper.readValue(p, CreateCommentPb.class);
      return CreateComment.fromPb(pb);
    }
  }
}
