package com.databricks.sdk.core;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.api.client.http.javanet.NetHttpTransport;
import com.google.auth.oauth2.AccessToken;
import com.google.auth.oauth2.GoogleCredentials;
import com.google.auth.oauth2.ServiceAccountCredentials;
import com.google.auth.oauth2.UserCredentials;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpServer;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.URI;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.Signature;
import java.util.Base64;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GoogleAuthCompatibilityTest {
  private HttpServer tokenServer;
  private URI tokenServerUri;
  private final AtomicReference<String> requestBody = new AtomicReference<>();
  private volatile int responseCode = 200;
  private volatile String responseBody =
      "{\"access_token\":\"refreshed-token\",\"expires_in\":3600,\"token_type\":\"Bearer\","
          + "\"issued_token_type\":\"urn:ietf:params:oauth:token-type:access_token\"}";

  @BeforeEach
  void startTokenServer() throws IOException {
    tokenServer = HttpServer.create(new InetSocketAddress("127.0.0.1", 0), 0);
    tokenServer.createContext("/token", this::respondToTokenRequest);
    tokenServer.createContext(
        "/subject",
        exchange -> {
          byte[] subjectToken = "external-subject-token".getBytes(StandardCharsets.UTF_8);
          exchange.sendResponseHeaders(200, subjectToken.length);
          try {
            exchange.getResponseBody().write(subjectToken);
          } finally {
            exchange.close();
          }
        });
    tokenServer.start();
    tokenServerUri =
        URI.create("http://127.0.0.1:" + tokenServer.getAddress().getPort() + "/token");
  }

  @AfterEach
  void stopTokenServer() {
    if (tokenServer != null) {
      tokenServer.stop(0);
    }
  }

  @Test
  void addsBearerTokenToRequestMetadata() throws IOException {
    GoogleCredentials credentials =
        GoogleCredentials.create(
            new AccessToken("test-token", new Date(System.currentTimeMillis() + 3600000)));

    assertEquals(
        Collections.singletonList("Bearer test-token"),
        credentials
            .getRequestMetadata(URI.create("https://storage.googleapis.com/"))
            .get("Authorization"));
  }

  @Test
  void parsesUserCredentialsWithPinnedHttpDependencies() throws IOException {
    String credentialJson =
        "{\"type\":\"authorized_user\",\"client_id\":\"test-client\","
            + "\"client_secret\":\"test-secret\",\"refresh_token\":\"test-refresh\"}";

    try (ByteArrayInputStream input =
        new ByteArrayInputStream(credentialJson.getBytes(StandardCharsets.UTF_8))) {
      UserCredentials credentials = UserCredentials.fromStream(input);

      assertEquals("test-client", credentials.getClientId());
      assertEquals("test-secret", credentials.getClientSecret());
      assertEquals("test-refresh", credentials.getRefreshToken());
    }
  }

  @Test
  void refreshesUserCredentialsWithPinnedHttpDependencies() throws IOException {
    UserCredentials credentials =
        UserCredentials.newBuilder()
            .setClientId("test-client")
            .setClientSecret("test-secret")
            .setRefreshToken("test-refresh")
            .setTokenServerUri(tokenServerUri)
            .build();

    credentials.refresh();

    assertRefreshedToken(credentials);
    Map<String, String> form = requestForm();
    assertEquals("refresh_token", form.get("grant_type"));
    assertEquals("test-client", form.get("client_id"));
    assertEquals("test-secret", form.get("client_secret"));
    assertEquals("test-refresh", form.get("refresh_token"));
  }

  @Test
  void refreshesServiceAccountWithPinnedHttpDependencies() throws Exception {
    KeyPairGenerator keyGenerator = KeyPairGenerator.getInstance("RSA");
    keyGenerator.initialize(2048);
    KeyPair keyPair = keyGenerator.generateKeyPair();
    ServiceAccountCredentials credentials =
        ServiceAccountCredentials.newBuilder()
            .setClientEmail("test-account@example.com")
            .setPrivateKey(keyPair.getPrivate())
            .setPrivateKeyId("test-key")
            .setScopes(Collections.singletonList("https://www.googleapis.com/auth/cloud-platform"))
            .setTokenServerUri(tokenServerUri)
            .build();

    credentials.refresh();

    assertRefreshedToken(credentials);
    Map<String, String> form = requestForm();
    assertEquals("urn:ietf:params:oauth:grant-type:jwt-bearer", form.get("grant_type"));
    String[] assertion = form.get("assertion").split("\\.");
    JsonNode claims = new ObjectMapper().readTree(Base64.getUrlDecoder().decode(assertion[1]));
    assertEquals("test-account@example.com", claims.get("iss").asText());
    assertEquals("https://oauth2.googleapis.com/token", claims.get("aud").asText());
    assertEquals("https://www.googleapis.com/auth/cloud-platform", claims.get("scope").asText());
    Signature verifier = Signature.getInstance("SHA256withRSA");
    verifier.initVerify(keyPair.getPublic());
    verifier.update((assertion[0] + "." + assertion[1]).getBytes(StandardCharsets.UTF_8));
    assertTrue(verifier.verify(Base64.getUrlDecoder().decode(assertion[2])));
  }

  @Test
  void exchangesExternalAccountTokenWithPinnedHttpDependencies() throws IOException {
    String audience =
        "//iam.googleapis.com/projects/123/locations/global/workloadIdentityPools/test/providers/test";
    String credentialJson =
        "{\"type\":\"external_account\",\"audience\":\""
            + audience
            + "\",\"subject_token_type\":\"urn:ietf:params:oauth:token-type:jwt\",\"token_url\":\""
            + "https://sts.googleapis.com/v1/token"
            + "\",\"credential_source\":{\"url\":\""
            + tokenServerUri.resolve("/subject")
            + "\"}}";
    GoogleCredentials credentials;
    try (ByteArrayInputStream input =
        new ByteArrayInputStream(credentialJson.getBytes(StandardCharsets.UTF_8))) {
      NetHttpTransport transport =
          new NetHttpTransport.Builder()
              .setConnectionFactory(
                  url -> {
                    URI localUri =
                        url.getHost().equals("sts.googleapis.com")
                            ? tokenServerUri
                            : tokenServerUri.resolve("/subject");
                    return (HttpURLConnection) localUri.toURL().openConnection();
                  })
              .build();
      credentials =
          GoogleCredentials.fromStream(input, () -> transport)
              .createScoped(
                  Collections.singletonList("https://www.googleapis.com/auth/cloud-platform"));
    }

    credentials.refresh();

    assertRefreshedToken(credentials);
    Map<String, String> form = requestForm();
    assertEquals("urn:ietf:params:oauth:grant-type:token-exchange", form.get("grant_type"));
    assertEquals("external-subject-token", form.get("subject_token"));
    assertEquals(audience, form.get("audience"));
    assertEquals("urn:ietf:params:oauth:token-type:jwt", form.get("subject_token_type"));
  }

  @Test
  void propagatesTokenEndpointErrorsWithPinnedHttpDependencies() {
    responseCode = 400;
    responseBody = "{\"error\":\"invalid_grant\",\"error_description\":\"Refresh token revoked\"}";
    UserCredentials credentials =
        UserCredentials.newBuilder()
            .setClientId("test-client")
            .setClientSecret("test-secret")
            .setRefreshToken("revoked-refresh")
            .setTokenServerUri(tokenServerUri)
            .build();

    IOException failure = assertThrows(IOException.class, credentials::refresh);

    assertTrue(failure.getMessage().contains("invalid_grant"));
  }

  private void assertRefreshedToken(GoogleCredentials credentials) throws IOException {
    assertEquals("refreshed-token", credentials.getAccessToken().getTokenValue());
    assertTrue(credentials.getAccessToken().getExpirationTime().after(new Date()));
    assertEquals(
        Collections.singletonList("Bearer refreshed-token"),
        credentials
            .getRequestMetadata(URI.create("https://storage.googleapis.com/"))
            .get("Authorization"));
  }

  private Map<String, String> requestForm() throws IOException {
    Map<String, String> form = new HashMap<>();
    for (String field : requestBody.get().split("&")) {
      String[] pair = field.split("=", 2);
      form.put(URLDecoder.decode(pair[0], "UTF-8"), URLDecoder.decode(pair[1], "UTF-8"));
    }
    return form;
  }

  private void respondToTokenRequest(HttpExchange exchange) throws IOException {
    try (InputStream input = exchange.getRequestBody();
        ByteArrayOutputStream body = new ByteArrayOutputStream()) {
      byte[] buffer = new byte[1024];
      int length;
      while ((length = input.read(buffer)) != -1) {
        body.write(buffer, 0, length);
      }
      requestBody.set(new String(body.toByteArray(), StandardCharsets.UTF_8));
      byte[] content = responseBody.getBytes(StandardCharsets.UTF_8);
      exchange.getResponseHeaders().set("Content-Type", "application/json");
      exchange.sendResponseHeaders(responseCode, content.length);
      exchange.getResponseBody().write(content);
    } finally {
      exchange.close();
    }
  }
}
