// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

@Generated
class ServiceErrorPb {
  @JsonProperty("error_code")
  private ServiceErrorCode errorCode;

  @JsonProperty("message")
  private String message;

  public ServiceErrorPb setErrorCode(ServiceErrorCode errorCode) {
    this.errorCode = errorCode;
    return this;
  }

  public ServiceErrorCode getErrorCode() {
    return errorCode;
  }

  public ServiceErrorPb setMessage(String message) {
    this.message = message;
    return this;
  }

  public String getMessage() {
    return message;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ServiceErrorPb that = (ServiceErrorPb) o;
    return Objects.equals(errorCode, that.errorCode) && Objects.equals(message, that.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errorCode, message);
  }

  @Override
  public String toString() {
    return new ToStringer(ServiceErrorPb.class)
        .add("errorCode", errorCode)
        .add("message", message)
        .toString();
  }
}
