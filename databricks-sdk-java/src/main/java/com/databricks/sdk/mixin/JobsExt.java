package com.databricks.sdk.mixin;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.service.jobs.*;
import java.util.Collection;
import java.util.Iterator;

public class JobsExt extends JobsAPI {

  public JobsExt(ApiClient apiClient) {
    super(apiClient);
  }

  public JobsExt(JobsService mock) {
    super(mock);
  }

  /**
   * List jobs.
   *
   * <p>Retrieves a list of jobs. If the job has multiple pages of tasks, job_clusters, parameters
   * or environments, it will paginate through all pages and aggregate the results.
   */
  public Iterable<BaseJob> list(ListJobsRequest request) {
    // fetch jobs with limited elements in top level arrays
    Iterable<BaseJob> jobsList = super.list(request);

    if (!request.getExpandTasks()) {
      return jobsList;
    }

    Iterator<BaseJob> iterator = jobsList.iterator();
    return () ->
        new Iterator<BaseJob>() {
          @Override
          public boolean hasNext() {
            return iterator.hasNext();
          }

          @Override
          public BaseJob next() {
            BaseJob job = iterator.next();

            // The has_more field is only present in jobs with 100+ tasks, that is served from Jobs
            // API 2.2.
            // Extra tasks and other fields need to be fetched only when has_more is true.
            if (job.getHasMore() != null && job.getHasMore()) {
              // fully fetch all top level arrays for the job
              GetJobRequest getJobRequest = new GetJobRequest().setJobId(job.getJobId());
              Job fullJob = get(getJobRequest);
              job.getSettings().setTasks(fullJob.getSettings().getTasks());
              job.getSettings().setJobClusters(fullJob.getSettings().getJobClusters());
              job.getSettings().setParameters(fullJob.getSettings().getParameters());
              job.getSettings().setEnvironments(fullJob.getSettings().getEnvironments());
            }
            // Set the has_more field to false to indicate that there are no more tasks and other
            // fields to fetch.
            job.setHasMore(null);
            return job;
          }
        };
  }

  /**
   * List job runs.
   *
   * <p>Retrieve a list of runs. If the run has multiple pages of tasks, job_clusters, parameters or
   * repair_history, it will paginate through all pages and aggregate the results.
   */
  public Iterable<BaseRun> listRuns(ListRunsRequest request) {
    // fetch runs with limited elements in top level arrays
    Iterable<BaseRun> runsList = super.listRuns(request);

    if (!request.getExpandTasks()) {
      return runsList;
    }

    Iterator<BaseRun> iterator = runsList.iterator();
    return () ->
        new Iterator<BaseRun>() {
          @Override
          public boolean hasNext() {
            return iterator.hasNext();
          }

          @Override
          public BaseRun next() {
            BaseRun run = iterator.next();

            // The has_more field is only present in run with 100+ tasks, that is served from Jobs
            // API 2.2.
            // Extra tasks and other fields need to be fetched only when has_more is true.
            if (run.getHasMore() != null && run.getHasMore()) {
              // fully fetch all top level arrays for the run
              GetRunRequest getRunRequest = new GetRunRequest().setRunId(run.getRunId());
              Run fullRun = getRun(getRunRequest);
              run.setTasks(fullRun.getTasks());
              run.setJobClusters(fullRun.getJobClusters());
              run.setJobParameters(fullRun.getJobParameters());
              run.setRepairHistory(fullRun.getRepairHistory());
            }
            // Set the has_more fields to null.
            // This field in Jobs API 2.2 is useful for pagination. It indicates if there are more
            // than 100 tasks or job_clusters in the run.
            // This function hides pagination details from the user. So the field does not play
            // useful role here.
            run.setHasMore(null);
            return run;
          }
        };
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
