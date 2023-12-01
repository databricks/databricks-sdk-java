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
        serviceAccountCredentials =
            ServiceAccountCredentials.fromStream(
                new ByteArrayInputStream(googleCredentials.getBytes(StandardCharsets.UTF_8)));
      } catch (IOException ex) {
        LOG.warn("Failed to get Google service account credentials.");
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
        throw new RuntimeException(e);
      }
      Map<String, String> headers = new HashMap<>();
      headers.put("Authorization", String.format("Bearer %s", idToken.getTokenValue()));

      if (config.isAccountClient()) {
        LOG.warn("in if check");
        AccessToken token;
        try {
          LOG.warn("Generating token");
          token = finalServiceAccountCredentials.createScoped(GcpScopes).refreshAccessToken();
        } catch (Exception e) {
          LOG.warn("Throwing");
          throw new RuntimeException(e);
        }
        headers.put("X-Databricks-GCP-SA-Access-Token", token.getTokenValue());
      }

      return headers;
    };
  }
}
