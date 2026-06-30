// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.Generated;

/**
 * The Jobs API allows you to create, edit, and delete jobs.
 *
 * <p>You can use a Databricks job to run a data processing or data analysis task in a Databricks
 * cluster with scalable resources. Your job can consist of a single task or can be a large,
 * multi-task workflow with complex dependencies. Databricks manages the task orchestration, cluster
 * management, monitoring, and error reporting for all of your jobs. You can run your jobs
 * immediately or periodically through an easy-to-use scheduling system. You can implement job tasks
 * using notebooks, JARS, Spark Declarative Pipelines, or Python, Scala, Spark submit, and Java
 * applications.
 *
 * <p>You should never hard code secrets or store them in plain text. Use the [Secrets CLI] to
 * manage secrets in the [Databricks CLI]. Use the [Secrets utility] to reference secrets in
 * notebooks and jobs.
 *
 * <p>[Databricks CLI]: https://docs.databricks.com/dev-tools/cli/index.html [Secrets CLI]:
 * https://docs.databricks.com/dev-tools/cli/secrets-cli.html [Secrets utility]:
 * https://docs.databricks.com/dev-tools/databricks-utils.html#dbutils-secrets
 *
 * <p>This is the high-level interface, that contains generated methods.
 *
 * <p>Evolving: this interface is under development. Method signatures may change.
 */
@Generated
public interface JobsService {
  /**
   * Cancels all active runs of a job. The runs are canceled asynchronously, so it doesn't prevent
   * new runs from being started.
   */
  void cancelAllRuns(CancelAllRuns cancelAllRuns);

  /**
   * Cancels a job run or a task run. The run is canceled asynchronously, so it may still be running
   * when this request completes.
   */
  void cancelRun(CancelRun cancelRun);

  /** Create a new job. */
  CreateResponse create(CreateJob createJob);

  /** Deletes a job. */
  void delete(DeleteJob deleteJob);

  /** Deletes a non-active run. Returns an error if the run is active. */
  void deleteRun(DeleteRun deleteRun);

  /** Export and retrieve the job run task. */
  ExportRunOutput exportRun(ExportRunRequest exportRunRequest);

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
  Job get(GetJobRequest getJobRequest);

  /** Gets the permission levels that a user can have on an object. */
  GetJobPermissionLevelsResponse getPermissionLevels(
      GetJobPermissionLevelsRequest getJobPermissionLevelsRequest);

  /** Gets the permissions of a job. Jobs can inherit permissions from their root object. */
  JobPermissions getPermissions(GetJobPermissionsRequest getJobPermissionsRequest);

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
  Run getRun(GetRunRequest getRunRequest);

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
  RunOutput getRunOutput(GetRunOutputRequest getRunOutputRequest);

  /** Retrieves a list of jobs. */
  ListJobsResponse list(ListJobsRequest listJobsRequest);

  /** List runs in descending order by start time. */
  ListRunsResponse listRuns(ListRunsRequest listRunsRequest);

  /**
   * Re-run one or more tasks. Tasks are re-run as part of the original job run. They use the
   * current job and task settings, and can be viewed in the history for the original job run.
   */
  RepairRunResponse repairRun(RepairRun repairRun);

  /**
   * Overwrite all settings for the given job. Use the [_Update_ endpoint](:method:jobs/update) to
   * update job settings partially.
   */
  void reset(ResetJob resetJob);

  /** Run a job and return the `run_id` of the triggered run. */
  RunNowResponse runNow(RunNow runNow);

  /**
   * Sets permissions on an object, replacing existing permissions if they exist. Deletes all direct
   * permissions if none are specified. Objects can inherit permissions from their root object.
   */
  JobPermissions setPermissions(JobPermissionsRequest jobPermissionsRequest);

  /**
   * Submit a one-time run. This endpoint allows you to submit a workload directly without creating
   * a job. Runs submitted using this endpoint don’t display in the UI. Use the `jobs/runs/get` API
   * to check the run state after the job is submitted.
   *
   * <p>**Important:** Jobs submitted using this endpoint are not saved as a job. They do not show
   * up in the Jobs UI, and do not retry when they fail. Because they are not saved, Databricks
   * cannot auto-optimize serverless compute in case of failure. If your job fails, you may want to
   * use classic compute to specify the compute needs for the job. Alternatively, use the `POST
   * /jobs/create` and `POST /jobs/run-now` endpoints to create and run a saved job.
   */
  SubmitRunResponse submit(SubmitRun submitRun);

  /**
   * Add, update, or remove specific settings of an existing job. Use the [_Reset_
   * endpoint](:method:jobs/reset) to overwrite all job settings.
   */
  void update(UpdateJob updateJob);

  /** Updates the permissions on a job. Jobs can inherit permissions from their root object. */
  JobPermissions updatePermissions(JobPermissionsRequest jobPermissionsRequest);
}
