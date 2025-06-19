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
    using = DeleteTransitionRequestResponse.DeleteTransitionRequestResponseSerializer.class)
@JsonDeserialize(
    using = DeleteTransitionRequestResponse.DeleteTransitionRequestResponseDeserializer.class)
public class DeleteTransitionRequestResponse {

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
    return new ToStringer(DeleteTransitionRequestResponse.class).toString();
  }

  DeleteTransitionRequestResponsePb toPb() {
    DeleteTransitionRequestResponsePb pb = new DeleteTransitionRequestResponsePb();

    return pb;
  }

  static DeleteTransitionRequestResponse fromPb(DeleteTransitionRequestResponsePb pb) {
    DeleteTransitionRequestResponse model = new DeleteTransitionRequestResponse();

    return model;
  }

  public static class DeleteTransitionRequestResponseSerializer
      extends JsonSerializer<DeleteTransitionRequestResponse> {
    @Override
    public void serialize(
        DeleteTransitionRequestResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      DeleteTransitionRequestResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class DeleteTransitionRequestResponseDeserializer
      extends JsonDeserializer<DeleteTransitionRequestResponse> {
    @Override
    public DeleteTransitionRequestResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      DeleteTransitionRequestResponsePb pb =
          mapper.readValue(p, DeleteTransitionRequestResponsePb.class);
      return DeleteTransitionRequestResponse.fromPb(pb);
    }
  }
}
