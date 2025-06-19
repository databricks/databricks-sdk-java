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
@JsonSerialize(using = EditPipelineResponse.EditPipelineResponseSerializer.class)
@JsonDeserialize(using = EditPipelineResponse.EditPipelineResponseDeserializer.class)
public class EditPipelineResponse {

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
    return new ToStringer(EditPipelineResponse.class).toString();
  }

  EditPipelineResponsePb toPb() {
    EditPipelineResponsePb pb = new EditPipelineResponsePb();

    return pb;
  }

  static EditPipelineResponse fromPb(EditPipelineResponsePb pb) {
    EditPipelineResponse model = new EditPipelineResponse();

    return model;
  }

  public static class EditPipelineResponseSerializer extends JsonSerializer<EditPipelineResponse> {
    @Override
    public void serialize(
        EditPipelineResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      EditPipelineResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class EditPipelineResponseDeserializer
      extends JsonDeserializer<EditPipelineResponse> {
    @Override
    public EditPipelineResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      EditPipelineResponsePb pb = mapper.readValue(p, EditPipelineResponsePb.class);
      return EditPipelineResponse.fromPb(pb);
    }
  }
}
