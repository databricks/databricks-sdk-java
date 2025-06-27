package com.databricks.sdk.core.oauth;

import com.databricks.sdk.core.*;
import java.io.IOException;
import java.util.Collections;

/**
 * Adds refreshed Databricks machine-to-machine OAuth Bearer token to every request, if
 * /oidc/.well-known/oauth-authorization-server is available on the given host.
 */
public class OAuthM2MServicePrincipalCredentialsProvider implements CredentialsProvider {

  @Override
  public String authType() {
    return "oauth-m2m";
  }

  @Override
  public OAuthHeaderFactory configure(DatabricksConfig config) {
    if (config.getClientId() == null
        || config.getClientSecret() == null
        || config.getHost() == null) {
      return null;
    }
    // TODO: Add cache in getOidcEndpoints
    // TODO: Azure returns 404 for UC workspace after redirecting to
    // https://login.microsoftonline.com/{cfg.azure_tenant_id}/.well-known/oauth-authorization-server
    try {
      OpenIDConnectEndpoints jsonResponse = config.getOidcEndpoints();
      ClientCredentials clientCredentials =
          new ClientCredentials.Builder()
              .withHttpClient(config.getHttpClient())
              .withClientId(config.getClientId())
              .withClientSecret(config.getClientSecret())
              .withTokenUrl(jsonResponse.getTokenEndpoint())
              .withScopes(Collections.singletonList("all-apis"))
              .withAuthParameterPosition(AuthParameterPosition.HEADER)
              .build();

      CachedTokenSource cachedTokenSource =
          new CachedTokenSource.Builder(clientCredentials)
              .setAsyncDisabled(config.getDisableAsyncTokenRefresh())
              .build();

      return OAuthHeaderFactory.fromTokenSource(cachedTokenSource);
    } catch (IOException e) {
      // TODO: Log exception
      throw new DatabricksException("Unable to fetch OIDC endpoint: " + e.getMessage(), e);
    }
  }
}
