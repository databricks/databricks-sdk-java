// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.billing;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/** Databricks log delivery status. */
@Generated
class LogDeliveryStatusPb {
  @JsonProperty("last_attempt_time")
  private String lastAttemptTime;

  @JsonProperty("last_successful_attempt_time")
  private String lastSuccessfulAttemptTime;

  @JsonProperty("message")
  private String message;

  @JsonProperty("status")
  private DeliveryStatus status;

  public LogDeliveryStatusPb setLastAttemptTime(String lastAttemptTime) {
    this.lastAttemptTime = lastAttemptTime;
    return this;
  }

  public String getLastAttemptTime() {
    return lastAttemptTime;
  }

  public LogDeliveryStatusPb setLastSuccessfulAttemptTime(String lastSuccessfulAttemptTime) {
    this.lastSuccessfulAttemptTime = lastSuccessfulAttemptTime;
    return this;
  }

  public String getLastSuccessfulAttemptTime() {
    return lastSuccessfulAttemptTime;
  }

  public LogDeliveryStatusPb setMessage(String message) {
    this.message = message;
    return this;
  }

  public String getMessage() {
    return message;
  }

  public LogDeliveryStatusPb setStatus(DeliveryStatus status) {
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
    LogDeliveryStatusPb that = (LogDeliveryStatusPb) o;
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
    return new ToStringer(LogDeliveryStatusPb.class)
        .add("lastAttemptTime", lastAttemptTime)
        .add("lastSuccessfulAttemptTime", lastSuccessfulAttemptTime)
        .add("message", message)
        .add("status", status)
        .toString();
  }
}
