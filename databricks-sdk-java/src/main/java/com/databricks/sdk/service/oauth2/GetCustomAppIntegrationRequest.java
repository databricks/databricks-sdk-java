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

/** Get OAuth Custom App Integration */
@Generated
@JsonSerialize(
    using = GetCustomAppIntegrationRequest.GetCustomAppIntegrationRequestSerializer.class)
@JsonDeserialize(
    using = GetCustomAppIntegrationRequest.GetCustomAppIntegrationRequestDeserializer.class)
public class GetCustomAppIntegrationRequest {
  /** The OAuth app integration ID. */
  private String integrationId;

  public GetCustomAppIntegrationRequest setIntegrationId(String integrationId) {
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
    GetCustomAppIntegrationRequest that = (GetCustomAppIntegrationRequest) o;
    return Objects.equals(integrationId, that.integrationId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(integrationId);
  }

  @Override
  public String toString() {
    return new ToStringer(GetCustomAppIntegrationRequest.class)
        .add("integrationId", integrationId)
        .toString();
  }

  GetCustomAppIntegrationRequestPb toPb() {
    GetCustomAppIntegrationRequestPb pb = new GetCustomAppIntegrationRequestPb();
    pb.setIntegrationId(integrationId);

    return pb;
  }

  static GetCustomAppIntegrationRequest fromPb(GetCustomAppIntegrationRequestPb pb) {
    GetCustomAppIntegrationRequest model = new GetCustomAppIntegrationRequest();
    model.setIntegrationId(pb.getIntegrationId());

    return model;
  }

  public static class GetCustomAppIntegrationRequestSerializer
      extends JsonSerializer<GetCustomAppIntegrationRequest> {
    @Override
    public void serialize(
        GetCustomAppIntegrationRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      GetCustomAppIntegrationRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class GetCustomAppIntegrationRequestDeserializer
      extends JsonDeserializer<GetCustomAppIntegrationRequest> {
    @Override
    public GetCustomAppIntegrationRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      GetCustomAppIntegrationRequestPb pb =
          mapper.readValue(p, GetCustomAppIntegrationRequestPb.class);
      return GetCustomAppIntegrationRequest.fromPb(pb);
    }
  }
}
