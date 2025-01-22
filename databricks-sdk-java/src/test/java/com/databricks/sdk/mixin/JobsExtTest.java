package com.databricks.sdk.mixin;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

import com.databricks.sdk.service.jobs.*;

import java.util.ArrayList;
import java.util.Collection;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class JobsExtTest {

  @Test
  public void testGetRunPaginationWithTasks() {
    JobsService service = Mockito.mock(JobsService.class);

    Run firstPage = new Run().setNextPageToken("tokenToSecondPage");
    addTasks(firstPage, 0L, 1L);
    addJobClusters(firstPage, "clusterKey1", "clusterKey2");
    addJobParameters(firstPage, "parameterKey1", "parameterKey2");
    Run secondPage = new Run().setNextPageToken("tokenToThirdPage");
    addTasks(secondPage, 2L, 3L);
    addJobClusters(secondPage, "clusterKey3");
    addJobParameters(secondPage, "parameterKey3", "parameterKey4");
    Run thirdPage = new Run();
    addTasks(thirdPage, 4L);
    addJobParameters(thirdPage, "parameterKey5");


    when(service.getRun(any())).thenReturn(firstPage).thenReturn(secondPage).thenReturn(thirdPage);

    JobsExt jobsExt = new JobsExt(service);

    GetRunRequest request = new GetRunRequest();

    Run run = jobsExt.getRun(request);

    Run expectedRun = new Run();
    addTasks(expectedRun, 0L, 1L, 2L, 3L, 4L);
    addJobClusters(expectedRun, "clusterKey1", "clusterKey2", "clusterKey3");
    addJobParameters(expectedRun, "parameterKey1", "parameterKey2", "parameterKey3", "parameterKey4", "parameterKey5");

    assertEquals(expectedRun, run);
    verify(service, times(3)).getRun(any());
  }

  @Test
  public void testGetRunPaginationWithIterations() {
    JobsService service = Mockito.mock(JobsService.class);

    Run firstPage = new Run().setNextPageToken("tokenToSecondPage");
    addIterations(firstPage, 0L, 1L);
    Run secondPage = new Run().setNextPageToken("tokenToThirdPage");
    addIterations(secondPage, 2L, 3L);
    Run thirdPage = new Run();
    addIterations(thirdPage, 4L);

    when(service.getRun(any())).thenReturn(firstPage).thenReturn(secondPage).thenReturn(thirdPage);

    JobsExt jobsExt = new JobsExt(service);

    GetRunRequest request = new GetRunRequest();

    Run run = jobsExt.getRun(request);

    Run expectedRun = new Run();
    addIterations(expectedRun, 0L, 1L, 2L, 3L, 4L);

    assertEquals(expectedRun, run);
    verify(service, times(3)).getRun(any());
  }

  private void addTasks(Run run, long... taskRunIds) {
    Collection<RunTask> tasks = new ArrayList<>();
    for (long runId : taskRunIds) {
      tasks.add(new RunTask().setRunId(runId));
    }
    run.setTasks(tasks);
  }

  private void addIterations(Run run, long... iterationRunIds) {
    Collection<RunTask> iterations = new ArrayList<>();
    for (long runId : iterationRunIds) {
      iterations.add(new RunTask().setRunId(runId));
    }
    run.setIterations(iterations);
  }

  private void addJobClusters(Run run, String... clusterKeys) {
    Collection<JobCluster> clusters = new ArrayList<>();
    for (String clusterKey : clusterKeys) {
      clusters.add(new JobCluster().setJobClusterKey(clusterKey));
    }
    run.setJobClusters(clusters);
  }

  private void addJobParameters(Run run, String... parameterKeys) {
    Collection<JobParameter> parameters = new ArrayList<>();
    for (String parameterKey : parameterKeys) {
      parameters.add(new JobParameter().setName(parameterKey).setValue(parameterKey));
    }
    run.setJobParameters(parameters);
  }
}
