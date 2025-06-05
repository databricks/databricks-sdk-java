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
@JsonSerialize(using = DeleteModelVersionResponse.DeleteModelVersionResponseSerializer.class)
@JsonDeserialize(using = DeleteModelVersionResponse.DeleteModelVersionResponseDeserializer.class)
public class DeleteModelVersionResponse {

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
    return new ToStringer(DeleteModelVersionResponse.class).toString();
  }

  DeleteModelVersionResponsePb toPb() {
    DeleteModelVersionResponsePb pb = new DeleteModelVersionResponsePb();

    return pb;
  }

  static DeleteModelVersionResponse fromPb(DeleteModelVersionResponsePb pb) {
    DeleteModelVersionResponse model = new DeleteModelVersionResponse();

    return model;
  }

  public static class DeleteModelVersionResponseSerializer
      extends JsonSerializer<DeleteModelVersionResponse> {
    @Override
    public void serialize(
        DeleteModelVersionResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      DeleteModelVersionResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class DeleteModelVersionResponseDeserializer
      extends JsonDeserializer<DeleteModelVersionResponse> {
    @Override
    public DeleteModelVersionResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      DeleteModelVersionResponsePb pb = mapper.readValue(p, DeleteModelVersionResponsePb.class);
      return DeleteModelVersionResponse.fromPb(pb);
    }
  }
}
