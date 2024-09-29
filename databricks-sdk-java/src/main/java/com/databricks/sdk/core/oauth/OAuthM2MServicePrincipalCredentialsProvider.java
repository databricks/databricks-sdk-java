package com.databricks.sdk.core.oauth;

import com.databricks.sdk.core.*;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Adds refreshed Databricks machine-to-machine OAuth Bearer token to every request, if
 * /oidc/.well-known/oauth-authorization-server is available on the given host.
 */
public class OAuthM2MServicePrincipalCredentialsProvider implements CredentialsProvider {
  private final ObjectMapper mapper = new ObjectMapper();

  @Override
  public String authType() {
    return "oauth-m2m";
  }

  @Override
  public HeaderFactory configure(DatabricksConfig config) {
    if (config.getClientId() == null
        || config.getClientSecret() == null
        || config.getHost() == null) {
      return null;
    }
    // TODO: Azure returns 404 for UC workspace after redirecting to
    // https://login.microsoftonline.com/{cfg.azure_tenant_id}/.well-known/oauth-authorization-server
    try {
      OpenIDConnectEndpoints jsonResponse = config.getOidcEndpoints();
      ClientCredentials tokenSource =
          new ClientCredentials.Builder()
              .withHttpClient(config.getHttpClient())
              .withClientId(config.getClientId())
              .withClientSecret(config.getClientSecret())
              .withTokenUrl(jsonResponse.getTokenEndpoint())
              .withScopes(Collections.singletonList("all-apis"))
              .withAuthParameterPosition(AuthParameterPosition.HEADER)
              .build();

      return () -> {
        Token token = tokenSource.getToken();
        Map<String, String> headers = new HashMap<>();
        headers.put("Authorization", token.getTokenType() + " " + token.getAccessToken());
        return headers;
      };
    } catch (IOException e) {
      // TODO: Log exception
      throw new DatabricksException("Unable to fetch OIDC endpoint: " + e.getMessage(), e);
    }
  }
}
