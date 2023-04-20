package com.databricks.sdk.client.error;

import com.databricks.sdk.client.DatabricksException;
import java.net.ConnectException;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.util.Arrays;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DatabricksApiException extends DatabricksException {
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

  // Note: message is already exposed in the Throwable API, so it is not included here.
  private final String errorCode;
  private final int statusCode;

  public DatabricksApiException(String message, String errorCode, int statusCode) {
    super(message);
    this.errorCode = errorCode;
    this.statusCode = statusCode;
  }

  public DatabricksApiException(String errorCode, int statusCode, Throwable cause) {
    super(cause.getMessage(), cause);
    this.errorCode = errorCode;
    this.statusCode = statusCode;
  }

  public static DatabricksApiException notFound(String message) {
    return new DatabricksApiException("NOT_FOUND", message, 404);
  }

  public String getErrorCode() {
    return errorCode;
  }

  public int getStatusCode() {
    return statusCode;
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
      if (getMessage().contains(substring)) {
        LOG.debug("Attempting retry because of {}", substring);
        return true;
      }
    }
    for (Class<? extends Throwable> clazz : RETRYABLE_CLASSES) {
      if (isCausedBy(getCause(), clazz)) {
        LOG.debug("Attempting retry because cause or nested cause extends {}", clazz.getName());
        return true;
      }
    }
    return false;
  }

  public static boolean isCausedBy(Throwable throwable, Class<? extends Throwable> clazz) {
    if (throwable == null) {
      return false;
    }
    if (clazz.isInstance(throwable)) {
      return true;
    }
    return isCausedBy(throwable.getCause(), clazz);
  }
}
