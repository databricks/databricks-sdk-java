package com.databricks.sdk.core.oauth;

import static org.junit.jupiter.api.Assertions.*;

import com.databricks.sdk.core.DatabricksException;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;

public class ConsentTest {

  @Test
  public void testConsentWithBrowserAuthTimeout() {
    Consent consent =
        new Consent.Builder()
            .withClientId("test-client-id")
            .withClientSecret("test-client-secret")
            .withAuthUrl("https://test.com/auth")
            .withTokenUrl("https://test.com/token")
            .withRedirectUrl("http://localhost:8080/callback")
            .withState("test-state")
            .withVerifier("test-verifier")
            .withBrowserTimeout(Optional.of(Duration.ofSeconds(30)))
            .build();

    assertEquals(Optional.of(Duration.ofSeconds(30)), consent.getBrowserTimeout());
  }

  @Test
  public void testConsentWithoutBrowserAuthTimeout() {
    Consent consent =
        new Consent.Builder()
            .withClientId("test-client-id")
            .withClientSecret("test-client-secret")
            .withAuthUrl("https://test.com/auth")
            .withTokenUrl("https://test.com/token")
            .withRedirectUrl("http://localhost:8080/callback")
            .withState("test-state")
            .withVerifier("test-verifier")
            .build();

    assertEquals(Optional.empty(), consent.getBrowserTimeout());
  }

  @Test
  public void testTimeoutLogicWithShortTimeout() throws InterruptedException {
    // Test that timeout is enforced correctly.
    Consent.CallbackResponseHandler handler =
        new Consent.CallbackResponseHandler(Optional.of(Duration.ofMillis(100))); // 100ms timeout

    long startTime = System.currentTimeMillis();

    try {
      handler.getParams();
      fail("Expected timeout exception");
    } catch (DatabricksException e) {
      long elapsedTime = System.currentTimeMillis() - startTime;
      assertTrue(
          elapsedTime >= 100, "Timeout should have taken at least 100ms, but took " + elapsedTime);
      assertTrue(e.getMessage().contains("timed out after 0 seconds"));
    }
  }

  @Test
  public void testTimeoutLogicWithNoTimeout() throws InterruptedException {
    // Test that no timeout means indefinite wait.
    Consent.CallbackResponseHandler handler = new Consent.CallbackResponseHandler(Optional.empty());

    CountDownLatch latch = new CountDownLatch(1);

    Thread setterThread =
        new Thread(
            () -> {
              try {
                Thread.sleep(50);
                synchronized (handler.lock) {
                  Map<String, String> params = new HashMap<>();
                  params.put("code", "test-code");
                  params.put("state", "test-state");
                  handler.setParams(params);
                }
                latch.countDown();
              } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
              }
            });

    setterThread.start();

    Map<String, String> result = handler.getParams();
    assertNotNull(result);
    assertEquals("test-code", result.get("code"));
    assertEquals("test-state", result.get("state"));
    assertTrue(latch.await(1, TimeUnit.SECONDS));
  }

  @Test
  public void testTimeoutLogicWithParamsSetBeforeTimeout() throws InterruptedException {
    // Test that if params are set before timeout, no exception is thrown.
    Consent.CallbackResponseHandler handler =
        new Consent.CallbackResponseHandler(Optional.of(Duration.ofSeconds(1)));

    CountDownLatch latch = new CountDownLatch(1);

    Thread setterThread =
        new Thread(
            () -> {
              try {
                Thread.sleep(50);
                synchronized (handler.lock) {
                  Map<String, String> params = new HashMap<>();
                  params.put("code", "test-code");
                  handler.setParams(params);
                }
                latch.countDown();
              } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
              }
            });

    setterThread.start();

    Map<String, String> result = handler.getParams();
    assertNotNull(result);
    assertEquals("test-code", result.get("code"));
    assertTrue(latch.await(1, TimeUnit.SECONDS));
  }
}
