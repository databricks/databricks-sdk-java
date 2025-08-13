package com.databricks.sdk.core;

import com.databricks.sdk.core.error.details.ErrorDetails;

/**
 * The result of checking whether {@code ApiClient} should retry a request.
 *
 * <p>If shouldRetry is true, the request failed and must be retried. If shouldRetry is false, then
 * the behavior depends on the value of error. If error is null, the request was successful and
 * should be parsed and returned to the user. If error is not null, the request has failed in an
 * unrecoverable way and this exception should be thrown, potentially wrapped in another exception.
 */
public class DatabricksError extends DatabricksException {
  private final Throwable cause;
  private final String errorCode;
  private final int statusCode;
  private final ErrorDetails errorDetails;

  public DatabricksError(int statusCode) {
    this("", "OK", statusCode, null, ErrorDetails.builder().build());
  }

  public DatabricksError(String errorCode, String message) {
    this(errorCode, message, 400, null, ErrorDetails.builder().build());
  }

  public DatabricksError(String errorCode, String message, int statusCode) {
    this(errorCode, message, statusCode, null, ErrorDetails.builder().build());
  }

  public DatabricksError(String errorCode, int statusCode, Throwable cause) {
    this(errorCode, cause.getMessage(), statusCode, cause, ErrorDetails.builder().build());
  }

  public DatabricksError(String errorCode, String message, int statusCode, ErrorDetails details) {
    this(errorCode, message, statusCode, null, details);
  }

  private DatabricksError(
      String errorCode, String message, int statusCode, Throwable cause, ErrorDetails details) {
    super(message, cause);
    this.errorCode = errorCode;
    this.cause = cause;
    this.statusCode = statusCode;
    this.errorDetails = details == null ? ErrorDetails.builder().build() : details;
  }

  public String getErrorCode() {
    return errorCode;
  }

  public int getStatusCode() {
    return statusCode;
  }

  public Throwable getCause() {
    return cause;
  }

  public ErrorDetails getErrorDetails() {
    return errorDetails;
  }
}
