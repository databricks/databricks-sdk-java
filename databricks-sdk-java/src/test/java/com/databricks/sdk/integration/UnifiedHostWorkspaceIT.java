package com.databricks.sdk.integration;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import com.databricks.sdk.AccountClient;
import com.databricks.sdk.WorkspaceClient;
import com.databricks.sdk.core.DatabricksConfig;
import com.databricks.sdk.integration.framework.EnvContext;
import com.databricks.sdk.integration.framework.EnvOrSkip;
import com.databricks.sdk.integration.framework.EnvTest;
import com.databricks.sdk.service.iam.User;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledIfEnvironmentVariable;
import org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable;
import org.junit.jupiter.api.extension.ExtendWith;

@EnvContext("account")
@ExtendWith(EnvTest.class)
@EnabledIfEnvironmentVariable(named = "UNIFIED_HOST", matches = ".+")
public class UnifiedHostWorkspaceIT {
  // google-credentials uses a GCP ID token with target_audience=cfg.host.
  // On the unified host this produces the same token for both account and workspace
  // requests (identical OIDC exchange, identical audience). Account-level APIs accept
  // this token, but workspace-level APIs return 401. The X-Databricks-Org-Id header
  // is set correctly. This appears to be a server-side limitation on unified hosts.
  @Test
  @DisabledIfEnvironmentVariable(named = "CLOUD_PROVIDER", matches = "GCP")
  void currentUserMe(
      AccountClient a,
      @EnvOrSkip("UNIFIED_HOST") String unifiedHost,
      @EnvOrSkip("TEST_WORKSPACE_ID") String workspaceId,
      @EnvOrSkip("TEST_ACCOUNT_ID") String accountId) {
    DatabricksConfig config =
        new DatabricksConfig()
            .setHost(unifiedHost)
            .setClientId(a.config().getClientId())
            .setClientSecret(a.config().getClientSecret())
            .setWorkspaceId(workspaceId)
            .setAccountId(accountId);

    WorkspaceClient ws = new WorkspaceClient(config);

    User me = ws.currentUser().me();
    assertNotNull(me.getUserName(), "Expected non-empty UserName");
  }
}
