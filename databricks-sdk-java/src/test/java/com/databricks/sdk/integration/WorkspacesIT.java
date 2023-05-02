package com.databricks.sdk.integration;

import com.databricks.sdk.DatabricksAccount;
import com.databricks.sdk.integration.framework.CollectionUtils;
import com.databricks.sdk.integration.framework.EnvContext;
import com.databricks.sdk.integration.framework.EnvTest;
import com.databricks.sdk.service.provisioning.Workspace;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

@EnvContext("account")
@ExtendWith(EnvTest.class)
public class WorkspacesIT {
  @Test
  void listsWorkspaces(DatabricksAccount a) {
    Iterable<Workspace> list = a.workspaces().list();

    java.util.List<Workspace> all = CollectionUtils.asList(list);

    CollectionUtils.assertUnique(all);
  }
}
