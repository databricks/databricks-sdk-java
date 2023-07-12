// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Objects;

import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.QueryParam;
import com.databricks.sdk.support.ToStringer;



@Generated
public class ServiceError {
  /**
   
   */
  @JsonProperty("error_code")
  private ServiceErrorCode errorCode;
  
  /**
   * Brief summary of error condition.
   */
  @JsonProperty("message")
  private String message;
  
  public ServiceError setErrorCode(ServiceErrorCode errorCode) {
    this.errorCode = errorCode;
    return this;
  }

  public ServiceErrorCode getErrorCode() {
    return errorCode;
  }
  
  public ServiceError setMessage(String message) {
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
    ServiceError that = (ServiceError) o;
    return Objects.equals(errorCode, that.errorCode)
    && Objects.equals(message, that.message)
    ;
  }

  @Override
  public int hashCode() {
    return Objects.hash(errorCode, message);
  }

  @Override
  public String toString() {
    return new ToStringer(ServiceError.class)
      .add("errorCode", errorCode)
      .add("message", message).toString();
  }
}
