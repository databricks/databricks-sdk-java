package com.databricks.sdk.client.oauth;

import com.databricks.sdk.client.CredentialsProvider;
import com.databricks.sdk.client.DatabricksConfig;
import com.databricks.sdk.client.HeaderFactory;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.apache.http.HttpHeaders;

/**
 * A {@code CredentialsProvider} which implements the Authorization Code + PKCE flow by opening a
 * browser for the user to authorize the application.
 */
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
    } catch (IOException e) {
      return null;
    }
  }
}
