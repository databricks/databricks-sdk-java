package com.databricks.sdk.core.oauth;

import com.databricks.sdk.core.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

/**
 * A {@code CredentialsProvider} which implements the Authorization Code + PKCE flow by opening a
 * browser for the user to authorize the application.
 */
public class ExternalBrowserCredentialsProvider implements CredentialsProvider {

  private static final Logger LOG = LoggerFactory.getLogger(ExternalBrowserCredentialsProvider.class);

  @Override
  public String authType() {
    return "external-browser";
  }

  @Override
  public HeaderFactory configure(DatabricksConfig config) {
    LOG.info("browser " + config.toString());
    if (config.getHost() == null || config.getAuthType() != "external-browser") {
      return null;
    }
    try {
      OAuthClient client = new OAuthClient(config);
      Consent consent = client.initiateConsent();
      SessionCredentials creds = consent.launchExternalBrowser();
      return creds.configure(config);
    } catch (IOException | DatabricksException e) {
      return null;
    }
  }
}
