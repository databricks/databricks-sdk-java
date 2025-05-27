package com.databricks.sdk.core.oauth;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.time.LocalDateTime;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;
import java.util.stream.Stream;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class OAuthHeaderFactoryTest {

  private static final String TOKEN_TYPE = "Bearer";
  private static final String TOKEN_VALUE = "test-token";

  @Mock private TokenSource tokenSource;

  private static Stream<Arguments> provideTokenSourceTestCases() {
    LocalDateTime expiry = LocalDateTime.now().plusHours(1);
    Token token = new Token(TOKEN_VALUE, TOKEN_TYPE, expiry);

    return Stream.of(
        Arguments.of(
            "Standard token source",
            token,
            Collections.singletonMap("Authorization", TOKEN_TYPE + " " + TOKEN_VALUE)),
        Arguments.of(
            "Token with custom type",
            new Token(TOKEN_VALUE, "Custom", expiry),
            Collections.singletonMap("Authorization", "Custom " + TOKEN_VALUE)));
  }

  @ParameterizedTest(name = "{0}")
  @MethodSource("provideTokenSourceTestCases")
  public void testFromTokenSourceFactoryMethod(
      String testName, Token token, Map<String, String> expectedHeaders) {
    when(tokenSource.getToken()).thenReturn(token);

    OAuthHeaderFactory factory = OAuthHeaderFactory.fromTokenSource(tokenSource);

    assertNotNull(factory, "Factory should not be null");

    Token actualToken = factory.getToken();
    assertEquals(token, actualToken, "Factory should return the same token as the source");

    Map<String, String> headers = factory.headers();
    assertEquals(expectedHeaders, headers, "Factory should generate correct headers");
  }

  private static Stream<Arguments> provideSuppliersTestCases() {
    LocalDateTime expiry = LocalDateTime.now().plusHours(1);
    Token token = new Token(TOKEN_VALUE, TOKEN_TYPE, expiry);

    Map<String, String> standardHeaders = new HashMap<>();
    standardHeaders.put("Authorization", TOKEN_TYPE + " " + TOKEN_VALUE);
    standardHeaders.put("Content-Type", "application/json");

    Map<String, String> multipleHeaders = new HashMap<>();
    multipleHeaders.put("Authorization", TOKEN_TYPE + " " + TOKEN_VALUE);
    multipleHeaders.put("X-Custom-Header", "custom-value");
    multipleHeaders.put("Accept", "application/json");

    return Stream.of(
        Arguments.of("Standard suppliers", token, standardHeaders),
        Arguments.of("Empty headers", token, new HashMap<>()),
        Arguments.of("Multiple custom headers", token, multipleHeaders));
  }

  @ParameterizedTest(name = "{0}")
  @MethodSource("provideSuppliersTestCases")
  public void testFromSuppliersFactoryMethod(
      String testName, Token token, Map<String, String> expectedHeaders) {
    Supplier<Token> tokenSupplier = () -> token;
    Supplier<Map<String, String>> headerSupplier = () -> new HashMap<>(expectedHeaders);

    OAuthHeaderFactory factory = OAuthHeaderFactory.fromSuppliers(tokenSupplier, headerSupplier);

    assertNotNull(factory, "Factory should not be null");

    Token actualToken = factory.getToken();
    assertEquals(token, actualToken, "Factory should return the same token as the supplier");

    Map<String, String> actualHeaders = factory.headers();
    assertEquals(
        expectedHeaders, actualHeaders, "Factory should return the same headers as the supplier");
  }
}
