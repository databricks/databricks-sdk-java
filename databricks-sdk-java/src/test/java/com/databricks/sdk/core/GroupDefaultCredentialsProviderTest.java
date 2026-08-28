package com.databricks.sdk.core;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.databricks.sdk.core.http.Request;
import org.junit.jupiter.api.Test;

class GroupDefaultCredentialsProviderTest {
  // Verifies that the default chain skips an unsupported provider and reaches a group-aware M2M
  // provider instead of using credentials for the unassumed identity.
  @Test
  void defaultChainContinuesAfterUnsupportedProvider() {
    MappingHttpClient httpClient =
        new MappingHttpClient()
            .put("GET /.well-known/databricks-config", "{}")
            .put(
                "GET /oidc/.well-known/oauth-authorization-server",
                "{\"token_endpoint\":\"https://workspace.example/oidc/v1/token\"}")
            .put(
                "POST /oidc/v1/token",
                "{\"token_type\":\"Bearer\",\"access_token\":\"role-token\","
                    + "\"expires_in\":3600}");

    DatabricksConfig config =
        new DatabricksConfig()
            .setHost("https://workspace.example")
            .setDiscoveryUrl(
                "https://workspace.example/oidc/.well-known/oauth-authorization-server")
            .setToken("normal-pat-must-not-be-used")
            .setClientId("test-client")
            .setClientSecret("test-secret")
            .setGroupId("group-123");
    config.setHttpClient(httpClient);

    DefaultCredentialsProvider provider = new DefaultCredentialsProvider();
    HeaderFactory headers = provider.configure(config);

    assertEquals("Bearer role-token", headers.headers().get("Authorization"));
    assertEquals("oauth-m2m", provider.authType());

    Request tokenRequest = httpClient.singleRequest("POST", "/oidc/v1/token");
    assertTrue(tokenRequest.getBodyString().contains("assume_group=group-123"));
  }
}
