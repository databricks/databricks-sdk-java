package com.databricks.sdk.client.oauth;

import com.databricks.sdk.client.CredentialsProvider;
import com.databricks.sdk.client.DatabricksConfig;
import com.databricks.sdk.client.DatabricksException;
import com.databricks.sdk.client.HeaderFactory;
import java.io.IOException;

/**
 * A {@code CredentialsProvider} which implements the Authorization Code + PKCE flow by opening a
 * browser for the user to authorize the application.
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class ExternalBrowserCredentialsProvider implements CredentialsProvider {

  /** {@inheritDoc} */
  @Override
  public String authType() {
    return "external-browser";
  }

  /** {@inheritDoc} */
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
