// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.workspace;

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
@JsonSerialize(using = DeleteSecretResponse.DeleteSecretResponseSerializer.class)
@JsonDeserialize(using = DeleteSecretResponse.DeleteSecretResponseDeserializer.class)
public class DeleteSecretResponse {

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
    return new ToStringer(DeleteSecretResponse.class).toString();
  }

  DeleteSecretResponsePb toPb() {
    DeleteSecretResponsePb pb = new DeleteSecretResponsePb();

    return pb;
  }

  static DeleteSecretResponse fromPb(DeleteSecretResponsePb pb) {
    DeleteSecretResponse model = new DeleteSecretResponse();

    return model;
  }

  public static class DeleteSecretResponseSerializer extends JsonSerializer<DeleteSecretResponse> {
    @Override
    public void serialize(
        DeleteSecretResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      DeleteSecretResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class DeleteSecretResponseDeserializer
      extends JsonDeserializer<DeleteSecretResponse> {
    @Override
    public DeleteSecretResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      DeleteSecretResponsePb pb = mapper.readValue(p, DeleteSecretResponsePb.class);
      return DeleteSecretResponse.fromPb(pb);
    }
  }
}
