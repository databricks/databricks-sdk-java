package com.databricks.sdk.client.oauth;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.databricks.sdk.client.DatabricksConfig;
import com.databricks.sdk.client.DatabricksException;
import com.databricks.sdk.client.FixtureServer;
import com.databricks.sdk.client.commons.CommonsHttpClient;
import java.io.IOException;
import org.junit.jupiter.api.Test;

public class ExternalBrowserCredentialsProviderTest {
  @Test
  void OAuthClientTest() {
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
      OAuthClient testClient;
      try {
        testClient = new OAuthClient(config);
        Consent testConsent = testClient.initiateConsent();
      } catch (IOException e) {
        throw new DatabricksException(e.getMessage());
      }
      assertEquals(testClient.getClientId(), clientID);
    } catch (IOException e) {
      throw new DatabricksException(e.getMessage());
    }
  }
}
