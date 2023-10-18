package com.databricks.sdk.core.oauth;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TokenTest {

  private static final String accessToken = "testAccessToken";
  private static final String refreshToken = "testRefreshToken";
  private static final String tokenType = "testTokenType";
  private LocalDateTime currentLocalDateTime;

  @BeforeEach
  void init() {
    currentLocalDateTime = LocalDateTime.now();
  }

  @Test
  void createNonRefreshableToken() {
    Token token = new Token(accessToken, tokenType, currentLocalDateTime.plusMinutes(5));
    assertEquals(accessToken, token.getAccessToken());
    assertEquals(tokenType, token.getTokenType());
    assertNull(token.getRefreshToken());
    assertTrue(token.isValid());
  }

  @Test
  void createRefreshableToken() {
    Token token =
        new Token(accessToken, tokenType, refreshToken, currentLocalDateTime.plusMinutes(5));
    assertEquals(accessToken, token.getAccessToken());
    assertEquals(tokenType, token.getTokenType());
    assertEquals(refreshToken, token.getRefreshToken());
    assertTrue(token.isValid());
  }

  @Test
  void tokenExpiryMoreThan40Seconds() {
    Token token = new Token(accessToken, tokenType, currentLocalDateTime.plusSeconds(50));
    assertFalse(token.isExpired());
    assertTrue(token.isValid());
  }

  @Test
  void tokenExpiryLessThan40Seconds() {
    Token token = new Token(accessToken, tokenType, currentLocalDateTime.plusSeconds(30));
    assertTrue(token.isExpired());
    assertFalse(token.isValid());
  }

  @Test
  void expiredToken() {
    Token token = new Token(accessToken, tokenType, currentLocalDateTime.minusSeconds(10));
    assertTrue(token.isExpired());
    assertFalse(token.isValid());
  }
}
