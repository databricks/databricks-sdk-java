// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.provisioning;

import com.databricks.sdk.support.ToStringer;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * <p>NetworkHealth class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class NetworkHealth {
  /** Details of the error. */
  @JsonProperty("error_message")
  private String errorMessage;

  /**
   * The AWS resource associated with this error: credentials, VPC, subnet, security group, or
   * network ACL.
   */
  @JsonProperty("error_type")
  private ErrorType errorType;

  /**
   * <p>Setter for the field <code>errorMessage</code>.</p>
   *
   * @param errorMessage a {@link java.lang.String} object
   * @return a {@link com.databricks.sdk.service.provisioning.NetworkHealth} object
   */
  public NetworkHealth setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
    return this;
  }

  /**
   * <p>Getter for the field <code>errorMessage</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getErrorMessage() {
    return errorMessage;
  }

  /**
   * <p>Setter for the field <code>errorType</code>.</p>
   *
   * @param errorType a {@link com.databricks.sdk.service.provisioning.ErrorType} object
   * @return a {@link com.databricks.sdk.service.provisioning.NetworkHealth} object
   */
  public NetworkHealth setErrorType(ErrorType errorType) {
    this.errorType = errorType;
    return this;
  }

  /**
   * <p>Getter for the field <code>errorType</code>.</p>
   *
   * @return a {@link com.databricks.sdk.service.provisioning.ErrorType} object
   */
  public ErrorType getErrorType() {
    return errorType;
  }

  /** {@inheritDoc} */
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    NetworkHealth that = (NetworkHealth) o;
    return Objects.equals(errorMessage, that.errorMessage)
        && Objects.equals(errorType, that.errorType);
  }

  /** {@inheritDoc} */
  @Override
  public int hashCode() {
    return Objects.hash(errorMessage, errorType);
  }

  /** {@inheritDoc} */
  @Override
  public String toString() {
    return new ToStringer(NetworkHealth.class)
        .add("errorMessage", errorMessage)
        .add("errorType", errorType)
        .toString();
  }
}
