package com.databricks.sdk.core.retry;

import com.databricks.sdk.core.DatabricksError;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * This class is used to determine if an idempotent request should be retried. An idempotent request
 * should always be retried except if the error is non-recoverable..
 */
public class IdempotentRequestRetryStrategy implements RetryStrategy {

  private static final Set<Class<? extends RuntimeException>> NON_RETRIABLE_EXCEPTIONS =
      new HashSet<>(
          Arrays.asList(
              IllegalArgumentException.class,
              IllegalStateException.class,
              UnsupportedOperationException.class,
              IndexOutOfBoundsException.class,
              NullPointerException.class,
              ClassCastException.class,
              NumberFormatException.class,
              ArrayIndexOutOfBoundsException.class,
              ArrayStoreException.class,
              ArithmeticException.class,
              NegativeArraySizeException.class));

  private static final Set<Integer> NON_RETRIABLE_HTTP_CODES =
      new HashSet<>(Arrays.asList(400, 401, 403, 404, 405, 409, 410, 411, 412, 413, 414, 415, 416));

  @Override
  public boolean isRetriable(DatabricksError databricksError) {
    if (isNonRetriableException(databricksError)) {
      return false;
    }
    if (isNonRetriableHttpCode(databricksError)) {
      return false;
    }
    return true;
  }

  private boolean isNonRetriableException(DatabricksError databricksError) {
    if (databricksError.getCause() == null) {
      return false;
    }
    return NON_RETRIABLE_EXCEPTIONS.contains(databricksError.getCause().getClass());
  }

  private boolean isNonRetriableHttpCode(DatabricksError databricksError) {
    return NON_RETRIABLE_HTTP_CODES.contains(databricksError.getStatusCode());
  }
}
