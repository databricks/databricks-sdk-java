// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.settings;

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
@JsonSerialize(using = SetStatusResponse.SetStatusResponseSerializer.class)
@JsonDeserialize(using = SetStatusResponse.SetStatusResponseDeserializer.class)
public class SetStatusResponse {

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
    return new ToStringer(SetStatusResponse.class).toString();
  }

  SetStatusResponsePb toPb() {
    SetStatusResponsePb pb = new SetStatusResponsePb();

    return pb;
  }

  static SetStatusResponse fromPb(SetStatusResponsePb pb) {
    SetStatusResponse model = new SetStatusResponse();

    return model;
  }

  public static class SetStatusResponseSerializer extends JsonSerializer<SetStatusResponse> {
    @Override
    public void serialize(SetStatusResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      SetStatusResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class SetStatusResponseDeserializer extends JsonDeserializer<SetStatusResponse> {
    @Override
    public SetStatusResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      SetStatusResponsePb pb = mapper.readValue(p, SetStatusResponsePb.class);
      return SetStatusResponse.fromPb(pb);
    }
  }
}
