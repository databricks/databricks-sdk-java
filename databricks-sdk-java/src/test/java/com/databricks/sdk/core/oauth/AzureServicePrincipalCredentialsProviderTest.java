package com.databricks.sdk.core.oauth;

import static com.databricks.sdk.core.AzureEnvironment.ARM_DATABRICKS_RESOURCE_ID;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.times;

import com.databricks.sdk.core.*;

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.temporal.IsoFields;
import java.util.HashMap;
import java.util.Map;

import com.databricks.sdk.core.http.HttpClient;
import com.databricks.sdk.core.http.Response;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class AzureServicePrincipalCredentialsProviderTest {
  private static final String TOKEN = "t-123";
  private static final String TOKEN_TYPE = "token-type";

  @Test
  void testGetToken() throws IOException {
    AzureServicePrincipalCredentialsProvider provider = new AzureServicePrincipalCredentialsProvider();
    HttpClient mockClient = Mockito.mock(HttpClient.class);
    Map<String, Object> response = new HashMap<>();
    response.put("access_token", TOKEN);
    response.put("token_type", TOKEN_TYPE);
    response.put("expires_in", 360);
    String responseJson = new ObjectMapper().writeValueAsString(response);
    System.out.println(responseJson);
    Mockito.when(mockClient.execute(any()))
        .thenReturn(new Response(responseJson))
        .thenReturn(new Response(responseJson));
    DatabricksConfig config =
        new DatabricksConfig()
            .setHost(".azuredatabricks.net")
            .setCredentialsProvider(provider)
            .setAzureClientId("clientID")
            .setAzureClientSecret("clientSecret")
            .setAzureTenantId("tenantID")
            .setHttpClient(mockClient);

    HeaderFactory header = provider.configure(config);

    String token = header.headers().get("Authorization");
    assertEquals(token, "Bearer " + TOKEN);
  }
}
