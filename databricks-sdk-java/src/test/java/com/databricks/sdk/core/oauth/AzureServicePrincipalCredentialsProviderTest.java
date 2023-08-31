package com.databricks.sdk.core.oauth;

import static com.databricks.sdk.core.AzureEnvironment.ARM_DATABRICKS_RESOURCE_ID;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.times;

import com.databricks.sdk.core.*;
import java.time.LocalDateTime;
import java.time.temporal.IsoFields;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class AzureServicePrincipalCredentialsProviderTest {
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
    return provider;
  }

  @Test
  void testGetToken() {
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
    Mockito.verify(provider, times(1)).tokenSourceFor(any(), eq(ARM_DATABRICKS_RESOURCE_ID));
    Mockito.verify(provider, times(1)).tokenSourceFor(any(), eq(PUBLIC_MANAGEMENT_ENDPOINT));
  }
}
