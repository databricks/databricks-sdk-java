package com.databricks.sdk.benchmark;

import com.databricks.sdk.WorkspaceClient;
import com.databricks.sdk.core.DatabricksConfig;
import com.databricks.sdk.core.UserAgent;
import com.databricks.sdk.integration.framework.EnvContext;
import com.databricks.sdk.integration.framework.EnvOrSkip;
import com.databricks.sdk.integration.framework.EnvTest;
import com.databricks.sdk.service.iam.User;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserAgentLoadTest {

  @Test
  public void testAsStringConcurrent() throws InterruptedException, ExecutionException {
    int numThreads = 200;
    ExecutorService executorService = Executors.newFixedThreadPool(numThreads);
    List<Future<Boolean>> futures = new ArrayList<>();
    int successCount = 0;
    int failureCount = 0;

    // Add some user agent info
    Callable<Boolean> task =
        () -> {
          try {
            UserAgent.withOtherInfo("key1", "value1");
            UserAgent.asString();
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
