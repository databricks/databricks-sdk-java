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
@JsonSerialize(using = DeleteCredentialsResponse.DeleteCredentialsResponseSerializer.class)
@JsonDeserialize(using = DeleteCredentialsResponse.DeleteCredentialsResponseDeserializer.class)
public class DeleteCredentialsResponse {

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
    return new ToStringer(DeleteCredentialsResponse.class).toString();
  }

  DeleteCredentialsResponsePb toPb() {
    DeleteCredentialsResponsePb pb = new DeleteCredentialsResponsePb();

    return pb;
  }

  static DeleteCredentialsResponse fromPb(DeleteCredentialsResponsePb pb) {
    DeleteCredentialsResponse model = new DeleteCredentialsResponse();

    return model;
  }

  public static class DeleteCredentialsResponseSerializer
      extends JsonSerializer<DeleteCredentialsResponse> {
    @Override
    public void serialize(
        DeleteCredentialsResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      DeleteCredentialsResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class DeleteCredentialsResponseDeserializer
      extends JsonDeserializer<DeleteCredentialsResponse> {
    @Override
    public DeleteCredentialsResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      DeleteCredentialsResponsePb pb = mapper.readValue(p, DeleteCredentialsResponsePb.class);
      return DeleteCredentialsResponse.fromPb(pb);
    }
  }
}
