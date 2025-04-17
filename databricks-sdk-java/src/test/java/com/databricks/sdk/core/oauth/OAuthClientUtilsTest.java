package com.databricks.sdk.core.oauth;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import com.databricks.sdk.core.DatabricksConfig;
import org.junit.jupiter.api.Test;

public class OAuthClientUtilsTest {

  @Test
  void resolveClientIdTest() {
    // Test with regular client ID
    DatabricksConfig config =
        new DatabricksConfig().setClientId("test-client-id").setAzureClientId("azure-client-id");
    assertEquals("test-client-id", OAuthClientUtils.resolveClientId(config));

    // Test with only Azure client ID
    config = new DatabricksConfig().setClientId(null).setAzureClientId("azure-client-id");
    assertEquals("azure-client-id", OAuthClientUtils.resolveClientId(config));

    // Test with no client IDs
    config = new DatabricksConfig().setClientId(null).setAzureClientId(null);
    assertEquals("databricks-cli", OAuthClientUtils.resolveClientId(config));
  }

  @Test
  void resolveClientSecretTest() {
    // Test with regular client secret
    DatabricksConfig config =
        new DatabricksConfig()
            .setClientSecret("test-client-secret")
            .setAzureClientSecret("azure-client-secret");
    assertEquals("test-client-secret", OAuthClientUtils.resolveClientSecret(config));

    // Test with only Azure client secret
    config =
        new DatabricksConfig().setClientSecret(null).setAzureClientSecret("azure-client-secret");
    assertEquals("azure-client-secret", OAuthClientUtils.resolveClientSecret(config));

    // Test with no client secrets
    config = new DatabricksConfig().setClientSecret(null).setAzureClientSecret(null);
    assertNull(OAuthClientUtils.resolveClientSecret(config));
  }

  @Test
  void resolveClientCredentialsTest() {
    // Test with both client ID and secret
    DatabricksConfig config =
        new DatabricksConfig().setClientId("test-client-id").setClientSecret("test-client-secret");
    String[] credentials = OAuthClientUtils.resolveClientCredentials(config);
    assertEquals("test-client-id", credentials[0]);
    assertEquals("test-client-secret", credentials[1]);

    // Test with only client ID
    config = new DatabricksConfig().setClientId("test-client-id").setClientSecret(null);
    credentials = OAuthClientUtils.resolveClientCredentials(config);
    assertEquals("test-client-id", credentials[0]);
    assertNull(credentials[1]);

    // Test with Azure credentials
    config =
        new DatabricksConfig()
            .setClientId(null)
            .setClientSecret(null)
            .setAzureClientId("azure-client-id")
            .setAzureClientSecret("azure-client-secret");
    credentials = OAuthClientUtils.resolveClientCredentials(config);
    assertEquals("azure-client-id", credentials[0]);
    assertEquals("azure-client-secret", credentials[1]);

    // Test with no credentials
    config = new DatabricksConfig();
    credentials = OAuthClientUtils.resolveClientCredentials(config);
    assertEquals("databricks-cli", credentials[0]);
    assertNull(credentials[1]);

    // Test mixed credentials preference
    config =
        new DatabricksConfig()
            .setClientId("test-client-id")
            .setClientSecret(null)
            .setAzureClientId("azure-client-id")
            .setAzureClientSecret("azure-client-secret");
    credentials = OAuthClientUtils.resolveClientCredentials(config);
    assertEquals("test-client-id", credentials[0]);
    assertEquals("azure-client-secret", credentials[1]);
  }
}
