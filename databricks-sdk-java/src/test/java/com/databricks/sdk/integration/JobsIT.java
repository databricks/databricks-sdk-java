package com.databricks.sdk.integration;

import static org.junit.jupiter.api.Assertions.*;

import com.databricks.sdk.WorkspaceClient;
import com.databricks.sdk.core.error.platform.ResourceDoesNotExist;
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
  void listsJobs(WorkspaceClient w) {
    Iterable<BaseJob> list = w.jobs().list(new ListJobsRequest());

    java.util.List<BaseJob> all = CollectionUtils.asList(list);

    CollectionUtils.assertUnique(all);
  }

  @Test
  void getNonExistingJob(WorkspaceClient w) {
    assertThrowsExactly(
        ResourceDoesNotExist.class,
        () -> {
          w.jobs().get(123456789);
        });
  }
}
