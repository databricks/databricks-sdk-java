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
@JsonSerialize(using = DeleteExchangeResponse.DeleteExchangeResponseSerializer.class)
@JsonDeserialize(using = DeleteExchangeResponse.DeleteExchangeResponseDeserializer.class)
public class DeleteExchangeResponse {

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
    return new ToStringer(DeleteExchangeResponse.class).toString();
  }

  DeleteExchangeResponsePb toPb() {
    DeleteExchangeResponsePb pb = new DeleteExchangeResponsePb();

    return pb;
  }

  static DeleteExchangeResponse fromPb(DeleteExchangeResponsePb pb) {
    DeleteExchangeResponse model = new DeleteExchangeResponse();

    return model;
  }

  public static class DeleteExchangeResponseSerializer
      extends JsonSerializer<DeleteExchangeResponse> {
    @Override
    public void serialize(
        DeleteExchangeResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      DeleteExchangeResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class DeleteExchangeResponseDeserializer
      extends JsonDeserializer<DeleteExchangeResponse> {
    @Override
    public DeleteExchangeResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      DeleteExchangeResponsePb pb = mapper.readValue(p, DeleteExchangeResponsePb.class);
      return DeleteExchangeResponse.fromPb(pb);
    }
  }
}
