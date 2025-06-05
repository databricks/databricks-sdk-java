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
@JsonSerialize(using = RestoreExperimentResponse.RestoreExperimentResponseSerializer.class)
@JsonDeserialize(using = RestoreExperimentResponse.RestoreExperimentResponseDeserializer.class)
public class RestoreExperimentResponse {

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
    return new ToStringer(RestoreExperimentResponse.class).toString();
  }

  RestoreExperimentResponsePb toPb() {
    RestoreExperimentResponsePb pb = new RestoreExperimentResponsePb();

    return pb;
  }

  static RestoreExperimentResponse fromPb(RestoreExperimentResponsePb pb) {
    RestoreExperimentResponse model = new RestoreExperimentResponse();

    return model;
  }

  public static class RestoreExperimentResponseSerializer
      extends JsonSerializer<RestoreExperimentResponse> {
    @Override
    public void serialize(
        RestoreExperimentResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      RestoreExperimentResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class RestoreExperimentResponseDeserializer
      extends JsonDeserializer<RestoreExperimentResponse> {
    @Override
    public RestoreExperimentResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      RestoreExperimentResponsePb pb = mapper.readValue(p, RestoreExperimentResponsePb.class);
      return RestoreExperimentResponse.fromPb(pb);
    }
  }
}
