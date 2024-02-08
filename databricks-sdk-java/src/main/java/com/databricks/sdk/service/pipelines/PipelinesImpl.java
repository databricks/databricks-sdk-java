// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.pipelines;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import java.util.HashMap;
import java.util.Map;

/** Package-local implementation of Pipelines */
@Generated
class PipelinesImpl implements PipelinesService {
  private final ApiClient apiClient;

  public PipelinesImpl(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  @Override
  public CreatePipelineResponse create(CreatePipeline request) {
    String path = "/api/2.0/pipelines";
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");
    return apiClient.POST(path, request, CreatePipelineResponse.class, headers);
  }

  @Override
  public void delete(DeletePipelineRequest request) {
    String path = String.format("/api/2.0/pipelines/%s", request.getPipelineId());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    apiClient.DELETE(path, request, Void.class, headers);
  }

  @Override
  public GetPipelineResponse get(GetPipelineRequest request) {
    String path = String.format("/api/2.0/pipelines/%s", request.getPipelineId());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    return apiClient.GET(path, request, GetPipelineResponse.class, headers);
  }

  @Override
  public GetPipelinePermissionLevelsResponse getPermissionLevels(
      GetPipelinePermissionLevelsRequest request) {
    String path =
        String.format(
            "/api/2.0/permissions/pipelines/%s/permissionLevels", request.getPipelineId());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    return apiClient.GET(path, request, GetPipelinePermissionLevelsResponse.class, headers);
  }

  @Override
  public PipelinePermissions getPermissions(GetPipelinePermissionsRequest request) {
    String path = String.format("/api/2.0/permissions/pipelines/%s", request.getPipelineId());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    return apiClient.GET(path, request, PipelinePermissions.class, headers);
  }

  @Override
  public GetUpdateResponse getUpdate(GetUpdateRequest request) {
    String path =
        String.format(
            "/api/2.0/pipelines/%s/updates/%s", request.getPipelineId(), request.getUpdateId());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    return apiClient.GET(path, request, GetUpdateResponse.class, headers);
  }

  @Override
  public ListPipelineEventsResponse listPipelineEvents(ListPipelineEventsRequest request) {
    String path = String.format("/api/2.0/pipelines/%s/events", request.getPipelineId());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    return apiClient.GET(path, request, ListPipelineEventsResponse.class, headers);
  }

  @Override
  public ListPipelinesResponse listPipelines(ListPipelinesRequest request) {
    String path = "/api/2.0/pipelines";
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    return apiClient.GET(path, request, ListPipelinesResponse.class, headers);
  }

  @Override
  public ListUpdatesResponse listUpdates(ListUpdatesRequest request) {
    String path = String.format("/api/2.0/pipelines/%s/updates", request.getPipelineId());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    return apiClient.GET(path, request, ListUpdatesResponse.class, headers);
  }

  @Override
  public PipelinePermissions setPermissions(PipelinePermissionsRequest request) {
    String path = String.format("/api/2.0/permissions/pipelines/%s", request.getPipelineId());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");
    return apiClient.PUT(path, request, PipelinePermissions.class, headers);
  }

  @Override
  public StartUpdateResponse startUpdate(StartUpdate request) {
    String path = String.format("/api/2.0/pipelines/%s/updates", request.getPipelineId());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");
    return apiClient.POST(path, request, StartUpdateResponse.class, headers);
  }

  @Override
  public void stop(StopRequest request) {
    String path = String.format("/api/2.0/pipelines/%s/stop", request.getPipelineId());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    apiClient.POST(path, null, Void.class, headers);
  }

  @Override
  public void update(EditPipeline request) {
    String path = String.format("/api/2.0/pipelines/%s", request.getPipelineId());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");
    apiClient.PUT(path, request, Void.class, headers);
  }

  @Override
  public PipelinePermissions updatePermissions(PipelinePermissionsRequest request) {
    String path = String.format("/api/2.0/permissions/pipelines/%s", request.getPipelineId());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");
    return apiClient.PATCH(path, request, PipelinePermissions.class, headers);
  }
}
