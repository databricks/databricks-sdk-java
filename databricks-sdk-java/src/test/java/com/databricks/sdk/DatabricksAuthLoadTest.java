// These are auto-generated tests for Unified Authentication
// In case of editing this file, make sure the change is propagated to all Databricks SDK codebases

package com.databricks.sdk;

import static org.junit.jupiter.api.Assertions.*;

import com.databricks.sdk.core.ConfigResolving;
import com.databricks.sdk.core.DatabricksConfig;
import com.databricks.sdk.core.commons.CommonsHttpClient;
import com.databricks.sdk.core.utils.GitHubUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;
import org.junit.jupiter.api.Test;

public class DatabricksAuthLoadTest implements GitHubUtils, ConfigResolving {

  public void testConcurrentConfigBasicAuthAttrs() throws Exception {
    int numThreads = 200;
    ExecutorService executorService = Executors.newFixedThreadPool(numThreads);
    List<Future<Boolean>> futures = new ArrayList<>();
    int successCount = 0;
    int failureCount = 0;

    Callable<Boolean> task =
        () -> {
          try {
            DatabricksConfig config =
                new DatabricksConfig()
                    .setHost("https://dbc-bb03964f-3f59.cloud.databricks.com")
                    .setClientId("<<REDACTED>>")
                    .setClientSecret("<<REDACTED>>");

            config.setHttpClient(new CommonsHttpClient.Builder().withTimeoutSeconds(30).build());
            config.authenticate();

            assertEquals("oauth-m2m", config.getAuthType());

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
