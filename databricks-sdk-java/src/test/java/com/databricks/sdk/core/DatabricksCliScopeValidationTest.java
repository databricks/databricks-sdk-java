package com.databricks.sdk.core;

import static org.junit.jupiter.api.Assertions.*;

import com.databricks.sdk.core.oauth.Token;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.nio.charset.StandardCharsets;
import java.time.Instant;
import java.util.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class DatabricksCliScopeValidationTest {

  private static final ObjectMapper MAPPER = new ObjectMapper();

  /** Builds a fake JWT (header.payload.signature) with the given claims. */
  private static String makeJwt(Map<String, Object> claims) {
    try {
      String header =
          Base64.getUrlEncoder()
              .withoutPadding()
              .encodeToString("{\"alg\":\"none\"}".getBytes(StandardCharsets.UTF_8));
      String payload =
          Base64.getUrlEncoder().withoutPadding().encodeToString(MAPPER.writeValueAsBytes(claims));
      return header + "." + payload + ".sig";
    } catch (Exception e) {
      throw new RuntimeException(e);
    }
  }

  private static Token makeToken(Map<String, Object> claims) {
    return new Token(makeJwt(claims), "Bearer", Instant.now().plusSeconds(3600));
  }

  static List<Arguments> scopeValidationCases() {
    return Arrays.asList(
        // Exact match (offline_access filtered out).
        Arguments.of(
            Collections.singletonMap("scope", "sql offline_access"),
            Collections.singletonList("sql"),
            false,
            "match"),
        // Mismatch throws.
        Arguments.of(
            Collections.singletonMap("scope", "all-apis offline_access"),
            Collections.singletonList("sql"),
            true,
            "mismatch"),
        // offline_access on token only — still equivalent.
        Arguments.of(
            Collections.singletonMap("scope", "all-apis offline_access"),
            Collections.singletonList("all-apis"),
            false,
            "offline_access_on_token_only"),
        // offline_access in config only — still equivalent.
        Arguments.of(
            Collections.singletonMap("scope", "all-apis"),
            Arrays.asList("all-apis", "offline_access"),
            false,
            "offline_access_in_config_only"),
        // Order should not matter.
        Arguments.of(
            Collections.singletonMap("scope", "clusters sql"),
            Arrays.asList("sql", "clusters"),
            false,
            "multiple_scopes_order_independent"),
        // Partial overlap is still a mismatch.
        Arguments.of(
            Collections.singletonMap("scope", "sql clusters"),
            Arrays.asList("sql", "compute"),
            true,
            "multiple_scopes_partial_overlap_mismatch"),
        // No scope claim in token — validation is skipped.
        Arguments.of(
            Collections.singletonMap("sub", "user@example.com"),
            Collections.singletonList("sql"),
            false,
            "no_scope_claim_skips_validation"));
  }

  @ParameterizedTest(name = "{3}")
  @MethodSource("scopeValidationCases")
  void testScopeValidation(
      Map<String, Object> tokenClaims,
      List<String> configuredScopes,
      boolean expectError,
      String testName) {
    Token token = makeToken(tokenClaims);

    if (expectError) {
      assertThrows(
          DatabricksCliCredentialsProvider.ScopeMismatchException.class,
          () -> DatabricksCliCredentialsProvider.validateTokenScopes(token, configuredScopes));
    } else {
      assertDoesNotThrow(
          () -> DatabricksCliCredentialsProvider.validateTokenScopes(token, configuredScopes));
    }
  }

  @Test
  void testNonJwtTokenSkipsValidation() {
    Token token = new Token("opaque-token-string", "Bearer", Instant.now().plusSeconds(3600));
    assertDoesNotThrow(
        () ->
            DatabricksCliCredentialsProvider.validateTokenScopes(
                token, Collections.singletonList("sql")));
  }

  @Test
  void testErrorMessageContainsReauthCommand() {
    Token token = makeToken(Collections.singletonMap("scope", "all-apis"));
    DatabricksCliCredentialsProvider.ScopeMismatchException e =
        assertThrows(
            DatabricksCliCredentialsProvider.ScopeMismatchException.class,
            () ->
                DatabricksCliCredentialsProvider.validateTokenScopes(
                    token, Arrays.asList("sql", "offline_access")));
    assertTrue(
        e.getMessage().contains("databricks auth login"),
        "Expected re-auth command in error message, got: " + e.getMessage());
    assertTrue(
        e.getMessage().contains("do not match the configured scopes"),
        "Expected scope mismatch details in error message, got: " + e.getMessage());
  }

  @Test
  void testScopesExplicitlySetFlag() {
    DatabricksConfig config = new DatabricksConfig();
    assertFalse(config.isScopesExplicitlySet());

    config.setScopes(Arrays.asList("sql", "clusters"));
    assertTrue(config.isScopesExplicitlySet());

    config.setScopes(Collections.emptyList());
    assertFalse(config.isScopesExplicitlySet(), "Empty list should not count as explicitly set");

    config.setScopes(null);
    assertFalse(config.isScopesExplicitlySet(), "null should not count as explicitly set");
  }
}
