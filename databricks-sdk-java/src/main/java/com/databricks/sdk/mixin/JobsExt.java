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

  /**
   * Wrap the {@code JobsApi.getRun} operation to retrieve paginated content without breaking the
   * response contract.
   *
   * <p>Depending on the Jobs API version used under the hood, tasks or iteration runs retrieved by
   * the initial request may be truncated due to high cardinalities. Truncation can happen for job
   * runs over 100 task runs, as well as ForEach task runs with over 100 iteration runs. To avoid
   * returning an incomplete {@code Run} object to the user, this method performs all the requests
   * required to collect all task/iteration runs into a single {@code Run} object.
   */
  @Override
  public Run getRun(GetRunRequest request) {
    Run run = super.getRun(request);

    /*
     * fetch all additional pages (if any) and accumulate the result in a single response
     */

    Collection<RunTask> iterations = run.getIterations();
    boolean paginatingIterations = iterations != null && !iterations.isEmpty();

    while (run.getNextPageToken() != null) {
      request.setPageToken(run.getNextPageToken());
      Run currRun = super.getRun(request);
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

      Collection<JobCluster> newClusters = currRun.getJobClusters();
      if (newClusters != null) {
        run.getJobClusters().addAll(newClusters);
      }
      Collection<JobParameter> newParameters = currRun.getJobParameters();
      if (newParameters != null) {
        run.getJobParameters().addAll(newParameters);
      }
      Collection<RepairHistoryItem> newRepairHistory = currRun.getRepairHistory();
      if (newRepairHistory != null) {
          run.getRepairHistory().addAll(newRepairHistory);
      }
      run.setNextPageToken(currRun.getNextPageToken());
    }

    return run;
  }
}
