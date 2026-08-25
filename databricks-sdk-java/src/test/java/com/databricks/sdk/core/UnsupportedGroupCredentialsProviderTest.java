package com.databricks.sdk.core;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.databricks.sdk.core.oauth.AzureGithubOidcCredentialsProvider;
import com.databricks.sdk.core.oauth.AzureServicePrincipalCredentialsProvider;
import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class UnsupportedGroupCredentialsProviderTest {
  // Verifies that explicitly selecting an applicable provider without group support throws the
  // existing SDK error type with an actionable message.
  @ParameterizedTest(name = "{0}")
  @MethodSource("unsupportedProviders")
  void applicableUnsupportedProviderRejectsGroup(
      String authType, CredentialsProvider provider, DatabricksConfig config) {
    config.setGroupId("group-123").setAuthType(authType);

    DatabricksException error =
        assertThrows(DatabricksException.class, () -> provider.configure(config));

    assertEquals(DatabricksException.class, error.getClass());
    assertTrue(error.getMessage().contains(authType));
    assertTrue(error.getMessage().contains("does not support group assumption"));
  }

  // Verifies that an applicable provider without group support returns null during automatic
  // discovery, allowing the credential chain to continue to another provider.
  @ParameterizedTest(name = "{0}")
  @MethodSource("unsupportedProviders")
  void automaticChainSkipsApplicableUnsupportedProvider(
      String authType, CredentialsProvider provider, DatabricksConfig config) {
    config.setGroupId("group-123").setAuthType(null);

    assertNull(provider.configure(config));
  }

  private static Stream<Arguments> unsupportedProviders() {
    String azureHost = "https://adb-123.4.azuredatabricks.net";
    String gcpHost = "https://123.4.gcp.databricks.com";
    return Stream.of(
        Arguments.of(
            "pat",
            new PatCredentialsProvider(),
            new DatabricksConfig()
                .setHost("https://workspace.cloud.databricks.com")
                .setToken("token")),
        Arguments.of(
            "basic",
            new BasicCredentialsProvider(),
            new DatabricksConfig()
                .setHost("https://workspace.cloud.databricks.com")
                .setUsername("user")
                .setPassword("password")),
        Arguments.of(
            "databricks-cli",
            new DatabricksCliCredentialsProvider(),
            new DatabricksConfig()
                .setHost("https://workspace.cloud.databricks.com")
                .setAuthType("databricks-cli")),
        Arguments.of(
            "runtime",
            new NotebookNativeCredentialsProvider(),
            new DatabricksConfig().setAuthType("runtime")),
        Arguments.of(
            "azure-cli",
            new AzureCliCredentialsProvider(),
            new DatabricksConfig().setHost(azureHost)),
        Arguments.of(
            "azure-msi",
            new AzureMsiCredentialsProvider(),
            new DatabricksConfig().setHost(azureHost).setAzureUseMsi(true)),
        Arguments.of(
            "azure-client-secret",
            new AzureServicePrincipalCredentialsProvider(),
            new DatabricksConfig()
                .setHost(azureHost)
                .setAzureClientId("client")
                .setAzureClientSecret("secret")),
        Arguments.of(
            "github-oidc-azure",
            new AzureGithubOidcCredentialsProvider(),
            new DatabricksConfig()
                .setHost(azureHost)
                .setAzureClientId("client")
                .setAzureTenantId("tenant")),
        Arguments.of(
            "google-credentials",
            new GoogleCredentialsCredentialsProvider(),
            new DatabricksConfig().setHost(gcpHost).setGoogleCredentials("credentials")),
        Arguments.of(
            "google-id",
            new GoogleIdCredentialsProvider(),
            new DatabricksConfig().setHost(gcpHost).setGoogleServiceAccount("service-account")));
  }
}
