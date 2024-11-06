package com.databricks.sdk.integration;

import com.databricks.sdk.AccountClient;
import com.databricks.sdk.WorkspaceClient;
import com.databricks.sdk.integration.framework.EnvContext;
import com.databricks.sdk.integration.framework.EnvOrSkip;
import com.databricks.sdk.integration.framework.EnvTest;
import com.databricks.sdk.service.provisioning.Workspace;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

// Enable this test for aws-prod-acct once the issue with adding SP to non UC account is resolved
@EnvContext("ucacct")
@ExtendWith(EnvTest.class)
public class AccountClientIT {
  @Test
  public void getWorkspaceClient(
      AccountClient a, @EnvOrSkip("TEST_WORKSPACE_ID") String workspaceIdStr) {
    long workspaceId = Long.parseLong(workspaceIdStr);
    Workspace workspace = a.workspaces().get(workspaceId);
    WorkspaceClient w = a.getWorkspaceClient(workspace);
    assert w.currentUser().me().getActive();
  }
}
