package com.databricks.sdk.core.retry;

import com.databricks.sdk.core.DatabricksError;
import java.net.*;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * This class is used to determine if a non-idempotent request should be retried. We essentially
 * want to ensure that any request that could have potentially been processed by the server is not
 * retried.
 */
public class NonIdempotentRequestRetryStrategy implements RetryStrategy {
  private final Logger LOGGER = LoggerFactory.getLogger(getClass().getName());

  private static final List<Class<? extends Throwable>> RETRIABLE_CLASSES =
      Arrays.asList(
          ConnectException.class,
          UnknownHostException.class,
          NoRouteToHostException.class,
          PortUnreachableException.class);

  private static final Set<Integer> RETRIABLE_HTTP_CODES =
      new HashSet<>(
          Arrays.asList(
              /* Too many requests */ 429, /* Request not processed by server */ 501, 503));

  @Override
  public boolean isRetriable(DatabricksError databricksError) {
    if (RetryUtils.isCausedByTransientError(databricksError)) {
      return true;
    }
    if (isClientSideException(databricksError)) {
      return true;
    }
    if (isRetriableHttpErrorCode(databricksError)) {
      return true;
    }
    return false;
  }

  private boolean isRetriableHttpErrorCode(DatabricksError databricksError) {
    return RETRIABLE_HTTP_CODES.contains(databricksError.getStatusCode());
  }

  private boolean isClientSideException(DatabricksError error) {
    for (Class<? extends Throwable> clazz : RETRIABLE_CLASSES) {
      if (isCausedBy(error.getCause(), clazz)) {
        LOGGER.debug("Attempting retry because cause or nested cause extends {}", clazz.getName());
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
