// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.jobs;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import java.util.HashMap;
import java.util.Map;

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
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");
    apiClient.execute("POST", path, request, CancelAllRunsResponse.class, headers);
  }

  @Override
  public void cancelRun(CancelRun request) {
    String path = "/api/2.1/jobs/runs/cancel";
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");
    apiClient.execute("POST", path, request, CancelRunResponse.class, headers);
  }

  @Override
  public CreateResponse create(CreateJob request) {
    String path = "/api/2.1/jobs/create";
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");
    return apiClient.execute("POST", path, request, CreateResponse.class, headers);
  }

  @Override
  public void delete(DeleteJob request) {
    String path = "/api/2.1/jobs/delete";
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");
    apiClient.execute("POST", path, request, DeleteResponse.class, headers);
  }

  @Override
  public void deleteRun(DeleteRun request) {
    String path = "/api/2.1/jobs/runs/delete";
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");
    apiClient.execute("POST", path, request, DeleteRunResponse.class, headers);
  }

  @Override
  public ExportRunOutput exportRun(ExportRunRequest request) {
    String path = "/api/2.1/jobs/runs/export";
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    return apiClient.execute("GET", path, request, ExportRunOutput.class, headers);
  }

  @Override
  public Job get(GetJobRequest request) {
    String path = "/api/2.1/jobs/get";
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    return apiClient.execute("GET", path, request, Job.class, headers);
  }

  @Override
  public GetJobPermissionLevelsResponse getPermissionLevels(GetJobPermissionLevelsRequest request) {
    String path =
        String.format("/api/2.0/permissions/jobs/%s/permissionLevels", request.getJobId());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    return apiClient.execute("GET", path, request, GetJobPermissionLevelsResponse.class, headers);
  }

  @Override
  public JobPermissions getPermissions(GetJobPermissionsRequest request) {
    String path = String.format("/api/2.0/permissions/jobs/%s", request.getJobId());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    return apiClient.execute("GET", path, request, JobPermissions.class, headers);
  }

  @Override
  public Run getRun(GetRunRequest request) {
    String path = "/api/2.1/jobs/runs/get";
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    return apiClient.execute("GET", path, request, Run.class, headers);
  }

  @Override
  public RunOutput getRunOutput(GetRunOutputRequest request) {
    String path = "/api/2.1/jobs/runs/get-output";
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    return apiClient.execute("GET", path, request, RunOutput.class, headers);
  }

  @Override
  public ListJobsResponse list(ListJobsRequest request) {
    String path = "/api/2.1/jobs/list";
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    return apiClient.execute("GET", path, request, ListJobsResponse.class, headers);
  }

  @Override
  public ListRunsResponse listRuns(ListRunsRequest request) {
    String path = "/api/2.1/jobs/runs/list";
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    return apiClient.execute("GET", path, request, ListRunsResponse.class, headers);
  }

  @Override
  public RepairRunResponse repairRun(RepairRun request) {
    String path = "/api/2.1/jobs/runs/repair";
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");
    return apiClient.execute("POST", path, request, RepairRunResponse.class, headers);
  }

  @Override
  public void reset(ResetJob request) {
    String path = "/api/2.1/jobs/reset";
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");
    apiClient.execute("POST", path, request, ResetResponse.class, headers);
  }

  @Override
  public RunNowResponse runNow(RunNow request) {
    String path = "/api/2.1/jobs/run-now";
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");
    return apiClient.execute("POST", path, request, RunNowResponse.class, headers);
  }

  @Override
  public JobPermissions setPermissions(JobPermissionsRequest request) {
    String path = String.format("/api/2.0/permissions/jobs/%s", request.getJobId());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");
    return apiClient.execute("PUT", path, request, JobPermissions.class, headers);
  }

  @Override
  public SubmitRunResponse submit(SubmitRun request) {
    String path = "/api/2.1/jobs/runs/submit";
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");
    return apiClient.execute("POST", path, request, SubmitRunResponse.class, headers);
  }

  @Override
  public void update(UpdateJob request) {
    String path = "/api/2.1/jobs/update";
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");
    apiClient.execute("POST", path, request, UpdateResponse.class, headers);
  }

  @Override
  public JobPermissions updatePermissions(JobPermissionsRequest request) {
    String path = String.format("/api/2.0/permissions/jobs/%s", request.getJobId());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");
    return apiClient.execute("PATCH", path, request, JobPermissions.class, headers);
  }
}
