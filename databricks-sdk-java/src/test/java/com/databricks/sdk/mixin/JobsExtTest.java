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

  @Test
  public void testListJobsWithoutExpandTasks() {
    JobsService service = Mockito.mock(JobsService.class);
    BaseJob job1 = new BaseJob().setJobId(100L).setSettings(new JobSettings().setName("job1"));
    BaseJob job2 = new BaseJob().setJobId(200L).setSettings(new JobSettings().setName("job2"));
    BaseJob job3 = new BaseJob().setJobId(300L).setSettings(new JobSettings().setName("job3"));
    BaseJob job4 = new BaseJob().setJobId(400L).setSettings(new JobSettings().setName("job4"));

    List<BaseJob> jobsOnFirstPage = new ArrayList<>();
    jobsOnFirstPage.add(job1);
    jobsOnFirstPage.add(job2);
    List<BaseJob> jobsOnSecondPage = new ArrayList<>();
    jobsOnSecondPage.add(job3);
    jobsOnSecondPage.add(job4);
    when(service.list(any()))
        .thenReturn(new ListJobsResponse().setJobs(jobsOnFirstPage))
        .thenReturn(new ListJobsResponse().setJobs(jobsOnSecondPage));
    JobsExt jobsExt = new JobsExt(service);

    ListJobsRequest request = new ListJobsRequest().setExpandTasks(false);
    Iterable<BaseJob> jobsList = jobsExt.list(request);

    List<BaseJob> expectedJobsList = new ArrayList<>();
    expectedJobsList.add(job1);
    expectedJobsList.add(job2);
    expectedJobsList.add(job3);
    expectedJobsList.add(job4);
    for (BaseJob job : jobsList) {
      BaseJob expectedJob =
          expectedJobsList.stream()
              .filter(e -> e.getJobId().equals(job.getJobId()))
              .findFirst()
              .orElse(null);
      assertEquals(expectedJob, job);
    }
    verify(service, times(0)).get(any());
  }

  @Test
  public void testListJobs() {
    JobsService service = Mockito.mock(JobsService.class);
    BaseJob job1 =
        new BaseJob()
            .setJobId(100L)
            .setSettings(new JobSettings().setName("job1"))
            .setHasMore(true);
    addTasks(job1, "job1_taskKey1", "job1_taskKey2");
    BaseJob job2 =
        new BaseJob()
            .setJobId(200L)
            .setSettings(new JobSettings().setName("job2"))
            .setHasMore(true);
    addTasks(job2, "job2_taskKey1", "job2_taskKey2");

    Job getJob1_page1 =
        new Job()
            .setJobId(100L)
            .setNextPageToken("job1_page2token")
            .setSettings(new JobSettings().setName("job1"));
    addTasks(getJob1_page1, "job1_taskKey1", "job1_taskKey2");
    Job getJob1_page2 = new Job().setJobId(100L).setSettings(new JobSettings().setName("job1"));
    addTasks(getJob1_page2, "job1_taskKey3", "job1_taskKey4");

    Job getJob2_page1 =
        new Job()
            .setJobId(200L)
            .setNextPageToken("job2_page2token")
            .setSettings(new JobSettings().setName("job2"));
    addTasks(getJob2_page1, "job2_taskKey1", "job2_taskKey2");
    Job getJob2_page2 = new Job().setJobId(200L).setSettings(new JobSettings().setName("job2"));
    addTasks(getJob2_page2, "job2_taskKey3", "job2_taskKey4");

    doReturn(getJob1_page1)
        .when(service)
        .get(
            argThat(
                request ->
                    request != null
                        && request.getJobId() == 100L
                        && request.getPageToken() == null));
    doReturn(getJob1_page2)
        .when(service)
        .get(
            argThat(
                request ->
                    request != null
                        && request.getJobId() == 100L
                        && "job1_page2token".equals(request.getPageToken())));
    doReturn(getJob2_page1)
        .when(service)
        .get(
            argThat(
                request ->
                    request != null
                        && request.getJobId() == 200L
                        && request.getPageToken() == null));
    doReturn(getJob2_page2)
        .when(service)
        .get(
            argThat(
                request ->
                    request != null
                        && request.getJobId() == 200L
                        && "job2_page2token".equals(request.getPageToken())));

    List<BaseJob> jobsOnFirstPage = new ArrayList<>();
    jobsOnFirstPage.add(job1);
    jobsOnFirstPage.add(job2);
    ListJobsResponse response = new ListJobsResponse().setJobs(jobsOnFirstPage);
    when(service.list(any())).thenReturn(response);
    JobsExt jobsExt = new JobsExt(service);

    ListJobsRequest request = new ListJobsRequest().setExpandTasks(true);
    Iterable<BaseJob> jobsList = jobsExt.list(request);

    BaseJob expectedJob1 =
        new BaseJob()
            .setJobId(100L)
            .setSettings(new JobSettings().setName("job1"))
            .setHasMore(false);
    addTasks(expectedJob1, "job1_taskKey1", "job1_taskKey2", "job1_taskKey3", "job1_taskKey4");
    BaseJob expectedJob2 =
        new BaseJob()
            .setJobId(200L)
            .setSettings(new JobSettings().setName("job2"))
            .setHasMore(false);
    addTasks(expectedJob2, "job2_taskKey1", "job2_taskKey2", "job2_taskKey3", "job2_taskKey4");
    List<BaseJob> expectedJobsList = new ArrayList<>();
    expectedJobsList.add(expectedJob1);
    expectedJobsList.add(expectedJob2);
    for (BaseJob job : jobsList) {
      BaseJob expectedJob =
          expectedJobsList.stream()
              .filter(e -> e.getJobId().equals(job.getJobId()))
              .findFirst()
              .orElse(null);
      assertEquals(expectedJob, job);
    }
    verify(service, times(4)).get(any());
  }

  private void addTasks(BaseJob job, String... taskKeys) {
    Collection<Task> tasks = new ArrayList<>();
    for (String taskKey : taskKeys) {
      tasks.add(new Task().setTaskKey(taskKey));
    }
    job.getSettings().setTasks(tasks);
  }
}
