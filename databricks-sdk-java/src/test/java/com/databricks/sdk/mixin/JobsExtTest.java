package com.databricks.sdk.mixin;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
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
    BaseJob job3 = new BaseJob().setJobId(300L).setSettings(new JobSettings().setName("job3"));
    addTasks(job3, "job3_taskKey1", "job3_taskKey2");

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
    ListJobsResponse responsePage1 =
        new ListJobsResponse().setJobs(jobsOnFirstPage).setNextPageToken("page2token");
    List<BaseJob> jobsOnSecondPage = new ArrayList<>();
    jobsOnSecondPage.add(job3);
    ListJobsResponse responsePage2 = new ListJobsResponse().setJobs(jobsOnSecondPage);

    JobsExt jobsExt = new JobsExt(service);
    when(service.list(any())).thenReturn(responsePage1).thenReturn(responsePage2);

    ListJobsRequest request = new ListJobsRequest().setExpandTasks(true);
    Iterable<BaseJob> jobsList = jobsExt.list(request);

    BaseJob expectedJob1 =
        new BaseJob().setJobId(100L).setSettings(new JobSettings().setName("job1"));
    addTasks(expectedJob1, "job1_taskKey1", "job1_taskKey2", "job1_taskKey3", "job1_taskKey4");
    BaseJob expectedJob2 =
        new BaseJob().setJobId(200L).setSettings(new JobSettings().setName("job2"));
    addTasks(expectedJob2, "job2_taskKey1", "job2_taskKey2", "job2_taskKey3", "job2_taskKey4");
    BaseJob expectedJob3 =
        new BaseJob().setJobId(300L).setSettings(new JobSettings().setName("job3"));
    addTasks(expectedJob3, "job3_taskKey1", "job3_taskKey2");
    List<BaseJob> expectedJobsList = new ArrayList<>();
    expectedJobsList.add(expectedJob1);
    expectedJobsList.add(expectedJob2);
    expectedJobsList.add(expectedJob3);
    for (BaseJob job : jobsList) {
      BaseJob expectedJob =
          expectedJobsList.stream()
              .filter(e -> e.getJobId().equals(job.getJobId()))
              .findFirst()
              .orElse(null);
      assertEquals(expectedJob, job);
      assertNull(expectedJob.getHasMore());
    }
    // 2 getRun calls for job1, 2 getRun calls for job2, 0 getRun call for job3
    verify(service, times(4)).get(any());
  }

  private void addTasks(BaseJob job, String... taskKeys) {
    Collection<Task> tasks = new ArrayList<>();
    for (String taskKey : taskKeys) {
      tasks.add(new Task().setTaskKey(taskKey));
    }
    job.getSettings().setTasks(tasks);
  }

  @Test
  public void testListRunsWithoutExpandTasks() {
    JobsService service = Mockito.mock(JobsService.class);
    BaseRun run1 = new BaseRun().setRunId(100L).setJobId(1L);
    BaseRun run2 = new BaseRun().setRunId(200L).setJobId(2L);
    BaseRun run3 = new BaseRun().setRunId(300L).setJobId(3L);
    BaseRun run4 = new BaseRun().setRunId(400L).setJobId(4L);

    List<BaseRun> runsOnFirstPage = new ArrayList<>();
    runsOnFirstPage.add(run1);
    runsOnFirstPage.add(run2);
    List<BaseRun> runsOnSecondPage = new ArrayList<>();
    runsOnSecondPage.add(run3);
    runsOnSecondPage.add(run4);
    when(service.listRuns(any()))
        .thenReturn(new ListRunsResponse().setRuns(runsOnFirstPage))
        .thenReturn(new ListRunsResponse().setRuns(runsOnSecondPage));
    JobsExt jobsExt = new JobsExt(service);

    ListRunsRequest request = new ListRunsRequest().setExpandTasks(false);
    Iterable<BaseRun> runsList = jobsExt.listRuns(request);

    List<BaseRun> expectedRunsList = new ArrayList<>();
    expectedRunsList.add(run1);
    expectedRunsList.add(run2);
    expectedRunsList.add(run3);
    expectedRunsList.add(run4);
    for (BaseRun run : runsList) {
      BaseRun expectedRun =
          expectedRunsList.stream()
              .filter(e -> e.getRunId().equals(run.getRunId()))
              .findFirst()
              .orElse(null);
      assertEquals(expectedRun, run);
    }
    verify(service, times(0)).getRun(any());
  }

  @Test
  public void testListRuns() {
    JobsService service = Mockito.mock(JobsService.class);
    BaseRun run1 = new BaseRun().setRunId(100L).setJobId(1L).setHasMore(true);
    addTasks(run1, 101L, 102L);
    BaseRun run2 = new BaseRun().setRunId(200L).setJobId(2L).setHasMore(true);
    addTasks(run2, 201L, 202L);
    BaseRun run3 = new BaseRun().setRunId(300L).setJobId(3L);
    addTasks(run3, 301L);
    BaseRun run4 = new BaseRun().setRunId(400L).setJobId(4L).setHasMore(true);
    addTasks(run4, 401L, 402L);

    List<BaseRun> runsOnFirstPage = new ArrayList<>();
    runsOnFirstPage.add(run1);
    runsOnFirstPage.add(run2);
    runsOnFirstPage.add(run3);
    ListRunsResponse listRunsResponse1 =
        new ListRunsResponse().setRuns(runsOnFirstPage).setNextPageToken("page2token");
    List<BaseRun> runsOnSecondPage = new ArrayList<>();
    runsOnSecondPage.add(run4);
    ListRunsResponse listRunsResponse2 = new ListRunsResponse().setRuns(runsOnSecondPage);

    when(service.listRuns(any())).thenReturn(listRunsResponse1).thenReturn(listRunsResponse2);

    // runs/get?run_id=100
    Run getRun1_page1 = new Run().setRunId(100L).setJobId(1L).setNextPageToken("run1_page2token");
    addTasks(getRun1_page1, 101L, 102L);
    Run getRun1_page2 = new Run().setRunId(100L).setJobId(1L).setNextPageToken("run1_page3token");
    addTasks(getRun1_page2, 103L, 104L);
    Run getRun1_page3 = new Run().setRunId(100L).setJobId(1L);
    addTasks(getRun1_page3, 105L);

    // runs/get?run_id=200
    Run getRun2_page1 = new Run().setRunId(200L).setJobId(2L).setNextPageToken("run2_page2token");
    addTasks(getRun2_page1, 201L, 202L);
    Run getRun2_page2 = new Run().setRunId(200L).setJobId(2L);
    addTasks(getRun2_page2, 203L);

    // runs/get?run_id=300
    Run getRun3_page1 = new Run().setRunId(300L).setJobId(3L);
    addTasks(getRun3_page1, 301L);

    // runs/get?run_id=400
    Run getRun4_page1 = new Run().setRunId(400L).setJobId(4L).setNextPageToken("run4_page2token");
    addTasks(getRun4_page1, 401L, 402L);
    Run getRun4_page2 = new Run().setRunId(400L).setJobId(4L);
    addTasks(getRun4_page2, 403L, 404L);

    doReturn(getRun1_page1)
        .when(service)
        .getRun(
            argThat(
                request ->
                    request != null
                        && request.getRunId() == 100L
                        && request.getPageToken() == null));
    doReturn(getRun1_page2)
        .when(service)
        .getRun(
            argThat(
                request ->
                    request != null
                        && request.getRunId() == 100L
                        && "run1_page2token".equals(request.getPageToken())));
    doReturn(getRun1_page3)
        .when(service)
        .getRun(
            argThat(
                request ->
                    request != null
                        && request.getRunId() == 100L
                        && "run1_page3token".equals(request.getPageToken())));
    doReturn(getRun2_page1)
        .when(service)
        .getRun(
            argThat(
                request ->
                    request != null
                        && request.getRunId() == 200L
                        && request.getPageToken() == null));
    doReturn(getRun2_page2)
        .when(service)
        .getRun(
            argThat(
                request ->
                    request != null
                        && request.getRunId() == 200L
                        && "run2_page2token".equals(request.getPageToken())));
    doReturn(getRun3_page1)
        .when(service)
        .getRun(
            argThat(
                request ->
                    request != null
                        && request.getRunId() == 300L
                        && request.getPageToken() == null));
    doReturn(getRun4_page1)
        .when(service)
        .getRun(
            argThat(
                request ->
                    request != null
                        && request.getRunId() == 400L
                        && request.getPageToken() == null));
    doReturn(getRun4_page2)
        .when(service)
        .getRun(
            argThat(
                request ->
                    request != null
                        && request.getRunId() == 400L
                        && "run4_page2token".equals(request.getPageToken())));

    JobsExt jobsExt = new JobsExt(service);
    ListRunsRequest request = new ListRunsRequest().setExpandTasks(true);
    Iterable<BaseRun> runsList = jobsExt.listRuns(request);

    BaseRun expectedRun1 = new BaseRun().setRunId(100L).setJobId(1L);
    addTasks(expectedRun1, 101L, 102L, 103L, 104L, 105L);
    BaseRun expectedRun2 = new BaseRun().setRunId(200L).setJobId(2L);
    addTasks(expectedRun2, 201L, 202L, 203L);
    BaseRun expectedRun3 = new BaseRun().setRunId(300L).setJobId(3L);
    addTasks(expectedRun3, 301L);
    BaseRun expectedRun4 = new BaseRun().setRunId(400L).setJobId(4L);
    addTasks(expectedRun4, 401L, 402L, 403L, 404L);
    List<BaseRun> expectedRunsList = new ArrayList<>();
    expectedRunsList.add(expectedRun1);
    expectedRunsList.add(expectedRun2);
    expectedRunsList.add(expectedRun3);
    expectedRunsList.add(expectedRun4);
    for (BaseRun run : runsList) {
      BaseRun expectedRun =
          expectedRunsList.stream()
              .filter(e -> e.getRunId().equals(run.getRunId()))
              .findFirst()
              .orElse(null);
      assertEquals(expectedRun, run);
    }
    // 3 getRun calls for run 100, 2 getRun calls for run 200, 0 getRun call for run 300, 2 getRun
    // calls for run 400
    verify(service, times(7)).getRun(any());
  }

  private void addTasks(BaseRun run, long... taskRunIds) {
    Collection<RunTask> tasks = new ArrayList<>();
    for (long runId : taskRunIds) {
      tasks.add(new RunTask().setRunId(runId));
    }
    run.setTasks(tasks);
  }
}
