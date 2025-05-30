package com.databricks.sdk.core.oauth;

import static org.junit.jupiter.api.Assertions.*;

import com.databricks.sdk.core.utils.FakeClockSupplier;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
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
  private static final String REFRESHED_TOKEN = "refreshed-token";
  private static final Instant FIXED_INSTANT = Instant.parse("2023-10-18T12:00:00.00Z");
  private static final ZoneId ZONE_ID = ZoneId.of("UTC");

  @ParameterizedTest(name = "{0}")
  @MethodSource("provideAsyncRefreshScenarios")
  void testAsyncRefreshParametrized(
      String testName,
      long minutesUntilExpiry,
      boolean asyncEnabled,
      boolean expectRefresh,
      boolean expectRefreshedToken)
      throws Exception {
    FakeClockSupplier fakeClock = new FakeClockSupplier(FIXED_INSTANT, ZONE_ID);
    LocalDateTime currentTime = LocalDateTime.now(fakeClock.getClock());
    Token initialToken =
        new Token(
            INITIAL_TOKEN,
            TOKEN_TYPE,
            null,
            currentTime.plusMinutes(minutesUntilExpiry),
            fakeClock);
    Token refreshedToken =
        new Token(REFRESHED_TOKEN, TOKEN_TYPE, null, currentTime.plusMinutes(10), fakeClock);
    CountDownLatch refreshCalled = new CountDownLatch(1);

    RefreshableTokenSource source =
        new RefreshableTokenSource(initialToken) {
          @Override
          protected Token refresh() {
            refreshCalled.countDown();
            return refreshedToken;
          }
        }.enableAsyncRefresh(asyncEnabled);

    Token token1 = source.getToken();
    if (expectRefresh) {
      // Wait for async refresh if enabled, otherwise refresh is sync
      boolean refreshed = refreshCalled.await(2, TimeUnit.SECONDS);
      assertTrue(refreshed, "Refresh should have been triggered");
    } else {
      assertEquals(1, refreshCalled.getCount(), "Refresh should NOT have been triggered");
    }
    if (expectRefreshedToken) {
      // Wait for async to complete if needed
      for (int i = 0; i < 10; i++) {
        Token token2 = source.getToken();
        if (REFRESHED_TOKEN.equals(token2.getAccessToken())) {
          return; // Success
        }
        Thread.sleep(100);
      }
      fail("Token was not refreshed as expected");
    } else {
      assertEquals(INITIAL_TOKEN, token1.getAccessToken(), "Should return the initial token");
    }
  }

  private static Stream<Arguments> provideAsyncRefreshScenarios() {
    return Stream.of(
        Arguments.of("Fresh token, async enabled", 10, true, false, false),
        Arguments.of("Stale token, async enabled", 1, true, true, true),
        Arguments.of("Expired token, async enabled", -1, true, true, true),
        Arguments.of("Fresh token, async disabled", 10, false, false, false),
        Arguments.of("Stale token, async disabled", 1, false, false, false),
        Arguments.of("Expired token, async disabled", -1, false, true, true));
  }

  /**
   * This test verifies that if an asynchronous token refresh fails, the next refresh attempt is forced to be synchronous.
   * It ensures that after an async failure, the system does not repeatedly attempt async refreshes while the token is stale,
   * and only performs a synchronous refresh when the token is expired. After a successful sync refresh, async refreshes resume as normal.
   */
  @Test
  void testAsyncRefreshFailureFallback() throws Exception {
    FakeClockSupplier fakeClock = new FakeClockSupplier(FIXED_INSTANT, ZONE_ID);
    LocalDateTime currentTime = LocalDateTime.now(fakeClock.getClock());
    Token staleToken =
        new Token(INITIAL_TOKEN, TOKEN_TYPE, null, currentTime.plusMinutes(2), fakeClock);

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
            REFRESHED_TOKEN,
            TOKEN_TYPE,
            null,
            LocalDateTime.now(fakeClock.getClock()).plusMinutes(10),
            fakeClock);
      }
    }

    TestSource source = new TestSource(staleToken);
    source.enableAsyncRefresh(true);

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

    // Advance the clock so the token is now expired
    source.token =
        new Token(INITIAL_TOKEN, TOKEN_TYPE, null, currentTime.minusMinutes(1), fakeClock);

    // Now getToken() should call refresh synchronously and return the refreshed token
    Token token = source.getToken();
    assertEquals(
        REFRESHED_TOKEN,
        token.getAccessToken(),
        "Should return the refreshed token after sync refresh");
    assertEquals(
        2, source.refreshCallCount, "refresh() should have been called synchronously after expiry");

    // Make the token stale again and trigger async refresh since the last sync refresh succeeded
    source.token =
        new Token(INITIAL_TOKEN, TOKEN_TYPE, null, currentTime.plusMinutes(2), fakeClock);
    source.getToken();
    Thread.sleep(300);
    assertEquals(
        3,
        source.refreshCallCount,
        "refresh() should have been called again asynchronously after making token stale");
  }
}
