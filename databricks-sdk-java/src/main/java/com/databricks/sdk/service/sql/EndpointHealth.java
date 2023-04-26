// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * <p>EndpointHealth class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class EndpointHealth {
  /** Details about errors that are causing current degraded/failed status. */
  @JsonProperty("details")
  private String details;

  /**
   * The reason for failure to bring up clusters for this warehouse. This is available when status
   * is 'FAILED' and sometimes when it is DEGRADED.
   */
  @JsonProperty("failure_reason")
  private TerminationReason failureReason;

  /** Deprecated. split into summary and details for security */
  @JsonProperty("message")
  private String message;

  /** Health status of the warehouse. */
  @JsonProperty("status")
  private Status status;

  /** A short summary of the health status in case of degraded/failed warehouses. */
  @JsonProperty("summary")
  private String summary;

  /**
   * <p>Setter for the field <code>details</code>.</p>
   *
   * @param details a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.sql.EndpointHealth} object
   */
  public EndpointHealth setDetails(String details) {
    this.details = details;
    return this;
  }

  /**
   * <p>Getter for the field <code>details</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getDetails() {
    return details;
  }

  /**
   * <p>Setter for the field <code>failureReason</code>.</p>
   *
   * @param failureReason a {@link com.databricks.sdk.service.sql.TerminationReason} object
   * @return a {@link com.databricks.sdk.service.sql.EndpointHealth} object
   */
  public EndpointHealth setFailureReason(TerminationReason failureReason) {
    this.failureReason = failureReason;
    return this;
  }

  /**
   * <p>Getter for the field <code>failureReason</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.sql.TerminationReason} object
   */
  public TerminationReason getFailureReason() {
    return failureReason;
  }

  /**
   * <p>Setter for the field <code>message</code>.</p>
   *
   * @param message a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.sql.EndpointHealth} object
   */
  public EndpointHealth setMessage(String message) {
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
   * @param status a {@link com.databricks.sdk.service.sql.Status} object
   * @return a {@link com.databricks.sdk.service.sql.EndpointHealth} object
   */
  public EndpointHealth setStatus(Status status) {
    this.status = status;
    return this;
  }

  /**
   * <p>Getter for the field <code>status</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.sql.Status} object
   */
  public Status getStatus() {
    return status;
  }

  /**
   * <p>Setter for the field <code>summary</code>.</p>
   *
   * @param summary a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.sql.EndpointHealth} object
   */
  public EndpointHealth setSummary(String summary) {
    this.summary = summary;
    return this;
  }

  /**
   * <p>Getter for the field <code>summary</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getSummary() {
    return summary;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    EndpointHealth that = (EndpointHealth) o;
    return Objects.equals(details, that.details)
        && Objects.equals(failureReason, that.failureReason)
        && Objects.equals(message, that.message)
        && Objects.equals(status, that.status)
        && Objects.equals(summary, that.summary);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(details, failureReason, message, status, summary);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(EndpointHealth.class)
        .add("details", details)
        .add("failureReason", failureReason)
        .add("message", message)
        .add("status", status)
        .add("summary", summary)
        .toString();
  }
}
