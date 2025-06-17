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

public class RefreshableTokenSourceTest {
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

    RefreshableTokenSource source =
        new RefreshableTokenSource(initialToken) {
          @Override
          protected Token refresh() {
            refreshCalled.countDown();
            try {
              Thread.sleep(500);
            } catch (InterruptedException e) {
              Thread.currentThread().interrupt();
            }
            return refreshedToken;
          }
        }.withAsyncRefresh(asyncEnabled);

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
    // Create a test clock starting at current time
    TestClockSupplier clockSupplier = new TestClockSupplier(Instant.now());

    // Create a token that expires in 2 minutes from the initial clock time
    Token staleToken =
        new Token(
            INITIAL_TOKEN,
            TOKEN_TYPE,
            null,
            Instant.now(clockSupplier.getClock()).plus(Duration.ofMinutes(2)));

    class TestSource extends RefreshableTokenSource {
      int refreshCallCount = 0;
      boolean isFirstRefresh = true;

      TestSource(Token token) {
        super(token);
      }

      @Override
      protected Token refresh() {
        refreshCallCount++;
        if (isFirstRefresh) {
          isFirstRefresh = false;
          throw new RuntimeException("Simulated async failure");
        }
        return new Token(
            REFRESH_TOKEN,
            TOKEN_TYPE,
            null,
            Instant.now(clockSupplier.getClock()).plus(Duration.ofMinutes(10)));
      }
    }

    TestSource source = new TestSource(staleToken);
    source.withAsyncRefresh(true);
    source.withClockSupplier(clockSupplier);

    // First call triggers async refresh, which fails
    source.getToken();
    Thread.sleep(300);
    assertEquals(
        1, source.refreshCallCount, "refresh() should have been called once (async, failed)");

    // Token is still stale, so next call should NOT trigger another refresh since the last refresh
    // failed
    source.getToken();
    Thread.sleep(200);
    assertEquals(
        1,
        source.refreshCallCount,
        "refresh() should NOT be called again while stale after async failure");

    // Advance the clock by 3 minutes to make the token expired
    clockSupplier.advanceTime(Duration.ofMinutes(3));

    // Now getToken() should call refresh synchronously and return the refreshed token
    Token token = source.getToken();
    assertEquals(
        REFRESH_TOKEN,
        token.getAccessToken(),
        "Should return the refreshed token after sync refresh");
    assertEquals(
        2, source.refreshCallCount, "refresh() should have been called synchronously after expiry");

    // Advance time by 8 minutes to make the token stale again
    clockSupplier.advanceTime(Duration.ofMinutes(8));
    source.getToken();
    Thread.sleep(300);
    assertEquals(
        3,
        source.refreshCallCount,
        "refresh() should have been called again asynchronously after making token stale");
  }
}
