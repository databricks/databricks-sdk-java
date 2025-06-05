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
@JsonSerialize(using = DeleteAliasResponse.DeleteAliasResponseSerializer.class)
@JsonDeserialize(using = DeleteAliasResponse.DeleteAliasResponseDeserializer.class)
public class DeleteAliasResponse {

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
    return new ToStringer(DeleteAliasResponse.class).toString();
  }

  DeleteAliasResponsePb toPb() {
    DeleteAliasResponsePb pb = new DeleteAliasResponsePb();

    return pb;
  }

  static DeleteAliasResponse fromPb(DeleteAliasResponsePb pb) {
    DeleteAliasResponse model = new DeleteAliasResponse();

    return model;
  }

  public static class DeleteAliasResponseSerializer extends JsonSerializer<DeleteAliasResponse> {
    @Override
    public void serialize(DeleteAliasResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      DeleteAliasResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class DeleteAliasResponseDeserializer
      extends JsonDeserializer<DeleteAliasResponse> {
    @Override
    public DeleteAliasResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      DeleteAliasResponsePb pb = mapper.readValue(p, DeleteAliasResponsePb.class);
      return DeleteAliasResponse.fromPb(pb);
    }
  }
}
