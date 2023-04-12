package com.databricks.sdk.integration;

import com.databricks.sdk.DatabricksWorkspace;
import com.databricks.sdk.integration.framework.CollectionUtils;
import com.databricks.sdk.integration.framework.EnvContext;
import com.databricks.sdk.integration.framework.EnvTest;
import com.databricks.sdk.service.repos.List;
import com.databricks.sdk.service.repos.RepoInfo;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

@EnvContext("workspace")
@ExtendWith(EnvTest.class)
public class ReposIT {
  @Test
  void listsRepos(DatabricksWorkspace w) {
    Iterable<RepoInfo> list = w.repos().list(new List());

    java.util.List<RepoInfo> all = CollectionUtils.asList(list);

    CollectionUtils.assertUnique(all);
  }
}
