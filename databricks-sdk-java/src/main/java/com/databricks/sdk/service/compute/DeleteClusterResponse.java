// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

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
@JsonSerialize(using = DeleteClusterResponse.DeleteClusterResponseSerializer.class)
@JsonDeserialize(using = DeleteClusterResponse.DeleteClusterResponseDeserializer.class)
public class DeleteClusterResponse {

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
    return new ToStringer(DeleteClusterResponse.class).toString();
  }

  DeleteClusterResponsePb toPb() {
    DeleteClusterResponsePb pb = new DeleteClusterResponsePb();

    return pb;
  }

  static DeleteClusterResponse fromPb(DeleteClusterResponsePb pb) {
    DeleteClusterResponse model = new DeleteClusterResponse();

    return model;
  }

  public static class DeleteClusterResponseSerializer
      extends JsonSerializer<DeleteClusterResponse> {
    @Override
    public void serialize(
        DeleteClusterResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      DeleteClusterResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class DeleteClusterResponseDeserializer
      extends JsonDeserializer<DeleteClusterResponse> {
    @Override
    public DeleteClusterResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      DeleteClusterResponsePb pb = mapper.readValue(p, DeleteClusterResponsePb.class);
      return DeleteClusterResponse.fromPb(pb);
    }
  }
}
