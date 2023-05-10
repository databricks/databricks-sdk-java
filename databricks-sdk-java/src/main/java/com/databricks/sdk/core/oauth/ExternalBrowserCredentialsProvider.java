package com.databricks.sdk.core.oauth;

import com.databricks.sdk.core.CredentialsProvider;
import com.databricks.sdk.core.DatabricksConfig;
import com.databricks.sdk.core.DatabricksException;
import com.databricks.sdk.core.HeaderFactory;
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
    if (config.getHost() == null || config.getAuthType() != "external-browser") {
      return null;
    }
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
