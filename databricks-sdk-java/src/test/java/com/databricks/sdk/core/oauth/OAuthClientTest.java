package com.databricks.sdk.core.oauth;

import static org.junit.jupiter.api.Assertions.*;

import com.databricks.sdk.core.FixtureServer;
import com.databricks.sdk.core.commons.CommonsHttpClient;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class OAuthClientTest {

  @ParameterizedTest(name = "{0}")
  @MethodSource("provideBuilderTestCases")
  void testOAuthClientBuilder(
      String displayName,
      String clientId,
      String clientSecret,
      String host,
      String redirectUrl,
      List<String> scopes,
      String accountId,
      String expectedTokenUrl,
      String expectedAuthUrl)
      throws IOException {

    FixtureServer.FixtureMapping fixture =
        new FixtureServer.FixtureMapping.Builder()
            .validateMethod("GET")
            .validatePath("/oidc/.well-known/oauth-authorization-server")
            .withResponse(
                "{\"token_endpoint\": \""
                    + expectedTokenUrl
                    + "\", \"authorization_endpoint\": \""
                    + expectedAuthUrl
                    + "\"}",
                200)
            .build();

    try (FixtureServer fixtures = new FixtureServer()) {
      fixtures.with(fixture);

      OAuthClient.Builder builder =
          new OAuthClient.Builder()
              .withHttpClient(new CommonsHttpClient.Builder().withTimeoutSeconds(30).build())
              .withClientId(clientId)
              .withClientSecret(clientSecret)
              .withHost(fixtures.getUrl())
              .withRedirectUrl(redirectUrl)
              .withScopes(scopes);
      if (accountId != null) {
        builder.withAccountId(accountId);
      }
      OAuthClient client = builder.build();

      // Verify builder properties.
      assertEquals(clientId, client.getClientId());
      assertEquals(clientSecret, client.getClientSecret());
      assertEquals(fixtures.getUrl(), client.getHost());
      assertEquals(redirectUrl, client.getRedirectUrl());
      assertEquals(expectedTokenUrl, client.getTokenUrl());
      assertEquals(expectedAuthUrl, client.getAuthUrl());

      // Handle scopes - if null was passed, OAuthClient uses default scopes.
      if (scopes == null) {
        List<String> defaultScopes = Arrays.asList("offline_access", "clusters", "sql");
        assertEquals(defaultScopes, client.getScopes());
      } else {
        assertEquals(scopes, client.getScopes());
      }
    }
  }

  static Stream<Arguments> provideBuilderTestCases() {
    return Stream.of(
        Arguments.of(
            "Basic host + scopes",
            "test-client-1",
            "test-secret-1",
            "https://test1.databricks.com",
            "http://localhost:8080/callback",
            Arrays.asList("clusters", "sql"),
            null,
            "https://test1.databricks.com/oidc/token",
            "https://test1.databricks.com/oidc/authorize"),
        Arguments.of(
            "Null client secret",
            "test-client-2",
            null,
            "https://test2.databricks.com",
            "http://localhost:9000/callback",
            Arrays.asList("sql", "jobs"),
            null,
            "https://test2.databricks.com/oidc/token",
            "https://test2.databricks.com/oidc/authorize"),
        Arguments.of(
            "Default scopes",
            "test-client-3",
            "test-secret-3",
            "https://test3.databricks.com",
            "http://localhost:7000/callback",
            null, // Will use default scopes
            null,
            "https://test3.databricks.com/oidc/token",
            "https://test3.databricks.com/oidc/authorize"),
        Arguments.of(
            "Accounts host with accountId",
            "account-client",
            "account-secret",
            "https://accounts.cloud.databricks.com",
            "http://localhost:8081/callback",
            Arrays.asList("clusters"),
            "my-account-id",
            "https://accounts.cloud.databricks.com/oidc/accounts/my-account-id/v1/token",
            "https://accounts.cloud.databricks.com/oidc/accounts/my-account-id/v1/authorize"));
  }
}
