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
@JsonSerialize(using = AssignResponse.AssignResponseSerializer.class)
@JsonDeserialize(using = AssignResponse.AssignResponseDeserializer.class)
public class AssignResponse {

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
    return new ToStringer(AssignResponse.class).toString();
  }

  AssignResponsePb toPb() {
    AssignResponsePb pb = new AssignResponsePb();

    return pb;
  }

  static AssignResponse fromPb(AssignResponsePb pb) {
    AssignResponse model = new AssignResponse();

    return model;
  }

  public static class AssignResponseSerializer extends JsonSerializer<AssignResponse> {
    @Override
    public void serialize(AssignResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      AssignResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class AssignResponseDeserializer extends JsonDeserializer<AssignResponse> {
    @Override
    public AssignResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      AssignResponsePb pb = mapper.readValue(p, AssignResponsePb.class);
      return AssignResponse.fromPb(pb);
    }
  }
}
