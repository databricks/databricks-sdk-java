package com.databricks.sdk.core.oauth;

import static com.databricks.sdk.core.AzureEnvironment.ARM_DATABRICKS_RESOURCE_ID;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.times;

import com.databricks.sdk.core.*;
import java.time.LocalDateTime;
import java.time.temporal.IsoFields;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class AzureServicePrincipalCredentialsProviderTest {

  private static final String WORKSPACE_RESOURCE_ID =
      "/subscriptions/2a2345f8/resourceGroups/deco-rg/providers/Microsoft.Databricks/workspaces/deco-ws";
  private static final String SUBSCRIPTION = "2a2345f8";
  private static final String TOKEN = "t-123";
  private static final String TOKEN_TYPE = "token-type";
  public static final String PUBLIC_MANAGEMENT_ENDPOINT = "https://management.core.windows.net/";

  private static RefreshableTokenSource mockTokenSource() {
    RefreshableTokenSource tokenSource = Mockito.mock(RefreshableTokenSource.class);
    Mockito.when(tokenSource.getToken())
        .thenReturn(
            new Token(TOKEN, TOKEN_TYPE, LocalDateTime.now().plus(1, IsoFields.WEEK_BASED_YEARS)));
    return tokenSource;
  }

  private static AzureServicePrincipalCredentialsProvider
      getAzureServicePrincipalCredentialsProvider(RefreshableTokenSource tokenSource) {
    AzureServicePrincipalCredentialsProvider provider =
        Mockito.spy(new AzureServicePrincipalCredentialsProvider());
    Mockito.doReturn(tokenSource)
        .when(provider)
        .tokenSourceFor(any(), eq(ARM_DATABRICKS_RESOURCE_ID));
    Mockito.doReturn(tokenSource)
        .when(provider)
        .tokenSourceFor(any(), eq(PUBLIC_MANAGEMENT_ENDPOINT));
    Mockito.doReturn(tokenSource)
        .when(provider)
        .tokenSourceFor(any(), eq(ARM_DATABRICKS_RESOURCE_ID), eq(SUBSCRIPTION));
    Mockito.doReturn(tokenSource)
        .when(provider)
        .tokenSourceFor(any(), eq(PUBLIC_MANAGEMENT_ENDPOINT), eq(SUBSCRIPTION));
    return provider;
  }

  @Test
  void testWorkSpaceIDUsage() {
    AzureServicePrincipalCredentialsProvider provider =
        getAzureServicePrincipalCredentialsProvider(mockTokenSource());
    DatabricksConfig config =
        new DatabricksConfig()
            .setHost(".azuredatabricks.")
            .setCredentialsProvider(provider)
            .setAzureClientId("clientID")
            .setAzureClientSecret("clientSecret")
            .setAzureTenantId("tenantID")
            .setAzureWorkspaceResourceId(WORKSPACE_RESOURCE_ID);

    HeaderFactory header = provider.configure(config);

    String token = header.headers().get("Authorization");
    assertEquals(token, "Bearer " + TOKEN);
    Mockito.verify(provider, times(1))
        .tokenSourceFor(any(), eq(ARM_DATABRICKS_RESOURCE_ID), eq(SUBSCRIPTION));
    Mockito.verify(provider, times(1))
        .tokenSourceFor(any(), eq(PUBLIC_MANAGEMENT_ENDPOINT), eq(SUBSCRIPTION));
    Mockito.verify(provider, never()).tokenSourceFor(any(), eq(ARM_DATABRICKS_RESOURCE_ID));
    Mockito.verify(provider, never()).tokenSourceFor(any(), eq(PUBLIC_MANAGEMENT_ENDPOINT));
  }

  @Test
  void testFallbackWhenTailsToGetTokenForSubscription() {
    CliTokenSource tokenSource = Mockito.mock(CliTokenSource.class);
    Mockito.when(tokenSource.getToken())
        .thenThrow(new DatabricksException("error"))
        .thenReturn(new Token(TOKEN, TOKEN_TYPE, LocalDateTime.now()));

    AzureServicePrincipalCredentialsProvider provider =
        getAzureServicePrincipalCredentialsProvider(tokenSource);

    DatabricksConfig config =
        new DatabricksConfig()
            .setHost(".azuredatabricks.")
            .setCredentialsProvider(provider)
            .setAzureClientId("clientID")
            .setAzureClientSecret("clientSecret")
            .setAzureTenantId("tenantID")
            .setAzureWorkspaceResourceId(WORKSPACE_RESOURCE_ID);

    HeaderFactory header = provider.configure(config);

    String token = header.headers().get("Authorization");
    assertEquals(token, "Bearer " + TOKEN);

    Mockito.verify(provider, times(1))
        .tokenSourceFor(any(), eq(ARM_DATABRICKS_RESOURCE_ID), eq(SUBSCRIPTION));
    Mockito.verify(provider, times(1))
        .tokenSourceFor(any(), eq(PUBLIC_MANAGEMENT_ENDPOINT), eq(SUBSCRIPTION));
    Mockito.verify(provider, times(1)).tokenSourceFor(any(), eq(ARM_DATABRICKS_RESOURCE_ID));
    Mockito.verify(provider, times(1)).tokenSourceFor(any(), eq(PUBLIC_MANAGEMENT_ENDPOINT));
  }

  @Test
  void testGetTokenWithoutWorkspaceResourceID() {
    AzureServicePrincipalCredentialsProvider provider =
        getAzureServicePrincipalCredentialsProvider(mockTokenSource());
    DatabricksConfig config =
        new DatabricksConfig()
            .setHost(".azuredatabricks.")
            .setCredentialsProvider(provider)
            .setAzureClientId("clientID")
            .setAzureClientSecret("clientSecret")
            .setAzureTenantId("tenantID");

    HeaderFactory header = provider.configure(config);

    String token = header.headers().get("Authorization");
    assertEquals(token, "Bearer " + TOKEN);
    Mockito.verify(provider, never())
        .tokenSourceFor(any(), eq(ARM_DATABRICKS_RESOURCE_ID), eq(SUBSCRIPTION));
    Mockito.verify(provider, never())
        .tokenSourceFor(any(), eq(PUBLIC_MANAGEMENT_ENDPOINT), eq(SUBSCRIPTION));
    Mockito.verify(provider, times(1)).tokenSourceFor(any(), eq(ARM_DATABRICKS_RESOURCE_ID));
    Mockito.verify(provider, times(1)).tokenSourceFor(any(), eq(PUBLIC_MANAGEMENT_ENDPOINT));
  }
}
