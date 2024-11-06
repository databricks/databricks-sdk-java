package com.databricks.sdk.benchmark;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.databricks.sdk.WorkspaceClient;
import com.databricks.sdk.core.DatabricksConfig;
import com.databricks.sdk.integration.framework.EnvContext;
import com.databricks.sdk.integration.framework.EnvOrSkip;
import com.databricks.sdk.integration.framework.EnvTest;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

/**
 * This test executes a simple operation 150 times concurrently to verify that the end-to-end
 * behavior of the SDK is correct under concurrent load. This test is designed to be run manually
 * rather than being included in CI processes, as it generates a large number of requests.
 */
@EnvContext("workspace")
@ExtendWith(EnvTest.class)
public class WorkspaceClientLoadIT {

  @Test
  public void testConcurrentCurrentUserMe(
      @EnvOrSkip("DATABRICKS_HOST") String host,
      @EnvOrSkip("DATABRICKS_CLIENT_ID") String clientId,
      @EnvOrSkip("DATABRICKS_CLIENT_SECRET") String clientSecret)
      throws Exception {
    int numThreads = 150;
    ExecutorService executorService = Executors.newFixedThreadPool(numThreads);
    List<Future<Boolean>> futures = new ArrayList<>();
    int successCount = 0;
    int failureCount = 0;

    Callable<Boolean> task =
        () -> {
          try {
            DatabricksConfig config =
                new DatabricksConfig()
                    .setHost(host)
                    .setClientId(clientId)
                    .setClientSecret(clientSecret);

            WorkspaceClient w = new WorkspaceClient(config);

            // This should not throw an exception.
            w.currentUser().me();

            return true;
          } catch (Exception e) {
            System.err.println(
                "DatabricksException occurred in thread " + Thread.currentThread().getName());
            e.printStackTrace();
            return false;
          }
        };

    for (int i = 0; i < numThreads; i++) {
      futures.add(executorService.submit(task));
    }

    executorService.shutdown();
    if (!executorService.awaitTermination(60, TimeUnit.SECONDS)) {
      executorService.shutdownNow();
    }

    for (Future<Boolean> future : futures) {
      if (future.get()) {
        successCount++;
      } else {
        failureCount++;
      }
    }

    // Log the results
    System.out.println("Number of successful threads: " + successCount);
    System.out.println("Number of failed threads: " + failureCount);

    // Optionally, you can assert that there were no failures
    assertEquals(0, failureCount);
  }
}
