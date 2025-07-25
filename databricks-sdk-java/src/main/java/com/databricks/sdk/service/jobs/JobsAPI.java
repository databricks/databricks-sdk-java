// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.jobs;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.core.DatabricksException;
import com.databricks.sdk.support.Generated;
import com.databricks.sdk.support.Paginator;
import com.databricks.sdk.support.Wait;
import java.time.Duration;
import java.util.Arrays;
import java.util.concurrent.TimeoutException;
import java.util.function.Consumer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * The Jobs API allows you to create, edit, and delete jobs.
 *
 * <p>You can use a Databricks job to run a data processing or data analysis task in a Databricks
 * cluster with scalable resources. Your job can consist of a single task or can be a large,
 * multi-task workflow with complex dependencies. Databricks manages the task orchestration, cluster
 * management, monitoring, and error reporting for all of your jobs. You can run your jobs
 * immediately or periodically through an easy-to-use scheduling system. You can implement job tasks
 * using notebooks, JARS, Delta Live Tables pipelines, or Python, Scala, Spark submit, and Java
 * applications.
 *
 * <p>You should never hard code secrets or store them in plain text. Use the [Secrets CLI] to
 * manage secrets in the [Databricks CLI]. Use the [Secrets utility] to reference secrets in
 * notebooks and jobs.
 *
 * <p>[Databricks CLI]: https://docs.databricks.com/dev-tools/cli/index.html [Secrets CLI]:
 * https://docs.databricks.com/dev-tools/cli/secrets-cli.html [Secrets utility]:
 * https://docs.databricks.com/dev-tools/databricks-utils.html#dbutils-secrets
 */
@Generated
public class JobsAPI {
  private static final Logger LOG = LoggerFactory.getLogger(JobsAPI.class);

  private final JobsService impl;

  /** Regular-use constructor */
  public JobsAPI(ApiClient apiClient) {
    impl = new JobsImpl(apiClient);
  }

  /** Constructor for mocks */
  public JobsAPI(JobsService mock) {
    impl = mock;
  }

  public Run waitGetRunJobTerminatedOrSkipped(Long runId) throws TimeoutException {
    return waitGetRunJobTerminatedOrSkipped(runId, Duration.ofMinutes(20), null);
  }

  public Run waitGetRunJobTerminatedOrSkipped(Long runId, Duration timeout, Consumer<Run> callback)
      throws TimeoutException {
    long deadline = System.currentTimeMillis() + timeout.toMillis();
    java.util.List<RunLifeCycleState> targetStates =
        Arrays.asList(RunLifeCycleState.TERMINATED, RunLifeCycleState.SKIPPED);
    java.util.List<RunLifeCycleState> failureStates =
        Arrays.asList(RunLifeCycleState.INTERNAL_ERROR);
    String statusMessage = "polling...";
    int attempt = 1;
    while (System.currentTimeMillis() < deadline) {
      Run poll = getRun(new GetRunRequest().setRunId(runId));
      RunLifeCycleState status = poll.getState().getLifeCycleState();
      statusMessage = String.format("current status: %s", status);
      if (poll.getState() != null) {
        statusMessage = poll.getState().getStateMessage();
      }
      if (targetStates.contains(status)) {
        return poll;
      }
      if (callback != null) {
        callback.accept(poll);
      }
      if (failureStates.contains(status)) {
        String msg =
            String.format(
                "failed to reach TERMINATED or SKIPPED, got %s: %s", status, statusMessage);
        throw new IllegalStateException(msg);
      }

      String prefix = String.format("runId=%s", runId);
      int sleep = attempt;
      if (sleep > 10) {
        // sleep 10s max per attempt
        sleep = 10;
      }
      LOG.info("{}: ({}) {} (sleeping ~{}s)", prefix, status, statusMessage, sleep);
      try {
        Thread.sleep((long) (sleep * 1000L + Math.random() * 1000));
      } catch (InterruptedException e) {
        Thread.currentThread().interrupt();
        throw new DatabricksException("Current thread was interrupted", e);
      }
      attempt++;
    }
    throw new TimeoutException(String.format("timed out after %s: %s", timeout, statusMessage));
  }

