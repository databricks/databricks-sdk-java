package com.databricks.sdk.core;

import static com.databricks.sdk.core.AzureEnvironment.ARM_DATABRICKS_RESOURCE_ID;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.*;
import static org.mockito.Mockito.times;

import com.databricks.sdk.core.oauth.Token;
import com.databricks.sdk.core.oauth.TokenSource;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;

class AzureCliCredentialsProviderTest {

  private static final String WORKSPACE_RESOURCE_ID =
      "/subscriptions/2a2345f8/resourceGroups/deco-rg/providers/Microsoft.Databricks/workspaces/deco-ws";
  private static final String SUBSCRIPTION = "2a2345f8";
  private static final String TOKEN = "t-123";
  private static final String TOKEN_TYPE = "token-type";

  private static CliTokenSource mockTokenSource() {
    CliTokenSource tokenSource = Mockito.mock(CliTokenSource.class);
    Mockito.when(tokenSource.getToken())
        .thenReturn(new Token(TOKEN, TOKEN_TYPE, java.time.Instant.now()));
    return tokenSource;
  }

  private static AzureCliCredentialsProvider getAzureCliCredentialsProvider(
      TokenSource tokenSource) {

    AzureCliCredentialsProvider provider = Mockito.spy(new AzureCliCredentialsProvider());
    Mockito.doReturn(tokenSource).when(provider).getToken(any(), anyList());

    return provider;
  }

  @Test
  void testWorkSpaceIDUsage() {
    AzureCliCredentialsProvider provider = getAzureCliCredentialsProvider(mockTokenSource());
    DatabricksConfig config =
        new DatabricksConfig()
            .setHost(".azuredatabricks.net")
            .setCredentialsProvider(provider)
            .setAzureWorkspaceResourceId(WORKSPACE_RESOURCE_ID);
    ArgumentCaptor<List<String>> argument = ArgumentCaptor.forClass(List.class);

    HeaderFactory header = provider.configure(config);

    String token = header.headers().get("Authorization");
    assertEquals(token, TOKEN_TYPE + " " + TOKEN);
    Mockito.verify(provider, times(2)).getToken(any(), argument.capture());

    List<String> value = argument.getValue();
    value = value.subList(value.size() - 2, value.size());
    List<String> expected = Arrays.asList("--subscription", SUBSCRIPTION);
    assertEquals(expected, value);
  }

  @Test
  void testFallbackWhenTailsToGetTokenForSubscription() {
    CliTokenSource tokenSource = mockTokenSource();

    AzureCliCredentialsProvider provider = Mockito.spy(new AzureCliCredentialsProvider());
    Mockito.doThrow(new DatabricksException("error")).when(provider).getToken(any(), anyList());
    Mockito.doReturn(tokenSource).when(provider).getToken(any(), anyList());

    DatabricksConfig config =
        new DatabricksConfig()
            .setHost(".azuredatabricks.net")
            .setCredentialsProvider(provider)
            .setAzureWorkspaceResourceId(WORKSPACE_RESOURCE_ID);

    HeaderFactory header = provider.configure(config);

    String token = header.headers().get("Authorization");
    assertEquals(token, TOKEN_TYPE + " " + TOKEN);

    Mockito.verify(provider, times(1)).tokenSourceFor(any(), eq(ARM_DATABRICKS_RESOURCE_ID));
  }

  @Test
  void testGetTokenWithoutWorkspaceResourceID() {
    AzureCliCredentialsProvider provider = getAzureCliCredentialsProvider(mockTokenSource());
    DatabricksConfig config =
        new DatabricksConfig().setHost(".azuredatabricks.net").setCredentialsProvider(provider);

    ArgumentCaptor<List<String>> argument = ArgumentCaptor.forClass(List.class);

    HeaderFactory header = provider.configure(config);

    String token = header.headers().get("Authorization");
    assertEquals(token, TOKEN_TYPE + " " + TOKEN);
    Mockito.verify(provider, times(2)).getToken(any(), argument.capture());

    List<String> value = argument.getValue();
    assertFalse(value.contains("--subscription"));
    assertFalse(value.contains(SUBSCRIPTION));
  }
}
