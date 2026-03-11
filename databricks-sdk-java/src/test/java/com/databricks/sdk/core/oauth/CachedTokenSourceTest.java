package com.databricks.sdk.core.oauth;

import static org.junit.jupiter.api.Assertions.*;

import com.databricks.sdk.core.utils.TestClockSupplier;
import java.lang.reflect.Field;
import java.time.Duration;
import java.time.Instant;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.BooleanSupplier;
import java.util.stream.Stream;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class CachedTokenSourceTest {
  private static final String TOKEN_TYPE = "Bearer";
  private static final String INITIAL_TOKEN = "initial-token";
  private static final String REFRESH_TOKEN = "refreshed-token";
  private static final Instant BASE_TIME = Instant.parse("2026-03-09T00:00:00Z");

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

  private static Token tokenExpiringAt(String accessToken, Instant expiry) {
    return new Token(accessToken, TOKEN_TYPE, null, expiry);
  }

  /**
   * Reads the private {@code staleAfter} field so the tests can verify the exact threshold computed
   * by {@link CachedTokenSource} without changing the production API just for test visibility.
   */
  private static Instant getStaleAfter(CachedTokenSource source) throws Exception {
    Field staleAfterField = CachedTokenSource.class.getDeclaredField("staleAfter");
    staleAfterField.setAccessible(true);
    return (Instant) staleAfterField.get(source);
  }

  private static boolean getRefreshInProgress(CachedTokenSource source) throws Exception {
    Field f = CachedTokenSource.class.getDeclaredField("refreshInProgress");
    f.setAccessible(true);
    return (boolean) f.get(source);
  }

  /**
   * Polls a condition until it becomes true or the timeout expires. This keeps the async-refresh
   * tests deterministic without relying on long fixed sleeps.
   */
  private static void awaitCondition(String message, BooleanSupplier condition) throws Exception {
    long deadlineNanos = System.nanoTime() + TimeUnit.SECONDS.toNanos(1);
    while (System.nanoTime() < deadlineNanos) {
      if (condition.getAsBoolean()) {
        return;
      }
      Thread.sleep(10);
    }
    fail(message);
  }

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
   * Supplies coverage for the two stale-threshold strategies supported by the cache:
   *
   * <p>Dynamic mode computes {@code staleAfter} from the token TTL and caps the stale window at
   * twenty minutes. Legacy mode uses the stale duration explicitly provided through the builder.
   * The scenarios also cover null initial tokens and already-expired tokens to document how those
   * edge cases initialize the cached threshold.
   */
  private static Stream<Arguments> provideStaleAfterScenarios() {
    return Stream.of(
        Arguments.of(
            "Dynamic staleAfter uses half the TTL",
            tokenExpiringAt(INITIAL_TOKEN, BASE_TIME.plus(Duration.ofMinutes(4))),
            null,
            BASE_TIME.plus(Duration.ofMinutes(2))),
        Arguments.of(
            "Dynamic staleAfter is capped at twenty minutes",
            tokenExpiringAt(INITIAL_TOKEN, BASE_TIME.plus(Duration.ofMinutes(60))),
            null,
            BASE_TIME.plus(Duration.ofMinutes(40))),
        Arguments.of(
            "Dynamic staleAfter clamps expired tokens to expiry",
            tokenExpiringAt(INITIAL_TOKEN, BASE_TIME.minus(Duration.ofMinutes(1))),
            null,
            BASE_TIME.minus(Duration.ofMinutes(1))),
        Arguments.of(
            "Legacy staleAfter uses the builder stale duration",
            tokenExpiringAt(INITIAL_TOKEN, BASE_TIME.plus(Duration.ofMinutes(10))),
            Duration.ofMinutes(3),
            BASE_TIME.plus(Duration.ofMinutes(7))),
        Arguments.of(
            "Legacy staleAfter honors a stale duration longer than the remaining TTL",
            tokenExpiringAt(INITIAL_TOKEN, BASE_TIME.plus(Duration.ofMinutes(4))),
            Duration.ofMinutes(5),
            BASE_TIME.minus(Duration.ofMinutes(1))),
        Arguments.of("No initial token leaves staleAfter unset in dynamic mode", null, null, null),
        Arguments.of(
            "No initial token leaves staleAfter unset in legacy mode",
            null,
            Duration.ofMinutes(5),
            null));
  }

  /**
   * Verifies that {@link CachedTokenSource} computes {@code staleAfter} correctly for both the
   * default dynamic behavior and the legacy builder-provided stale duration path.
   *
   * <p>Each scenario builds the cache with a deterministic test clock, inspects the private {@code
   * staleAfter} field via reflection, and compares it with the expected threshold for the
   * configured token and builder options. The token source is a stub because this test only
   * validates initialization logic and should never trigger a refresh.
   */
  @ParameterizedTest(name = "{0}")
  @MethodSource("provideStaleAfterScenarios")
  void testStaleAfterComputationParametrized(
      String testName, Token initialToken, Duration staleDuration, Instant expectedStaleAfter)
      throws Exception {
    TestClockSupplier clockSupplier = new TestClockSupplier(BASE_TIME);

    CachedTokenSource.Builder builder =
        new CachedTokenSource.Builder(
                () -> {
                  throw new UnsupportedOperationException(
                      "Token refresh should not be invoked when computing staleAfter");
                })
            .setClockSupplier(clockSupplier);

    if (initialToken != null) {
      builder.setToken(initialToken);
    }
    if (staleDuration != null) {
      builder.setStaleDuration(staleDuration);
    }

    CachedTokenSource source = builder.build();

    assertEquals(
        expectedStaleAfter,
        getStaleAfter(source),
        "Computed staleAfter did not match the expected value");
  }

  /**
   * Verifies that once an async refresh fails, repeated reads before the one-minute backoff has
   * elapsed keep serving the cached token and do not trigger another refresh attempt.
   */
  @Test
  void testGetTokenDoesNotRetryBeforeAsyncBackoffElapses() throws Exception {
    TestClockSupplier clockSupplier = new TestClockSupplier(BASE_TIME);
    AtomicInteger refreshCallCount = new AtomicInteger();
    CountDownLatch secondAttemptStarted = new CountDownLatch(1);

    TokenSource tokenSource =
        () -> {
          if (refreshCallCount.incrementAndGet() == 1) {
            throw new RuntimeException("Simulated async failure");
          }
          secondAttemptStarted.countDown();
          return tokenExpiringAt(
              REFRESH_TOKEN, Instant.now(clockSupplier.getClock()).plus(Duration.ofMinutes(10)));
        };

    CachedTokenSource source = buildStaleSource(tokenSource, clockSupplier);

    assertEquals(INITIAL_TOKEN, source.getToken().getAccessToken());

    Instant backoffThreshold = BASE_TIME.plus(Duration.ofMinutes(7));
    awaitCondition(
        "async refresh cycle should complete (staleAfter pushed forward, refreshInProgress reset)",
        () ->
            backoffThreshold.equals(getStaleAfterUnchecked(source))
                && !getRefreshInProgressUnchecked(source));

    assertEquals(INITIAL_TOKEN, source.getToken().getAccessToken());
    assertFalse(
        secondAttemptStarted.await(200, TimeUnit.MILLISECONDS),
        "No second refresh should start before the backoff has elapsed");
    assertEquals(1, refreshCallCount.get(), "Only the failed async refresh should have run");
  }

  /**
   * Verifies that once the async-refresh backoff has elapsed, the next stale read starts another
   * async refresh and the refreshed token is eventually published to the cache.
   */
  @Test
  void testGetTokenRetriesAfterAsyncBackoffElapsesAndUpdatesToken() throws Exception {
    TestClockSupplier clockSupplier = new TestClockSupplier(BASE_TIME);
    AtomicInteger refreshCallCount = new AtomicInteger();
    CountDownLatch secondAttemptStarted = new CountDownLatch(1);

    TokenSource tokenSource =
        () -> {
          if (refreshCallCount.incrementAndGet() == 1) {
            throw new RuntimeException("Simulated async failure");
          }
          secondAttemptStarted.countDown();
          return tokenExpiringAt(
              REFRESH_TOKEN, Instant.now(clockSupplier.getClock()).plus(Duration.ofMinutes(10)));
        };

    CachedTokenSource source = buildStaleSource(tokenSource, clockSupplier);

    assertEquals(INITIAL_TOKEN, source.getToken().getAccessToken());

    Instant backoffThreshold = BASE_TIME.plus(Duration.ofMinutes(7));
    awaitCondition(
        "async refresh cycle should complete (staleAfter pushed forward, refreshInProgress reset)",
        () ->
            backoffThreshold.equals(getStaleAfterUnchecked(source))
                && !getRefreshInProgressUnchecked(source));

    clockSupplier.advanceTime(Duration.ofMinutes(2));

    assertEquals(INITIAL_TOKEN, source.getToken().getAccessToken());
    assertTrue(
        secondAttemptStarted.await(1, TimeUnit.SECONDS),
        "A new async refresh should start once the backoff has elapsed");
    awaitCondition(
        "The refreshed token should be published after the retry succeeds",
        () -> REFRESH_TOKEN.equals(source.getToken().getAccessToken()));
    assertEquals(2, refreshCallCount.get(), "The cache should retry exactly once after backoff");
  }

  /**
   * Verifies that an async refresh result is discarded when the cache already holds a token with a
   * later expiry. This covers the concurrent scenario where a blocking refresh runs while an async
   * refresh is in flight: the async result is older and should not overwrite the newer cached
   * token.
   */
  @Test
  void testAsyncRefreshDiscardsOlderToken() throws Exception {
    TestClockSupplier clockSupplier = new TestClockSupplier(BASE_TIME);

    Token olderRefreshToken =
        tokenExpiringAt("older-async-token", BASE_TIME.plus(Duration.ofMinutes(8)));
    Token newerBlockingToken =
        tokenExpiringAt("newer-blocking-token", BASE_TIME.plus(Duration.ofMinutes(20)));

    CountDownLatch asyncRefreshStarted = new CountDownLatch(1);
    CountDownLatch allowAsyncToFinish = new CountDownLatch(1);
    AtomicInteger refreshCallCount = new AtomicInteger();

    TokenSource tokenSource =
        () -> {
          int call = refreshCallCount.incrementAndGet();
          if (call == 1) {
            asyncRefreshStarted.countDown();
            try {
              allowAsyncToFinish.await(5, TimeUnit.SECONDS);
            } catch (InterruptedException e) {
              Thread.currentThread().interrupt();
            }
            return olderRefreshToken;
          }
          return newerBlockingToken;
        };

    CachedTokenSource source =
        new CachedTokenSource.Builder(tokenSource)
            .setToken(tokenExpiringAt(INITIAL_TOKEN, BASE_TIME.plus(Duration.ofMinutes(10))))
            .setClockSupplier(clockSupplier)
            .build();

    // Advance clock so the token is stale, triggering an async refresh.
    clockSupplier.advanceTime(Duration.ofMinutes(6));
    Token staleResult = source.getToken();
    assertEquals(INITIAL_TOKEN, staleResult.getAccessToken());
    assertTrue(asyncRefreshStarted.await(1, TimeUnit.SECONDS), "Async refresh should have started");

    // While async refresh is blocked, advance time so the token expires and force a blocking
    // refresh that installs a newer token.
    clockSupplier.advanceTime(Duration.ofMinutes(4));
    Token blockingResult = source.getToken();
    assertEquals("newer-blocking-token", blockingResult.getAccessToken());

    // Let the async refresh finish — its older token should be discarded.
    allowAsyncToFinish.countDown();
    awaitCondition(
        "refreshInProgress should be reset after the async refresh completes",
        () -> !getRefreshInProgressUnchecked(source));

    assertEquals(
        "newer-blocking-token",
        source.getToken().getAccessToken(),
        "The newer blocking token should still be cached after the older async result is discarded");
  }

  /**
   * Builds a CachedTokenSource whose initial token is already stale. The clock is advanced past the
   * dynamic staleAfter threshold so the very first getToken call triggers an async refresh.
   */
  private static CachedTokenSource buildStaleSource(
      TokenSource tokenSource, TestClockSupplier clockSupplier) {
    CachedTokenSource source =
        new CachedTokenSource.Builder(tokenSource)
            .setToken(tokenExpiringAt(INITIAL_TOKEN, BASE_TIME.plus(Duration.ofMinutes(10))))
            .setClockSupplier(clockSupplier)
            .build();
    clockSupplier.advanceTime(Duration.ofMinutes(6));
    return source;
  }

  /** Wraps the checked reflection helper so it can be used inside polling lambdas. */
  private static Instant getStaleAfterUnchecked(CachedTokenSource source) {
    try {
      return getStaleAfter(source);
    } catch (Exception e) {
      throw new RuntimeException(e);
    }
  }

  private static boolean getRefreshInProgressUnchecked(CachedTokenSource source) {
    try {
      return getRefreshInProgress(source);
    } catch (Exception e) {
      throw new RuntimeException(e);
    }
  }
}
