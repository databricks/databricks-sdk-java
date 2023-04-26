// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.jobs;

import com.databricks.sdk.client.ApiClient;
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
 * <p>You should never hard code secrets or store them in plain text. Use the :service:secrets to
 * manage secrets in the [Databricks CLI]. Use the [Secrets utility] to reference secrets in
 * notebooks and jobs.
 *
 * <p>[Databricks CLI]: https://docs.databricks.com/dev-tools/cli/index.html [Secrets utility]:
 * https://docs.databricks.com/dev-tools/databricks-utils.html#dbutils-secrets
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class JobsAPI {
  private static final Logger LOG = LoggerFactory.getLogger(JobsAPI.class);

  private final JobsService impl;

  /**
   * Regular-use constructor
   *
   * @param apiClient a {@link com.databricks.sdk.client.ApiClient} object
   */
  public JobsAPI(ApiClient apiClient) {
    impl = new JobsImpl(apiClient);
  }

  /**
   * Constructor for mocks
   *
   * @param mock a {@link com.databricks.sdk.service.jobs.JobsService} object
   */
  public JobsAPI(JobsService mock) {
    impl = mock;
  }

  /**
   * <p>waitGetRunJobTerminatedOrSkipped.</p>
   *
   * @param runId a long
   * @return a {@link com.databricks.sdk.service.jobs.Run} object
   * @throws java.util.concurrent.TimeoutException if any.
   */
  public Run waitGetRunJobTerminatedOrSkipped(long runId) throws TimeoutException {
    return waitGetRunJobTerminatedOrSkipped(runId, Duration.ofMinutes(20), null);
  }

  /**
   * <p>waitGetRunJobTerminatedOrSkipped.</p>
   *
   * @param runId a long
   * @param timeout a {@link java.time.Duration} object
   * @param callback a {@link java.util.function.Consumer} object
   * @return a {@link com.databricks.sdk.service.jobs.Run} object
   * @throws java.util.concurrent.TimeoutException if any.
   */
  public Run waitGetRunJobTerminatedOrSkipped(long runId, Duration timeout, Consumer<Run> callback)
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
      }
      attempt++;
    }
    throw new TimeoutException(String.format("timed out after %s: %s", timeout, statusMessage));
  }

  /**
   * <p>cancelAllRuns.</p>
   *
   * @param jobId a long
   */
  public void cancelAllRuns(long jobId) {
    cancelAllRuns(new CancelAllRuns().setJobId(jobId));
  }

  /**
   * Cancel all runs of a job.
   *
   * <p>Cancels all active runs of a job. The runs are canceled asynchronously, so it doesn't
   * prevent new runs from being started.
   *
   * @param request a {@link com.databricks.sdk.service.jobs.CancelAllRuns} object
   */
  public void cancelAllRuns(CancelAllRuns request) {
    impl.cancelAllRuns(request);
  }

  /**
   * <p>cancelRun.</p>
   *
   * @param runId a long
   * @return a {@link com.databricks.sdk.support.Wait} object
   */
  public Wait<Run, Void> cancelRun(long runId) {
    return cancelRun(new CancelRun().setRunId(runId));
  }

  /**
   * Cancel a job run.
   *
   * <p>Cancels a job run. The run is canceled asynchronously, so it may still be running when this
   * request completes.
   *
   * @param request a {@link com.databricks.sdk.service.jobs.CancelRun} object
   * @return a {@link com.databricks.sdk.support.Wait} object
   */
  public Wait<Run, Void> cancelRun(CancelRun request) {
    impl.cancelRun(request);
    return new Wait<>(
        (timeout, callback) ->
            waitGetRunJobTerminatedOrSkipped(request.getRunId(), timeout, callback));
  }

  /**
   * Create a new job.
   *
   * <p>Create a new job.
   *
   * @param request a {@link com.databricks.sdk.service.jobs.CreateJob} object
   * @return a {@link com.databricks.sdk.service.jobs.CreateResponse} object
   */
  public CreateResponse create(CreateJob request) {
    return impl.create(request);
  }

  /**
   * <p>delete.</p>
   *
   * @param jobId a long
   */
  public void delete(long jobId) {
    delete(new DeleteJob().setJobId(jobId));
  }

  /**
   * Delete a job.
   *
   * <p>Deletes a job.
   *
   * @param request a {@link com.databricks.sdk.service.jobs.DeleteJob} object
   */
  public void delete(DeleteJob request) {
    impl.delete(request);
  }

  /**
   * <p>deleteRun.</p>
   *
   * @param runId a long
   */
  public void deleteRun(long runId) {
    deleteRun(new DeleteRun().setRunId(runId));
  }

  /**
   * Delete a job run.
   *
   * <p>Deletes a non-active run. Returns an error if the run is active.
   *
   * @param request a {@link com.databricks.sdk.service.jobs.DeleteRun} object
   */
  public void deleteRun(DeleteRun request) {
    impl.deleteRun(request);
  }

  /**
   * <p>exportRun.</p>
   *
   * @param runId a long
   * @return a {@link com.databricks.sdk.service.jobs.ExportRunOutput} object
   */
  public ExportRunOutput exportRun(long runId) {
    return exportRun(new ExportRunRequest().setRunId(runId));
  }

  /**
   * Export and retrieve a job run.
   *
   * <p>Export and retrieve the job run task.
   *
   * @param request a {@link com.databricks.sdk.service.jobs.ExportRunRequest} object
   * @return a {@link com.databricks.sdk.service.jobs.ExportRunOutput} object
   */
  public ExportRunOutput exportRun(ExportRunRequest request) {
    return impl.exportRun(request);
  }

  /**
   * <p>get.</p>
   *
   * @param jobId a long
   * @return a {@link com.databricks.sdk.service.jobs.Job} object
   */
  public Job get(long jobId) {
    return get(new GetJobRequest().setJobId(jobId));
  }

  /**
   * Get a single job.
   *
   * <p>Retrieves the details for a single job.
   *
   * @param request a {@link com.databricks.sdk.service.jobs.GetJobRequest} object
   * @return a {@link com.databricks.sdk.service.jobs.Job} object
   */
  public Job get(GetJobRequest request) {
    return impl.get(request);
  }

  /**
   * <p>getRun.</p>
   *
   * @param runId a long
   * @return a {@link com.databricks.sdk.service.jobs.Run} object
   */
  public Run getRun(long runId) {
    return getRun(new GetRunRequest().setRunId(runId));
  }

  /**
   * Get a single job run.
   *
   * <p>Retrieve the metadata of a run.
   *
   * @param request a {@link com.databricks.sdk.service.jobs.GetRunRequest} object
   * @return a {@link com.databricks.sdk.service.jobs.Run} object
   */
  public Run getRun(GetRunRequest request) {
    return impl.getRun(request);
  }

  /**
   * <p>getRunOutput.</p>
   *
   * @param runId a long
   * @return a {@link com.databricks.sdk.service.jobs.RunOutput} object
   */
  public RunOutput getRunOutput(long runId) {
    return getRunOutput(new GetRunOutputRequest().setRunId(runId));
  }

  /**
   * Get the output for a single run.
   *
   * <p>Retrieve the output and metadata of a single task run. When a notebook task returns a value
   * through the `dbutils.notebook.exit()` call, you can use this endpoint to retrieve that value.
   * Databricks restricts this API to returning the first 5 MB of the output. To return a larger
   * result, you can store job results in a cloud storage service.
   *
   * <p>This endpoint validates that the __run_id__ parameter is valid and returns an HTTP status
   * code 400 if the __run_id__ parameter is invalid. Runs are automatically removed after 60 days.
   * If you to want to reference them beyond 60 days, you must save old run results before they
   * expire.
   *
   * @param request a {@link com.databricks.sdk.service.jobs.GetRunOutputRequest} object
   * @return a {@link com.databricks.sdk.service.jobs.RunOutput} object
   */
  public RunOutput getRunOutput(GetRunOutputRequest request) {
    return impl.getRunOutput(request);
  }

  /**
   * List all jobs.
   *
   * <p>Retrieves a list of jobs.
   *
   * @param request a {@link com.databricks.sdk.service.jobs.ListJobsRequest} object
   * @return a {@link java.lang.Iterable} object
   */
  public Iterable<BaseJob> list(ListJobsRequest request) {
    request.setOffset(0L);
    return new Paginator<>(
            request,
            impl::list,
            ListJobsResponse::getJobs,
            response -> {
              Long offset = request.getOffset();
              if (offset == null) {
                offset = 0L;
              }
              offset += response.getJobs().size();
              return request.setOffset(offset);
            })
        .withDedupe(BaseJob::getJobId);
  }

  /**
   * List runs for a job.
   *
   * <p>List runs in descending order by start time.
   *
   * @param request a {@link com.databricks.sdk.service.jobs.ListRunsRequest} object
   * @return a {@link java.lang.Iterable} object
   */
  public Iterable<BaseRun> listRuns(ListRunsRequest request) {
    request.setOffset(0L);
    return new Paginator<>(
            request,
            impl::listRuns,
            ListRunsResponse::getRuns,
            response -> {
              Long offset = request.getOffset();
              if (offset == null) {
                offset = 0L;
              }
              offset += response.getRuns().size();
              return request.setOffset(offset);
            })
        .withDedupe(BaseRun::getRunId);
  }

  /**
   * <p>repairRun.</p>
   *
   * @param runId a long
   * @return a {@link com.databricks.sdk.support.Wait} object
   */
  public Wait<Run, RepairRunResponse> repairRun(long runId) {
    return repairRun(new RepairRun().setRunId(runId));
  }

  /**
   * Repair a job run.
   *
   * <p>Re-run one or more tasks. Tasks are re-run as part of the original job run. They use the
   * current job and task settings, and can be viewed in the history for the original job run.
   *
   * @param request a {@link com.databricks.sdk.service.jobs.RepairRun} object
   * @return a {@link com.databricks.sdk.support.Wait} object
   */
  public Wait<Run, RepairRunResponse> repairRun(RepairRun request) {
    RepairRunResponse response = impl.repairRun(request);
    return new Wait<>(
        (timeout, callback) ->
            waitGetRunJobTerminatedOrSkipped(request.getRunId(), timeout, callback),
        response);
  }

  /**
   * <p>reset.</p>
   *
   * @param jobId a long
   * @param newSettings a {@link com.databricks.sdk.service.jobs.JobSettings} object
   */
  public void reset(long jobId, JobSettings newSettings) {
    reset(new ResetJob().setJobId(jobId).setNewSettings(newSettings));
  }

  /**
   * Overwrites all settings for a job.
   *
   * <p>Overwrites all the settings for a specific job. Use the Update endpoint to update job
   * settings partially.
   *
   * @param request a {@link com.databricks.sdk.service.jobs.ResetJob} object
   */
  public void reset(ResetJob request) {
    impl.reset(request);
  }

  /**
   * <p>runNow.</p>
   *
   * @param jobId a long
   * @return a {@link com.databricks.sdk.support.Wait} object
   */
  public Wait<Run, RunNowResponse> runNow(long jobId) {
    return runNow(new RunNow().setJobId(jobId));
  }

  /**
   * Trigger a new job run.
   *
   * <p>Run a job and return the `run_id` of the triggered run.
   *
   * @param request a {@link com.databricks.sdk.service.jobs.RunNow} object
   * @return a {@link com.databricks.sdk.support.Wait} object
   */
  public Wait<Run, RunNowResponse> runNow(RunNow request) {
    RunNowResponse response = impl.runNow(request);
    return new Wait<>(
        (timeout, callback) ->
            waitGetRunJobTerminatedOrSkipped(response.getRunId(), timeout, callback),
        response);
  }

  /**
   * Create and trigger a one-time run.
   *
   * <p>Submit a one-time run. This endpoint allows you to submit a workload directly without
   * creating a job. Runs submitted using this endpoint don’t display in the UI. Use the
   * `jobs/runs/get` API to check the run state after the job is submitted.
   *
   * @param request a {@link com.databricks.sdk.service.jobs.SubmitRun} object
   * @return a {@link com.databricks.sdk.support.Wait} object
   */
  public Wait<Run, SubmitRunResponse> submit(SubmitRun request) {
    SubmitRunResponse response = impl.submit(request);
    return new Wait<>(
        (timeout, callback) ->
            waitGetRunJobTerminatedOrSkipped(response.getRunId(), timeout, callback),
        response);
  }

  /**
   * <p>update.</p>
   *
   * @param jobId a long
   */
  public void update(long jobId) {
    update(new UpdateJob().setJobId(jobId));
  }

  /**
   * Partially updates a job.
   *
   * <p>Add, update, or remove specific settings of an existing job. Use the ResetJob to overwrite
   * all job settings.
   *
   * @param request a {@link com.databricks.sdk.service.jobs.UpdateJob} object
   */
  public void update(UpdateJob request) {
    impl.update(request);
  }

  /**
   * <p>impl.</p>
   *
   * @return a {@link com.databricks.sdk.service.jobs.JobsService} object
   */
  public JobsService impl() {
    return impl;
  }
}
