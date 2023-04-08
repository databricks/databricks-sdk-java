// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.billing;

import com.fasterxml.jackson.annotation.JsonProperty;

/** Databricks log delivery status. */
public class LogDeliveryStatus {
  /** The UTC time for the latest log delivery attempt. */
  @JsonProperty("last_attempt_time")
  private String lastAttemptTime;

  /** The UTC time for the latest successful log delivery. */
  @JsonProperty("last_successful_attempt_time")
  private String lastSuccessfulAttemptTime;

  /**
   * Informative message about the latest log delivery attempt. If the log delivery fails with
   * USER_FAILURE, error details will be provided for fixing misconfigurations in cloud permissions.
   */
  @JsonProperty("message")
  private String message;

  /** This describes an enum */
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
}
