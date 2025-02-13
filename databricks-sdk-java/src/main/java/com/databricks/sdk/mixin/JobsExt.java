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
   * runs with over 100 task runs, as well as ForEach task runs with over 100 iteration runs. To
   * avoid returning an incomplete {@code Run} object to the user, this method performs all the
   * requests required to collect all task/iteration runs into a single {@code Run} object.
   */
  @Override
  public Run getRun(GetRunRequest request) {
    Run run = super.getRun(request);

    // When querying a Job run, a page token is returned when there are more than 100 tasks. No
    // iterations are defined for a Job run. Therefore, the next page in the response only includes
    // the next page of tasks.
    // When querying a ForEach task run, a page token is returned when there are more than 100
    // iterations. Only a single task is returned, corresponding to the ForEach task itself.
    // Therefore, the client only reads the iterations from the next page and not the tasks.
    Collection<RunTask> iterations = run.getIterations();
    boolean paginatingIterations = iterations != null && !iterations.isEmpty();

    // runs/get response includes next_page_token as long as there are more pages to fetch.
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

      // Each new page of runs/get response includes the next page of the job_clusters,
      // job_parameters, and repair history.
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

  /**
   * Wrap the {@code JobsApi.get} operation to retrieve paginated content without breaking the
   * response contract.
   *
   * <p>Depending on the Jobs API version used under the hood, tasks or job_clusters retrieved by
   * the initial request may be truncated due to high cardinalities. Truncation can happen for jobs
   * with over 100 tasks, as well as job_clusters with over 100 elements. To avoid returning an
   * incomplete {@code Job} object to the user, this method performs all the requests required to
   * collect all tasks and job_clusters into a single {@code Job} object.
   */
  public Job get(GetJobRequest request) {
    Job job = super.get(request);

    // jobs/get response includes next_page_token as long as there are more pages to fetch.
    while (job.getNextPageToken() != null) {
      request.setPageToken(job.getNextPageToken());
      Job currJob = super.get(request);
      // Each new page of jobs/get response includes the next page of the tasks, job_clusters,
      // job_parameters, and environments.
      Collection<Task> newTasks = currJob.getSettings().getTasks();
      if (newTasks != null) {
        job.getSettings().getTasks().addAll(newTasks);
      }
      Collection<JobCluster> newClusters = currJob.getSettings().getJobClusters();
      if (newClusters != null) {
        job.getSettings().getJobClusters().addAll(newClusters);
      }
      Collection<JobParameterDefinition> newParameters = currJob.getSettings().getParameters();
      if (newParameters != null) {
        job.getSettings().getParameters().addAll(newParameters);
      }
      Collection<JobEnvironment> newEnvironments = currJob.getSettings().getEnvironments();
      if (newEnvironments != null) {
        job.getSettings().getEnvironments().addAll(newEnvironments);
      }
      job.setNextPageToken(currJob.getNextPageToken());
    }

    return job;
  }
}
