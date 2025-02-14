package com.databricks.sdk.mixin;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

import com.databricks.sdk.service.jobs.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
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
    addJobParameters(
        expectedRun,
        "parameterKey1",
        "parameterKey2",
        "parameterKey3",
        "parameterKey4",
        "parameterKey5");

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

  @Test
  public void testGetJobPaginationWithTasks() {
    JobsService service = Mockito.mock(JobsService.class);
    Task taskKey1 = new Task().setTaskKey("taskKey1");
    Task taskKey2 = new Task().setTaskKey("taskKey2");
    List<Task> tasks = new ArrayList<>();
    tasks.add(taskKey1);
    tasks.add(taskKey2);

    JobCluster jobClusterKey1 = new JobCluster().setJobClusterKey("jobClusterKey1");
    List<JobCluster> jobClusters = new ArrayList<>();
    jobClusters.add(jobClusterKey1);
    Job firstPage =
        new Job().setSettings(new JobSettings().setTasks(tasks).setJobClusters(jobClusters));

    when(service.get(any())).thenReturn(firstPage);
    JobsExt jobsExt = new JobsExt(service);

    GetJobRequest request = new GetJobRequest();
    Job job = jobsExt.get(request);

    Job expectedJob =
        new Job().setSettings(new JobSettings().setTasks(tasks).setJobClusters(jobClusters));
    assertEquals(expectedJob, job);
    verify(service, times(1)).get(any());
  }

  @Test
  public void testGetJobPaginationWithJobClusters() {
    JobsService service = Mockito.mock(JobsService.class);
    Job firstPage = new Job().setSettings(new JobSettings()).setNextPageToken("tokenToSecondPage");
    addTasks(firstPage, "taskKey1", "taskKey2");
    addJobClusters(firstPage, "clusterKey1", "clusterKey2");
    addJobParameters(firstPage, "parameterKey1");
    addJobEnvironments(firstPage, "environmentKey1");

    Job secondPage = new Job().setSettings(new JobSettings()).setNextPageToken("tokenToThirdPage");
    addTasks(secondPage, "taskKey3", "taskKey4");
    addJobClusters(secondPage, "clusterKey3");
    addJobParameters(secondPage, "parameterKey2");
    addJobEnvironments(secondPage, "environmentKey2");

    Job thirdPage = new Job().setSettings(new JobSettings());
    addTasks(thirdPage, "taskKey5");
    addJobParameters(thirdPage, "parameterKey3");

    when(service.get(any())).thenReturn(firstPage).thenReturn(secondPage).thenReturn(thirdPage);
    JobsExt jobsExt = new JobsExt(service);

    GetJobRequest request = new GetJobRequest();
    Job job = jobsExt.get(request);

    Job expectedJob = new Job().setSettings(new JobSettings());
    addTasks(expectedJob, "taskKey1", "taskKey2", "taskKey3", "taskKey4", "taskKey5");
    addJobClusters(expectedJob, "clusterKey1", "clusterKey2", "clusterKey3");
    addJobParameters(expectedJob, "parameterKey1", "parameterKey2", "parameterKey3");
    addJobEnvironments(expectedJob, "environmentKey1", "environmentKey2");
    assertEquals(expectedJob, job);
    verify(service, times(3)).get(any());
  }

  private void addTasks(Job job, String... taskKeys) {
    Collection<Task> tasks = new ArrayList<>();
    for (String taskKey : taskKeys) {
      tasks.add(new Task().setTaskKey(taskKey));
    }
    job.getSettings().setTasks(tasks);
  }

  private void addJobClusters(Job job, String... clusterKeys) {
    Collection<JobCluster> jobClusters = new ArrayList<>();
    for (String clusterKey : clusterKeys) {
      jobClusters.add(new JobCluster().setJobClusterKey(clusterKey));
    }
    job.getSettings().setJobClusters(jobClusters);
  }

  private void addJobParameters(Job job, String... parameterKeys) {
    Collection<JobParameterDefinition> parameters = new ArrayList<>();
    for (String parameterKey : parameterKeys) {
      parameters.add(new JobParameterDefinition().setName(parameterKey));
    }
    job.getSettings().setParameters(parameters);
  }

  private void addJobEnvironments(Job job, String... environmentKeys) {
    Collection<JobEnvironment> environments = new ArrayList<>();
    for (String environmentKey : environmentKeys) {
      environments.add(new JobEnvironment().setEnvironmentKey(environmentKey));
    }
    job.getSettings().setEnvironments(environments);
  }
}
