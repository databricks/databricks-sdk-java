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

@Generated
@JsonSerialize(
    using =
        UpdateLogDeliveryConfigurationStatusRequest
            .UpdateLogDeliveryConfigurationStatusRequestSerializer.class)
@JsonDeserialize(
    using =
        UpdateLogDeliveryConfigurationStatusRequest
            .UpdateLogDeliveryConfigurationStatusRequestDeserializer.class)
public class UpdateLogDeliveryConfigurationStatusRequest {
  /** Databricks log delivery configuration ID */
  private String logDeliveryConfigurationId;

  /**
   * Status of log delivery configuration. Set to `ENABLED` (enabled) or `DISABLED` (disabled).
   * Defaults to `ENABLED`. You can [enable or disable the
   * configuration](#operation/patch-log-delivery-config-status) later. Deletion of a configuration
   * is not supported, so disable a log delivery configuration that is no longer needed.
   */
  private LogDeliveryConfigStatus status;

  public UpdateLogDeliveryConfigurationStatusRequest setLogDeliveryConfigurationId(
      String logDeliveryConfigurationId) {
    this.logDeliveryConfigurationId = logDeliveryConfigurationId;
    return this;
  }

  public String getLogDeliveryConfigurationId() {
    return logDeliveryConfigurationId;
  }

  public UpdateLogDeliveryConfigurationStatusRequest setStatus(LogDeliveryConfigStatus status) {
    this.status = status;
    return this;
  }

  public LogDeliveryConfigStatus getStatus() {
    return status;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    UpdateLogDeliveryConfigurationStatusRequest that =
        (UpdateLogDeliveryConfigurationStatusRequest) o;
    return Objects.equals(logDeliveryConfigurationId, that.logDeliveryConfigurationId)
        && Objects.equals(status, that.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(logDeliveryConfigurationId, status);
  }

  @Override
  public String toString() {
    return new ToStringer(UpdateLogDeliveryConfigurationStatusRequest.class)
        .add("logDeliveryConfigurationId", logDeliveryConfigurationId)
        .add("status", status)
        .toString();
  }

  UpdateLogDeliveryConfigurationStatusRequestPb toPb() {
    UpdateLogDeliveryConfigurationStatusRequestPb pb =
        new UpdateLogDeliveryConfigurationStatusRequestPb();
    pb.setLogDeliveryConfigurationId(logDeliveryConfigurationId);
    pb.setStatus(status);

    return pb;
  }

  static UpdateLogDeliveryConfigurationStatusRequest fromPb(
      UpdateLogDeliveryConfigurationStatusRequestPb pb) {
    UpdateLogDeliveryConfigurationStatusRequest model =
        new UpdateLogDeliveryConfigurationStatusRequest();
    model.setLogDeliveryConfigurationId(pb.getLogDeliveryConfigurationId());
    model.setStatus(pb.getStatus());

    return model;
  }

  public static class UpdateLogDeliveryConfigurationStatusRequestSerializer
      extends JsonSerializer<UpdateLogDeliveryConfigurationStatusRequest> {
    @Override
    public void serialize(
        UpdateLogDeliveryConfigurationStatusRequest value,
        JsonGenerator gen,
        SerializerProvider provider)
        throws IOException {
      UpdateLogDeliveryConfigurationStatusRequestPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class UpdateLogDeliveryConfigurationStatusRequestDeserializer
      extends JsonDeserializer<UpdateLogDeliveryConfigurationStatusRequest> {
    @Override
    public UpdateLogDeliveryConfigurationStatusRequest deserialize(
        JsonParser p, DeserializationContext ctxt) throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      UpdateLogDeliveryConfigurationStatusRequestPb pb =
          mapper.readValue(p, UpdateLogDeliveryConfigurationStatusRequestPb.class);
      return UpdateLogDeliveryConfigurationStatusRequest.fromPb(pb);
    }
  }
}
