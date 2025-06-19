// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.dashboards;

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
@JsonSerialize(using = DeleteScheduleResponse.DeleteScheduleResponseSerializer.class)
@JsonDeserialize(using = DeleteScheduleResponse.DeleteScheduleResponseDeserializer.class)
public class DeleteScheduleResponse {

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
    return new ToStringer(DeleteScheduleResponse.class).toString();
  }

  DeleteScheduleResponsePb toPb() {
    DeleteScheduleResponsePb pb = new DeleteScheduleResponsePb();

    return pb;
  }

  static DeleteScheduleResponse fromPb(DeleteScheduleResponsePb pb) {
    DeleteScheduleResponse model = new DeleteScheduleResponse();

    return model;
  }

  public static class DeleteScheduleResponseSerializer
      extends JsonSerializer<DeleteScheduleResponse> {
    @Override
    public void serialize(
        DeleteScheduleResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      DeleteScheduleResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class DeleteScheduleResponseDeserializer
      extends JsonDeserializer<DeleteScheduleResponse> {
    @Override
    public DeleteScheduleResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      DeleteScheduleResponsePb pb = mapper.readValue(p, DeleteScheduleResponsePb.class);
      return DeleteScheduleResponse.fromPb(pb);
    }
  }
}
