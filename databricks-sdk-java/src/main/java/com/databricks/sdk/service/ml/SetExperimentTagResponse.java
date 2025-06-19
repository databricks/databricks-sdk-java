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
@JsonSerialize(using = SetExperimentTagResponse.SetExperimentTagResponseSerializer.class)
@JsonDeserialize(using = SetExperimentTagResponse.SetExperimentTagResponseDeserializer.class)
public class SetExperimentTagResponse {

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
    return new ToStringer(SetExperimentTagResponse.class).toString();
  }

  SetExperimentTagResponsePb toPb() {
    SetExperimentTagResponsePb pb = new SetExperimentTagResponsePb();

    return pb;
  }

  static SetExperimentTagResponse fromPb(SetExperimentTagResponsePb pb) {
    SetExperimentTagResponse model = new SetExperimentTagResponse();

    return model;
  }

  public static class SetExperimentTagResponseSerializer
      extends JsonSerializer<SetExperimentTagResponse> {
    @Override
    public void serialize(
        SetExperimentTagResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      SetExperimentTagResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class SetExperimentTagResponseDeserializer
      extends JsonDeserializer<SetExperimentTagResponse> {
    @Override
    public SetExperimentTagResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      SetExperimentTagResponsePb pb = mapper.readValue(p, SetExperimentTagResponsePb.class);
      return SetExperimentTagResponse.fromPb(pb);
    }
  }
}
