// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.qualitymonitorv2;

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
@JsonSerialize(using = DeleteQualityMonitorResponse.DeleteQualityMonitorResponseSerializer.class)
@JsonDeserialize(
    using = DeleteQualityMonitorResponse.DeleteQualityMonitorResponseDeserializer.class)
public class DeleteQualityMonitorResponse {

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
    return new ToStringer(DeleteQualityMonitorResponse.class).toString();
  }

  DeleteQualityMonitorResponsePb toPb() {
    DeleteQualityMonitorResponsePb pb = new DeleteQualityMonitorResponsePb();

    return pb;
  }

  static DeleteQualityMonitorResponse fromPb(DeleteQualityMonitorResponsePb pb) {
    DeleteQualityMonitorResponse model = new DeleteQualityMonitorResponse();

    return model;
  }

  public static class DeleteQualityMonitorResponseSerializer
      extends JsonSerializer<DeleteQualityMonitorResponse> {
    @Override
    public void serialize(
        DeleteQualityMonitorResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      DeleteQualityMonitorResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class DeleteQualityMonitorResponseDeserializer
      extends JsonDeserializer<DeleteQualityMonitorResponse> {
    @Override
    public DeleteQualityMonitorResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      DeleteQualityMonitorResponsePb pb = mapper.readValue(p, DeleteQualityMonitorResponsePb.class);
      return DeleteQualityMonitorResponse.fromPb(pb);
    }
  }
}
