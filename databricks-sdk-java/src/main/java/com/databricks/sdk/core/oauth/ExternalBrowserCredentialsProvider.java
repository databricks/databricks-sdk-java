package com.databricks.sdk.core.oauth;

import com.databricks.sdk.core.CredentialsProvider;
import com.databricks.sdk.core.DatabricksConfig;
import com.databricks.sdk.core.DatabricksException;
import com.databricks.sdk.core.HeaderFactory;
import java.io.IOException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * A {@code CredentialsProvider} which implements the Authorization Code + PKCE flow by opening a
 * browser for the user to authorize the application. When cache support is enabled with {@link
 * DatabricksConfig#setOAuthTokenCachePassphrase} and {@link
 * DatabricksConfig#setTokenCacheEnabled(boolean)}, tokens will be cached to avoid repeated
 * authentication.
 */
public class ExternalBrowserCredentialsProvider implements CredentialsProvider {
  private static final Logger LOGGER =
      LoggerFactory.getLogger(ExternalBrowserCredentialsProvider.class);

  @Override
  public String authType() {
    return "external-browser";
  }

  @Override
  public HeaderFactory configure(DatabricksConfig config) {
    if (config.getHost() == null
        || config.getClientId() == null
        || !config.getAuthType().equals("external-browser")) {
      return null;
    }

    try {
      // Get the token cache from config
      TokenCache tokenCache = config.getTokenCache();

      // First try to use the cached token if available (will return null if disabled)
      Token cachedToken = tokenCache.load();
      if (cachedToken != null && cachedToken.getRefreshToken() != null) {
        LOGGER.debug("Found cached token for {}:{}", config.getHost(), config.getClientId());

        try {
          // Create SessionCredentials with the cached token and try to refresh if needed
          SessionCredentials cachedCreds =
              new SessionCredentials.Builder()
                  .withToken(cachedToken)
                  .withHttpClient(config.getHttpClient())
                  .withClientId(config.getClientId())
                  .withClientSecret(config.getClientSecret())
                  .withTokenUrl(config.getOidcEndpoints().getTokenEndpoint())
                  .withRedirectUrl(config.getEffectiveOAuthRedirectUrl())
                  .build();

          LOGGER.debug("Using cached token, will immediately refresh");
          cachedCreds.token = cachedCreds.refresh();
          tokenCache.save(cachedToken);
          return cachedCreds.configure(config);
        } catch (Exception e) {
          // If token refresh fails, log and continue to browser auth
          LOGGER.info("Token refresh failed: {}, falling back to browser auth", e.getMessage());
        }
      }

      // If no cached token or refresh failed, perform browser auth
      SessionCredentials credentials = performBrowserAuth(config);
      tokenCache.save(credentials.getToken());
      return credentials.configure(config);
    } catch (IOException | DatabricksException e) {
      LOGGER.error("Failed to authenticate: {}", e.getMessage());
      return null;
    }
  }

  SessionCredentials performBrowserAuth(DatabricksConfig config) throws IOException {
    LOGGER.debug("Performing browser authentication");
    OAuthClient client = new OAuthClient(config);
    Consent consent = client.initiateConsent();
    return consent.launchExternalBrowser();
  }
}
