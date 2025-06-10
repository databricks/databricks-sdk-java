package com.databricks.sdk.core.oauth;

import static org.junit.jupiter.api.Assertions.*;

import java.time.Instant;
import org.junit.jupiter.api.Test;

class TokenTest {

  private static final String accessToken = "testAccessToken";
  private static final String refreshToken = "testRefreshToken";
  private static final String tokenType = "testTokenType";
  private static final Instant currentInstant = Instant.now();

  @Test
  void createNonRefreshableToken() {
    Token token = new Token(accessToken, tokenType, currentInstant.plusSeconds(300));
    assertEquals(accessToken, token.getAccessToken());
    assertEquals(tokenType, token.getTokenType());
    assertNull(token.getRefreshToken());
  }

  @Test
  void createRefreshableToken() {
    Token token = new Token(accessToken, tokenType, refreshToken, currentInstant.plusSeconds(300));
    assertEquals(accessToken, token.getAccessToken());
    assertEquals(tokenType, token.getTokenType());
    assertEquals(refreshToken, token.getRefreshToken());
  }
}
