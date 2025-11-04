package com.databricks.sdk.core;

import static com.databricks.sdk.core.utils.GoogleUtils.GCP_SCOPES;
import static com.databricks.sdk.core.utils.GoogleUtils.SA_ACCESS_TOKEN_HEADER;

import com.google.auth.oauth2.GoogleCredentials;
import com.google.auth.oauth2.IdTokenCredentials;
import com.google.auth.oauth2.IdTokenProvider;
import com.google.auth.oauth2.ImpersonatedCredentials;
import java.io.IOException;
import java.util.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GoogleIdCredentialsProvider implements CredentialsProvider {

  private static final Logger LOG = LoggerFactory.getLogger(GoogleIdCredentialsProvider.class);

  @Override
  public String authType() {
    return "google-id";
  }

  @Override
  public HeaderFactory configure(DatabricksConfig config) {
    String host = config.getHost();
    String googleServiceAccount = config.getGoogleServiceAccount();
    if (host == null || googleServiceAccount == null || !config.isGcp()) {
      return null;
    }

    GoogleCredentials googleCredentials;
    try {
      googleCredentials = GoogleCredentials.getApplicationDefault();
    } catch (IOException e) {
      LOG.warn("Failed to get Google application default credential." + e);
      return null;
    }

    // Create the impersonated credential. Use 3600s as the lifetime, which is the default value in
    // google-auth.
    ImpersonatedCredentials impersonatedCredentials =
        ImpersonatedCredentials.create(
            googleCredentials, googleServiceAccount, null, new ArrayList<>(), 3600);

    IdTokenCredentials idTokenCredentials =
        IdTokenCredentials.newBuilder()
            .setIdTokenProvider(impersonatedCredentials)
            .setTargetAudience(host)
            // Setting this will include email in the id token.
            .setOptions(Collections.singletonList(IdTokenProvider.Option.INCLUDE_EMAIL))
            .build();

    ImpersonatedCredentials gcpScopedCredentials =
        ImpersonatedCredentials.create(
            googleCredentials, googleServiceAccount, null, GCP_SCOPES, 3600);

    return () -> {
      Map<String, String> headers = new HashMap<>();
      try {
        headers.put(
            "Authorization",
            String.format("Bearer %s", idTokenCredentials.refreshAccessToken().getTokenValue()));
      } catch (IOException e) {
        String message = "Failed to refresh access token from id token credentials.";
        LOG.error(message + e);
        throw new DatabricksException(message, e);
      }

      if (config.getHostType() != DatabricksConfig.HostType.WORKSPACE_HOST) {
        try {
          headers.put(
              SA_ACCESS_TOKEN_HEADER, gcpScopedCredentials.refreshAccessToken().getTokenValue());
        } catch (IOException e) {
          String message = "Failed to refresh access token from scoped id token credentials.";
          LOG.error(message + e);
          throw new DatabricksException(message, e);
        }
      }

      return headers;
    };
  }
}
