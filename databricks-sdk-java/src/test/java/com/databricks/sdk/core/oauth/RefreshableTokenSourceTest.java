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
  @Test
  void testAsyncRefresh() throws Exception {
    // Set up a fake clock and initial token that is about to become stale
    Instant now = Instant.parse("2023-10-18T12:00:00.00Z");
    ZoneId zoneId = ZoneId.of("UTC");
    FakeClockSupplier fakeClock = new FakeClockSupplier(now, zoneId);
    LocalDateTime currentTime = LocalDateTime.now(fakeClock.getClock());

    // Token expires in 2 minutes (less than the default stale duration of 3 minutes)
    Token initialToken =
        new Token("initial-token", "Bearer", null, currentTime.plusMinutes(2), fakeClock);

    CountDownLatch refreshCalled = new CountDownLatch(1);
    Token refreshedToken =
        new Token("refreshed-token", "Bearer", null, currentTime.plusMinutes(10), fakeClock);

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
        "initial-token", token1.getAccessToken(), "Should return the stale token immediately");

    // Wait for async refresh to complete (with timeout)
    boolean refreshed = refreshCalled.await(2, TimeUnit.SECONDS);
    assertTrue(refreshed, "Async refresh should have been triggered");

    // After refresh, getToken should return the refreshed token
    // (may need to wait a bit for the token to be set)
    for (int i = 0; i < 10; i++) {
      Token token2 = source.getToken();
      if ("refreshed-token".equals(token2.getAccessToken())) {
        return; // Success
      }
      Thread.sleep(100);
    }
    fail("Token was not refreshed asynchronously");
  }

  @Test
  void testSyncRefreshWhenExpired() {
    // Set up a fake clock and an expired token
    Instant now = Instant.parse("2023-10-18T12:00:00.00Z");
    ZoneId zoneId = ZoneId.of("UTC");
    FakeClockSupplier fakeClock = new FakeClockSupplier(now, zoneId);
    LocalDateTime currentTime = LocalDateTime.now(fakeClock.getClock());

    Token expiredToken =
        new Token("expired-token", "Bearer", null, currentTime.minusMinutes(1), fakeClock);
    Token refreshedToken =
        new Token("refreshed-token", "Bearer", null, currentTime.plusMinutes(10), fakeClock);

    final boolean[] refreshCalled = {false};
    RefreshableTokenSource source =
        new RefreshableTokenSource(expiredToken) {
          @Override
          protected Token refresh() {
            refreshCalled[0] = true;
            return refreshedToken;
          }
        }.enableAsyncRefresh(true);

    // Should call refresh synchronously and return the refreshed token
    Token token = source.getToken();
    assertTrue(refreshCalled[0], "refresh() should be called synchronously for expired token");
    assertEquals("refreshed-token", token.getAccessToken(), "Should return the refreshed token");
  }

  @Test
  void testNoRefreshWhenTokenIsFresh() {
    // Set up a fake clock and a fresh token
    Instant now = Instant.parse("2023-10-18T12:00:00.00Z");
    ZoneId zoneId = ZoneId.of("UTC");
    FakeClockSupplier fakeClock = new FakeClockSupplier(now, zoneId);
    LocalDateTime currentTime = LocalDateTime.now(fakeClock.getClock());

    Token freshToken =
        new Token("fresh-token", "Bearer", null, currentTime.plusMinutes(10), fakeClock);

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
    assertEquals("fresh-token", token.getAccessToken(), "Should return the fresh token");
  }
}
