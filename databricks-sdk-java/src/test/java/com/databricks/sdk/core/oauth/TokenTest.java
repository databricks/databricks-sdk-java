package com.databricks.sdk.core.oauth;

import static org.junit.jupiter.api.Assertions.*;

import com.databricks.sdk.core.utils.FakeClockSupplier;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import org.junit.jupiter.api.Test;

class TokenTest {

  private static final String accessToken = "testAccessToken";
  private static final String refreshToken = "testRefreshToken";
  private static final String tokenType = "testTokenType";
  private final LocalDateTime currentLocalDateTime;
  private final FakeClockSupplier fakeClockSupplier;

  TokenTest() {
    Instant instant = Instant.parse("2023-10-18T12:00:00.00Z");
    ZoneId zoneId = ZoneId.of("UTC");
    fakeClockSupplier = new FakeClockSupplier(instant, zoneId);
    currentLocalDateTime = LocalDateTime.now(fakeClockSupplier.getClock());
  }

  @Test
  void createNonRefreshableToken() {
    Token token =
        new Token(accessToken, tokenType, currentLocalDateTime.plusMinutes(5), fakeClockSupplier);
    assertEquals(accessToken, token.getAccessToken());
    assertEquals(tokenType, token.getTokenType());
    assertNull(token.getRefreshToken());
    assertTrue(token.isValid());
  }

  @Test
  void createRefreshableToken() {
    Token token =
        new Token(
            accessToken,
            tokenType,
            refreshToken,
            currentLocalDateTime.plusMinutes(5),
            fakeClockSupplier);
    assertEquals(accessToken, token.getAccessToken());
    assertEquals(tokenType, token.getTokenType());
    assertEquals(refreshToken, token.getRefreshToken());
    assertTrue(token.isValid());
  }

  @Test
  void tokenExpiryMoreThan40Seconds() {
    Token token =
        new Token(accessToken, tokenType, currentLocalDateTime.plusSeconds(50), fakeClockSupplier);
    assertFalse(token.isExpired());
    assertTrue(token.isValid());
  }

  @Test
  void tokenExpiryLessThan40Seconds() {
    Token token =
        new Token(accessToken, tokenType, currentLocalDateTime.plusSeconds(30), fakeClockSupplier);
    assertTrue(token.isExpired());
    assertFalse(token.isValid());
  }

  @Test
  void expiredToken() {
    Token token =
        new Token(accessToken, tokenType, currentLocalDateTime.minusSeconds(10), fakeClockSupplier);
    assertTrue(token.isExpired());
    assertFalse(token.isValid());
  }

  @Test
  void tokenLifetimeInFuture() {
    Token token =
        new Token(accessToken, tokenType, currentLocalDateTime.plusMinutes(10), fakeClockSupplier);
    assertEquals(java.time.Duration.ofMinutes(10), token.getLifetime());
  }

  @Test
  void tokenLifetimeExpired() {
    Token token =
        new Token(accessToken, tokenType, currentLocalDateTime.minusMinutes(2), fakeClockSupplier);
    assertEquals(java.time.Duration.ofMinutes(-2), token.getLifetime());
  }

  @Test
  void tokenLifetimeZero() {
    Token token = new Token(accessToken, tokenType, currentLocalDateTime, fakeClockSupplier);
    assertEquals(java.time.Duration.ZERO, token.getLifetime());
  }
}
