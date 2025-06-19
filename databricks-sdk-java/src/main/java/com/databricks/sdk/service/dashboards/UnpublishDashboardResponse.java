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
@JsonSerialize(using = UnpublishDashboardResponse.UnpublishDashboardResponseSerializer.class)
@JsonDeserialize(using = UnpublishDashboardResponse.UnpublishDashboardResponseDeserializer.class)
public class UnpublishDashboardResponse {

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
    return new ToStringer(UnpublishDashboardResponse.class).toString();
  }

  UnpublishDashboardResponsePb toPb() {
    UnpublishDashboardResponsePb pb = new UnpublishDashboardResponsePb();

    return pb;
  }

  static UnpublishDashboardResponse fromPb(UnpublishDashboardResponsePb pb) {
    UnpublishDashboardResponse model = new UnpublishDashboardResponse();

    return model;
  }

  public static class UnpublishDashboardResponseSerializer
      extends JsonSerializer<UnpublishDashboardResponse> {
    @Override
    public void serialize(
        UnpublishDashboardResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      UnpublishDashboardResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class UnpublishDashboardResponseDeserializer
      extends JsonDeserializer<UnpublishDashboardResponse> {
    @Override
    public UnpublishDashboardResponse deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      UnpublishDashboardResponsePb pb = mapper.readValue(p, UnpublishDashboardResponsePb.class);
      return UnpublishDashboardResponse.fromPb(pb);
    }
  }
}
