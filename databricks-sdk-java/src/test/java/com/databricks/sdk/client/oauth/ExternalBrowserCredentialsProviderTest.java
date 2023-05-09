package com.databricks.sdk.client.oauth;

import com.databricks.sdk.client.DatabricksConfig;
import com.databricks.sdk.client.DatabricksException;
import com.databricks.sdk.client.FixtureServer;
import com.databricks.sdk.client.commons.CommonsHttpClient;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class ExternalBrowserCredentialsProviderTest {
    @Test
    void OAuthClientTest() {
        try (FixtureServer fixtures = new FixtureServer()) {
            fixtures.with("GET /oidc/.well-known/oauth-authorization-server", "{\"\": []}");
            String clientID = "test-client-id";
            DatabricksConfig config = new DatabricksConfig()
                    .setAuthType("external-browser")
                    .setHost(fixtures.getUrl())
                    .setClientId(clientID)
                    .setHttpClient(new CommonsHttpClient(30));

            config.resolve();
            OAuthClient testClient;
            try {
                testClient = new OAuthClient(config);
            } catch (IOException e) {
                throw new DatabricksException(e.getMessage());
            }
            assertEquals(testClient.getClientId(), clientID);
        } catch (IOException e) {
            throw new DatabricksException(e.getMessage());
        }
    }
}
