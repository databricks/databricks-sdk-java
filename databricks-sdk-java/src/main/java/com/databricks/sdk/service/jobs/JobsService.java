// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.jobs;

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
 * <p>This is the high-level interface, that contains generated methods.
 *
 * <p>Evolving: this interface is under development. Method signatures may change.
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public interface JobsService {
  /**
   * Cancel all runs of a job.
   *
   * <p>Cancels all active runs of a job. The runs are canceled asynchronously, so it doesn't
   * prevent new runs from being started.
   *
   * @param cancelAllRuns a {@link com.databricks.sdk.service.jobs.CancelAllRuns} object
   */
  void cancelAllRuns(CancelAllRuns cancelAllRuns);

  /**
   * Cancel a job run.
   *
   * <p>Cancels a job run. The run is canceled asynchronously, so it may still be running when this
   * request completes.
   *
   * @param cancelRun a {@link com.databricks.sdk.service.jobs.CancelRun} object
   */
  void cancelRun(CancelRun cancelRun);

  /**
   * Create a new job.
   *
   * <p>Create a new job.
   *
   * @param createJob a {@link com.databricks.sdk.service.jobs.CreateJob} object
   * @return a {@link com.databricks.sdk.service.jobs.CreateResponse} object
   */
  CreateResponse create(CreateJob createJob);

  /**
   * Delete a job.
   *
   * <p>Deletes a job.
   *
   * @param deleteJob a {@link com.databricks.sdk.service.jobs.DeleteJob} object
   */
  void delete(DeleteJob deleteJob);

  /**
   * Delete a job run.
   *
   * <p>Deletes a non-active run. Returns an error if the run is active.
   *
   * @param deleteRun a {@link com.databricks.sdk.service.jobs.DeleteRun} object
   */
  void deleteRun(DeleteRun deleteRun);

  /**
   * Export and retrieve a job run.
   *
   * <p>Export and retrieve the job run task.
   *
   * @param exportRunRequest a {@link com.databricks.sdk.service.jobs.ExportRunRequest} object
   * @return a {@link com.databricks.sdk.service.jobs.ExportRunOutput} object
   */
  ExportRunOutput exportRun(ExportRunRequest exportRunRequest);

  /**
   * Get a single job.
   *
   * <p>Retrieves the details for a single job.
   *
   * @param getJobRequest a {@link com.databricks.sdk.service.jobs.GetJobRequest} object
   * @return a {@link com.databricks.sdk.service.jobs.Job} object
   */
  Job get(GetJobRequest getJobRequest);

  /**
   * Get a single job run.
   *
   * <p>Retrieve the metadata of a run.
   *
   * @param getRunRequest a {@link com.databricks.sdk.service.jobs.GetRunRequest} object
   * @return a {@link com.databricks.sdk.service.jobs.Run} object
   */
  Run getRun(GetRunRequest getRunRequest);

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
   * @param getRunOutputRequest a {@link com.databricks.sdk.service.jobs.GetRunOutputRequest} object
   * @return a {@link com.databricks.sdk.service.jobs.RunOutput} object
   */
  RunOutput getRunOutput(GetRunOutputRequest getRunOutputRequest);

  /**
   * List all jobs.
   *
   * <p>Retrieves a list of jobs.
   *
   * @param listJobsRequest a {@link com.databricks.sdk.service.jobs.ListJobsRequest} object
   * @return a {@link com.databricks.sdk.service.jobs.ListJobsResponse} object
   */
  ListJobsResponse list(ListJobsRequest listJobsRequest);

  /**
   * List runs for a job.
   *
   * <p>List runs in descending order by start time.
   *
   * @param listRunsRequest a {@link com.databricks.sdk.service.jobs.ListRunsRequest} object
   * @return a {@link com.databricks.sdk.service.jobs.ListRunsResponse} object
   */
  ListRunsResponse listRuns(ListRunsRequest listRunsRequest);

  /**
   * Repair a job run.
   *
   * <p>Re-run one or more tasks. Tasks are re-run as part of the original job run. They use the
   * current job and task settings, and can be viewed in the history for the original job run.
   *
   * @param repairRun a {@link com.databricks.sdk.service.jobs.RepairRun} object
   * @return a {@link com.databricks.sdk.service.jobs.RepairRunResponse} object
   */
  RepairRunResponse repairRun(RepairRun repairRun);

  /**
   * Overwrites all settings for a job.
   *
   * <p>Overwrites all the settings for a specific job. Use the Update endpoint to update job
   * settings partially.
   *
   * @param resetJob a {@link com.databricks.sdk.service.jobs.ResetJob} object
   */
  void reset(ResetJob resetJob);

  /**
   * Trigger a new job run.
   *
   * <p>Run a job and return the `run_id` of the triggered run.
   *
   * @param runNow a {@link com.databricks.sdk.service.jobs.RunNow} object
   * @return a {@link com.databricks.sdk.service.jobs.RunNowResponse} object
   */
  RunNowResponse runNow(RunNow runNow);

  /**
   * Create and trigger a one-time run.
   *
   * <p>Submit a one-time run. This endpoint allows you to submit a workload directly without
   * creating a job. Runs submitted using this endpoint don’t display in the UI. Use the
   * `jobs/runs/get` API to check the run state after the job is submitted.
   *
   * @param submitRun a {@link com.databricks.sdk.service.jobs.SubmitRun} object
   * @return a {@link com.databricks.sdk.service.jobs.SubmitRunResponse} object
   */
  SubmitRunResponse submit(SubmitRun submitRun);

  /**
   * Partially updates a job.
   *
   * <p>Add, update, or remove specific settings of an existing job. Use the ResetJob to overwrite
   * all job settings.
   *
   * @param updateJob a {@link com.databricks.sdk.service.jobs.UpdateJob} object
   */
  void update(UpdateJob updateJob);
}
