// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

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
@JsonSerialize(using = UpdateAssignmentResponse.UpdateAssignmentResponseSerializer.class)
@JsonDeserialize(using = UpdateAssignmentResponse.UpdateAssignmentResponseDeserializer.class)
public class UpdateAssignmentResponse {

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
    return new ToStringer(UpdateAssignmentResponse.class).toString();
  }

  UpdateAssignmentResponsePb toPb() {
    UpdateAssignmentResponsePb pb = new UpdateAssignmentResponsePb();

    return pb;
  }

  static UpdateAssignmentResponse fromPb(UpdateAssignmentResponsePb pb) {
    UpdateAssignmentResponse model = new UpdateAssignmentResponse();

    return model;
  }

  public static class UpdateAssignmentResponseSerializer
      extends JsonSerializer<UpdateAssignmentResponse> {
    @Override
    public void serialize(
        UpdateAssignmentResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      UpdateAssignmentResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class UpdateAssignmentResponseDeserializer
      extends JsonDeserializer<UpdateAssignmentResponse> {
    @Override
    public UpdateAssignmentResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      UpdateAssignmentResponsePb pb = mapper.readValue(p, UpdateAssignmentResponsePb.class);
      return UpdateAssignmentResponse.fromPb(pb);
    }
  }
}
