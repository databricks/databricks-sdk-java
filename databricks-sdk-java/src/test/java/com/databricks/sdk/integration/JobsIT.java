package com.databricks.sdk.integration;

import com.databricks.sdk.DatabricksWorkspace;
import com.databricks.sdk.integration.framework.CollectionUtils;
import com.databricks.sdk.integration.framework.EnvContext;
import com.databricks.sdk.integration.framework.EnvTest;
import com.databricks.sdk.service.jobs.BaseJob;
import com.databricks.sdk.service.jobs.ListJobsRequest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

@EnvContext("workspace")
@ExtendWith(EnvTest.class)
public class JobsIT {
  @Test
  void listsJobs(DatabricksWorkspace w) {
    Iterable<BaseJob> list = w.jobs().list(new ListJobsRequest());

    java.util.List<BaseJob> all = CollectionUtils.asList(list);

    CollectionUtils.assertUnique(all);
  }
}
