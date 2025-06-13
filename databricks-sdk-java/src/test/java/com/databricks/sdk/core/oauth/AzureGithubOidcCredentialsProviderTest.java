package com.databricks.sdk.core.oauth;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

import com.databricks.sdk.core.CredentialsProvider;
import com.databricks.sdk.core.DatabricksConfig;
import com.databricks.sdk.core.DatabricksException;
import com.databricks.sdk.core.HeaderFactory;
import com.databricks.sdk.core.http.HttpClient;
import com.databricks.sdk.core.http.Request;
import com.databricks.sdk.core.http.Response;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;
import java.util.Iterator;
import org.json.JSONObject;
import org.junit.jupiter.api.Test;

public class AzureGithubOidcCredentialsProviderTest {
  private static final String TOKEN = "t-123";
  private static final String TOKEN_RESPONSE = new JSONObject().put("value", "token-id").toString();
  private static final String OAUTH_RESPONSE =
      new JSONObject()
          .put("access_token", TOKEN)
          .put("token_type", "Bearer")
          .put("expires_in", 360)
          .toString();

  @Test
  void shouldAbortIfNotAzure() {
    CredentialsProvider provider = new AzureGithubOidcCredentialsProvider();

    DatabricksConfig config =
        new DatabricksConfig()
            .setCredentialsProvider(provider)
            .setAzureClientId("clientID")
            .setAzureTenantId("tenantID")
            .setActionsIdTokenRequestToken("action-token")
            .setActionsIdTokenRequestUrl("action-url");

    assertNull(provider.configure(config));
  }

  @Test
  void shouldAbortIfMissingActionsIdTokenParameters() {
    CredentialsProvider provider = new AzureGithubOidcCredentialsProvider();

    DatabricksConfig config =
        new DatabricksConfig()
            .setHost(".azuredatabricks.net")
            .setCredentialsProvider(provider)
            .setAzureClientId("clientID")
            .setAzureTenantId("tenantID");

    assertNull(provider.configure(config));
  }

  @Test
  void shouldThrowIfTokenIdResponseIsNot200() throws MalformedURLException {
    CredentialsProvider provider = new AzureGithubOidcCredentialsProvider();

    HttpClient mockClient = mockClient(makeResponse(TOKEN_RESPONSE, 500));

    DatabricksConfig config =
        new DatabricksConfig()
            .setHost(".azuredatabricks.net")
            .setCredentialsProvider(new AzureGithubOidcCredentialsProvider())
            .setAzureClientId("clientID")
            .setAzureTenantId("tenantID")
            .setActionsIdTokenRequestToken("action-token")
            .setActionsIdTokenRequestUrl("action-url")
            .setHttpClient(mockClient);

    assertThrows(DatabricksException.class, () -> provider.configure(config));
  }

  @Test
  void shouldThrowIfInvalidTokenId() throws MalformedURLException {
    CredentialsProvider provider = new AzureGithubOidcCredentialsProvider();

    HttpClient mockClient = mockClient(makeResponse(":-(", 200));

    DatabricksConfig config =
        new DatabricksConfig()
            .setHost(".azuredatabricks.net")
            .setCredentialsProvider(new AzureGithubOidcCredentialsProvider())
            .setAzureClientId("clientID")
            .setAzureTenantId("tenantID")
            .setActionsIdTokenRequestToken("action-token")
            .setActionsIdTokenRequestUrl("action-url")
            .setHttpClient(mockClient);

    assertThrows(DatabricksException.class, () -> provider.configure(config));
  }

  @Test
  void shouldThrowIfTokenIdException() {
    CredentialsProvider provider = new AzureGithubOidcCredentialsProvider();

    HttpClient mockClient = mockClient(new IOException("test error"));

    DatabricksConfig config =
        new DatabricksConfig()
            .setHost(".azuredatabricks.net")
            .setCredentialsProvider(new AzureGithubOidcCredentialsProvider())
            .setAzureClientId("clientID")
            .setAzureTenantId("tenantID")
            .setActionsIdTokenRequestToken("action-token")
            .setActionsIdTokenRequestUrl("action-url")
            .setHttpClient(mockClient);

    assertThrows(DatabricksException.class, () -> provider.configure(config));
  }

  @Test
  void shouldThrowIfOAuthResponseException() throws IOException {
    CredentialsProvider provider = new AzureGithubOidcCredentialsProvider();

    HttpClient mockClient =
        mockClient(makeResponse(TOKEN_RESPONSE, 200), new IOException("test error"));

    DatabricksConfig config =
        new DatabricksConfig()
            .setHost(".azuredatabricks.net")
            .setCredentialsProvider(provider)
            .setAzureClientId("clientID")
            .setAzureTenantId("tenantID")
            .setActionsIdTokenRequestToken("action-token")
            .setActionsIdTokenRequestUrl("action-url")
            .setHttpClient(mockClient);

    HeaderFactory headerFactory = provider.configure(config);
    assertThrows(DatabricksException.class, headerFactory::headers);
  }

  @Test
  void shouldThrowIfInvalidOAuthResponse() throws IOException {
    CredentialsProvider provider = new AzureGithubOidcCredentialsProvider();

    HttpClient mockClient = mockClient(makeResponse(TOKEN_RESPONSE, 200), makeResponse(":-(", 200));

    DatabricksConfig config =
        new DatabricksConfig()
            .setHost(".azuredatabricks.net")
            .setCredentialsProvider(provider)
            .setAzureClientId("clientID")
            .setAzureTenantId("tenantID")
            .setActionsIdTokenRequestToken("action-token")
            .setActionsIdTokenRequestUrl("action-url")
            .setHttpClient(mockClient);

    HeaderFactory headerFactory = provider.configure(config);
    assertThrows(DatabricksException.class, headerFactory::headers);
  }

  @Test
  void success() throws IOException {
    CredentialsProvider provider = new AzureGithubOidcCredentialsProvider();

    HttpClient mockClient =
        mockClient(makeResponse(TOKEN_RESPONSE, 200), makeResponse(OAUTH_RESPONSE, 200));

    DatabricksConfig config =
        new DatabricksConfig()
            .setHost(".azuredatabricks.net")
            .setCredentialsProvider(provider)
            .setAzureClientId("clientID")
            .setAzureTenantId("tenantID")
            .setActionsIdTokenRequestToken("action-token")
            .setActionsIdTokenRequestUrl("action-url")
            .setHttpClient(mockClient);

    HeaderFactory header = provider.configure(config);

    String token = header.headers().get("Authorization");
    assertEquals(token, "Bearer " + TOKEN);
  }

  private static Response makeResponse(String body, int status) throws MalformedURLException {
    return new Response(body, status, "status", new URL("https://databricks.com/"));
  }

  private static HttpClient mockClient(Object... responses) {
    Iterator<Object> iterator = Arrays.asList(responses).iterator();
    return (Request in) -> {
      Object next = iterator.next();
      if (next instanceof Response) {
        return (Response) next;
      } else if (next instanceof IOException) {
        throw (IOException) next;
      } else {
        return null;
      }
    };
  }
}
