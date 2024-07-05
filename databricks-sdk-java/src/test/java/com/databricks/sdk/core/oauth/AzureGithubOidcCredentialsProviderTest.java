package com.databricks.sdk.core.oauth;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.databricks.sdk.core.CredentialsProvider;
import com.databricks.sdk.core.DatabricksConfig;
import com.databricks.sdk.core.HeaderFactory;
import com.databricks.sdk.core.http.HttpClient;
import com.databricks.sdk.core.http.Request;
import com.databricks.sdk.core.http.Response;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.collect.ImmutableMap;
import java.io.IOException;
import java.net.URL;
import java.util.Arrays;
import java.util.Iterator;
import org.junit.jupiter.api.Test;

public class AzureGithubOidcCredentialsProviderTest {
  private static final String TOKEN = "t-123";
  private static final String TOKEN_TYPE = "token-type";

  @Test
  void testGetToken() throws IOException {
    CredentialsProvider provider = new AzureGithubOidcCredentialsProvider();

    String responseTokenId =
        new ObjectMapper()
            .writeValueAsString(ImmutableMap.builder().put("value", "token-id").build());
    String responseOauth =
        new ObjectMapper()
            .writeValueAsString(
                ImmutableMap.builder()
                    .put("access_token", TOKEN)
                    .put("token_type", TOKEN_TYPE)
                    .put("expires_in", 360)
                    .build());

    HttpClient mockClient =
        mockClient(
            new Response(responseTokenId, new URL("https://databricks.com/")),
            new Response(responseOauth, new URL("https://databricks.com/")));

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

  private static HttpClient mockClient(Response... responses) {
    Iterator<Response> iterator = Arrays.asList(responses).iterator();
    return (Request in) -> iterator.hasNext() ? iterator.next() : null;
  }
}
