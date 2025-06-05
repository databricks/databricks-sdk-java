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
@JsonSerialize(using = UpdateCredentialsResponse.UpdateCredentialsResponseSerializer.class)
@JsonDeserialize(using = UpdateCredentialsResponse.UpdateCredentialsResponseDeserializer.class)
public class UpdateCredentialsResponse {

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
    return new ToStringer(UpdateCredentialsResponse.class).toString();
  }

  UpdateCredentialsResponsePb toPb() {
    UpdateCredentialsResponsePb pb = new UpdateCredentialsResponsePb();

    return pb;
  }

  static UpdateCredentialsResponse fromPb(UpdateCredentialsResponsePb pb) {
    UpdateCredentialsResponse model = new UpdateCredentialsResponse();

    return model;
  }

  public static class UpdateCredentialsResponseSerializer
      extends JsonSerializer<UpdateCredentialsResponse> {
    @Override
    public void serialize(
        UpdateCredentialsResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      UpdateCredentialsResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class UpdateCredentialsResponseDeserializer
      extends JsonDeserializer<UpdateCredentialsResponse> {
    @Override
    public UpdateCredentialsResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      UpdateCredentialsResponsePb pb = mapper.readValue(p, UpdateCredentialsResponsePb.class);
      return UpdateCredentialsResponse.fromPb(pb);
    }
  }
}
