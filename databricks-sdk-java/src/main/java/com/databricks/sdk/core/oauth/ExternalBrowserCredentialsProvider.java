package com.databricks.sdk.core.oauth;

import com.databricks.sdk.core.CredentialsProvider;
import com.databricks.sdk.core.DatabricksConfig;
import com.databricks.sdk.core.DatabricksException;
import com.databricks.sdk.core.HeaderFactory;
import java.io.IOException;
import java.nio.file.Path;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * A {@code CredentialsProvider} which implements the Authorization Code + PKCE flow by opening a
 * browser for the user to authorize the application. Uses a specified TokenCache or creates a
 * default one if none is provided.
 */
public class ExternalBrowserCredentialsProvider implements CredentialsProvider {
  private static final Logger LOGGER =
      LoggerFactory.getLogger(ExternalBrowserCredentialsProvider.class);

  private TokenCache tokenCache;

  /**
   * Creates a new ExternalBrowserCredentialsProvider with the specified TokenCache.
   *
   * @param tokenCache the TokenCache to use for caching tokens
   */
  public ExternalBrowserCredentialsProvider(TokenCache tokenCache) {
    this.tokenCache = tokenCache;
  }

  /**
   * Creates a new ExternalBrowserCredentialsProvider with a default TokenCache. A FileTokenCache
   * will be created when credentials are configured.
   */
  public ExternalBrowserCredentialsProvider() {
    this(null);
  }

  @Override
  public String authType() {
    return "external-browser";
  }

  @Override
  public HeaderFactory configure(DatabricksConfig config) {
    if (config.getHost() == null || config.getAuthType() != "external-browser") {
      return null;
    }
    try {
      if (tokenCache == null) {
        // Create a default FileTokenCache based on config
        Path cachePath =
            TokenCacheUtils.getCacheFilePath(
                config.getHost(), config.getClientId(), config.getScopes());
        tokenCache = new FileTokenCache(cachePath);
      }

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
                  .withTokenCache(tokenCache)
                  .build();

          LOGGER.debug("Using cached token, will immediately refresh");
          cachedCreds.token = cachedCreds.refresh();
          return cachedCreds.configure(config);
        } catch (Exception e) {
          // If token refresh fails, log and continue to browser auth
          LOGGER.info("Token refresh failed: {}, falling back to browser auth", e.getMessage());
        }
      }

      // If no cached token or refresh failed, perform browser auth
      SessionCredentials credentials = performBrowserAuth(config, tokenCache);
      tokenCache.save(credentials.getToken());
      return credentials.configure(config);
    } catch (IOException | DatabricksException e) {
      LOGGER.error("Failed to authenticate: {}", e.getMessage());
      return null;
    }
  }

  SessionCredentials performBrowserAuth(DatabricksConfig config, TokenCache tokenCache)
      throws IOException {
    LOGGER.debug("Performing browser authentication");
    OAuthClient client = new OAuthClient(config);
    Consent consent = client.initiateConsent();

    // Use the existing browser flow to get credentials
    SessionCredentials credentials = consent.launchExternalBrowser();

    // Create a new SessionCredentials with the same token but with our token cache
    return new SessionCredentials.Builder()
        .withToken(credentials.getToken())
        .withHttpClient(config.getHttpClient())
        .withClientId(config.getClientId())
        .withClientSecret(config.getClientSecret())
        .withTokenUrl(config.getOidcEndpoints().getTokenEndpoint())
        .withRedirectUrl(config.getEffectiveOAuthRedirectUrl())
        .withTokenCache(tokenCache)
        .build();
  }
}
