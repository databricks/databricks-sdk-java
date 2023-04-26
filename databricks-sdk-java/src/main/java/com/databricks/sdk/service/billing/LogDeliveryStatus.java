// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.billing;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * Databricks log delivery status.
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
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

  /**
   * <p>Setter for the field <code>lastAttemptTime</code>.</p>
   *
   * @param lastAttemptTime a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.billing.LogDeliveryStatus} object
   */
  public LogDeliveryStatus setLastAttemptTime(String lastAttemptTime) {
    this.lastAttemptTime = lastAttemptTime;
    return this;
  }

  /**
   * <p>Getter for the field <code>lastAttemptTime</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getLastAttemptTime() {
    return lastAttemptTime;
  }

  /**
   * <p>Setter for the field <code>lastSuccessfulAttemptTime</code>.</p>
   *
   * @param lastSuccessfulAttemptTime a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.billing.LogDeliveryStatus} object
   */
  public LogDeliveryStatus setLastSuccessfulAttemptTime(String lastSuccessfulAttemptTime) {
    this.lastSuccessfulAttemptTime = lastSuccessfulAttemptTime;
    return this;
  }

  /**
   * <p>Getter for the field <code>lastSuccessfulAttemptTime</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getLastSuccessfulAttemptTime() {
    return lastSuccessfulAttemptTime;
  }

  /**
   * <p>Setter for the field <code>message</code>.</p>
   *
   * @param message a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.billing.LogDeliveryStatus} object
   */
  public LogDeliveryStatus setMessage(String message) {
    this.message = message;
    return this;
  }

  /**
   * <p>Getter for the field <code>message</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getMessage() {
    return message;
  }

  /**
   * <p>Setter for the field <code>status</code>.</p>
   *
   * @param status a {@link com.databricks.sdk.service.billing.DeliveryStatus} object
   * @return a {@link com.databricks.sdk.service.billing.LogDeliveryStatus} object
   */
  public LogDeliveryStatus setStatus(DeliveryStatus status) {
    this.status = status;
    return this;
  }

  /**
   * <p>Getter for the field <code>status</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.billing.DeliveryStatus} object
   */
  public DeliveryStatus getStatus() {
    return status;
  }

  /** {@inheritDoc} */
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

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(lastAttemptTime, lastSuccessfulAttemptTime, message, status);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(LogDeliveryStatus.class)
        .add("lastAttemptTime", lastAttemptTime)
        .add("lastSuccessfulAttemptTime", lastSuccessfulAttemptTime)
        .add("message", message)
        .add("status", status)
        .toString();
  }
}
