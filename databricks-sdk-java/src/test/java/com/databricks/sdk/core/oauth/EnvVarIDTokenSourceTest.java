package com.databricks.sdk.core.oauth;

import static org.junit.jupiter.api.Assertions.*;

import com.databricks.sdk.core.DatabricksException;
import com.databricks.sdk.core.utils.Environment;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

/** Tests for EnvVarIDTokenSource. */
public class EnvVarIDTokenSourceTest {
  private static final String TEST_ENV_VAR_NAME = "TEST_ID_TOKEN";
  private static final String TEST_TOKEN = "test-id-token";
  private static final String TEST_AUDIENCE = "test-audience";

  private Environment createTestEnvironment(Map<String, String> envVars) {
    return new Environment(envVars, new String[0], "test");
  }

  private static Stream<Arguments> provideTestCases() {
    return Stream.of(
        // Test case: Success case
        Arguments.of(
            "Success case",
            TEST_ENV_VAR_NAME,
            createEnvVars(TEST_ENV_VAR_NAME, TEST_TOKEN),
            TEST_TOKEN,
            null),
        // Test case: Null environment variable name
        Arguments.of(
            "Null environment variable name",
            null,
            new HashMap<>(),
            null,
            IllegalArgumentException.class),
        // Test case: Empty environment variable name
        Arguments.of(
            "Empty environment variable name",
            "",
            new HashMap<>(),
            null,
            IllegalArgumentException.class),
        // Test case: Missing environment variable
        Arguments.of(
            "Missing environment variable",
            TEST_ENV_VAR_NAME,
            new HashMap<>(),
            null,
            DatabricksException.class),
        // Test case: Empty token value
        Arguments.of(
            "Empty token value",
            TEST_ENV_VAR_NAME,
            createEnvVars(TEST_ENV_VAR_NAME, ""),
            null,
            DatabricksException.class),
        // Test case: Null environment
        Arguments.of(
            "Null environment", TEST_ENV_VAR_NAME, null, null, IllegalArgumentException.class));
  }

  private static Map<String, String> createEnvVars(String key, String value) {
    Map<String, String> envVars = new HashMap<>();
    envVars.put(key, value);
    return envVars;
  }

  @ParameterizedTest(name = "{0}")
  @MethodSource("provideTestCases")
  void testGetIDToken(
      String testName,
      String envVarName,
      Map<String, String> envVars,
      String expectedToken,
      Class<? extends Exception> expectedException) {
    Environment env = envVars != null ? createTestEnvironment(envVars) : null;
    EnvVarIDTokenSource source = new EnvVarIDTokenSource(envVarName, env);

    if (expectedException != null) {
      assertThrows(expectedException, () -> source.getIDToken(TEST_AUDIENCE));
    } else {
      IDToken token = source.getIDToken(TEST_AUDIENCE);
      assertNotNull(token);
      assertEquals(expectedToken, token.getValue());
    }
  }
}
