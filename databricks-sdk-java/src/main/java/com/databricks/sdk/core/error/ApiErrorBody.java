package com.databricks.sdk.core.error;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The union of all JSON error responses from the Databricks APIs, not including HTML responses.
 *
 * <p>This is a direct translation of <a
 * href="https://github.com/databricks/databricks-sdk-go/blob/main/apierr/errors.go#L31">the
 * APIErrorBody struct from the Go SDK</a>.
 */
public class ApiErrorBody {
  private String errorCode;
  private String message;
  private String scimDetail;
  private String scimStatus;
  private String scimType;
  private String api12Error;

  public ApiErrorBody() {}

  public ApiErrorBody(
      @JsonProperty("error_code") String errorCode,
      @JsonProperty("message") String message,
      @JsonProperty("detail") String scimDetail,
      @JsonProperty("status") String scimStatus,
      @JsonProperty("scimType") String scimType,
      @JsonProperty("error") String api12Error) {
    this.errorCode = errorCode;
    this.message = message;
    this.scimDetail = scimDetail;
    this.scimStatus = scimStatus;
    this.scimType = scimType;
    this.api12Error = api12Error;
  }

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
