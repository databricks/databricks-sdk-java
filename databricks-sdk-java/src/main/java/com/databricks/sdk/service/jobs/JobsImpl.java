// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.jobs;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;

/** Package-local implementation of Jobs */
@Generated
class JobsImpl implements JobsService {
  private final ApiClient apiClient;

  public JobsImpl(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  @Override
  public void cancelAllRuns(CancelAllRuns request) {
    String path = "/api/2.1/jobs/runs/cancel-all";
    apiClient.POST(path, request, Void.class);
  }

  @Override
  public void cancelRun(CancelRun request) {
    String path = "/api/2.1/jobs/runs/cancel";
    apiClient.POST(path, request, Void.class);
  }

  @Override
  public CreateResponse create(CreateJob request) {
    String path = "/api/2.1/jobs/create";
    return apiClient.POST(path, request, CreateResponse.class);
  }

  @Override
  public void delete(DeleteJob request) {
    String path = "/api/2.1/jobs/delete";
    apiClient.POST(path, request, Void.class);
  }

  @Override
  public void deleteRun(DeleteRun request) {
    String path = "/api/2.1/jobs/runs/delete";
    apiClient.POST(path, request, Void.class);
  }

  @Override
  public ExportRunOutput exportRun(ExportRunRequest request) {
    String path = "/api/2.1/jobs/runs/export";
    return apiClient.GET(path, request, ExportRunOutput.class);
  }

  @Override
  public Job get(GetJobRequest request) {
    String path = "/api/2.1/jobs/get";
    return apiClient.GET(path, request, Job.class);
  }

  @Override
  public Run getRun(GetRunRequest request) {
    String path = "/api/2.1/jobs/runs/get";
    return apiClient.GET(path, request, Run.class);
  }

  @Override
  public RunOutput getRunOutput(GetRunOutputRequest request) {
    String path = "/api/2.1/jobs/runs/get-output";
    return apiClient.GET(path, request, RunOutput.class);
  }

  @Override
  public ListJobsResponse list(ListJobsRequest request) {
    String path = "/api/2.1/jobs/list";
    return apiClient.GET(path, request, ListJobsResponse.class);
  }

  @Override
  public ListRunsResponse listRuns(ListRunsRequest request) {
    String path = "/api/2.1/jobs/runs/list";
    return apiClient.GET(path, request, ListRunsResponse.class);
  }

  @Override
  public RepairRunResponse repairRun(RepairRun request) {
    String path = "/api/2.1/jobs/runs/repair";
    return apiClient.POST(path, request, RepairRunResponse.class);
  }

  @Override
  public void reset(ResetJob request) {
    String path = "/api/2.1/jobs/reset";
    apiClient.POST(path, request, Void.class);
  }

  @Override
  public RunNowResponse runNow(RunNow request) {
    String path = "/api/2.1/jobs/run-now";
    return apiClient.POST(path, request, RunNowResponse.class);
  }

  @Override
  public SubmitRunResponse submit(SubmitRun request) {
    String path = "/api/2.1/jobs/runs/submit";
    return apiClient.POST(path, request, SubmitRunResponse.class);
  }

  @Override
  public void update(UpdateJob request) {
    String path = "/api/2.1/jobs/update";
    apiClient.POST(path, request, Void.class);
  }
}
