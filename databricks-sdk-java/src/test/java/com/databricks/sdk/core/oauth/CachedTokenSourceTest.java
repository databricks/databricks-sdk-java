package com.databricks.sdk.core.oauth;

import static org.junit.jupiter.api.Assertions.*;

import com.databricks.sdk.core.utils.TestClockSupplier;
import java.time.Duration;
import java.time.Instant;
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

  // Token TTL for the stale scenario: 4 minutes.
  // dynamicStaleDuration = min(4/2, 20) = 2 min.
  // After advancing the clock by STALE_ADVANCE_MINUTES = 3, lifeTime = 1 min.
  // 1 min ≤ 2 min (stale) and 1 min > 40s (not expired) → STALE.
  private static final long STALE_MINUTES = 4;
  private static final long STALE_ADVANCE_MINUTES = 3;

  // Token TTL for the capped stale duration scenario: 60 minutes.
  // dynamicStaleDuration = min(60/2, 20) = 20 min (MAX_STALE_DURATION cap).
  // After advancing the clock by CAPPED_STALE_ADVANCE_MINUTES = 41, lifeTime = 19 min.
  // 19 min ≤ 20 min (stale) and 19 min > 40s (not expired) → STALE.
  private static final long CAPPED_STALE_MINUTES = 60;
  private static final long CAPPED_STALE_ADVANCE_MINUTES = 41;

  private static final long EXPIRED_MINUTES = -1;

  private static Stream<Arguments> provideAsyncRefreshScenarios() {
    return Stream.of(
        Arguments.of("Fresh token, async enabled", FRESH_MINUTES, 0L, false, false, INITIAL_TOKEN),
        Arguments.of(
            "Stale token, async enabled",
            STALE_MINUTES,
            STALE_ADVANCE_MINUTES,
            false,
            true,
            INITIAL_TOKEN),
        Arguments.of(
            "Expired token, async enabled", EXPIRED_MINUTES, 0L, false, true, REFRESH_TOKEN),
        Arguments.of("Fresh token, async disabled", FRESH_MINUTES, 0L, true, false, INITIAL_TOKEN),
        Arguments.of(
            "Stale token, async disabled",
            STALE_MINUTES,
            STALE_ADVANCE_MINUTES,
            true,
            false,
            INITIAL_TOKEN),
        Arguments.of(
            "Stale token, capped stale duration, async enabled",
            CAPPED_STALE_MINUTES,
            CAPPED_STALE_ADVANCE_MINUTES,
            false,
            true,
            INITIAL_TOKEN),
        Arguments.of(
            "Expired token, async disabled", EXPIRED_MINUTES, 0L, true, true, REFRESH_TOKEN));
  }

  @ParameterizedTest(name = "{0}")
  @MethodSource("provideAsyncRefreshScenarios")
  void testAsyncRefreshParametrized(
      String testName,
      long minutesUntilExpiry,
      long clockAdvanceMinutes,
      boolean asyncDisabled,
      boolean expectRefresh,
      String expectedToken)
      throws Exception {

    TestClockSupplier clockSupplier = new TestClockSupplier(Instant.now());

    Token initialToken =
        new Token(
            INITIAL_TOKEN,
            TOKEN_TYPE,
            null,
            Instant.now(clockSupplier.getClock()).plus(Duration.ofMinutes(minutesUntilExpiry)));
    Token refreshedToken =
        new Token(
            REFRESH_TOKEN,
            TOKEN_TYPE,
            null,
            Instant.now(clockSupplier.getClock()).plus(Duration.ofMinutes(10)));
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
            .setAsyncDisabled(asyncDisabled)
            .setToken(initialToken)
            .setClockSupplier(clockSupplier)
            .build();

    // Advance the clock to put the token in the expected state before calling getToken().
    clockSupplier.advanceTime(Duration.ofMinutes(clockAdvanceMinutes));

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

    // Create a token with a TTL of 4 minutes that will be stale in 3 minutes.
    Token staleToken =
        new Token(
            INITIAL_TOKEN,
            TOKEN_TYPE,
            null,
            Instant.now(clockSupplier.getClock()).plus(Duration.ofMinutes(4)));

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
            .setAsyncDisabled(false)
            .setToken(staleToken)
            .setClockSupplier(clockSupplier)
            .build();

    // Advance clock to put the token in the stale window.
    clockSupplier.advanceTime(Duration.ofMinutes(3));

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
    Thread.sleep(600);
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
    Thread.sleep(600);
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
}
