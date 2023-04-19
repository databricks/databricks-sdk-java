package com.databricks.sdk.client;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;
import java.util.List;

public class DatabricksApiException extends DatabricksException {
  private final Logger LOG = LoggerFactory.getLogger(getClass().getName());
  private static final List<String> TRANSIENT_ERROR_STRING_MATCHES = Arrays.asList(
    "com.databricks.backend.manager.util.UnknownWorkerEnvironmentException",
    "does not have any associated worker environments",
    "There is no worker environment with id",
    "Unknown worker environment",
    "ClusterNotReadyException",
    "connection reset by peer",
    "TLS handshake timeout",
    "connection refused",
    "Unexpected error",
    "i/o timeout");

  // Message is already exposed in the Throwable API.
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
    for (String substring : TRANSIENT_ERROR_STRING_MATCHES) {
      if (getMessage().contains(substring)) {
        LOG.debug("Attempting retry because of {}", substring);
        return true;
      }
    }
    return false;
  }
}
