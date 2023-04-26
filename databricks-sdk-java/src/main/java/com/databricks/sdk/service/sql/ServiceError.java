// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * <p>ServiceError class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class ServiceError {
  /** */
  @JsonProperty("error_code")
  private ServiceErrorCode errorCode;

  /** Brief summary of error condition. */
  @JsonProperty("message")
  private String message;

  /**
   * <p>Setter for the field <code>errorCode</code>.</p>
   *
   * @param errorCode a {@link com.databricks.sdk.service.sql.ServiceErrorCode} object
   * @return a {@link com.databricks.sdk.service.sql.ServiceError} object
   */
  public ServiceError setErrorCode(ServiceErrorCode errorCode) {
    this.errorCode = errorCode;
    return this;
  }

  /**
   * <p>Getter for the field <code>errorCode</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.sql.ServiceErrorCode} object
   */
  public ServiceErrorCode getErrorCode() {
    return errorCode;
  }

  /**
   * <p>Setter for the field <code>message</code>.</p>
   *
   * @param message a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.sql.ServiceError} object
   */
  public ServiceError setMessage(String message) {
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

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ServiceError that = (ServiceError) o;
    return Objects.equals(errorCode, that.errorCode) && Objects.equals(message, that.message);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(errorCode, message);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(ServiceError.class)
        .add("errorCode", errorCode)
        .add("message", message)
        .toString();
  }
}
