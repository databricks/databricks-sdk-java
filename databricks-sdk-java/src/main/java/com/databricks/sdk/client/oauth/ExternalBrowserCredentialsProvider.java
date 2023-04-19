package com.databricks.sdk.client.oauth;

import com.databricks.sdk.client.CredentialsProvider;
import com.databricks.sdk.client.DatabricksConfig;
import com.databricks.sdk.client.HeaderFactory;
import org.apache.http.HttpHeaders;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Map;

public class ExternalBrowserCredentialsProvider implements CredentialsProvider {

  @Override
  public String authType() {
    return "external-browser";
  }

  @Override
  public HeaderFactory configure(DatabricksConfig config) {
    try {
      OAuthClient client = new OAuthClient(config);
      Consent consent = client.initiateConsent();
      RefreshableCredentials creds = consent.launchExternalBrowser();
      return () -> {
        Token token = creds.getToken();
        Map<String, String> headers = new HashMap<>();
        headers.put(HttpHeaders.AUTHORIZATION, token.getTokenType() + " " + token.getAccessToken());
        return headers;
      };
    } catch (IOException | URISyntaxException e) {
      return null;
    }
  }
}
