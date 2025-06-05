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
@JsonSerialize(using = DeleteExchangeFilterResponse.DeleteExchangeFilterResponseSerializer.class)
@JsonDeserialize(
    using = DeleteExchangeFilterResponse.DeleteExchangeFilterResponseDeserializer.class)
public class DeleteExchangeFilterResponse {

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
    return new ToStringer(DeleteExchangeFilterResponse.class).toString();
  }

  DeleteExchangeFilterResponsePb toPb() {
    DeleteExchangeFilterResponsePb pb = new DeleteExchangeFilterResponsePb();

    return pb;
  }

  static DeleteExchangeFilterResponse fromPb(DeleteExchangeFilterResponsePb pb) {
    DeleteExchangeFilterResponse model = new DeleteExchangeFilterResponse();

    return model;
  }

  public static class DeleteExchangeFilterResponseSerializer
      extends JsonSerializer<DeleteExchangeFilterResponse> {
    @Override
    public void serialize(
        DeleteExchangeFilterResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      DeleteExchangeFilterResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class DeleteExchangeFilterResponseDeserializer
      extends JsonDeserializer<DeleteExchangeFilterResponse> {
    @Override
    public DeleteExchangeFilterResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      DeleteExchangeFilterResponsePb pb = mapper.readValue(p, DeleteExchangeFilterResponsePb.class);
      return DeleteExchangeFilterResponse.fromPb(pb);
    }
  }
}
