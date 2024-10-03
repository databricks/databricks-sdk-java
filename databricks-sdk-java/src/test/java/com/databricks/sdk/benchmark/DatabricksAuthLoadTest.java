package com.databricks.sdk.benchmark;

import static org.junit.jupiter.api.Assertions.*;

import java.util.concurrent.*;

/*
 This test executes the authentication workflow 200 times concurrently and verifies that all 200 runs complete successfully.
 It is designed to address a previously observed issue where multiple SDK operations needed to authenticate, causing the OIDC endpoints to rate-limit the requests.
 Now that these endpoints are configured to retry upon receiving a 429 error, the test runs successfully.
 However, since this test generates a large number of requests, it should be run manually rather than being included in CI processes.
*/
/*
public class DatabricksAuthLoadTest implements GitHubUtils, ConfigResolving {

  @Test
  @Disabled
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
*/
