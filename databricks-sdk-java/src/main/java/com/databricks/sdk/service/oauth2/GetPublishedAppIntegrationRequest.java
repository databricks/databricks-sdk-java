// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.oauth2;

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

/** Get OAuth Published App Integration */
@Generated
@JsonSerialize(
    using = GetPublishedAppIntegrationRequest.GetPublishedAppIntegrationRequestSerializer.class)
@JsonDeserialize(
    using = GetPublishedAppIntegrationRequest.GetPublishedAppIntegrationRequestDeserializer.class)
public class GetPublishedAppIntegrationRequest {
  /** */
  private String integrationId;

  public GetPublishedAppIntegrationRequest setIntegrationId(String integrationId) {
    this.integrationId = integrationId;
    return this;
  }

  public String getIntegrationId() {
    return integrationId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GetPublishedAppIntegrationRequest that = (GetPublishedAppIntegrationRequest) o;
    return Objects.equals(integrationId, that.integrationId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(integrationId);
  }

  @Override
  public String toString() {
    return new ToStringer(GetPublishedAppIntegrationRequest.class)
        .add("integrationId", integrationId)
        .toString();
  }

  GetPublishedAppIntegrationRequestPb toPb() {
    GetPublishedAppIntegrationRequestPb pb = new GetPublishedAppIntegrationRequestPb();
    pb.setIntegrationId(integrationId);

    return pb;
  }

  static GetPublishedAppIntegrationRequest fromPb(GetPublishedAppIntegrationRequestPb pb) {
    GetPublishedAppIntegrationRequest model = new GetPublishedAppIntegrationRequest();
    model.setIntegrationId(pb.getIntegrationId());

    return model;
  }

  public static class GetPublishedAppIntegrationRequestSerializer
      extends JsonSerializer<GetPublishedAppIntegrationRequest> {
    @Override
    public void serialize(
        GetPublishedAppIntegrationRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      GetPublishedAppIntegrationRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class GetPublishedAppIntegrationRequestDeserializer
      extends JsonDeserializer<GetPublishedAppIntegrationRequest> {
    @Override
    public GetPublishedAppIntegrationRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      GetPublishedAppIntegrationRequestPb pb =
          mapper.readValue(p, GetPublishedAppIntegrationRequestPb.class);
      return GetPublishedAppIntegrationRequest.fromPb(pb);
    }
  }
}
