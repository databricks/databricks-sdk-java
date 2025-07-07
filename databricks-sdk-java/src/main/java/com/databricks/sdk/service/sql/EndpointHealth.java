// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
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

  /** */
  @JsonProperty("status")
  private Status status;

  /** A short summary of the health status in case of degraded/failed warehouses. */
  @JsonProperty("summary")
  private String summary;

  public EndpointHealth setDetails(String details) {
    this.details = details;
    return this;
  }

  public String getDetails() {
    return details;
  }

  public EndpointHealth setFailureReason(TerminationReason failureReason) {
    this.failureReason = failureReason;
    return this;
  }

  public TerminationReason getFailureReason() {
    return failureReason;
  }

  public EndpointHealth setMessage(String message) {
    this.message = message;
    return this;
  }

  public String getMessage() {
    return message;
  }

  public EndpointHealth setStatus(Status status) {
    this.status = status;
    return this;
  }

  public Status getStatus() {
    return status;
  }

  public EndpointHealth setSummary(String summary) {
    this.summary = summary;
    return this;
  }

  public String getSummary() {
    return summary;
  }

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

  @Override
  public int hashCode() {
    return Objects.hash(details, failureReason, message, status, summary);
  }

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
