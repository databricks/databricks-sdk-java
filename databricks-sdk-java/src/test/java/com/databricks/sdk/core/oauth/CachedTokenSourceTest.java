package com.databricks.sdk.core.oauth;

import static org.junit.jupiter.api.Assertions.*;

import com.databricks.sdk.core.utils.ClockSupplier;
import java.time.Clock;
import java.time.Duration;
import java.time.Instant;
import java.time.ZoneId;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class CachedTokenSourceTest {
  private static final String TOKEN_TYPE = "Bearer";
  private static final String INITIAL_TOKEN = "initial-token";
  private static final String REFRESH_TOKEN = "refreshed-token";
  private static final long FRESH_MINUTES = 10;
  private static final long STALE_MINUTES = 1;
  private static final long EXPIRED_MINUTES = -1;

  private static Stream<Arguments> provideAsyncRefreshScenarios() {
    return Stream.of(
        Arguments.of("Fresh token, async enabled", FRESH_MINUTES, true, false, INITIAL_TOKEN),
        Arguments.of("Stale token, async enabled", STALE_MINUTES, true, true, INITIAL_TOKEN),
        Arguments.of("Expired token, async enabled", EXPIRED_MINUTES, true, true, REFRESH_TOKEN),
        Arguments.of("Fresh token, async disabled", FRESH_MINUTES, false, false, INITIAL_TOKEN),
        Arguments.of("Stale token, async disabled", STALE_MINUTES, false, false, INITIAL_TOKEN),
        Arguments.of("Expired token, async disabled", EXPIRED_MINUTES, false, true, REFRESH_TOKEN));
  }

  @ParameterizedTest(name = "{0}")
  @MethodSource("provideAsyncRefreshScenarios")
  void testAsyncRefreshParametrized(
      String testName,
      long minutesUntilExpiry,
      boolean asyncEnabled,
      boolean expectRefresh,
      String expectedToken)
      throws Exception {

    Token initialToken =
        new Token(
            INITIAL_TOKEN,
            TOKEN_TYPE,
            null,
            Instant.now().plus(Duration.ofMinutes(minutesUntilExpiry)));
    Token refreshedToken =
        new Token(REFRESH_TOKEN, TOKEN_TYPE, null, Instant.now().plus(Duration.ofMinutes(10)));
    CountDownLatch refreshCalled = new CountDownLatch(1);

    TokenSource tokenSource =
        new TokenSource() {
          @Override
          public Token getToken() {
            refreshCalled.countDown();
            try {
              Thread.sleep(500);
            } catch (InterruptedException e) {
              Thread.currentThread().interrupt();
            }
            return refreshedToken;
          }
        };

    CachedTokenSource source =
        new CachedTokenSource.Builder(tokenSource)
            .withAsyncEnabled(asyncEnabled)
            .withToken(initialToken)
            .build();

    Token token = source.getToken();

    boolean refreshed = refreshCalled.await(1, TimeUnit.SECONDS);
    assertEquals(expectRefresh, refreshed, "Refresh should have been triggered");
    assertEquals(expectedToken, token.getAccessToken(), "Token value did not match expected");
  }

  /**
   * This test verifies that if an asynchronous token refresh fails, the next refresh attempt is
   * forced to be synchronous. It ensures that after an async failure, the system does not
   * repeatedly attempt async refreshes while the token is stale, and only performs a synchronous
   * refresh when the token is expired. After a successful sync refresh, async refreshes resume as
   * normal.
   */
  @Test
  void testAsyncRefreshFailureFallback() throws Exception {
    // Create a mutable clock supplier that we can control
    TestClockSupplier clockSupplier = new TestClockSupplier(Instant.now());

    // Create a token that will be stale (2 minutes until expiry)
    Token staleToken =
        new Token(
            INITIAL_TOKEN,
            TOKEN_TYPE,
            null,
            Instant.now(clockSupplier.getClock()).plus(Duration.ofMinutes(2)));

    class TestSource implements TokenSource {
      int refreshCallCount = 0;
      boolean isFirstRefresh = true;

      @Override
      public Token getToken() {
        refreshCallCount++;
        try {
          // Sleep to simulate token fetch delay
          Thread.sleep(500);
        } catch (InterruptedException e) {
          Thread.currentThread().interrupt();
        }
        if (isFirstRefresh) {
          isFirstRefresh = false;
          throw new RuntimeException("Simulated async failure");
        }
        // Return a token that expires in 10 minutes from current time
        return new Token(
            REFRESH_TOKEN + "-" + refreshCallCount,
            TOKEN_TYPE,
            null,
            Instant.now(clockSupplier.getClock()).plus(Duration.ofMinutes(10)));
      }
    }

    TestSource testSource = new TestSource();
    CachedTokenSource source =
        new CachedTokenSource.Builder(testSource)
            .withAsyncEnabled(true)
            .withToken(staleToken)
            .withClockSupplier(clockSupplier)
            .build();

    // First call triggers async refresh, which fails
    // Should return stale token immediately (async refresh)
    Token token = source.getToken();
    assertEquals(INITIAL_TOKEN, token.getAccessToken(), "Should return stale token immediately");
    Thread.sleep(600);
    assertEquals(
        1, testSource.refreshCallCount, "refresh() should have been called once (async, failed)");

    // Token is still stale, so next call should NOT trigger another refresh since the last refresh
    // failed
    token = source.getToken();
    assertEquals(INITIAL_TOKEN, token.getAccessToken(), "Should still return stale token");
    assertEquals(
        1,
        testSource.refreshCallCount,
        "refresh() should NOT be called again while stale after async failure");

    // Advance time by 3 minutes to make the token expired
    clockSupplier.advanceTime(Duration.ofMinutes(3));

    // Now getToken() should call refresh synchronously and return the refreshed token
    token = source.getToken();
    assertEquals(
        REFRESH_TOKEN + "-2",
        token.getAccessToken(),
        "Should return the refreshed token after sync refresh");
    assertEquals(
        2,
        testSource.refreshCallCount,
        "refresh() should have been called synchronously after expiry");

    // Advance time by 8 minutes to make the token stale again
    clockSupplier.advanceTime(Duration.ofMinutes(8));
    // Should return stale token immediately (async refresh)
    token = source.getToken();
    assertEquals(
        REFRESH_TOKEN + "-2", token.getAccessToken(), "Should return stale token immediately");
    Thread.sleep(600);
    assertEquals(
        3,
        testSource.refreshCallCount,
        "refresh() should have been called again asynchronously after making token stale");
  }

  private static class TestClockSupplier implements ClockSupplier {
    private Instant instant;

    TestClockSupplier(Instant instant) {
      this.instant = instant;
    }

    void advanceTime(Duration duration) {
      this.instant = instant.plus(duration);
    }

    @Override
    public Clock getClock() {
      return Clock.fixed(instant, ZoneId.of("UTC"));
    }
  }
}
