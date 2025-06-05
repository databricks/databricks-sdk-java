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
@JsonSerialize(using = SetTagResponse.SetTagResponseSerializer.class)
@JsonDeserialize(using = SetTagResponse.SetTagResponseDeserializer.class)
public class SetTagResponse {

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
    return new ToStringer(SetTagResponse.class).toString();
  }

  SetTagResponsePb toPb() {
    SetTagResponsePb pb = new SetTagResponsePb();

    return pb;
  }

  static SetTagResponse fromPb(SetTagResponsePb pb) {
    SetTagResponse model = new SetTagResponse();

    return model;
  }

  public static class SetTagResponseSerializer extends JsonSerializer<SetTagResponse> {
    @Override
    public void serialize(SetTagResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      SetTagResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class SetTagResponseDeserializer extends JsonDeserializer<SetTagResponse> {
    @Override
    public SetTagResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      SetTagResponsePb pb = mapper.readValue(p, SetTagResponsePb.class);
      return SetTagResponse.fromPb(pb);
    }
  }
}
