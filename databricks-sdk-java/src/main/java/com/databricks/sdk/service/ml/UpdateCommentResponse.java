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
@JsonSerialize(using = UpdateCommentResponse.UpdateCommentResponseSerializer.class)
@JsonDeserialize(using = UpdateCommentResponse.UpdateCommentResponseDeserializer.class)
public class UpdateCommentResponse {
  /** Comment details. */
  private CommentObject comment;

  public UpdateCommentResponse setComment(CommentObject comment) {
    this.comment = comment;
    return this;
  }

  public CommentObject getComment() {
    return comment;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    UpdateCommentResponse that = (UpdateCommentResponse) o;
    return Objects.equals(comment, that.comment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(comment);
  }

  @Override
  public String toString() {
    return new ToStringer(UpdateCommentResponse.class).add("comment", comment).toString();
  }

  UpdateCommentResponsePb toPb() {
    UpdateCommentResponsePb pb = new UpdateCommentResponsePb();
    pb.setComment(comment);

    return pb;
  }

  static UpdateCommentResponse fromPb(UpdateCommentResponsePb pb) {
    UpdateCommentResponse model = new UpdateCommentResponse();
    model.setComment(pb.getComment());

    return model;
  }

  public static class UpdateCommentResponseSerializer
      extends JsonSerializer<UpdateCommentResponse> {
    @Override
    public void serialize(
        UpdateCommentResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      UpdateCommentResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class UpdateCommentResponseDeserializer
      extends JsonDeserializer<UpdateCommentResponse> {
    @Override
    public UpdateCommentResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      UpdateCommentResponsePb pb = mapper.readValue(p, UpdateCommentResponsePb.class);
      return UpdateCommentResponse.fromPb(pb);
    }
  }
}
