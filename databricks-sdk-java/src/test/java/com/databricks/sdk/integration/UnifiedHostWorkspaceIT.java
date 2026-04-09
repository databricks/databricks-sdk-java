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
import org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable;
import org.junit.jupiter.api.extension.ExtendWith;

@EnvContext("account")
@ExtendWith(EnvTest.class)
@EnabledIfEnvironmentVariable(named = "UNIFIED_HOST", matches = ".+")
public class UnifiedHostWorkspaceIT {
  @Test
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
