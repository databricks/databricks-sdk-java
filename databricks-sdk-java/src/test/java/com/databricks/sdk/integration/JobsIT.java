package com.databricks.sdk.integration;

import com.databricks.sdk.WorkspaceClient;
import com.databricks.sdk.framework.CollectionUtils;
import com.databricks.sdk.framework.EnvContext;
import com.databricks.sdk.framework.EnvTest;
import com.databricks.sdk.service.jobs.BaseJob;
import com.databricks.sdk.service.jobs.ListJobsRequest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

@EnvContext("workspace")
@ExtendWith(EnvTest.class)
public class JobsIT {
  @Test
  void listsJobs(WorkspaceClient w) {
    Iterable<BaseJob> list = w.jobs().list(new ListJobsRequest());

    java.util.List<BaseJob> all = CollectionUtils.asList(list);

    CollectionUtils.assertUnique(all);
  }
}
