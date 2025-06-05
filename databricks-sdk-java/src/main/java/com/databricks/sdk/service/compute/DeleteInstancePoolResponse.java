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
@JsonSerialize(using = DeleteInstancePoolResponse.DeleteInstancePoolResponseSerializer.class)
@JsonDeserialize(using = DeleteInstancePoolResponse.DeleteInstancePoolResponseDeserializer.class)
public class DeleteInstancePoolResponse {

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
    return new ToStringer(DeleteInstancePoolResponse.class).toString();
  }

  DeleteInstancePoolResponsePb toPb() {
    DeleteInstancePoolResponsePb pb = new DeleteInstancePoolResponsePb();

    return pb;
  }

  static DeleteInstancePoolResponse fromPb(DeleteInstancePoolResponsePb pb) {
    DeleteInstancePoolResponse model = new DeleteInstancePoolResponse();

    return model;
  }

  public static class DeleteInstancePoolResponseSerializer
      extends JsonSerializer<DeleteInstancePoolResponse> {
    @Override
    public void serialize(
        DeleteInstancePoolResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      DeleteInstancePoolResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class DeleteInstancePoolResponseDeserializer
      extends JsonDeserializer<DeleteInstancePoolResponse> {
    @Override
    public DeleteInstancePoolResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      DeleteInstancePoolResponsePb pb = mapper.readValue(p, DeleteInstancePoolResponsePb.class);
      return DeleteInstancePoolResponse.fromPb(pb);
    }
  }
}
