package com.databricks.sdk.integration;

import com.databricks.sdk.AccountClient;
import com.databricks.sdk.framework.CollectionUtils;
import com.databricks.sdk.framework.EnvContext;
import com.databricks.sdk.framework.EnvTest;
import com.databricks.sdk.service.provisioning.Workspace;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledIfEnvironmentVariable;
import org.junit.jupiter.api.extension.ExtendWith;

@EnvContext("account")
@DisabledIfEnvironmentVariable(named = "ARM_CLIENT_ID", matches = ".*")
@ExtendWith(EnvTest.class)
public class WorkspacesIT {
  @Test
  void listsWorkspaces(AccountClient a) {
    Iterable<Workspace> list = a.workspaces().list();

    java.util.List<Workspace> all = CollectionUtils.asList(list);

    CollectionUtils.assertUnique(all);
  }
}
