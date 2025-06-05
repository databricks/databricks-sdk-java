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
@JsonSerialize(using = DeleteListingResponse.DeleteListingResponseSerializer.class)
@JsonDeserialize(using = DeleteListingResponse.DeleteListingResponseDeserializer.class)
public class DeleteListingResponse {

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
    return new ToStringer(DeleteListingResponse.class).toString();
  }

  DeleteListingResponsePb toPb() {
    DeleteListingResponsePb pb = new DeleteListingResponsePb();

    return pb;
  }

  static DeleteListingResponse fromPb(DeleteListingResponsePb pb) {
    DeleteListingResponse model = new DeleteListingResponse();

    return model;
  }

  public static class DeleteListingResponseSerializer
      extends JsonSerializer<DeleteListingResponse> {
    @Override
    public void serialize(
        DeleteListingResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      DeleteListingResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class DeleteListingResponseDeserializer
      extends JsonDeserializer<DeleteListingResponse> {
    @Override
    public DeleteListingResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      DeleteListingResponsePb pb = mapper.readValue(p, DeleteListingResponsePb.class);
      return DeleteListingResponse.fromPb(pb);
    }
  }
}
