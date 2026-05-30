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
    assertEquals(currentInstant.plusSeconds(300), token.getExpiry());
  }

  @Test
  void createRefreshableToken() {
    Token token = new Token(accessToken, tokenType, refreshToken, currentInstant.plusSeconds(300));
    assertEquals(accessToken, token.getAccessToken());
    assertEquals(tokenType, token.getTokenType());
    assertEquals(refreshToken, token.getRefreshToken());
    assertEquals(currentInstant.plusSeconds(300), token.getExpiry());
  }

  @Test
  void canonicalTokenTypeNormalizesBearerCasing() {
    Instant expiry = currentInstant.plusSeconds(300);
    assertEquals("Bearer", new Token(accessToken, "Bearer", expiry).getCanonicalTokenType());
    assertEquals("Bearer", new Token(accessToken, "bearer", expiry).getCanonicalTokenType());
    assertEquals("Bearer", new Token(accessToken, "BEARER", expiry).getCanonicalTokenType());
    assertEquals("Bearer", new Token(accessToken, "BeArEr", expiry).getCanonicalTokenType());
  }

  @Test
  void canonicalTokenTypePreservesNonBearerSchemes() {
    Instant expiry = currentInstant.plusSeconds(300);
    assertEquals("Custom", new Token(accessToken, "Custom", expiry).getCanonicalTokenType());
    assertEquals("MAC", new Token(accessToken, "MAC", expiry).getCanonicalTokenType());
  }
}
