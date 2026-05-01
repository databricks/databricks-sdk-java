package com.databricks.sdk.integration;

import com.databricks.sdk.AccountClient;
import com.databricks.sdk.core.DatabricksConfig;
import com.databricks.sdk.integration.framework.EnvContext;
import com.databricks.sdk.integration.framework.EnvTest;
import com.databricks.sdk.service.iam.Group;
import com.databricks.sdk.service.iam.ListAccountGroupsRequest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable;
import org.junit.jupiter.api.extension.ExtendWith;

@EnvContext("account")
@ExtendWith(EnvTest.class)
@EnabledIfEnvironmentVariable(named = "UNIFIED_HOST", matches = ".+")
public class UnifiedHostAccountIT {
  @Test
  void listGroups(AccountClient a) {
    String unifiedHost = System.getenv("UNIFIED_HOST");
    DatabricksConfig cfg = a.config();
    cfg.setHost(unifiedHost);

    Iterable<Group> groups = a.groups().list(new ListAccountGroupsRequest());
    assert groups.iterator().hasNext();
  }
}
