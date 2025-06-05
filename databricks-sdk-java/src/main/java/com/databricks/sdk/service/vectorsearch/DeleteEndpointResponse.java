// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.vectorsearch;

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
@JsonSerialize(using = DeleteEndpointResponse.DeleteEndpointResponseSerializer.class)
@JsonDeserialize(using = DeleteEndpointResponse.DeleteEndpointResponseDeserializer.class)
public class DeleteEndpointResponse {

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
    return new ToStringer(DeleteEndpointResponse.class).toString();
  }

  DeleteEndpointResponsePb toPb() {
    DeleteEndpointResponsePb pb = new DeleteEndpointResponsePb();

    return pb;
  }

  static DeleteEndpointResponse fromPb(DeleteEndpointResponsePb pb) {
    DeleteEndpointResponse model = new DeleteEndpointResponse();

    return model;
  }

  public static class DeleteEndpointResponseSerializer
      extends JsonSerializer<DeleteEndpointResponse> {
    @Override
    public void serialize(
        DeleteEndpointResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      DeleteEndpointResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class DeleteEndpointResponseDeserializer
      extends JsonDeserializer<DeleteEndpointResponse> {
    @Override
    public DeleteEndpointResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      DeleteEndpointResponsePb pb = mapper.readValue(p, DeleteEndpointResponsePb.class);
      return DeleteEndpointResponse.fromPb(pb);
    }
  }
}
