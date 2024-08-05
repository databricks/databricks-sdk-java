package com.databricks.sdk.mixin;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.service.jobs.*;
import java.util.Collection;

public class JobsExt extends JobsAPI {

  public JobsExt(ApiClient apiClient) {
    super(apiClient);
  }

  public JobsExt(JobsService mock) {
    super(mock);
  }

  @Override
  public Run getRun(GetRunRequest request) {
    Run run = super.getRun(request);

    /*
     * fetch all additional pages (if any) and accumulate the result in a single response
     */

    Collection<RunTask> iterations = run.getIterations();
    boolean paginatingIterations = iterations != null && !iterations.isEmpty();

    Run currRun = run;
    while (currRun.getNextPageToken() != null) {
      request.setPageToken(currRun.getNextPageToken());
      currRun = super.getRun(request);
      if (paginatingIterations) {
        Collection<RunTask> newIterations = currRun.getIterations();
        if (newIterations != null) {
          run.getIterations().addAll(newIterations);
        }
      } else {
        Collection<RunTask> newTasks = currRun.getTasks();
        if (newTasks != null) {
          run.getTasks().addAll(newTasks);
        }
      }
    }

    // now that we've added all pages to the Run, the tokens are useless
    run.setNextPageToken(null);
    run.setPrevPageToken(null);

    return run;
  }
}
