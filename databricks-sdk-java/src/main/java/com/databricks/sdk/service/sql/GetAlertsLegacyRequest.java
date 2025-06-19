// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

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

/** Get an alert */
@Generated
@JsonSerialize(using = GetAlertsLegacyRequest.GetAlertsLegacyRequestSerializer.class)
@JsonDeserialize(using = GetAlertsLegacyRequest.GetAlertsLegacyRequestDeserializer.class)
public class GetAlertsLegacyRequest {
  /** */
  private String alertId;

  public GetAlertsLegacyRequest setAlertId(String alertId) {
    this.alertId = alertId;
    return this;
  }

  public String getAlertId() {
    return alertId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GetAlertsLegacyRequest that = (GetAlertsLegacyRequest) o;
    return Objects.equals(alertId, that.alertId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alertId);
  }

  @Override
  public String toString() {
    return new ToStringer(GetAlertsLegacyRequest.class).add("alertId", alertId).toString();
  }

  GetAlertsLegacyRequestPb toPb() {
    GetAlertsLegacyRequestPb pb = new GetAlertsLegacyRequestPb();
    pb.setAlertId(alertId);

    return pb;
  }

  static GetAlertsLegacyRequest fromPb(GetAlertsLegacyRequestPb pb) {
    GetAlertsLegacyRequest model = new GetAlertsLegacyRequest();
    model.setAlertId(pb.getAlertId());

    return model;
  }

  public static class GetAlertsLegacyRequestSerializer
      extends JsonSerializer<GetAlertsLegacyRequest> {
    @Override
    public void serialize(
        GetAlertsLegacyRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      GetAlertsLegacyRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class GetAlertsLegacyRequestDeserializer
      extends JsonDeserializer<GetAlertsLegacyRequest> {
    @Override
    public GetAlertsLegacyRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      // The Codec is set by us in the SerDeUtils.java, and it is an ObjectMapper.
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      GetAlertsLegacyRequestPb pb = mapper.readValue(p, GetAlertsLegacyRequestPb.class);
      return GetAlertsLegacyRequest.fromPb(pb);
    }
  }
}
