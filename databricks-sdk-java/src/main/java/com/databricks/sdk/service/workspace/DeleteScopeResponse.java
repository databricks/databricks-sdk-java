// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.workspace;

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
@JsonSerialize(using = DeleteScopeResponse.DeleteScopeResponseSerializer.class)
@JsonDeserialize(using = DeleteScopeResponse.DeleteScopeResponseDeserializer.class)
public class DeleteScopeResponse {

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
    return new ToStringer(DeleteScopeResponse.class).toString();
  }

  DeleteScopeResponsePb toPb() {
    DeleteScopeResponsePb pb = new DeleteScopeResponsePb();

    return pb;
  }

  static DeleteScopeResponse fromPb(DeleteScopeResponsePb pb) {
    DeleteScopeResponse model = new DeleteScopeResponse();

    return model;
  }

  public static class DeleteScopeResponseSerializer extends JsonSerializer<DeleteScopeResponse> {
    @Override
    public void serialize(DeleteScopeResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      DeleteScopeResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class DeleteScopeResponseDeserializer
      extends JsonDeserializer<DeleteScopeResponse> {
    @Override
    public DeleteScopeResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      DeleteScopeResponsePb pb = mapper.readValue(p, DeleteScopeResponsePb.class);
      return DeleteScopeResponse.fromPb(pb);
    }
  }
}
