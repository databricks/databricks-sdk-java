package com.databricks.sdk.core.oauth;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.databricks.sdk.core.utils.ClockSupplier;
import com.databricks.sdk.core.utils.FakeClockSupplier;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Arrays;
import java.util.Iterator;
import org.junit.jupiter.api.Test;

public class CachedTokenTest {
  private static final ZoneId ZONE_ID = ZoneId.of("UTC");
  private static final Instant INSTANT_NOW = Instant.ofEpochSecond(0);
  private static final LocalDateTime NOW = LocalDateTime.ofInstant(INSTANT_NOW, ZONE_ID);
  private static final ClockSupplier FAKE_CLOCK = new FakeClockSupplier(INSTANT_NOW, ZONE_ID);
  private static final String TOKEN_TYPE = "test-token-type";

  @Test
  void shouldNotRefreshValidToken() {
    Token token1 = new Token("token1", TOKEN_TYPE, NOW.plusHours(1));
    Token token2 = new Token("token2", TOKEN_TYPE, NOW.plusHours(2));
    CachedTokenSource ts = new CachedTokenSource(FAKE_CLOCK, testTokenSource(token1, token2));

    assertEquals(ts.getToken(), token1);
    assertEquals(ts.getToken(), token1); // token1 remains valid
  }

  @Test
  void shouldRefreshInvalidToken() {
    Token token1 = new Token("token1", TOKEN_TYPE, NOW.minusHours(1));
    Token token2 = new Token("token2", TOKEN_TYPE, NOW.plusHours(1));
    CachedTokenSource ts = new CachedTokenSource(FAKE_CLOCK, testTokenSource(token1, token2));

    assertEquals(ts.getToken(), token1);
    assertEquals(ts.getToken(), token2);
    assertEquals(ts.getToken(), token2); // token2 remains valid
  }

  @Test
  void shouldRefresh40SecBeforeExpiry() {
    Token token1 = new Token("token1", TOKEN_TYPE, NOW.plusSeconds(40));
    Token token2 = new Token("token2", TOKEN_TYPE, NOW.plusSeconds(41));
    CachedTokenSource ts = new CachedTokenSource(FAKE_CLOCK, testTokenSource(token1, token2));

    assertEquals(ts.getToken(), token1);
    assertEquals(ts.getToken(), token2);
    assertEquals(ts.getToken(), token2); // token2 remains valid
  }

  // Return a TokenSource that iterates over the given input tokens.
  private static TokenSource testTokenSource(Token... inputTokens) {
    Iterator<Token> iterator = Arrays.asList(inputTokens).iterator();
    return iterator::next;
  }
}
