package com.databricks.sdk.integration;

import com.databricks.sdk.AccountClient;
import com.databricks.sdk.WorkspaceClient;
import com.databricks.sdk.integration.framework.EnvContext;
import com.databricks.sdk.integration.framework.EnvTest;
import com.databricks.sdk.service.provisioning.Workspace;
import java.util.Iterator;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

@EnvContext("account")
@ExtendWith(EnvTest.class)
public class AccountClientIT {
  @Test
  public void getWorkspaceClient(AccountClient a) {
    Iterator<Workspace> workspaces = a.workspaces().list().iterator();
    if (!workspaces.hasNext()) {
      return;
    }
    Workspace workspace = workspaces.next();
    WorkspaceClient w = a.getWorkspaceClient(workspace);
    assert w.currentUser().me().getActive();
  }
}
