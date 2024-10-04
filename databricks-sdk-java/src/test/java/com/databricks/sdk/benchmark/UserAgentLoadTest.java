package com.databricks.sdk.benchmark;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.databricks.sdk.core.UserAgent;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;
import org.junit.jupiter.api.Test;

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
