package com.databricks.sdk.client.oauth;

import com.databricks.sdk.client.*;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Adds refreshed Databricks machine-to-machine OAuth Bearer token to every request, if
 * /oidc/.well-known/oauth-authorization-server is available on the given host.
 */
public class OAuthM2MServicePrincipalCredentialsProvider implements CredentialsProvider {
    private final HttpClient hc;

    public OAuthM2MServicePrincipalCredentialsProvider(HttpClient hc) {
        this.hc = hc;
    }

    @Override
    public String authType() {
        return "oauth-m2m";
    }

    @Override
    public HeaderFactory configure(DatabricksConfig config) {
        // TODO: change to use cfg.oidc_endpoints (and add cache there)
        // TODO: Azure returns 404 for UC workspace after redirecting to
        // https://login.microsoftonline.com/{cfg.azure_tenant_id}/.well-known/oauth-authorization-server
        String oidcUrl = config.getHost() + "/oidc/.well-known/oauth-authorization-server";
        try {
            OpenIDConnectResponse jsonResponse = hc.GET(oidcUrl, OpenIDConnectResponse.class);
            ClientCredentials tokenSource = new ClientCredentials(config.getClientId(), config.getClientSecret(),
                    jsonResponse.getTokenEndpoint(), null,
                    Collections.singletonList("all-apis"), false, true);

            return () -> {
                Token token = tokenSource.refresh();
                Map<String, String> headers = new HashMap<>();
                headers.put("Authorization", token.getTokenType() + " " + token.getAccessToken());
                return headers;
            };
        } catch (DatabricksException e) {
            // TODO: Log exception
            return null;
        }
    }
}
