package com.databricks.sdk.core.oauth;

import static org.junit.jupiter.api.Assertions.*;

import com.databricks.sdk.core.utils.FakeClockSupplier;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;

public class RefreshableTokenSourceTest {
    private static class MutableBoolean {
        boolean value = false;
    }
  private static final String TOKEN_TYPE = "Bearer";
  private static final String INITIAL_TOKEN = "initial-token";
  private static final String REFRESHED_TOKEN = "refreshed-token";
  private static final String EXPIRED_TOKEN = "expired-token";
  private static final String FRESH_TOKEN = "fresh-token";
  private static final Instant FIXED_INSTANT = Instant.parse("2023-10-18T12:00:00.00Z");
  private static final ZoneId ZONE_ID = ZoneId.of("UTC");

  @Test
  void testAsyncRefresh() throws Exception {
    FakeClockSupplier fakeClock = new FakeClockSupplier(FIXED_INSTANT, ZONE_ID);
    LocalDateTime currentTime = LocalDateTime.now(fakeClock.getClock());

    // Token expires in 2 minutes (less than the default stale duration of 3 minutes)
    Token initialToken =
        new Token(INITIAL_TOKEN, TOKEN_TYPE, null, currentTime.plusMinutes(2), fakeClock);

    CountDownLatch refreshCalled = new CountDownLatch(1);
    Token refreshedToken =
        new Token(REFRESHED_TOKEN, TOKEN_TYPE, null, currentTime.plusMinutes(10), fakeClock);

    // Subclass with a refresh() that signals when called
    RefreshableTokenSource source =
        new RefreshableTokenSource(initialToken) {
          @Override
          protected Token refresh() {
            refreshCalled.countDown();
            return refreshedToken;
          }
        }.enableAsyncRefresh(true);

    // First call should return the stale token and trigger async refresh
    Token token1 = source.getToken();
    assertEquals(
        INITIAL_TOKEN, token1.getAccessToken(), "Should return the stale token immediately");

    // Wait for async refresh to complete (with timeout)
    boolean refreshed = refreshCalled.await(2, TimeUnit.SECONDS);
    assertTrue(refreshed, "Async refresh should have been triggered");

    // After refresh, getToken should return the refreshed token
    // (may need to wait a bit for the token to be set)
    for (int i = 0; i < 10; i++) {
      Token token2 = source.getToken();
      if (REFRESHED_TOKEN.equals(token2.getAccessToken())) {
        return; // Success
      }
      Thread.sleep(100);
    }
    fail("Token was not refreshed asynchronously");
  }

  @Test
  void testSyncRefreshWhenExpired() {
    FakeClockSupplier fakeClock = new FakeClockSupplier(FIXED_INSTANT, ZONE_ID);
    LocalDateTime currentTime = LocalDateTime.now(fakeClock.getClock());

    Token expiredToken =
        new Token(EXPIRED_TOKEN, TOKEN_TYPE, null, currentTime.minusMinutes(1), fakeClock);
    Token refreshedToken =
        new Token(REFRESHED_TOKEN, TOKEN_TYPE, null, currentTime.plusMinutes(10), fakeClock);

    MutableBoolean refreshCalled = new MutableBoolean();
    RefreshableTokenSource source =
        new RefreshableTokenSource(expiredToken) {
          @Override
          protected Token refresh() {
            refreshCalled.value = true;
            return refreshedToken;
          }
        }.enableAsyncRefresh(true);

    // Should call refresh synchronously and return the refreshed token
    Token token = source.getToken();
    assertTrue(refreshCalled.value, "refresh() should be called synchronously for expired token");
    assertEquals(REFRESHED_TOKEN, token.getAccessToken(), "Should return the refreshed token");
  }

  @Test
  void testNoRefreshWhenTokenIsFresh() {
    FakeClockSupplier fakeClock = new FakeClockSupplier(FIXED_INSTANT, ZONE_ID);
    LocalDateTime currentTime = LocalDateTime.now(fakeClock.getClock());

    Token freshToken =
        new Token(FRESH_TOKEN, TOKEN_TYPE, null, currentTime.plusMinutes(10), fakeClock);

    RefreshableTokenSource source =
        new RefreshableTokenSource(freshToken) {
          @Override
          protected Token refresh() {
            fail("refresh() should not be called when token is fresh");
            return null;
          }
        };

    // Should return the fresh token and never call refresh
    Token token = source.getToken();
    assertEquals(FRESH_TOKEN, token.getAccessToken(), "Should return the fresh token");
  }

  @Test
  void testRefreshThrowsException() {
    FakeClockSupplier fakeClock = new FakeClockSupplier(FIXED_INSTANT, ZONE_ID);
    LocalDateTime currentTime = LocalDateTime.now(fakeClock.getClock());

    Token expiredToken =
        new Token(EXPIRED_TOKEN, TOKEN_TYPE, null, currentTime.minusMinutes(1), fakeClock);

    RefreshableTokenSource source =
        new RefreshableTokenSource(expiredToken) {
          @Override
          protected Token refresh() {
            throw new RuntimeException("Simulated refresh failure");
          }
        };

    RuntimeException thrown = assertThrows(
        RuntimeException.class,
        source::getToken,
        "getToken() should propagate exception from refresh() when token is expired");
    assertEquals("Simulated refresh failure", thrown.getMessage());
  }

  @Test
  void testFailedAsyncRefreshForcesNextRefreshToBeSynchronous() throws Exception {
    FakeClockSupplier fakeClock = new FakeClockSupplier(FIXED_INSTANT, ZONE_ID);
    LocalDateTime currentTime = LocalDateTime.now(fakeClock.getClock());
    // Token is stale (expires in 2 minutes)
    Token staleToken = new Token(INITIAL_TOKEN, TOKEN_TYPE, null, currentTime.plusMinutes(2), fakeClock);

    class TestSource extends RefreshableTokenSource {
      int refreshCallCount = 0;
      boolean failFirst = true;
      TestSource(Token token) { super(token); }
      @Override
      protected Token refresh() {
        refreshCallCount++;
        if (failFirst) {
          failFirst = false;
          throw new RuntimeException("Simulated async failure");
        }
        throw new RuntimeException("Simulated sync failure");
      }
    }

    TestSource source = new TestSource(staleToken);
    source.enableAsyncRefresh(true);

    // First call triggers async refresh, which fails
    source.getToken();
    Thread.sleep(300); // Give time for async refresh to run
    assertEquals(1, source.refreshCallCount, "refresh() should have been called once (async, failed)");

    // Token is still stale, so next call should NOT trigger another refresh
    source.getToken();
    Thread.sleep(200);
    assertEquals(1, source.refreshCallCount, "refresh() should NOT be called again while stale after async failure");

    // Advance the clock so the token is now expired
    source.token = new Token(
        INITIAL_TOKEN, TOKEN_TYPE, null, currentTime.minusMinutes(1), fakeClock);

    // Now getToken() should call refresh synchronously and throw
    RuntimeException thrown = assertThrows(
        RuntimeException.class,
        source::getToken,
        "getToken() should call refresh synchronously and propagate exception when expired");
    assertEquals("Simulated sync failure", thrown.getMessage());
    assertEquals(2, source.refreshCallCount, "refresh() should have been called synchronously after expiry");
  }
}
