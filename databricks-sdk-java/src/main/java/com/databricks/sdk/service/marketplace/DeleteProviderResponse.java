// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.marketplace;

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
@JsonSerialize(using = DeleteProviderResponse.DeleteProviderResponseSerializer.class)
@JsonDeserialize(using = DeleteProviderResponse.DeleteProviderResponseDeserializer.class)
public class DeleteProviderResponse {

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
    return new ToStringer(DeleteProviderResponse.class).toString();
  }

  DeleteProviderResponsePb toPb() {
    DeleteProviderResponsePb pb = new DeleteProviderResponsePb();

    return pb;
  }

  static DeleteProviderResponse fromPb(DeleteProviderResponsePb pb) {
    DeleteProviderResponse model = new DeleteProviderResponse();

    return model;
  }

  public static class DeleteProviderResponseSerializer
      extends JsonSerializer<DeleteProviderResponse> {
    @Override
    public void serialize(
        DeleteProviderResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      DeleteProviderResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class DeleteProviderResponseDeserializer
      extends JsonDeserializer<DeleteProviderResponse> {
    @Override
    public DeleteProviderResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      DeleteProviderResponsePb pb = mapper.readValue(p, DeleteProviderResponsePb.class);
      return DeleteProviderResponse.fromPb(pb);
    }
  }
}