  /**
   * Cancels all active runs of a job. The runs are canceled asynchronously, so it doesn't prevent
   * new runs from being started.
   */
  public void cancelAllRuns(CancelAllRuns request) {
    impl.cancelAllRuns(request);
  }

  public Wait<Run, Void> cancelRun(long runId) {
    return cancelRun(new CancelRun().setRunId(runId));
  }

  /**
   * Cancels a job run or a task run. The run is canceled asynchronously, so it may still be running
   * when this request completes.
   */
  public Wait<Run, Void> cancelRun(CancelRun request) {
    impl.cancelRun(request);
    return new Wait<>(
        (timeout, callback) ->
            waitGetRunJobTerminatedOrSkipped(request.getRunId(), timeout, callback));
  }

  /** Create a new job. */
  public CreateResponse create(CreateJob request) {
    return impl.create(request);
  }

  public void delete(long jobId) {
    delete(new DeleteJob().setJobId(jobId));
  }

  /** Deletes a job. */
  public void delete(DeleteJob request) {
    impl.delete(request);
  }

  public void deleteRun(long runId) {
    deleteRun(new DeleteRun().setRunId(runId));
  }

  /** Deletes a non-active run. Returns an error if the run is active. */
  public void deleteRun(DeleteRun request) {
    impl.deleteRun(request);
  }

  public ExportRunOutput exportRun(long runId) {
    return exportRun(new ExportRunRequest().setRunId(runId));
  }

  /** Export and retrieve the job run task. */
  public ExportRunOutput exportRun(ExportRunRequest request) {
    return impl.exportRun(request);
  }

  public Job get(long jobId) {
    return get(new GetJobRequest().setJobId(jobId));
  }

  /**
   * Retrieves the details for a single job.
   *
   * <p>Large arrays in the results will be paginated when they exceed 100 elements. A request for a
   * single job will return all properties for that job, and the first 100 elements of array
   * properties (`tasks`, `job_clusters`, `environments` and `parameters`). Use the
   * `next_page_token` field to check for more results and pass its value as the `page_token` in
   * subsequent requests. If any array properties have more than 100 elements, additional results
   * will be returned on subsequent requests. Arrays without additional results will be empty on
   * later pages.
   */
  public Job get(GetJobRequest request) {
    return impl.get(request);
  }

  public GetJobPermissionLevelsResponse getPermissionLevels(String jobId) {
    return getPermissionLevels(new GetJobPermissionLevelsRequest().setJobId(jobId));
  }

  /** Gets the permission levels that a user can have on an object. */
  public GetJobPermissionLevelsResponse getPermissionLevels(GetJobPermissionLevelsRequest request) {
    return impl.getPermissionLevels(request);
  }

  public JobPermissions getPermissions(String jobId) {
    return getPermissions(new GetJobPermissionsRequest().setJobId(jobId));
  }

  /** Gets the permissions of a job. Jobs can inherit permissions from their root object. */
  public JobPermissions getPermissions(GetJobPermissionsRequest request) {
    return impl.getPermissions(request);
  }

  public Run getRun(long runId) {
    return getRun(new GetRunRequest().setRunId(runId));
  }

  /**
   * Retrieves the metadata of a run.
   *
   * <p>Large arrays in the results will be paginated when they exceed 100 elements. A request for a
   * single run will return all properties for that run, and the first 100 elements of array
   * properties (`tasks`, `job_clusters`, `job_parameters` and `repair_history`). Use the
   * next_page_token field to check for more results and pass its value as the page_token in
   * subsequent requests. If any array properties have more than 100 elements, additional results
   * will be returned on subsequent requests. Arrays without additional results will be empty on
   * later pages.
   */
  public Run getRun(GetRunRequest request) {
    return impl.getRun(request);
  }

