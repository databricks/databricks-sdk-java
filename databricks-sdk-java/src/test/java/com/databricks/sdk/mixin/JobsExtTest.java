package com.databricks.sdk.mixin;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

import com.databricks.sdk.service.jobs.GetRunRequest;
import com.databricks.sdk.service.jobs.JobsService;
import com.databricks.sdk.service.jobs.Run;
import com.databricks.sdk.service.jobs.RunTask;
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
    Run secondPage = new Run().setNextPageToken("tokenToThirdPage");
    addTasks(secondPage, 2L, 3L);
    Run thirdPage = new Run();
    addTasks(thirdPage, 4L);

    when(service.getRun(any())).thenReturn(firstPage).thenReturn(secondPage).thenReturn(thirdPage);

    JobsExt jobsExt = new JobsExt(service);

    GetRunRequest request = new GetRunRequest();

    Run run = jobsExt.getRun(request);

    Run expectedRun = new Run();
    addTasks(expectedRun, 0L, 1L, 2L, 3L, 4L);

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
}
