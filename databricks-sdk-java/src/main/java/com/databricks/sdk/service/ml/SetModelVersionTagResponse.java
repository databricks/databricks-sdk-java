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
@JsonSerialize(using = SetModelVersionTagResponse.SetModelVersionTagResponseSerializer.class)
@JsonDeserialize(using = SetModelVersionTagResponse.SetModelVersionTagResponseDeserializer.class)
public class SetModelVersionTagResponse {

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
    return new ToStringer(SetModelVersionTagResponse.class).toString();
  }

  SetModelVersionTagResponsePb toPb() {
    SetModelVersionTagResponsePb pb = new SetModelVersionTagResponsePb();

    return pb;
  }

  static SetModelVersionTagResponse fromPb(SetModelVersionTagResponsePb pb) {
    SetModelVersionTagResponse model = new SetModelVersionTagResponse();

    return model;
  }

  public static class SetModelVersionTagResponseSerializer
      extends JsonSerializer<SetModelVersionTagResponse> {
    @Override
    public void serialize(
        SetModelVersionTagResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      SetModelVersionTagResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class SetModelVersionTagResponseDeserializer
      extends JsonDeserializer<SetModelVersionTagResponse> {
    @Override
    public SetModelVersionTagResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      SetModelVersionTagResponsePb pb = mapper.readValue(p, SetModelVersionTagResponsePb.class);
      return SetModelVersionTagResponse.fromPb(pb);
    }
  }
}
