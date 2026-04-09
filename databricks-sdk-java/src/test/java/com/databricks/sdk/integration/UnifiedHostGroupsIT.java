package com.databricks.sdk.integration;

import static org.junit.jupiter.api.Assertions.*;

import com.databricks.sdk.WorkspaceClient;
import com.databricks.sdk.core.DatabricksConfig;
import com.databricks.sdk.integration.framework.EnvContext;
import com.databricks.sdk.integration.framework.EnvOrSkip;
import com.databricks.sdk.integration.framework.EnvTest;
import com.databricks.sdk.service.iam.Group;
import com.databricks.sdk.service.iam.ListGroupsRequest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

@EnvContext("account")
@ExtendWith(EnvTest.class)
public class UnifiedHostGroupsIT {
  @Test
  void listWorkspaceGroupsViaUnifiedHost(
      @EnvOrSkip("UNIFIED_HOST") String host,
      @EnvOrSkip("TEST_WORKSPACE_ID") String workspaceId,
      @EnvOrSkip("DATABRICKS_CLIENT_ID") String clientId,
      @EnvOrSkip("DATABRICKS_CLIENT_SECRET") String clientSecret) {
    DatabricksConfig config =
        new DatabricksConfig()
            .setHost(host)
            .setWorkspaceId(workspaceId)
            .setClientId(clientId)
            .setClientSecret(clientSecret);
    WorkspaceClient ws = new WorkspaceClient(config);

    Iterable<Group> groups = ws.groups().list(new ListGroupsRequest().setAttributes("displayName"));
    Group first = groups.iterator().next();
    assertNotNull(first.getDisplayName());
  }
}
