package com.databricks.sdk.integration;

import com.databricks.sdk.WorkspaceClient;
import com.databricks.sdk.core.DatabricksConfig;
import com.databricks.sdk.core.oauth.OpenIDConnectEndpoints;
import com.databricks.sdk.integration.framework.EnvContext;
import com.databricks.sdk.integration.framework.EnvTest;
import java.io.IOException;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable;
import org.junit.jupiter.api.extension.ExtendWith;

@EnvContext("workspace")
@ExtendWith(EnvTest.class)
public class OidcWorkspaceEndpointIT {
  @Test
  void checkEndpoints(WorkspaceClient w) throws IOException {
    OpenIDConnectEndpoints endpoints = w.config().getOidcEndpoints();
    String host = w.config().getHost();
    assert endpoints.getAuthorizationEndpoint().equals(host + "/oidc/v1/authorize");
    assert endpoints.getTokenEndpoint().equals(host + "/oidc/v1/token");
  }

  @Test
  @EnabledIfEnvironmentVariable(named = "UNIFIED_HOST", matches = ".+")
  void unifiedEndpointsForSpog(WorkspaceClient c) throws IOException {
    String unifiedHost = System.getenv("UNIFIED_HOST");
    DatabricksConfig cfg = c.config();
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
