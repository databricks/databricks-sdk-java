package com.databricks.sdk.core.oauth;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;
import org.junit.jupiter.api.Test;

class TokenTest {

  private static final String accessToken = "testAccessToken";
  private static final String refreshToken = "testRefreshToken";
  private static final String tokenType = "testTokenType";
  private static final LocalDateTime currentLocalDateTime = LocalDateTime.now();

  @Test
  void createNonRefreshableToken() {
    Token token = new Token(accessToken, tokenType, currentLocalDateTime.plusMinutes(5));
    assertEquals(accessToken, token.getAccessToken());
    assertEquals(tokenType, token.getTokenType());
    assertNull(token.getRefreshToken());
  }

  @Test
  void createRefreshableToken() {
    Token token =
        new Token(accessToken, tokenType, refreshToken, currentLocalDateTime.plusMinutes(5));
    assertEquals(accessToken, token.getAccessToken());
    assertEquals(tokenType, token.getTokenType());
    assertEquals(refreshToken, token.getRefreshToken());
  }
}
