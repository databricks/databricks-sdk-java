package com.databricks.sdk.client.oauth;

import com.databricks.sdk.client.CredentialsProvider;
import com.databricks.sdk.client.DatabricksConfig;
import com.databricks.sdk.client.EmptyHeaderFactory;
import com.databricks.sdk.client.HeaderFactory;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.http.HttpStatus;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

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
    public HeaderFactory configure(DatabricksConfig config) {
        // TODO: change to use cfg.oidc_endpoints (and add cache there)
        // TODO: Azure returns 404 for UC workspace after redirecting to
        // https://login.microsoftonline.com/{cfg.azure_tenant_id}/.well-known/oauth-authorization-server
        String oidcUrl = config.getHost() + "/oidc/.well-known/oauth-authorization-server";
        try (CloseableHttpClient httpClient = HttpClients.createDefault();
             CloseableHttpResponse response = httpClient.execute(new HttpGet(oidcUrl))) {
            int statusCode = response.getStatusLine().getStatusCode();
            if (statusCode != HttpStatus.SC_OK) {
                return new EmptyHeaderFactory();
            }
            String responseBody = EntityUtils.toString(response.getEntity());
            ObjectMapper objectMapper = new ObjectMapper();
            OpenIDConnectResponse jsonResponse = objectMapper.readValue(responseBody, OpenIDConnectResponse.class);
            ClientCredentials tokenSource = new ClientCredentials(config.getClientId(), config.getClientSecret(),
                    jsonResponse.getTokenEndpoint(), null,
                    Arrays.asList("all-apis"), false, true);

            return () -> {
                Token token = tokenSource.refresh();
                Map<String, String> headers = new HashMap<>();
                headers.put("Authorization", token.getTokenType() + " " + token.getAccessToken());
                return headers;
            };
        } catch (Exception e) {
            throw new RuntimeException("Failed to retrieve OAuth Service Principal: " + e.getMessage(), e);
        }
    }
}
