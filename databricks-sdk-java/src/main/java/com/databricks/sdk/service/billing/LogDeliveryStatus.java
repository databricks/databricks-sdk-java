// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.billing;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;


/**
 * Databricks log delivery status.
 */
@Generated
public class LogDeliveryStatus {
  /**
   * The UTC time for the latest log delivery attempt.
   */
  @JsonProperty("last_attempt_time")
  private String lastAttemptTime;
  
  /**
   * The UTC time for the latest successful log delivery.
   */
  @JsonProperty("last_successful_attempt_time")
  private String lastSuccessfulAttemptTime;
  
  /**
   * Informative message about the latest log delivery attempt. If the log
   * delivery fails with USER_FAILURE, error details will be provided for fixing
   * misconfigurations in cloud permissions.
   */
  @JsonProperty("message")
  private String message;
  
  /**
   * This describes an enum
   */
  @JsonProperty("status")
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
    && Objects.equals(status, that.status)
    ;
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
      .add("status", status).toString();
  }
}
