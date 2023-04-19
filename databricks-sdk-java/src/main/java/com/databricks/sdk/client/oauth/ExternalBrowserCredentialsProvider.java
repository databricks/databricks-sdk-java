package com.databricks.sdk.client.oauth;

import com.databricks.sdk.client.CredentialsProvider;
import com.databricks.sdk.client.DatabricksConfig;
import com.databricks.sdk.client.DatabricksException;
import com.databricks.sdk.client.HeaderFactory;
import java.io.IOException;

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
      return creds.configure(config);
    } catch (IOException | DatabricksException e) {
      return null;
    }
  }
}
