package com.databricks.sdk.client.error;

import com.fasterxml.jackson.annotation.JsonProperty;

/** The union of all JSON error responses from the Databricks APIs, not including HTML responses. */
public class ApiErrorBody {
  @JsonProperty("error_code")
  private String errorCode;

  private String message;

  @JsonProperty("detail")
  private String scimDetail;

  @JsonProperty("status")
  private String scimStatus;

  private String scimType;

  @JsonProperty("error")
  private String api12Error;

  public String getErrorCode() {
    return errorCode;
  }

  public void setErrorCode(String errorCode) {
    this.errorCode = errorCode;
  }

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public String getScimDetail() {
    return scimDetail;
  }

  public void setScimDetail(String scimDetail) {
    this.scimDetail = scimDetail;
  }

  public String getScimStatus() {
    return scimStatus;
  }

  public void setScimStatus(String scimStatus) {
    this.scimStatus = scimStatus;
  }

  public String getScimType() {
    return scimType;
  }

  public void setScimType(String scimType) {
    this.scimType = scimType;
  }

  public String getApi12Error() {
    return api12Error;
  }

  public void setApi12Error(String api12Error) {
    this.api12Error = api12Error;
  }
}
