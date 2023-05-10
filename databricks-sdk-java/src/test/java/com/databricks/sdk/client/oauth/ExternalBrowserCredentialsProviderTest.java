package com.databricks.sdk.client.oauth;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.databricks.sdk.core.DatabricksConfig;
import com.databricks.sdk.core.DatabricksException;
import com.databricks.sdk.core.FixtureServer;
import com.databricks.sdk.core.commons.CommonsHttpClient;
import java.io.IOException;

import com.databricks.sdk.core.oauth.Consent;
import com.databricks.sdk.core.oauth.OAuthClient;
import org.junit.jupiter.api.Test;

public class ExternalBrowserCredentialsProviderTest {
  @Test
  void clientAndConsentTest() {
    try (FixtureServer fixtures = new FixtureServer()) {
      fixtures.with(
          "GET /oidc/.well-known/oauth-authorization-server",
          "{\"token_endpoint\": \"token-test-end-point\"}");
      String clientID = "test-client-id";
      DatabricksConfig config =
          new DatabricksConfig()
              .setAuthType("external-browser")
              .setHost(fixtures.getUrl())
              .setClientId(clientID)
              .setHttpClient(new CommonsHttpClient(30));
      config.resolve();

      OAuthClient testClient = new OAuthClient(config);
      assertEquals(testClient.getClientId(), clientID);

      Consent testConsent = testClient.initiateConsent();
      assertEquals(testConsent.getTokenUrl(), "token-test-end-point");
    } catch (IOException e) {
      throw new DatabricksException(e.getMessage());
    }
  }

  @Test
  void consentExchange() {
    try (FixtureServer fixtures = new FixtureServer()) {
      fixtures.with(
              "GET /oidc/.well-known/oauth-authorization-server",
              "{\"token_endpoint\": \"token-test-end-point\"}");
      String clientID = "test-client-id";
      DatabricksConfig config =
              new DatabricksConfig()
                      .setAuthType("external-browser")
                      .setHost(fixtures.getUrl())
                      .setClientId(clientID)
                      .setHttpClient(new CommonsHttpClient(30));
      config.resolve();

      OAuthClient testClient = new OAuthClient(config);
      assertEquals(testClient.getClientId(), clientID);

      Consent testConsent = testClient.initiateConsent();
      assertEquals(testConsent.getTokenUrl(), "token-test-end-point");

      
    } catch (IOException e) {
      throw new DatabricksException(e.getMessage());
    }
  }
}
