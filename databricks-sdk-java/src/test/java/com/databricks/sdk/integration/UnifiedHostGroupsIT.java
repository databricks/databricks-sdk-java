package com.databricks.sdk.integration;

import static org.junit.jupiter.api.Assertions.*;

import com.databricks.sdk.AccountClient;
import com.databricks.sdk.WorkspaceClient;
import com.databricks.sdk.core.DatabricksConfig;
import com.databricks.sdk.integration.framework.EnvContext;
import com.databricks.sdk.integration.framework.EnvOrSkip;
import com.databricks.sdk.integration.framework.EnvTest;
import com.databricks.sdk.service.iam.Group;
import com.databricks.sdk.service.iam.ListGroupsRequest;
import java.util.Iterator;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledIfEnvironmentVariable;
import org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable;
import org.junit.jupiter.api.extension.ExtendWith;

@EnvContext("account")
@ExtendWith(EnvTest.class)
@EnabledIfEnvironmentVariable(named = "UNIFIED_HOST", matches = ".+")
public class UnifiedHostGroupsIT {
  @Test
  @DisabledIfEnvironmentVariable(named = "CLOUD_PROVIDER", matches = "GCP")
  void listWorkspaceGroupsViaUnifiedHost(
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

    Iterable<Group> groups = ws.groups().list(new ListGroupsRequest().setAttributes("displayName"));
    Iterator<Group> it = groups.iterator();
    assertTrue(it.hasNext(), "Expected at least one group");
    Group first = it.next();
    assertNotNull(first.getDisplayName());
  }
}
