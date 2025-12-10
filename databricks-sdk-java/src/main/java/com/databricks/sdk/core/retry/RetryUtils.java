package com.databricks.sdk.core.retry;

import com.databricks.sdk.core.DatabricksError;
import com.databricks.sdk.support.InternalApi;
import java.util.Arrays;
import java.util.List;

@InternalApi
public class RetryUtils {
  private static final List<String> TRANSIENT_ERROR_STRING_MATCHES =
      Arrays.asList(
          "com.databricks.backend.manager.util.UnknownWorkerEnvironmentException",
          "does not have any associated worker environments",
          "There is no worker environment with id",
          "Unknown worker environment",
          "ClusterNotReadyException");

  public static boolean isCausedByTransientError(DatabricksError databricksError) {
    String message = databricksError.getMessage();
    for (String match : TRANSIENT_ERROR_STRING_MATCHES) {
      if (message != null && message.contains(match)) {
        return true;
      }
    }
    return false;
  }
}
