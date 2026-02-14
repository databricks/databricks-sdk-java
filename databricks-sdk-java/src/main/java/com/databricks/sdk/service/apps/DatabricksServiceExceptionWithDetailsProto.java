// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.apps;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

/** Databricks Error that is returned by all Databricks APIs. */
@Generated
public class DatabricksServiceExceptionWithDetailsProto {
  /** */
  @JsonProperty("details")
  private Collection<Object> details;

  /** */
  @JsonProperty("error_code")
  private ErrorCode errorCode;

  /** */
  @JsonProperty("message")
  private String message;

  /** */
  @JsonProperty("stack_trace")
  private String stackTrace;

  public DatabricksServiceExceptionWithDetailsProto setDetails(Collection<Object> details) {
    this.details = details;
    return this;
  }

  public Collection<Object> getDetails() {
    return details;
  }

  public DatabricksServiceExceptionWithDetailsProto setErrorCode(ErrorCode errorCode) {
    this.errorCode = errorCode;
    return this;
  }

  public ErrorCode getErrorCode() {
    return errorCode;
  }

  public DatabricksServiceExceptionWithDetailsProto setMessage(String message) {
    this.message = message;
    return this;
  }

  public String getMessage() {
    return message;
  }

  public DatabricksServiceExceptionWithDetailsProto setStackTrace(String stackTrace) {
    this.stackTrace = stackTrace;
    return this;
  }

  public String getStackTrace() {
    return stackTrace;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    DatabricksServiceExceptionWithDetailsProto that =
        (DatabricksServiceExceptionWithDetailsProto) o;
    return Objects.equals(details, that.details)
        && Objects.equals(errorCode, that.errorCode)
        && Objects.equals(message, that.message)
        && Objects.equals(stackTrace, that.stackTrace);
  }

  @Override
  public int hashCode() {
    return Objects.hash(details, errorCode, message, stackTrace);
  }

  @Override
  public String toString() {
    return new ToStringer(DatabricksServiceExceptionWithDetailsProto.class)
        .add("details", details)
        .add("errorCode", errorCode)
        .add("message", message)
        .add("stackTrace", stackTrace)
        .toString();
  }
}
