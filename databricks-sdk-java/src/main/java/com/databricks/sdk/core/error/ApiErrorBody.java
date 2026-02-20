package com.databricks.sdk.core.error;

import com.databricks.sdk.core.error.details.ErrorDetails;
import com.databricks.sdk.support.InternalApi;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The union of all JSON error responses from the Databricks APIs, not including HTML responses.
 *
 * <p>Unknown properties in the response should be ignored.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@InternalApi
public class ApiErrorBody {
  private String errorCode;
  private String message;
  private String scimDetail;
  private String scimStatus;
  private String scimType;
  private String api12Error;
  private ErrorDetails errorDetails;

  public ApiErrorBody() {}

  /**
   * Constructs an ApiErrorBody from the given parameters.
   *
   * <p>The error details are converted to a list of ErrorDetail objects. This only supports the
   * ErrorInfo type.
   *
   * @param errorCode The error code.
   * @param message The error message.
   * @param scimDetail The SCIM detail.
   */
  public ApiErrorBody(
      @JsonProperty("error_code") String errorCode,
      @JsonProperty("message") String message,
      @JsonProperty("detail") String scimDetail,
      @JsonProperty("status") String scimStatus,
      @JsonProperty("scimType") String scimType,
      @JsonProperty("error") String api12Error,
      @JsonProperty("details") ErrorDetails errorDetails) {
    this.errorCode = errorCode;
    this.message = message;
    this.scimDetail = scimDetail;
    this.scimStatus = scimStatus;
    this.scimType = scimType;
    this.api12Error = api12Error;
    this.errorDetails = errorDetails;
  }

  public ErrorDetails getErrorDetails() {
    return errorDetails;
  }

  public void setErrorDetails(ErrorDetails errorDetails) {
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
