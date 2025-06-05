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
@JsonSerialize(using = DeletePipelineResponse.DeletePipelineResponseSerializer.class)
@JsonDeserialize(using = DeletePipelineResponse.DeletePipelineResponseDeserializer.class)
public class DeletePipelineResponse {

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
    return new ToStringer(DeletePipelineResponse.class).toString();
  }

  DeletePipelineResponsePb toPb() {
    DeletePipelineResponsePb pb = new DeletePipelineResponsePb();

    return pb;
  }

  static DeletePipelineResponse fromPb(DeletePipelineResponsePb pb) {
    DeletePipelineResponse model = new DeletePipelineResponse();

    return model;
  }

  public static class DeletePipelineResponseSerializer
      extends JsonSerializer<DeletePipelineResponse> {
    @Override
    public void serialize(
        DeletePipelineResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      DeletePipelineResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class DeletePipelineResponseDeserializer
      extends JsonDeserializer<DeletePipelineResponse> {
    @Override
    public DeletePipelineResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      DeletePipelineResponsePb pb = mapper.readValue(p, DeletePipelineResponsePb.class);
      return DeletePipelineResponse.fromPb(pb);
    }
  }
}
