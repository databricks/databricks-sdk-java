package com.databricks.sdk.core.oauth;

import com.databricks.sdk.core.CredentialsProvider;
import com.databricks.sdk.core.DatabricksConfig;
import com.databricks.sdk.core.DatabricksException;
import com.databricks.sdk.core.HeaderFactory;
import com.google.common.collect.ImmutableMap;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * GithubOidcCredentialsProvider uses a Token Supplier to get a GitHub OIDC JWT Token and exchanges
 * it for a Databricks Token.
 */
public class GithubOidcCredentialsProvider implements CredentialsProvider {

  @Override
  public String authType() {
    return "github-oidc";
  }

  @Override
  public HeaderFactory configure(DatabricksConfig config) throws DatabricksException {
    GitHubOidcTokenSupplier idTokenProvider =
        new GitHubOidcTokenSupplier(
            config.getHttpClient(),
            config.getActionsIdTokenRequestUrl(),
            config.getActionsIdTokenRequestToken(),
            config.getTokenAudience());

    if (!idTokenProvider.enabled() || config.getHost() == null || config.getClientId() == null) {
      return null;
    }

    String endpointUrl;

    try {
      endpointUrl = config.getOidcEndpoints().getTokenEndpoint();
    } catch (IOException e) {
      throw new DatabricksException("Unable to fetch OIDC endpoint: " + e.getMessage(), e);
    }

    ClientCredentials clientCredentials =
        new ClientCredentials.Builder()
            .withHttpClient(config.getHttpClient())
            .withClientId(config.getClientId())
            .withTokenUrl(endpointUrl)
            .withScopes(Collections.singletonList("all-apis"))
            .withAuthParameterPosition(AuthParameterPosition.HEADER)
            .withEndpointParametersSupplier(
                () ->
                    new ImmutableMap.Builder<String, String>()
                        .put("subject_token_type", "urn:ietf:params:oauth:token-type:jwt")
                        .put("subject_token", idTokenProvider.getOidcToken())
                        .put("grant_type", "urn:ietf:params:oauth:grant-type:token-exchange")
                        .build())
            .build();

    CachedTokenSource cachedTokenSource =
        new CachedTokenSource.Builder(clientCredentials)
            .setAsyncDisabled(config.getDisableAsyncTokenRefresh())
            .build();

    return () -> {
      Map<String, String> headers = new HashMap<>();
      headers.put("Authorization", "Bearer " + cachedTokenSource.getToken().getAccessToken());
      return headers;
    };
  }
}
