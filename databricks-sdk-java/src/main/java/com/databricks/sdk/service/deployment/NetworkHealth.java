// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.deployment;

import com.fasterxml.jackson.annotation.JsonProperty;

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

  public NetworkHealth setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
    return this;
  }

  public String getErrorMessage() {
    return errorMessage;
  }

  public NetworkHealth setErrorType(ErrorType errorType) {
    this.errorType = errorType;
    return this;
  }

  public ErrorType getErrorType() {
    return errorType;
  }
}
