package com.databricks.sdk.client.oauth;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import com.databricks.sdk.client.commons.CommonsHttpClient;
import java.util.HashMap;
import org.junit.jupiter.api.Test;

public class ClientCredentialsTest {

  @Test
  void clientCredentialsBuilderTest() {
    ClientCredentials testClientCreds =
        new ClientCredentials.Builder()
            .withClientId("test-client-id")
            .withClientSecret("test-client-secret")
            .withTokenUrl("test-token-url")
            .withHttpClient(new CommonsHttpClient(30))
            .withEndpointParameters(new HashMap<>())
            .build();

    assertNotNull(testClientCreds);
  }
}
