package com.databricks.sdk.integration;

import static org.junit.jupiter.api.Assertions.*;

import com.databricks.sdk.WorkspaceClient;
import com.databricks.sdk.core.error.platform.InvalidParameterValue;
import com.databricks.sdk.core.error.platform.ResourceDoesNotExist;
import com.databricks.sdk.integration.framework.CollectionUtils;
import com.databricks.sdk.integration.framework.EnvContext;
import com.databricks.sdk.integration.framework.EnvTest;
import com.databricks.sdk.service.jobs.*;
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

  @Test
  void deleteNonExistingJob(WorkspaceClient w) {
    assertThrowsExactly(
        InvalidParameterValue.class,
        () -> {
          w.jobs().delete(123456789);
        });
  }

  @Test
  void resetNonExistingJob(WorkspaceClient w) {
    assertThrowsExactly(
        InvalidParameterValue.class,
        () -> {
          w.jobs().reset(123456789, new JobSettings());
        });
  }

  @Test
  void updateNonExistingJob(WorkspaceClient w) {
    assertThrowsExactly(
        InvalidParameterValue.class,
        () -> {
          w.jobs().update(123456789);
        });
  }

  @Test
  void runNonExistingJob(WorkspaceClient w) {
    assertThrowsExactly(
        InvalidParameterValue.class,
        () -> {
          w.jobs().runNow(123456789);
        });
  }

  @Test
  void listsRuns(WorkspaceClient w) {
    Iterable<BaseRun> list = w.jobs().listRuns(new ListRunsRequest());

    java.util.List<BaseRun> all = CollectionUtils.asList(list);

    CollectionUtils.assertUnique(all);
  }

  @Test
  void getNonExistingRun(WorkspaceClient w) {
    assertThrowsExactly(
        InvalidParameterValue.class,
        () -> {
          w.jobs().getRun(123456789);
        });
  }

  @Test
  void getOutputOfNonExistingRun(WorkspaceClient w) {
    assertThrowsExactly(
        InvalidParameterValue.class,
        () -> {
          w.jobs().getRunOutput(123456789);
        });
  }

  @Test
  void deleteNonExistingRun(WorkspaceClient w) {
    assertThrowsExactly(
        InvalidParameterValue.class,
        () -> {
          w.jobs().deleteRun(123456789);
        });
  }

  @Test
  void exportNonExistingRun(WorkspaceClient w) {
    assertThrowsExactly(
        InvalidParameterValue.class,
        () -> {
          w.jobs().exportRun(123456789);
        });
  }

  @Test
  void cancelingNonExistingRun(WorkspaceClient w) {
    assertThrowsExactly(
        InvalidParameterValue.class,
        () -> {
          w.jobs().cancelRun(123456789);
        });
  }

  @Test
  void cancelingAllRunsFromNonExistingJob(WorkspaceClient w) {
    assertThrowsExactly(
        InvalidParameterValue.class,
        () -> {
          w.jobs().cancelAllRuns(new CancelAllRuns().setJobId(123456789L));
        });
  }

  @Test
  void repairingANonExistingRun(WorkspaceClient w) {
    assertThrowsExactly(
        InvalidParameterValue.class,
        () -> {
          w.jobs().repairRun(123456789);
        });
  }
}
