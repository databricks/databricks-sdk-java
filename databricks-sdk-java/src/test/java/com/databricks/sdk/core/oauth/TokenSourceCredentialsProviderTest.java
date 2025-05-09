package com.databricks.sdk.core.oauth;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import com.databricks.sdk.core.DatabricksConfig;
import com.databricks.sdk.core.DatabricksException;
import com.databricks.sdk.core.HeaderFactory;
import java.time.LocalDateTime;
import java.util.Map;
import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

/** Tests for TokenSourceCredentialsProvider */
class TokenSourceCredentialsProviderTest {
  private TokenSourceCredentialsProvider provider;
  private static final String TEST_AUTH_TYPE = "test-auth-type";
  private static final String TEST_ACCESS_TOKEN_VALUE = "test-access-token";
  private static final Token TEST_TOKEN =
      new Token(TEST_ACCESS_TOKEN_VALUE, "Bearer", LocalDateTime.now().plusHours(1));

  /** Tests token retrieval scenarios */
  @ParameterizedTest(name = "{0}")
  @MethodSource("provideTokenScenarios")
  void testTokenScenarios(
      String testName,
      TokenSource mockTokenSource,
      String expectedAuthHeader,
      Exception expectedException) {
    provider = new TokenSourceCredentialsProvider(mockTokenSource, TEST_AUTH_TYPE);
    DatabricksConfig config = new DatabricksConfig();
    HeaderFactory headerFactory = provider.configure(config);

    if (expectedException != null) {
      assertNull(headerFactory);
    } else {
      assertNotNull(headerFactory);
      Map<String, String> headers = headerFactory.headers();
      assertEquals(expectedAuthHeader, headers.get("Authorization"));
    }
    verify(mockTokenSource).getToken();
    assertEquals(TEST_AUTH_TYPE, provider.authType());
  }

  /** Provides test scenarios */
  private static Stream<Arguments> provideTokenScenarios() {
    // Mock behaviour of successful token retrieval
    TokenSource mockSuccessTokenSource = mock(TokenSource.class);
    when(mockSuccessTokenSource.getToken()).thenReturn(TEST_TOKEN);

    // Mock behaviour of failing token retrieval
    TokenSource mockFailureTokenSource = mock(TokenSource.class);
    when(mockFailureTokenSource.getToken())
        .thenThrow(new DatabricksException("Token retrieval failed"));

    return Stream.of(
        // Success case
        Arguments.of(
            "Successful token retrieval",
            mockSuccessTokenSource,
            "Bearer " + TEST_ACCESS_TOKEN_VALUE,
            null),
        // Failure case
        Arguments.of(
            "Failed token retrieval",
            mockFailureTokenSource,
            null,
            new DatabricksException("Token retrieval failed")));
  }
}
