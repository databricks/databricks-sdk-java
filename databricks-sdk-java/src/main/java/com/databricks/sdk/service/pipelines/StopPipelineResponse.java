// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.pipelines;

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
@JsonSerialize(using = StopPipelineResponse.StopPipelineResponseSerializer.class)
@JsonDeserialize(using = StopPipelineResponse.StopPipelineResponseDeserializer.class)
public class StopPipelineResponse {

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
    return new ToStringer(StopPipelineResponse.class).toString();
  }

  StopPipelineResponsePb toPb() {
    StopPipelineResponsePb pb = new StopPipelineResponsePb();

    return pb;
  }

  static StopPipelineResponse fromPb(StopPipelineResponsePb pb) {
    StopPipelineResponse model = new StopPipelineResponse();

    return model;
  }

  public static class StopPipelineResponseSerializer extends JsonSerializer<StopPipelineResponse> {
    @Override
    public void serialize(
        StopPipelineResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      StopPipelineResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class StopPipelineResponseDeserializer
      extends JsonDeserializer<StopPipelineResponse> {
    @Override
    public StopPipelineResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      StopPipelineResponsePb pb = mapper.readValue(p, StopPipelineResponsePb.class);
      return StopPipelineResponse.fromPb(pb);
    }
  }
}
