// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.files;

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
@JsonSerialize(using = DeleteDirectoryResponse.DeleteDirectoryResponseSerializer.class)
@JsonDeserialize(using = DeleteDirectoryResponse.DeleteDirectoryResponseDeserializer.class)
public class DeleteDirectoryResponse {

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
    return new ToStringer(DeleteDirectoryResponse.class).toString();
  }

  DeleteDirectoryResponsePb toPb() {
    DeleteDirectoryResponsePb pb = new DeleteDirectoryResponsePb();

    return pb;
  }

  static DeleteDirectoryResponse fromPb(DeleteDirectoryResponsePb pb) {
    DeleteDirectoryResponse model = new DeleteDirectoryResponse();

    return model;
  }

  public static class DeleteDirectoryResponseSerializer
      extends JsonSerializer<DeleteDirectoryResponse> {
    @Override
    public void serialize(
        DeleteDirectoryResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      DeleteDirectoryResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class DeleteDirectoryResponseDeserializer
      extends JsonDeserializer<DeleteDirectoryResponse> {
    @Override
    public DeleteDirectoryResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      DeleteDirectoryResponsePb pb = mapper.readValue(p, DeleteDirectoryResponsePb.class);
      return DeleteDirectoryResponse.fromPb(pb);
    }
  }
}
