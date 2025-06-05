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
@JsonSerialize(using = UpdateComment.UpdateCommentSerializer.class)
@JsonDeserialize(using = UpdateComment.UpdateCommentDeserializer.class)
public class UpdateComment {
  /** User-provided comment on the action. */
  private String comment;

  /** Unique identifier of an activity */
  private String id;

  public UpdateComment setComment(String comment) {
    this.comment = comment;
    return this;
  }

  public String getComment() {
    return comment;
  }

  public UpdateComment setId(String id) {
    this.id = id;
    return this;
  }

  public String getId() {
    return id;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    UpdateComment that = (UpdateComment) o;
    return Objects.equals(comment, that.comment) && Objects.equals(id, that.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(comment, id);
  }

  @Override
  public String toString() {
    return new ToStringer(UpdateComment.class).add("comment", comment).add("id", id).toString();
  }

  UpdateCommentPb toPb() {
    UpdateCommentPb pb = new UpdateCommentPb();
    pb.setComment(comment);
    pb.setId(id);

    return pb;
  }

  static UpdateComment fromPb(UpdateCommentPb pb) {
    UpdateComment model = new UpdateComment();
    model.setComment(pb.getComment());
    model.setId(pb.getId());

    return model;
  }

  public static class UpdateCommentSerializer extends JsonSerializer<UpdateComment> {
    @Override
    public void serialize(UpdateComment value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      UpdateCommentPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class UpdateCommentDeserializer extends JsonDeserializer<UpdateComment> {
    @Override
    public UpdateComment deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      UpdateCommentPb pb = mapper.readValue(p, UpdateCommentPb.class);
      return UpdateComment.fromPb(pb);
    }
  }
}
