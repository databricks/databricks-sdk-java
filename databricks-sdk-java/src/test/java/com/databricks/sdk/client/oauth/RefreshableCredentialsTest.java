package com.databricks.sdk.client.oauth;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import com.databricks.sdk.client.commons.CommonsHttpClient;
import org.junit.jupiter.api.Test;

public class RefreshableCredentialsTest {
  @Test
  void refreshableCredentialsBuilderTest() {
    RefreshableCredentials testRefreshableCreds =
        new RefreshableCredentials.Builder()
            .withClientId("test-client-id")
            .withClientSecret("test-client-secret")
            .withTokenUrl("test-token-url")
            .withRedirectUrl("test-redirect-url")
            .withHttpClient(new CommonsHttpClient(30))
            .build();

    assertNotNull(testRefreshableCreds);
    assertEquals(testRefreshableCreds.authType(), "oauth-u2m");
    assertEquals(testRefreshableCreds.getClientId(), "test-client-id");
    assertEquals(testRefreshableCreds.getClientSecret(), "test-client-secret");
    assertEquals(testRefreshableCreds.getTokenUrl(), "test-token-url");
    assertEquals(testRefreshableCreds.getRedirectUrl(), "test-redirect-url");
  }
}
