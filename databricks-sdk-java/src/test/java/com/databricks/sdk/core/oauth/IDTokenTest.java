package com.databricks.sdk.core.oauth;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class IDTokenTest {

  private static final String accessToken = "testIdToken";

  @Test
  void testIDTokenWithValue() {
    IDToken idToken = new IDToken(accessToken);
    assertEquals(accessToken, idToken.getValue());
  }

  @Test
  void testIDTokenWithNullValue() {
    assertThrows(IllegalArgumentException.class, () -> new IDToken(null));
  }
}
