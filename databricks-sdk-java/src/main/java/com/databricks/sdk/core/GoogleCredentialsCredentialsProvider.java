package com.databricks.sdk.core;

import static com.databricks.sdk.core.utils.GoogleUtils.GcpScopes;

import com.google.auth.oauth2.*;
import com.google.auth.oauth2.IdTokenProvider.Option;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GoogleCredentialsCredentialsProvider implements CredentialsProvider {

  private static final Logger LOG =
      LoggerFactory.getLogger(GoogleCredentialsCredentialsProvider.class);

  @Override
  public String authType() {
    return "google-credentials";
  }

  @Override
  public HeaderFactory configure(DatabricksConfig config) {
    String host = config.getHost();
    String googleCredentials = config.getGoogleCredentials();
    if (host == null || googleCredentials == null || !config.isGcp()) {
      return null;
    }

    ServiceAccountCredentials serviceAccountCredentials;

    try {
      serviceAccountCredentials =
          ServiceAccountCredentials.fromStream(Files.newInputStream(Paths.get(googleCredentials)));
    } catch (IOException e) {
      try {
        // If file doesn't exist, we try to parse the config as the content.
        serviceAccountCredentials =
            ServiceAccountCredentials.fromStream(
                new ByteArrayInputStream(googleCredentials.getBytes(StandardCharsets.UTF_8)));
      } catch (IOException ex) {
        LOG.warn("Failed to get Google service account credentials." + ex);
        return null;
      }
    }

    List<Option> tokenOption = Collections.emptyList();

    ServiceAccountCredentials finalServiceAccountCredentials = serviceAccountCredentials;
    return () -> {
      IdToken idToken;
      try {
        idToken = finalServiceAccountCredentials.idTokenWithAudience(host, tokenOption);
      } catch (IOException e) {
        LOG.warn("Failed to get id token from Google service account credentials." + e);
        throw new RuntimeException(e);
      }
      Map<String, String> headers = new HashMap<>();
      headers.put("Authorization", String.format("Bearer %s", idToken.getTokenValue()));

      if (config.isAccountClient()) {
        AccessToken token;
        try {
          token = finalServiceAccountCredentials.createScoped(GcpScopes).refreshAccessToken();
        } catch (Exception e) {
          LOG.warn("Failed to refresh access token from Google service account credentials." + e);
          throw new RuntimeException(e);
        }
        headers.put("X-Databricks-GCP-SA-Access-Token", token.getTokenValue());
      }

      return headers;
    };
  }
}
