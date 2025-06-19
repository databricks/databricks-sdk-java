// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

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
@JsonSerialize(using = DeleteCredentialResponse.DeleteCredentialResponseSerializer.class)
@JsonDeserialize(using = DeleteCredentialResponse.DeleteCredentialResponseDeserializer.class)
public class DeleteCredentialResponse {

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
    return new ToStringer(DeleteCredentialResponse.class).toString();
  }

  DeleteCredentialResponsePb toPb() {
    DeleteCredentialResponsePb pb = new DeleteCredentialResponsePb();

    return pb;
  }

  static DeleteCredentialResponse fromPb(DeleteCredentialResponsePb pb) {
    DeleteCredentialResponse model = new DeleteCredentialResponse();

    return model;
  }

  public static class DeleteCredentialResponseSerializer
      extends JsonSerializer<DeleteCredentialResponse> {
    @Override
    public void serialize(
        DeleteCredentialResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      DeleteCredentialResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class DeleteCredentialResponseDeserializer
      extends JsonDeserializer<DeleteCredentialResponse> {
    @Override
    public DeleteCredentialResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      DeleteCredentialResponsePb pb = mapper.readValue(p, DeleteCredentialResponsePb.class);
      return DeleteCredentialResponse.fromPb(pb);
    }
  }
}
