// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.jobs;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.http.client.methods.*;

import com.databricks.sdk.client.ApiClient;
import com.databricks.sdk.client.DatabricksException;

/**
 * The Jobs API allows you to create, edit, and delete jobs.
 * 
 * You can use a Databricks job to run a data processing or data analysis task
 * in a Databricks cluster with scalable resources. Your job can consist of a
 * single task or can be a large, multi-task workflow with complex dependencies.
 * Databricks manages the task orchestration, cluster management, monitoring,
 * and error reporting for all of your jobs. You can run your jobs immediately
 * or periodically through an easy-to-use scheduling system. You can implement
 * job tasks using notebooks, JARS, Delta Live Tables pipelines, or Python,
 * Scala, Spark submit, and Java applications.
 * 
 * You should never hard code secrets or store them in plain text. Use the
 * :service:secrets to manage secrets in the [Databricks CLI]. Use the [Secrets
 * utility] to reference secrets in notebooks and jobs.
 * 
 * [Databricks CLI]: https://docs.databricks.com/dev-tools/cli/index.html
 * [Secrets utility]: https://docs.databricks.com/dev-tools/databricks-utils.html#dbutils-secrets
 */
public class JobsAPI implements JobsService {
    private final ApiClient apiClient;

    public JobsAPI(ApiClient apiClient) {
        this.apiClient = apiClient;
    }
	
	/**
     * Cancel all runs of a job.
     * 
     * Cancels all active runs of a job. The runs are canceled asynchronously,
     * so it doesn't prevent new runs from being started.
     */
    @Override
    public void cancelAllRuns(CancelAllRuns request) {
        String path = "/api/2.1/jobs/runs/cancel-all";
        apiClient.POST(path, request, Void.class);
    }
    
	/**
     * Cancel a job run.
     * 
     * Cancels a job run. The run is canceled asynchronously, so it may still be
     * running when this request completes.
     */
    @Override
    public void cancelRun(CancelRun request) {
        String path = "/api/2.1/jobs/runs/cancel";
        apiClient.POST(path, request, Void.class);
    }
    
	/**
     * Create a new job.
     * 
     * Create a new job.
     */
    @Override
    public CreateResponse create(CreateJob request) {
        String path = "/api/2.1/jobs/create";
        return apiClient.POST(path, request, CreateResponse.class);
    }
    
	/**
     * Delete a job.
     * 
     * Deletes a job.
     */
    @Override
    public void delete(DeleteJob request) {
        String path = "/api/2.1/jobs/delete";
        apiClient.POST(path, request, Void.class);
    }
    
	/**
     * Delete a job run.
     * 
     * Deletes a non-active run. Returns an error if the run is active.
     */
    @Override
    public void deleteRun(DeleteRun request) {
        String path = "/api/2.1/jobs/runs/delete";
        apiClient.POST(path, request, Void.class);
    }
    
	/**
     * Export and retrieve a job run.
     * 
     * Export and retrieve the job run task.
     */
    @Override
    public ExportRunOutput exportRun(ExportRun request) {
        String path = "/api/2.1/jobs/runs/export";
        return apiClient.GET(path, request, ExportRunOutput.class);
    }
    
	/**
     * Get a single job.
     * 
     * Retrieves the details for a single job.
     */
    @Override
    public Job get(Get request) {
        String path = "/api/2.1/jobs/get";
        return apiClient.GET(path, request, Job.class);
    }
    
	/**
     * Get a single job run.
     * 
     * Retrieve the metadata of a run.
     */
    @Override
    public Run getRun(GetRun request) {
        String path = "/api/2.1/jobs/runs/get";
        return apiClient.GET(path, request, Run.class);
    }
    
	/**
     * Get the output for a single run.
     * 
     * Retrieve the output and metadata of a single task run. When a notebook
     * task returns a value through the `dbutils.notebook.exit()` call, you can
     * use this endpoint to retrieve that value. Databricks restricts this API
     * to returning the first 5 MB of the output. To return a larger result, you
     * can store job results in a cloud storage service.
     * 
     * This endpoint validates that the __run_id__ parameter is valid and
     * returns an HTTP status code 400 if the __run_id__ parameter is invalid.
     * Runs are automatically removed after 60 days. If you to want to reference
     * them beyond 60 days, you must save old run results before they expire.
     */
    @Override
    public RunOutput getRunOutput(GetRunOutput request) {
        String path = "/api/2.1/jobs/runs/get-output";
        return apiClient.GET(path, request, RunOutput.class);
    }
    
	/**
     * List all jobs.
     * 
     * Retrieves a list of jobs.
     */
    @Override
    public ListJobsResponse list(List request) {
        String path = "/api/2.1/jobs/list";
        return apiClient.GET(path, request, ListJobsResponse.class);
    }
    
	/**
     * List runs for a job.
     * 
     * List runs in descending order by start time.
     */
    @Override
    public ListRunsResponse listRuns(ListRuns request) {
        String path = "/api/2.1/jobs/runs/list";
        return apiClient.GET(path, request, ListRunsResponse.class);
    }
    
	/**
     * Repair a job run.
     * 
     * Re-run one or more tasks. Tasks are re-run as part of the original job
     * run. They use the current job and task settings, and can be viewed in the
     * history for the original job run.
     */
    @Override
    public RepairRunResponse repairRun(RepairRun request) {
        String path = "/api/2.1/jobs/runs/repair";
        return apiClient.POST(path, request, RepairRunResponse.class);
    }
    
	/**
     * Overwrites all settings for a job.
     * 
     * Overwrites all the settings for a specific job. Use the Update endpoint
     * to update job settings partially.
     */
    @Override
    public void reset(ResetJob request) {
        String path = "/api/2.1/jobs/reset";
        apiClient.POST(path, request, Void.class);
    }
    
	/**
     * Trigger a new job run.
     * 
     * Run a job and return the `run_id` of the triggered run.
     */
    @Override
    public RunNowResponse runNow(RunNow request) {
        String path = "/api/2.1/jobs/run-now";
        return apiClient.POST(path, request, RunNowResponse.class);
    }
    
	/**
     * Create and trigger a one-time run.
     * 
     * Submit a one-time run. This endpoint allows you to submit a workload
     * directly without creating a job. Runs submitted using this endpoint
     * don’t display in the UI. Use the `jobs/runs/get` API to check the run
     * state after the job is submitted.
     */
    @Override
    public SubmitRunResponse submit(SubmitRun request) {
        String path = "/api/2.1/jobs/runs/submit";
        return apiClient.POST(path, request, SubmitRunResponse.class);
    }
    
	/**
     * Partially updates a job.
     * 
     * Add, update, or remove specific settings of an existing job. Use the
     * ResetJob to overwrite all job settings.
     */
    @Override
    public void update(UpdateJob request) {
        String path = "/api/2.1/jobs/update";
        apiClient.POST(path, request, Void.class);
    }
    
}