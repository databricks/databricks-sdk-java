package com.databricks.sdk.core;

import static com.databricks.sdk.core.AzureEnvironment.ARM_DATABRICKS_RESOURCE_ID;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.times;

import com.databricks.sdk.core.oauth.Token;
import com.databricks.sdk.core.oauth.TokenSource;
import java.time.LocalDateTime;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class AzureCliCredentialsProviderTest {

  private static final String WORKSPACE_RESOURCE_ID =
      "/subscriptions/2a2345f8/resourceGroups/deco-rg/providers/Microsoft.Databricks/workspaces/deco-ws";
  private static final String SUBSCRIPTION = "2a2345f8";
  private static final String TOKEN = "t-123";
  private static final String TOKEN_TYPE = "token-type";
  public static final String PUBLIC_MANAGEMENT_ENDPOINT = "https://management.core.windows.net/";

  private static CliTokenSource mockTokenSource() {
    CliTokenSource tokenSource = Mockito.mock(CliTokenSource.class);
    Mockito.when(tokenSource.getToken())
        .thenReturn(new Token(TOKEN, TOKEN_TYPE, LocalDateTime.now()));
    return tokenSource;
  }

  private static AzureCliCredentialsProvider getAzureCliCredentialsProvider(
      TokenSource tokenSource) {

    AzureCliCredentialsProvider provider = Mockito.spy(new AzureCliCredentialsProvider());
    Mockito.doReturn(tokenSource)
        .when(provider)
        .tokenSourceFor(any(), eq(ARM_DATABRICKS_RESOURCE_ID));
    Mockito.doReturn(tokenSource)
        .when(provider)
        .tokenSourceFor(any(), eq(ARM_DATABRICKS_RESOURCE_ID), eq(SUBSCRIPTION));
    Mockito.doReturn(tokenSource)
        .when(provider)
        .tokenSourceFor(any(), eq(PUBLIC_MANAGEMENT_ENDPOINT));
    Mockito.doReturn(tokenSource)
        .when(provider)
        .tokenSourceFor(any(), eq(PUBLIC_MANAGEMENT_ENDPOINT), eq(SUBSCRIPTION));

    return provider;
  }

  @Test
  void testWorkSpaceIDUsage() {
    AzureCliCredentialsProvider provider = getAzureCliCredentialsProvider(mockTokenSource());
    DatabricksConfig config =
        new DatabricksConfig()
            .setHost(".azuredatabricks.")
            .setCredentialsProvider(provider)
            .setAzureWorkspaceResourceId(WORKSPACE_RESOURCE_ID);

    HeaderFactory header = provider.configure(config);

    String token = header.headers().get("Authorization");
    assertEquals(token, TOKEN_TYPE + " " + TOKEN);
    Mockito.verify(provider, times(1))
        .tokenSourceFor(any(), eq(ARM_DATABRICKS_RESOURCE_ID), eq(SUBSCRIPTION));
    Mockito.verify(provider, never()).tokenSourceFor(any(), eq(ARM_DATABRICKS_RESOURCE_ID));
  }

  @Test
  void testFallbackWhenTailsToGetTokenForSubscription() {
    CliTokenSource tokenSource = Mockito.mock(CliTokenSource.class);
    Mockito.when(tokenSource.getToken())
        .thenThrow(new DatabricksException("error"))
        .thenReturn(new Token(TOKEN, TOKEN_TYPE, LocalDateTime.now()));

    AzureCliCredentialsProvider provider = getAzureCliCredentialsProvider(tokenSource);

    DatabricksConfig config =
        new DatabricksConfig()
            .setHost(".azuredatabricks.")
            .setCredentialsProvider(provider)
            .setAzureWorkspaceResourceId(WORKSPACE_RESOURCE_ID);

    HeaderFactory header = provider.configure(config);

    String token = header.headers().get("Authorization");
    assertEquals(token, TOKEN_TYPE + " " + TOKEN);

    Mockito.verify(provider, times(1))
        .tokenSourceFor(any(), eq(ARM_DATABRICKS_RESOURCE_ID), eq(SUBSCRIPTION));
    Mockito.verify(provider, times(1)).tokenSourceFor(any(), eq(ARM_DATABRICKS_RESOURCE_ID));
  }

  @Test
  void testGetTokenWithoutWorkspaceResourceID() {
    AzureCliCredentialsProvider provider = getAzureCliCredentialsProvider(mockTokenSource());
    DatabricksConfig config =
        new DatabricksConfig().setHost(".azuredatabricks.").setCredentialsProvider(provider);

    HeaderFactory header = provider.configure(config);

    String token = header.headers().get("Authorization");
    assertEquals(token, TOKEN_TYPE + " " + TOKEN);
    Mockito.verify(provider, never())
        .tokenSourceFor(any(), eq(ARM_DATABRICKS_RESOURCE_ID), eq(SUBSCRIPTION));
    Mockito.verify(provider, times(1)).tokenSourceFor(any(), eq(ARM_DATABRICKS_RESOURCE_ID));
  }
}
