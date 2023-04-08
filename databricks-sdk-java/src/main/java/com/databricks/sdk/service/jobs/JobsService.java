// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.jobs;

import java.util.List;

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
 */
public interface JobsService {
  /**
   * Cancel all runs of a job.
   *
   * <p>Cancels all active runs of a job. The runs are canceled asynchronously, so it doesn't
   * prevent new runs from being started.
   */
  void cancelAllRuns(CancelAllRuns cancelAllRuns);

  /**
   * Cancel a job run.
   *
   * <p>Cancels a job run. The run is canceled asynchronously, so it may still be running when this
   * request completes.
   */
  void cancelRun(CancelRun cancelRun);

  /**
   * Create a new job.
   *
   * <p>Create a new job.
   */
  CreateResponse create(CreateJob createJob);

  /**
   * Delete a job.
   *
   * <p>Deletes a job.
   */
  void delete(DeleteJob deleteJob);

  /**
   * Delete a job run.
   *
   * <p>Deletes a non-active run. Returns an error if the run is active.
   */
  void deleteRun(DeleteRun deleteRun);

  /**
   * Export and retrieve a job run.
   *
   * <p>Export and retrieve the job run task.
   */
  ExportRunOutput exportRun(ExportRun exportRun);

  /**
   * Get a single job.
   *
   * <p>Retrieves the details for a single job.
   */
  Job get(Get get);

  /**
   * Get a single job run.
   *
   * <p>Retrieve the metadata of a run.
   */
  Run getRun(GetRun getRun);

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
   */
  RunOutput getRunOutput(GetRunOutput getRunOutput);

  /**
   * List all jobs.
   *
   * <p>Retrieves a list of jobs.
   */
  ListJobsResponse list(List list);

  /**
   * List runs for a job.
   *
   * <p>List runs in descending order by start time.
   */
  ListRunsResponse listRuns(ListRuns listRuns);

  /**
   * Repair a job run.
   *
   * <p>Re-run one or more tasks. Tasks are re-run as part of the original job run. They use the
   * current job and task settings, and can be viewed in the history for the original job run.
   */
  RepairRunResponse repairRun(RepairRun repairRun);

  /**
   * Overwrites all settings for a job.
   *
   * <p>Overwrites all the settings for a specific job. Use the Update endpoint to update job
   * settings partially.
   */
  void reset(ResetJob resetJob);

  /**
   * Trigger a new job run.
   *
   * <p>Run a job and return the `run_id` of the triggered run.
   */
  RunNowResponse runNow(RunNow runNow);

  /**
   * Create and trigger a one-time run.
   *
   * <p>Submit a one-time run. This endpoint allows you to submit a workload directly without
   * creating a job. Runs submitted using this endpoint don’t display in the UI. Use the
   * `jobs/runs/get` API to check the run state after the job is submitted.
   */
  SubmitRunResponse submit(SubmitRun submitRun);

  /**
   * Partially updates a job.
   *
   * <p>Add, update, or remove specific settings of an existing job. Use the ResetJob to overwrite
   * all job settings.
   */
  void update(UpdateJob updateJob);
}
