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
@JsonSerialize(using = DeleteLoggedModelResponse.DeleteLoggedModelResponseSerializer.class)
@JsonDeserialize(using = DeleteLoggedModelResponse.DeleteLoggedModelResponseDeserializer.class)
public class DeleteLoggedModelResponse {

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
    return new ToStringer(DeleteLoggedModelResponse.class).toString();
  }

  DeleteLoggedModelResponsePb toPb() {
    DeleteLoggedModelResponsePb pb = new DeleteLoggedModelResponsePb();

    return pb;
  }

  static DeleteLoggedModelResponse fromPb(DeleteLoggedModelResponsePb pb) {
    DeleteLoggedModelResponse model = new DeleteLoggedModelResponse();

    return model;
  }

  public static class DeleteLoggedModelResponseSerializer
      extends JsonSerializer<DeleteLoggedModelResponse> {
    @Override
    public void serialize(
        DeleteLoggedModelResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      DeleteLoggedModelResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class DeleteLoggedModelResponseDeserializer
      extends JsonDeserializer<DeleteLoggedModelResponse> {
    @Override
    public DeleteLoggedModelResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      DeleteLoggedModelResponsePb pb = mapper.readValue(p, DeleteLoggedModelResponsePb.class);
      return DeleteLoggedModelResponse.fromPb(pb);
    }
  }
}
