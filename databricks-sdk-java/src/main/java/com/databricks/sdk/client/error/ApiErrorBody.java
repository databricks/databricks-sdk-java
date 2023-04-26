package com.databricks.sdk.client.error;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The union of all JSON error responses from the Databricks APIs, not including HTML responses.
 *
 * <p>This is a direct translation of <a
 * href="https://github.com/databricks/databricks-sdk-go/blob/main/apierr/errors.go#L31">the
 * APIErrorBody struct from the Go SDK</a>.
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class ApiErrorBody {
  private String errorCode;
  private String message;
  private String scimDetail;
  private String scimStatus;
  private String scimType;
  private String api12Error;

  /**
   * <p>Constructor for ApiErrorBody.</p>
   */
  public ApiErrorBody() {}

  /**
   * <p>Constructor for ApiErrorBody.</p>
   *
   * @param errorCode a {@link java.lang.String} object
   * @param message a {@link java.lang.String} object
   * @param scimDetail a {@link java.lang.String} object
   * @param scimStatus a {@link java.lang.String} object
   * @param scimType a {@link java.lang.String} object
   * @param api12Error a {@link java.lang.String} object
   */
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

  /**
   * <p>Getter for the field <code>errorCode</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getErrorCode() {
    return errorCode;
  }

  /**
   * <p>Setter for the field <code>errorCode</code>.</p>
   *
   * @param errorCode a {@link java.lang.String} object
   */
  public void setErrorCode(String errorCode) {
    this.errorCode = errorCode;
  }

  /**
   * <p>Getter for the field <code>message</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getMessage() {
    return message;
  }

  /**
   * <p>Setter for the field <code>message</code>.</p>
   *
   * @param message a {@link java.lang.String} object
   */
  public void setMessage(String message) {
    this.message = message;
  }

  /**
   * <p>Getter for the field <code>scimDetail</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getScimDetail() {
    return scimDetail;
  }

  /**
   * <p>Setter for the field <code>scimDetail</code>.</p>
   *
   * @param scimDetail a {@link java.lang.String} object
   */
  public void setScimDetail(String scimDetail) {
    this.scimDetail = scimDetail;
  }

  /**
   * <p>Getter for the field <code>scimStatus</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getScimStatus() {
    return scimStatus;
  }

  /**
   * <p>Setter for the field <code>scimStatus</code>.</p>
   *
   * @param scimStatus a {@link java.lang.String} object
   */
  public void setScimStatus(String scimStatus) {
    this.scimStatus = scimStatus;
  }

  /**
   * <p>Getter for the field <code>scimType</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getScimType() {
    return scimType;
  }

  /**
   * <p>Setter for the field <code>scimType</code>.</p>
   *
   * @param scimType a {@link java.lang.String} object
   */
  public void setScimType(String scimType) {
    this.scimType = scimType;
  }

  /**
   * <p>Getter for the field <code>api12Error</code>.</p>
   *
   * @return a {@link java.lang.String} object
   */
  public String getApi12Error() {
    return api12Error;
  }

  /**
   * <p>Setter for the field <code>api12Error</code>.</p>
   *
   * @param api12Error a {@link java.lang.String} object
   */
  public void setApi12Error(String api12Error) {
    this.api12Error = api12Error;
  }
}
