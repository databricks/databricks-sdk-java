// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.vectorsearch;

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
@JsonSerialize(using = DeleteIndexResponse.DeleteIndexResponseSerializer.class)
@JsonDeserialize(using = DeleteIndexResponse.DeleteIndexResponseDeserializer.class)
public class DeleteIndexResponse {

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
    return new ToStringer(DeleteIndexResponse.class).toString();
  }

  DeleteIndexResponsePb toPb() {
    DeleteIndexResponsePb pb = new DeleteIndexResponsePb();

    return pb;
  }

  static DeleteIndexResponse fromPb(DeleteIndexResponsePb pb) {
    DeleteIndexResponse model = new DeleteIndexResponse();

    return model;
  }

  public static class DeleteIndexResponseSerializer extends JsonSerializer<DeleteIndexResponse> {
    @Override
    public void serialize(DeleteIndexResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      DeleteIndexResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class DeleteIndexResponseDeserializer
      extends JsonDeserializer<DeleteIndexResponse> {
    @Override
    public DeleteIndexResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      DeleteIndexResponsePb pb = mapper.readValue(p, DeleteIndexResponsePb.class);
      return DeleteIndexResponse.fromPb(pb);
    }
  }
}