  public RunOutput getRunOutput(long runId) {
    return getRunOutput(new GetRunOutputRequest().setRunId(runId));
  }

  /**
   * Retrieve the output and metadata of a single task run. When a notebook task returns a value
   * through the `dbutils.notebook.exit()` call, you can use this endpoint to retrieve that value.
   * Databricks restricts this API to returning the first 5 MB of the output. To return a larger
   * result, you can store job results in a cloud storage service.
   *
   * <p>This endpoint validates that the __run_id__ parameter is valid and returns an HTTP status
   * code 400 if the __run_id__ parameter is invalid. Runs are automatically removed after 60 days.
   * If you to want to reference them beyond 60 days, you must save old run results before they
   * expire.
   */
  public RunOutput getRunOutput(GetRunOutputRequest request) {
    return impl.getRunOutput(request);
  }

  /** Retrieves a list of jobs. */
  public Iterable<BaseJob> list(ListJobsRequest request) {
    return new Paginator<>(
        request,
        impl::list,
        ListJobsResponse::getJobs,
        response -> {
          String token = response.getNextPageToken();
          if (token == null || token.isEmpty()) {
            return null;
          }
          return request.setPageToken(token);
        });
  }

  /** List runs in descending order by start time. */
  public Iterable<BaseRun> listRuns(ListRunsRequest request) {
    return new Paginator<>(
        request,
        impl::listRuns,
        ListRunsResponse::getRuns,
        response -> {
          String token = response.getNextPageToken();
          if (token == null || token.isEmpty()) {
            return null;
          }
          return request.setPageToken(token);
        });
  }

  /**
   * Re-run one or more tasks. Tasks are re-run as part of the original job run. They use the
   * current job and task settings, and can be viewed in the history for the original job run.
   */
  public Wait<Run, RepairRunResponse> repairRun(RepairRun request) {
    RepairRunResponse response = impl.repairRun(request);
    return new Wait<>(
        (timeout, callback) ->
            waitGetRunJobTerminatedOrSkipped(request.getRunId(), timeout, callback),
        response);
  }

  /**
   * Overwrite all settings for the given job. Use the [_Update_ endpoint](:method:jobs/update) to
   * update job settings partially.
   */
  public void reset(ResetJob request) {
    impl.reset(request);
  }

  /** Run a job and return the `run_id` of the triggered run. */
  public Wait<Run, RunNowResponse> runNow(RunNow request) {
    RunNowResponse response = impl.runNow(request);
    return new Wait<>(
        (timeout, callback) ->
            waitGetRunJobTerminatedOrSkipped(response.getRunId(), timeout, callback),
        response);
  }

  /**
   * Sets permissions on an object, replacing existing permissions if they exist. Deletes all direct
   * permissions if none are specified. Objects can inherit permissions from their root object.
   */
  public JobPermissions setPermissions(JobPermissionsRequest request) {
    return impl.setPermissions(request);
  }

  /**
   * Submit a one-time run. This endpoint allows you to submit a workload directly without creating
   * a job. Runs submitted using this endpoint don’t display in the UI. Use the `jobs/runs/get` API
   * to check the run state after the job is submitted.
   */
  public Wait<Run, SubmitRunResponse> submit(SubmitRun request) {
    SubmitRunResponse response = impl.submit(request);
    return new Wait<>(
        (timeout, callback) ->
            waitGetRunJobTerminatedOrSkipped(response.getRunId(), timeout, callback),
        response);
  }

  /**
   * Add, update, or remove specific settings of an existing job. Use the [_Reset_
   * endpoint](:method:jobs/reset) to overwrite all job settings.
   */
  public void update(UpdateJob request) {
    impl.update(request);
  }

  /** Updates the permissions on a job. Jobs can inherit permissions from their root object. */
  public JobPermissions updatePermissions(JobPermissionsRequest request) {
    return impl.updatePermissions(request);
  }

  public JobsService impl() {
    return impl;
  }
}
