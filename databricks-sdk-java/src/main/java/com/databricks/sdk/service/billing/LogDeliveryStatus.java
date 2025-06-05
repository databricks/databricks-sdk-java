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

/** Databricks log delivery status. */
@Generated
@JsonSerialize(using = LogDeliveryStatus.LogDeliveryStatusSerializer.class)
@JsonDeserialize(using = LogDeliveryStatus.LogDeliveryStatusDeserializer.class)
public class LogDeliveryStatus {
  /** The UTC time for the latest log delivery attempt. */
  private String lastAttemptTime;

  /** The UTC time for the latest successful log delivery. */
  private String lastSuccessfulAttemptTime;

  /**
   * Informative message about the latest log delivery attempt. If the log delivery fails with
   * USER_FAILURE, error details will be provided for fixing misconfigurations in cloud permissions.
   */
  private String message;

  /**
   * The status string for log delivery. Possible values are: * `CREATED`: There were no log
   * delivery attempts since the config was created. * `SUCCEEDED`: The latest attempt of log
   * delivery has succeeded completely. * `USER_FAILURE`: The latest attempt of log delivery failed
   * because of misconfiguration of customer provided permissions on role or storage. *
   * `SYSTEM_FAILURE`: The latest attempt of log delivery failed because of an Databricks internal
   * error. Contact support if it doesn't go away soon. * `NOT_FOUND`: The log delivery status as
   * the configuration has been disabled since the release of this feature or there are no
   * workspaces in the account.
   */
  private DeliveryStatus status;

  public LogDeliveryStatus setLastAttemptTime(String lastAttemptTime) {
    this.lastAttemptTime = lastAttemptTime;
    return this;
  }

  public String getLastAttemptTime() {
    return lastAttemptTime;
  }

  public LogDeliveryStatus setLastSuccessfulAttemptTime(String lastSuccessfulAttemptTime) {
    this.lastSuccessfulAttemptTime = lastSuccessfulAttemptTime;
    return this;
  }

  public String getLastSuccessfulAttemptTime() {
    return lastSuccessfulAttemptTime;
  }

  public LogDeliveryStatus setMessage(String message) {
    this.message = message;
    return this;
  }

  public String getMessage() {
    return message;
  }

  public LogDeliveryStatus setStatus(DeliveryStatus status) {
    this.status = status;
    return this;
  }

  public DeliveryStatus getStatus() {
    return status;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    LogDeliveryStatus that = (LogDeliveryStatus) o;
    return Objects.equals(lastAttemptTime, that.lastAttemptTime)
        && Objects.equals(lastSuccessfulAttemptTime, that.lastSuccessfulAttemptTime)
        && Objects.equals(message, that.message)
        && Objects.equals(status, that.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lastAttemptTime, lastSuccessfulAttemptTime, message, status);
  }

  @Override
  public String toString() {
    return new ToStringer(LogDeliveryStatus.class)
        .add("lastAttemptTime", lastAttemptTime)
        .add("lastSuccessfulAttemptTime", lastSuccessfulAttemptTime)
        .add("message", message)
        .add("status", status)
        .toString();
  }

  LogDeliveryStatusPb toPb() {
    LogDeliveryStatusPb pb = new LogDeliveryStatusPb();
    pb.setLastAttemptTime(lastAttemptTime);
    pb.setLastSuccessfulAttemptTime(lastSuccessfulAttemptTime);
    pb.setMessage(message);
    pb.setStatus(status);

    return pb;
  }

  static LogDeliveryStatus fromPb(LogDeliveryStatusPb pb) {
    LogDeliveryStatus model = new LogDeliveryStatus();
    model.setLastAttemptTime(pb.getLastAttemptTime());
    model.setLastSuccessfulAttemptTime(pb.getLastSuccessfulAttemptTime());
    model.setMessage(pb.getMessage());
    model.setStatus(pb.getStatus());

    return model;
  }

  public static class LogDeliveryStatusSerializer extends JsonSerializer<LogDeliveryStatus> {
    @Override
    public void serialize(LogDeliveryStatus value, JsonGenerator gen, SerializerProvider provider)
        throws IOException {
      LogDeliveryStatusPb pb = value.toPb();
      provider.defaultSerializeValue(pb, gen);
    }
  }

  public static class LogDeliveryStatusDeserializer extends JsonDeserializer<LogDeliveryStatus> {
    @Override
    public LogDeliveryStatus deserialize(JsonParser p, DeserializationContext ctxt)
        throws IOException {
      ObjectMapper mapper = (ObjectMapper) p.getCodec();
      LogDeliveryStatusPb pb = mapper.readValue(p, LogDeliveryStatusPb.class);
      return LogDeliveryStatus.fromPb(pb);
    }
  }
}
