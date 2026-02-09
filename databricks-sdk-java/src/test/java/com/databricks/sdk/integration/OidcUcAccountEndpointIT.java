package com.databricks.sdk.integration;

import com.databricks.sdk.AccountClient;
import com.databricks.sdk.core.DatabricksConfig;
import com.databricks.sdk.core.oauth.OpenIDConnectEndpoints;
import com.databricks.sdk.integration.framework.EnvContext;
import com.databricks.sdk.integration.framework.EnvTest;
import java.io.IOException;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable;
import org.junit.jupiter.api.extension.ExtendWith;

@EnvContext("ucacct")
@ExtendWith(EnvTest.class)
public class OidcUcAccountEndpointIT {
  @Test
  void checkEndpoints(AccountClient a) throws IOException {
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

  @Test
  @EnabledIfEnvironmentVariable(named = "UNIFIED_HOST", matches = ".+")
  void unifiedEndpointsForSpog(AccountClient a) throws IOException {
    String unifiedHost = System.getenv("UNIFIED_HOST");
    DatabricksConfig cfg = a.config();
    cfg.setHost(unifiedHost);
    cfg.setExperimentalIsUnifiedHost(true);
    OpenIDConnectEndpoints endpoints = cfg.getOidcEndpoints();
    String host = cfg.getHost();
    String accountId = cfg.getAccountId();
    assert endpoints
        .getAuthorizationEndpoint()
        .equals(host + "/oidc/accounts/" + accountId + "/v1/authorize");
    assert endpoints.getTokenEndpoint().equals(host + "/oidc/accounts/" + accountId + "/v1/token");
  }
}
