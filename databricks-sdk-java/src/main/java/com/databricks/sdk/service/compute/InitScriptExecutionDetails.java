// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
public class InitScriptExecutionDetails {
  /** Addition details regarding errors. */
  @JsonProperty("error_message")
  private String errorMessage;

  /** The duration of the script execution in seconds. */
  @JsonProperty("execution_duration_seconds")
  private Long executionDurationSeconds;

  /** The current status of the script */
  @JsonProperty("status")
  private InitScriptExecutionDetailsStatus status;

  public InitScriptExecutionDetails setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
    return this;
  }

  public String getErrorMessage() {
    return errorMessage;
  }

  public InitScriptExecutionDetails setExecutionDurationSeconds(Long executionDurationSeconds) {
    this.executionDurationSeconds = executionDurationSeconds;
    return this;
  }

  public Long getExecutionDurationSeconds() {
    return executionDurationSeconds;
  }

  public InitScriptExecutionDetails setStatus(InitScriptExecutionDetailsStatus status) {
    this.status = status;
    return this;
  }

  public InitScriptExecutionDetailsStatus getStatus() {
    return status;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    InitScriptExecutionDetails that = (InitScriptExecutionDetails) o;
    return Objects.equals(errorMessage, that.errorMessage)
        && Objects.equals(executionDurationSeconds, that.executionDurationSeconds)
        && Objects.equals(status, that.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errorMessage, executionDurationSeconds, status);
  }

  @Override
  public String toString() {
    return new ToStringer(InitScriptExecutionDetails.class)
        .add("errorMessage", errorMessage)
        .add("executionDurationSeconds", executionDurationSeconds)
        .add("status", status)
        .toString();
  }
}
