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
@JsonSerialize(using = DeleteExperimentResponse.DeleteExperimentResponseSerializer.class)
@JsonDeserialize(using = DeleteExperimentResponse.DeleteExperimentResponseDeserializer.class)
public class DeleteExperimentResponse {

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
    return new ToStringer(DeleteExperimentResponse.class).toString();
  }

  DeleteExperimentResponsePb toPb() {
    DeleteExperimentResponsePb pb = new DeleteExperimentResponsePb();

    return pb;
  }

  static DeleteExperimentResponse fromPb(DeleteExperimentResponsePb pb) {
    DeleteExperimentResponse model = new DeleteExperimentResponse();

    return model;
  }

  public static class DeleteExperimentResponseSerializer
      extends JsonSerializer<DeleteExperimentResponse> {
    @Override
    public void serialize(
        DeleteExperimentResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      DeleteExperimentResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class DeleteExperimentResponseDeserializer
      extends JsonDeserializer<DeleteExperimentResponse> {
    @Override
    public DeleteExperimentResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      DeleteExperimentResponsePb pb = mapper.readValue(p, DeleteExperimentResponsePb.class);
      return DeleteExperimentResponse.fromPb(pb);
    }
  }
}
