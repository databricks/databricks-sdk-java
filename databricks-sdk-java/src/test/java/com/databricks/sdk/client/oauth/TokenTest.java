package com.databricks.sdk.client.oauth;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;
import org.junit.jupiter.api.Test;

public class TokenTest {

  @Test
  void expiredToken() {
    LocalDateTime expiry = LocalDateTime.now();
    Token testToken = new Token("testAccessToken", "testTokenType", "testRefreshToken", expiry);
    assertTrue(testToken.isExpired());
  }

  @Test
  void validToken() {
    LocalDateTime expiry = LocalDateTime.now().plusHours(1);
    Token testToken = new Token("testAccessToken", "testTokenType", "testRefreshToken", expiry);
    assertTrue(testToken.isValid());
  }
}
