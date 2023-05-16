package com.databricks.sdk.integration;

import com.databricks.sdk.WorkspaceClient;
import com.databricks.sdk.integration.framework.CollectionUtils;
import com.databricks.sdk.integration.framework.EnvContext;
import com.databricks.sdk.integration.framework.EnvTest;
import com.databricks.sdk.service.workspace.ListReposRequest;
import com.databricks.sdk.service.workspace.RepoInfo;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

@EnvContext("workspace")
@ExtendWith(EnvTest.class)
public class ReposIT {
  @Test
  void listsRepos(WorkspaceClient w) {
    Iterable<RepoInfo> list = w.repos().list(new ListReposRequest());

    java.util.List<RepoInfo> all = CollectionUtils.asList(list);

    CollectionUtils.assertUnique(all);
  }
}
