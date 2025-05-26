package com.databricks.sdk.core.oauth;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;
import org.junit.jupiter.api.Test;

public class OAuthHeaderFactoryFromSuppliersTest {

  private static final String TOKEN_TYPE = "Bearer";
  private static final String TOKEN_VALUE = "test-token";

  @Test
  public void testTokenAndHeaders() {
    Map<String, String> expectedHeaders = new HashMap<>();
    expectedHeaders.put("Authorization", TOKEN_TYPE + " " + TOKEN_VALUE);
    expectedHeaders.put("Content-Type", "application/json");

    Supplier<Token> tokenSupplier =
        () -> new Token(TOKEN_VALUE, TOKEN_TYPE, LocalDateTime.now().plusHours(1));
    Supplier<Map<String, String>> headerSupplier = () -> new HashMap<>(expectedHeaders);

    OAuthHeaderFactoryFromSuppliers factory =
        new OAuthHeaderFactoryFromSuppliers(tokenSupplier, headerSupplier);

    Token actualToken = factory.getToken();
    assertEquals(TOKEN_VALUE, actualToken.getAccessToken());
    assertEquals(TOKEN_TYPE, actualToken.getTokenType());

    Map<String, String> actualHeaders = factory.headers();
    assertEquals(expectedHeaders.size(), actualHeaders.size(), "Header maps should have same size");
    expectedHeaders.forEach(
        (key, value) ->
            assertEquals(
                value,
                actualHeaders.get(key),
                String.format("Header '%s' should have value '%s'", key, value)));
  }
}
