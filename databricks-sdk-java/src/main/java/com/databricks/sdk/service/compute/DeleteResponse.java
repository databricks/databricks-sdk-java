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
@JsonSerialize(using = DeleteResponse.DeleteResponseSerializer.class)
@JsonDeserialize(using = DeleteResponse.DeleteResponseDeserializer.class)
public class DeleteResponse {

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
    return new ToStringer(DeleteResponse.class).toString();
  }

  DeleteResponsePb toPb() {
    DeleteResponsePb pb = new DeleteResponsePb();

    return pb;
  }

  static DeleteResponse fromPb(DeleteResponsePb pb) {
    DeleteResponse model = new DeleteResponse();

    return model;
  }

  public static class DeleteResponseSerializer extends JsonSerializer<DeleteResponse> {
    @Override
    public void serialize(DeleteResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      DeleteResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class DeleteResponseDeserializer extends JsonDeserializer<DeleteResponse> {
    @Override
    public DeleteResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      DeleteResponsePb pb = mapper.readValue(p, DeleteResponsePb.class);
      return DeleteResponse.fromPb(pb);
    }
  }
}
