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
@JsonSerialize(using = DeleteCommentResponse.DeleteCommentResponseSerializer.class)
@JsonDeserialize(using = DeleteCommentResponse.DeleteCommentResponseDeserializer.class)
public class DeleteCommentResponse {

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash();
  }

  @Override
  public String toString() {
    return new ToStringer(DeleteCommentResponse.class).toString();
  }

  DeleteCommentResponsePb toPb() {
    DeleteCommentResponsePb pb = new DeleteCommentResponsePb();

    return pb;
  }

  static DeleteCommentResponse fromPb(DeleteCommentResponsePb pb) {
    DeleteCommentResponse model = new DeleteCommentResponse();

    return model;
  }

  public static class DeleteCommentResponseSerializer
      extends JsonSerializer<DeleteCommentResponse> {
    @Override
    public void serialize(
        DeleteCommentResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      DeleteCommentResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class DeleteCommentResponseDeserializer
      extends JsonDeserializer<DeleteCommentResponse> {
    @Override
    public DeleteCommentResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      DeleteCommentResponsePb pb = mapper.readValue(p, DeleteCommentResponsePb.class);
      return DeleteCommentResponse.fromPb(pb);
    }
  }
}
