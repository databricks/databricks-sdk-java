package com.databricks.sdk.core.oauth;

import com.databricks.sdk.core.DatabricksConfig;

/** Utility methods for OAuth client credentials resolution. */
public class OAuthClientUtils {

  /** Default client ID to use when no client ID is specified. */
  private static final String DEFAULT_CLIENT_ID = "databricks-cli";

  /**
   * Resolves the OAuth client ID from the configuration. Prioritizes regular OAuth client ID, then
   * Azure client ID, and falls back to default client ID.
   *
   * @param config The Databricks configuration
   * @return The resolved client ID
   */
  public static String resolveClientId(DatabricksConfig config) {
    if (config.getClientId() != null) {
      return config.getClientId();
    } else if (config.getAzureClientId() != null) {
      return config.getAzureClientId();
    }
    return DEFAULT_CLIENT_ID;
  }

  /**
   * Resolves the OAuth client secret from the configuration. Prioritizes regular OAuth client
   * secret, then Azure client secret.
   *
   * @param config The Databricks configuration
   * @return The resolved client secret, or null if not present
   */
  public static String resolveClientSecret(DatabricksConfig config) {
    if (config.getClientSecret() != null) {
      return config.getClientSecret();
    } else if (config.getAzureClientSecret() != null) {
      return config.getAzureClientSecret();
    }
    return null;
  }

  /**
   * Resolves both client ID and client secret from the configuration.
   *
   * @param config The Databricks configuration
   * @return An array containing the client ID and client secret (may be null)
   */
  public static String[] resolveClientCredentials(DatabricksConfig config) {
    String clientId = resolveClientId(config);
    String clientSecret = resolveClientSecret(config);
    return new String[] {clientId, clientSecret};
  }
}
