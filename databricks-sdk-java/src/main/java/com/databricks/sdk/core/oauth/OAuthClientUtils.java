package com.databricks.sdk.core.oauth;

import com.databricks.sdk.core.DatabricksConfig;
import com.databricks.sdk.core.http.Request;
import com.databricks.sdk.core.http.Response;
import java.io.IOException;

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
   * Resolves the OAuth OIDC endpoints from the configuration. Prioritizes regular OIDC endpoints,
   * then Azure OIDC endpoints. If the client ID and client secret are provided, the OIDC endpoints
   * are fetched from the discovery URL. If the Azure client ID and client secret are provided, the
   * OIDC endpoints are fetched from the Azure AD endpoint. If no client ID and client secret are
   * provided, the OIDC endpoints are fetched from the default OIDC endpoints.
   *
   * @param config The Databricks configuration
   * @return The resolved OIDC endpoints
   * @throws IOException if the OIDC endpoints cannot be resolved
   */
  public static OpenIDConnectEndpoints resolveOidcEndpoints(DatabricksConfig config)
      throws IOException {
    if (config.getClientId() != null && config.getClientSecret() != null) {
      return config.getOidcEndpoints();
    } else if (config.getAzureClientId() != null && config.getAzureClientSecret() != null) {
      Request request = new Request("GET", config.getHost() + "/oidc/oauth2/v2.0/authorize");
      request.setRedirectionBehavior(false);
      Response resp = config.getHttpClient().execute(request);
      String realAuthUrl = resp.getFirstHeader("location");
      if (realAuthUrl == null) {
        return null;
      }
      return new OpenIDConnectEndpoints(
          realAuthUrl.replaceAll("/authorize", "/token"), realAuthUrl);
    }
    return config.getOidcEndpoints();
  }
}
