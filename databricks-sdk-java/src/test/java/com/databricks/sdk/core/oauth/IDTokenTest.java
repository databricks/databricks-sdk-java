package com.databricks.sdk.core.oauth;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class IDTokenTest {

  private static final String accessToken = "testIdToken";

  @Test
  void createIDToken() {
    IDToken idToken = new IDToken(accessToken);
    assertEquals(accessToken, idToken.getValue());
  }
}
