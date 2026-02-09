package com.databricks.sdk.integration;

import com.databricks.sdk.AccountClient;
import com.databricks.sdk.core.oauth.OpenIDConnectEndpoints;
import com.databricks.sdk.integration.framework.EnvContext;
import com.databricks.sdk.integration.framework.EnvTest;
import java.io.IOException;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

@EnvContext("account")
@ExtendWith(EnvTest.class)
public class OidcAccountEndpointIT {
  @Test
  void lists(AccountClient a) throws IOException {
    OpenIDConnectEndpoints endpoints = a.config().getOidcEndpoints();
    String host = a.config().getHost();
    String accountId = a.config().getAccountId();
    if (a.config().isAzure()) {
      assert endpoints.getAuthorizationEndpoint().equals(host + "/oidc/v1/authorize");
      assert endpoints.getTokenEndpoint().equals(host + "/oidc/v1/token");
    } else {
      assert endpoints
          .getAuthorizationEndpoint()
          .equals(host + "/oidc/accounts/" + accountId + "/v1/authorize");
      assert endpoints
          .getTokenEndpoint()
          .equals(host + "/oidc/accounts/" + accountId + "/v1/token");
    }
  }
}
