package com.databricks.sdk.core.error;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * The union of all JSON error responses from the Databricks APIs, not including HTML responses.
 *
 * <p>Unknown properties in the response should be ignored.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ApiErrorBody {
  private String errorCode;
  private String message;
  private String scimDetail;
  private String scimStatus;
  private String scimType;
  private String api12Error;
  private List<ErrorDetail> errorDetails;

  public ApiErrorBody() {}

  public ApiErrorBody(
      @JsonProperty("error_code") String errorCode,
      @JsonProperty("message") String message,
      @JsonProperty("detail") String scimDetail,
      @JsonProperty("status") String scimStatus,
      @JsonProperty("scimType") String scimType,
      @JsonProperty("error") String api12Error,
      @JsonProperty("details") List<ErrorDetail> errorDetails) {
    this.errorCode = errorCode;
    this.message = message;
    this.scimDetail = scimDetail;
    this.scimStatus = scimStatus;
    this.scimType = scimType;
    this.api12Error = api12Error;
    this.errorDetails = errorDetails;
  }

  public List<ErrorDetail> getErrorDetails() {
    return errorDetails;
  }

  public void setErrorDetails(List<ErrorDetail> errorDetails) {
    this.errorDetails = errorDetails;
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
