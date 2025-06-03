package com.databricks.sdk.core.oauth;

import static org.junit.jupiter.api.Assertions.*;

import com.databricks.sdk.core.utils.FakeClockSupplier;
import java.time.Instant;
import java.time.ZoneId;
import org.junit.jupiter.api.Test;

class TokenTest {

  private static final String accessToken = "testAccessToken";
  private static final String refreshToken = "testRefreshToken";
  private static final String tokenType = "testTokenType";
  private final Instant currentInstant;
  private final FakeClockSupplier fakeClockSupplier;

  TokenTest() {
    Instant instant = Instant.parse("2023-10-18T12:00:00.00Z");
    ZoneId zoneId = ZoneId.of("UTC");
    fakeClockSupplier = new FakeClockSupplier(instant, zoneId);
    currentInstant = Instant.now(fakeClockSupplier.getClock());
  }

  @Test
  void createNonRefreshableToken() {
    Token token =
        new Token(accessToken, tokenType, currentInstant.plusSeconds(300), fakeClockSupplier);
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
            currentInstant.plusSeconds(300),
            fakeClockSupplier);
    assertEquals(accessToken, token.getAccessToken());
    assertEquals(tokenType, token.getTokenType());
    assertEquals(refreshToken, token.getRefreshToken());
    assertTrue(token.isValid());
  }

  @Test
  void tokenExpiryMoreThan40Seconds() {
    Token token =
        new Token(accessToken, tokenType, currentInstant.plusSeconds(50), fakeClockSupplier);
    assertFalse(token.isExpired());
    assertTrue(token.isValid());
  }

  @Test
  void tokenExpiryLessThan40Seconds() {
    Token token =
        new Token(accessToken, tokenType, currentInstant.plusSeconds(30), fakeClockSupplier);
    assertTrue(token.isExpired());
    assertFalse(token.isValid());
  }

  @Test
  void expiredToken() {
    Token token =
        new Token(accessToken, tokenType, currentInstant.minusSeconds(10), fakeClockSupplier);
    assertTrue(token.isExpired());
    assertFalse(token.isValid());
  }
}
