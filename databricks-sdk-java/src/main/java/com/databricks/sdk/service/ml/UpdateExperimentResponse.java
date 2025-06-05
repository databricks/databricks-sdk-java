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
@JsonSerialize(using = UpdateExperimentResponse.UpdateExperimentResponseSerializer.class)
@JsonDeserialize(using = UpdateExperimentResponse.UpdateExperimentResponseDeserializer.class)
public class UpdateExperimentResponse {

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
    return new ToStringer(UpdateExperimentResponse.class).toString();
  }

  UpdateExperimentResponsePb toPb() {
    UpdateExperimentResponsePb pb = new UpdateExperimentResponsePb();

    return pb;
  }

  static UpdateExperimentResponse fromPb(UpdateExperimentResponsePb pb) {
    UpdateExperimentResponse model = new UpdateExperimentResponse();

    return model;
  }

  public static class UpdateExperimentResponseSerializer
      extends JsonSerializer<UpdateExperimentResponse> {
    @Override
    public void serialize(
        UpdateExperimentResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      UpdateExperimentResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class UpdateExperimentResponseDeserializer
      extends JsonDeserializer<UpdateExperimentResponse> {
    @Override
    public UpdateExperimentResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      UpdateExperimentResponsePb pb = mapper.readValue(p, UpdateExperimentResponsePb.class);
      return UpdateExperimentResponse.fromPb(pb);
    }
  }
}
