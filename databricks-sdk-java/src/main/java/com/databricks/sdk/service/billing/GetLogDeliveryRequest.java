// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.billing;

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

/** Get log delivery configuration */
@Generated
@JsonSerialize(using = GetLogDeliveryRequest.GetLogDeliveryRequestSerializer.class)
@JsonDeserialize(using = GetLogDeliveryRequest.GetLogDeliveryRequestDeserializer.class)
public class GetLogDeliveryRequest {
  /** Databricks log delivery configuration ID */
  private String logDeliveryConfigurationId;

  public GetLogDeliveryRequest setLogDeliveryConfigurationId(String logDeliveryConfigurationId) {
    this.logDeliveryConfigurationId = logDeliveryConfigurationId;
    return this;
  }

  public String getLogDeliveryConfigurationId() {
    return logDeliveryConfigurationId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    GetLogDeliveryRequest that = (GetLogDeliveryRequest) o;
    return Objects.equals(logDeliveryConfigurationId, that.logDeliveryConfigurationId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(logDeliveryConfigurationId);
  }

  @Override
  public String toString() {
    return new ToStringer(GetLogDeliveryRequest.class)
        .add("logDeliveryConfigurationId", logDeliveryConfigurationId)
        .toString();
  }

  GetLogDeliveryRequestPb toPb() {
    GetLogDeliveryRequestPb pb = new GetLogDeliveryRequestPb();
    pb.setLogDeliveryConfigurationId(logDeliveryConfigurationId);

    return pb;
  }

  static GetLogDeliveryRequest fromPb(GetLogDeliveryRequestPb pb) {
    GetLogDeliveryRequest model = new GetLogDeliveryRequest();
    model.setLogDeliveryConfigurationId(pb.getLogDeliveryConfigurationId());

    return model;
  }

  public static class GetLogDeliveryRequestSerializer
      extends JsonSerializer<GetLogDeliveryRequest> {
    @Override
    public void serialize(
        GetLogDeliveryRequest value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      GetLogDeliveryRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class GetLogDeliveryRequestDeserializer
      extends JsonDeserializer<GetLogDeliveryRequest> {
    @Override
    public GetLogDeliveryRequest deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      GetLogDeliveryRequestPb pb = mapper.readValue(p, GetLogDeliveryRequestPb.class);
      return GetLogDeliveryRequest.fromPb(pb);
    }
  }
}
