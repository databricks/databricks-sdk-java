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
@JsonSerialize(using = CreateCommentResponse.CreateCommentResponseSerializer.class)
@JsonDeserialize(using = CreateCommentResponse.CreateCommentResponseDeserializer.class)
public class CreateCommentResponse {
  /** Comment details. */
  private CommentObject comment;

  public CreateCommentResponse setComment(CommentObject comment) {
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
    CreateCommentResponse that = (CreateCommentResponse) o;
    return Objects.equals(comment, that.comment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(comment);
  }

  @Override
  public String toString() {
    return new ToStringer(CreateCommentResponse.class).add("comment", comment).toString();
  }

  CreateCommentResponsePb toPb() {
    CreateCommentResponsePb pb = new CreateCommentResponsePb();
    pb.setComment(comment);

    return pb;
  }

  static CreateCommentResponse fromPb(CreateCommentResponsePb pb) {
    CreateCommentResponse model = new CreateCommentResponse();
    model.setComment(pb.getComment());

    return model;
  }

  public static class CreateCommentResponseSerializer
      extends JsonSerializer<CreateCommentResponse> {
    @Override
    public void serialize(
        CreateCommentResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      CreateCommentResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class CreateCommentResponseDeserializer
      extends JsonDeserializer<CreateCommentResponse> {
    @Override
    public CreateCommentResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      CreateCommentResponsePb pb = mapper.readValue(p, CreateCommentResponsePb.class);
      return CreateCommentResponse.fromPb(pb);
    }
  }
}
