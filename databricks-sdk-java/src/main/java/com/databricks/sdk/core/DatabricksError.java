package com.databricks.sdk.core;

import com.databricks.sdk.core.error.ErrorDetail;
import java.net.ConnectException;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * The result of checking whether {@code ApiClient} should retry a request.
 *
 * <p>If shouldRetry is true, the request failed and must be retried. If shouldRetry is false, then
 * the behavior depends on the value of error. If error is null, the request was successful and
 * should be parsed and returned to the user. If error is not null, the request has failed in an
 * unrecoverable way and this exception should be thrown, potentially wrapped in another exception.
 */
public class DatabricksError extends DatabricksException {
  private static final String ERROR_INFO_TYPE = "type.googleapis.com/google.rpc.ErrorInfo";
  private final Logger LOG = LoggerFactory.getLogger(getClass().getName());

  /** Errors returned by Databricks services which are known to be retriable. */
  private static final List<String> TRANSIENT_ERROR_STRING_MATCHES =
      Arrays.asList(
          "com.databricks.backend.manager.util.UnknownWorkerEnvironmentException",
          "does not have any associated worker environments",
          "There is no worker environment with id",
          "Unknown worker environment",
          "ClusterNotReadyException");

  /**
   * Exception classes thrown by Java and Java libraries in which case the request should be
   * retried.
   */
  private static final List<Class<? extends Throwable>> RETRYABLE_CLASSES =
      Arrays.asList(SocketException.class, SocketTimeoutException.class, ConnectException.class);

  private final String message;
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
    this.message = message;
    this.cause = cause;
    this.statusCode = statusCode;
    this.details = details == null ? Collections.emptyList() : details;
  }

  public List<ErrorDetail> getErrorInfo() {
    return this.getDetailsByType(ERROR_INFO_TYPE);
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

  public boolean isMissing() {
    return statusCode == 404;
  }

  public boolean isTooManyRequests() {
    return statusCode == 429;
  }

  public boolean isRetriable() {
    if (isTooManyRequests()) {
      return true;
    }
    for (String substring : TRANSIENT_ERROR_STRING_MATCHES) {
      if (message != null && message.contains(substring)) {
        LOG.debug("Attempting retry because of {}", substring);
        return true;
      }
    }
    for (Class<? extends Throwable> clazz : RETRYABLE_CLASSES) {
      if (isCausedBy(cause, clazz)) {
        LOG.debug("Attempting retry because cause or nested cause extends {}", clazz.getName());
        return true;
      }
    }
    return false;
  }

  List<ErrorDetail> getDetailsByType(String type) {
    return this.details.stream().filter(e -> e.getType().equals(type)).collect(Collectors.toList());
  }

  private static boolean isCausedBy(Throwable throwable, Class<? extends Throwable> clazz) {
    if (throwable == null) {
      return false;
    }
    if (clazz.isInstance(throwable)) {
      return true;
    }
    return isCausedBy(throwable.getCause(), clazz);
  }
}
