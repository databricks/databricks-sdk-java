package com.databricks.sdk.core;

import com.databricks.sdk.core.error.ErrorDetail;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

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

  private final List<ErrorDetail> details;

  public DatabricksError(int statusCode) {
    this("", "OK", statusCode, null, Collections.emptyList());
  }

  public DatabricksError(String errorCode, String message) {
    this(errorCode, message, 400, null, Collections.emptyList());
  }

  public DatabricksError(String errorCode, String message, int statusCode) {
    this(errorCode, message, statusCode, null, Collections.emptyList());
  }

  public DatabricksError(String errorCode, int statusCode, Throwable cause) {
    this(errorCode, cause.getMessage(), statusCode, cause, Collections.emptyList());
  }

  public DatabricksError(
      String errorCode, String message, int statusCode, List<ErrorDetail> details) {
    this(errorCode, message, statusCode, null, details);
  }

  private DatabricksError(
      String errorCode,
      String message,
      int statusCode,
      Throwable cause,
      List<ErrorDetail> details) {
    super(message, cause);
    this.errorCode = errorCode;
    this.cause = cause;
    this.statusCode = statusCode;
    this.details = details == null ? Collections.emptyList() : details;
  }

  public List<ErrorDetail> getErrorInfo() {
    return this.getDetailsByType("type.googleapis.com/google.rpc.ErrorInfo");
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

  List<ErrorDetail> getDetailsByType(String type) {
    return this.details.stream().filter(e -> e.getType().equals(type)).collect(Collectors.toList());
  }
}
