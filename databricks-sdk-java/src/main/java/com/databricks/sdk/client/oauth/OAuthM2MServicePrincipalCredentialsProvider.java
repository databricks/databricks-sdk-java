package com.databricks.sdk.client.oauth;

import com.databricks.sdk.client.*;
import com.databricks.sdk.client.http.Request;
import com.databricks.sdk.client.http.Response;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Adds refreshed Databricks machine-to-machine OAuth Bearer token to every request, if
 * /oidc/.well-known/oauth-authorization-server is available on the given host.
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class OAuthM2MServicePrincipalCredentialsProvider implements CredentialsProvider {
  private final ObjectMapper mapper = new ObjectMapper();

  /** {@inheritDoc} */
  @Override
  public String authType() {
    return "oauth-m2m";
  }

  /** {@inheritDoc} */
  @Override
  public HeaderFactory configure(DatabricksConfig config) {
    if (config.getClientId() == null
        || config.getClientSecret() == null
        || config.getHost() == null) {
      return null;
    }
    // TODO: change to use config.getOidcEndpoints() (and add cache there)
    // TODO: Azure returns 404 for UC workspace after redirecting to
    // https://login.microsoftonline.com/{cfg.azure_tenant_id}/.well-known/oauth-authorization-server
    String oidcUrl = config.getHost() + "/oidc/.well-known/oauth-authorization-server";
    try {
      Request req = new Request("GET", oidcUrl);
      Response resp = config.getHttpClient().execute(req);
      if (resp.getStatusCode() != 200) {
        throw new DatabricksException(
            "Failed fetching workspace URL: status code "
                + resp.getStatusCode()
                + ", response body: "
                + resp.getBody());
      }
      OpenIDConnectEndpoints jsonResponse =
          mapper.readValue(resp.getBody(), OpenIDConnectEndpoints.class);
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
