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
@JsonSerialize(
    using =
        GetPublishedDashboardEmbeddedResponse.GetPublishedDashboardEmbeddedResponseSerializer.class)
@JsonDeserialize(
    using =
        GetPublishedDashboardEmbeddedResponse.GetPublishedDashboardEmbeddedResponseDeserializer
            .class)
public class GetPublishedDashboardEmbeddedResponse {

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
    return new ToStringer(GetPublishedDashboardEmbeddedResponse.class).toString();
  }

  GetPublishedDashboardEmbeddedResponsePb toPb() {
    GetPublishedDashboardEmbeddedResponsePb pb = new GetPublishedDashboardEmbeddedResponsePb();

    return pb;
  }

  static GetPublishedDashboardEmbeddedResponse fromPb(GetPublishedDashboardEmbeddedResponsePb pb) {
    GetPublishedDashboardEmbeddedResponse model = new GetPublishedDashboardEmbeddedResponse();

    return model;
  }

  public static class GetPublishedDashboardEmbeddedResponseSerializer
      extends JsonSerializer<GetPublishedDashboardEmbeddedResponse> {
    @Override
    public void serialize(
        GetPublishedDashboardEmbeddedResponse value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      GetPublishedDashboardEmbeddedResponsePb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class GetPublishedDashboardEmbeddedResponseDeserializer
      extends JsonDeserializer<GetPublishedDashboardEmbeddedResponse> {
    @Override
    public GetPublishedDashboardEmbeddedResponse deserialize(
        JsonParser p, DeserializationContext ctxt) throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      GetPublishedDashboardEmbeddedResponsePb pb =
          mapper.readValue(p, GetPublishedDashboardEmbeddedResponsePb.class);
      return GetPublishedDashboardEmbeddedResponse.fromPb(pb);
    }
  }
}
