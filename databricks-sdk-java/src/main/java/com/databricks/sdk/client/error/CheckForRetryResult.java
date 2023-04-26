package com.databricks.sdk.client.error;

import com.databricks.sdk.client.DatabricksException;
import java.net.ConnectException;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.util.Arrays;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * The result of checking whether {@code ApiClient} should retry a request.
 *
 * <p>If shouldRetry is true, the request failed and must be retried. If shouldRetry is false, then
 * the behavior depends on the value of error. If error is null, the request was successful and
 * should be parsed and returned to the user. If error is not null, the request has failed in an
 * unrecoverable way and this exception should be thrown, potentially wrapped in another exception.
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class CheckForRetryResult {
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

  /**
   * <p>Constructor for CheckForRetryResult.</p>
   *
   * @param statusCode a int
   */
  public CheckForRetryResult(int statusCode) {
    this("OK", null, statusCode, null);
  }

  /**
   * <p>Constructor for CheckForRetryResult.</p>
   *
   * @param message a {@link java.lang.String} object
   * @param errorCode a {@link java.lang.String} object
   * @param statusCode a int
   */
  public CheckForRetryResult(String message, String errorCode, int statusCode) {
    this(message, errorCode, statusCode, null);
  }

  /**
   * <p>Constructor for CheckForRetryResult.</p>
   *
   * @param errorCode a {@link java.lang.String} object
   * @param statusCode a int
   * @param cause a {@link java.lang.Throwable} object
   */
  public CheckForRetryResult(String errorCode, int statusCode, Throwable cause) {
    this(cause.getMessage(), errorCode, statusCode, cause);
  }

  private CheckForRetryResult(String message, String errorCode, int statusCode, Throwable cause) {
    this.message = message;
    this.cause = cause;
    this.errorCode = errorCode;
    this.statusCode = statusCode;
  }

  /**
   * <p>toException.</p>
   *
   * @return a {@link com.databricks.sdk.client.DatabricksException} object
   */
  public DatabricksException toException() {
    if (errorCode == null) {
      return null;
    }
    return new DatabricksException(
        String.format("message: %s, errorCode: %s, statusCode: %d", message, errorCode, statusCode),
        cause);
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
   * <p>Getter for the field <code>statusCode</code>.</p>
   *
   * @return a int
   */
  public int getStatusCode() {
    return statusCode;
  }

  /**
   * <p>isMissing.</p>
   *
   * @return a boolean
   */
  public boolean isMissing() {
    return statusCode == 404;
  }

  /**
   * <p>isTooManyRequests.</p>
   *
   * @return a boolean
   */
  public boolean isTooManyRequests() {
    return statusCode == 429;
  }

  /**
   * <p>isRetriable.</p>
   *
   * @return a boolean
   */
  public boolean isRetriable() {
    if (isTooManyRequests()) {
      return true;
    }
    for (String substring : TRANSIENT_ERROR_STRING_MATCHES) {
      if (message.contains(substring)) {
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
