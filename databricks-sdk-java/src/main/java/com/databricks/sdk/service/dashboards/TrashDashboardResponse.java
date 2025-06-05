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
@JsonSerialize(using = TrashDashboardResponse.TrashDashboardResponseSerializer.class)
@JsonDeserialize(using = TrashDashboardResponse.TrashDashboardResponseDeserializer.class)
public class TrashDashboardResponse {

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
    return new ToStringer(TrashDashboardResponse.class).toString();
  }

  TrashDashboardResponsePb toPb() {
    TrashDashboardResponsePb pb = new TrashDashboardResponsePb();

    return pb;
  }

  static TrashDashboardResponse fromPb(TrashDashboardResponsePb pb) {
    TrashDashboardResponse model = new TrashDashboardResponse();

    return model;
  }

  public static class TrashDashboardResponseSerializer
      extends JsonSerializer<TrashDashboardResponse> {
    @Override
    public void serialize(
        TrashDashboardResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      TrashDashboardResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class TrashDashboardResponseDeserializer
      extends JsonDeserializer<TrashDashboardResponse> {
    @Override
    public TrashDashboardResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      TrashDashboardResponsePb pb = mapper.readValue(p, TrashDashboardResponsePb.class);
      return TrashDashboardResponse.fromPb(pb);
    }
  }
}
