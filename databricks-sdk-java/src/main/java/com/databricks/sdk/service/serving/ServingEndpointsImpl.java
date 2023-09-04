// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.serving;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import java.util.HashMap;
import java.util.Map;

/** Package-local implementation of ServingEndpoints */
@Generated
class ServingEndpointsImpl implements ServingEndpointsService {
  private final ApiClient apiClient;

  public ServingEndpointsImpl(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  @Override
  public BuildLogsResponse buildLogs(BuildLogsRequest request) {
    String path =
        String.format(
            "/api/2.0/serving-endpoints/%s/served-models/%s/build-logs",
            request.getName(), request.getServedModelName());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    return apiClient.GET(path, request, BuildLogsResponse.class, headers);
  }

  @Override
  public ServingEndpointDetailed create(CreateServingEndpoint request) {
    String path = "/api/2.0/serving-endpoints";
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");
    return apiClient.POST(path, request, ServingEndpointDetailed.class, headers);
  }

  @Override
  public void delete(DeleteServingEndpointRequest request) {
    String path = String.format("/api/2.0/serving-endpoints/%s", request.getName());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    apiClient.DELETE(path, request, Void.class, headers);
  }

  @Override
  public void exportMetrics(ExportMetricsRequest request) {
    String path = String.format("/api/2.0/serving-endpoints/%s/metrics", request.getName());
    Map<String, String> headers = new HashMap<>();
    apiClient.GET(path, request, Void.class, headers);
  }

  @Override
  public ServingEndpointDetailed get(GetServingEndpointRequest request) {
    String path = String.format("/api/2.0/serving-endpoints/%s", request.getName());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    return apiClient.GET(path, request, ServingEndpointDetailed.class, headers);
  }

  @Override
  public GetServingEndpointPermissionLevelsResponse getPermissionLevels(
      GetServingEndpointPermissionLevelsRequest request) {
    String path =
        String.format(
            "/api/2.0/permissions/serving-endpoints/%s/permissionLevels",
            request.getServingEndpointId());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    return apiClient.GET(path, request, GetServingEndpointPermissionLevelsResponse.class, headers);
  }

  @Override
  public ServingEndpointPermissions getPermissions(GetServingEndpointPermissionsRequest request) {
    String path =
        String.format("/api/2.0/permissions/serving-endpoints/%s", request.getServingEndpointId());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    return apiClient.GET(path, request, ServingEndpointPermissions.class, headers);
  }

  @Override
  public ListEndpointsResponse list() {
    String path = "/api/2.0/serving-endpoints";
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    return apiClient.GET(path, ListEndpointsResponse.class, headers);
  }

  @Override
  public ServerLogsResponse logs(LogsRequest request) {
    String path =
        String.format(
            "/api/2.0/serving-endpoints/%s/served-models/%s/logs",
            request.getName(), request.getServedModelName());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    return apiClient.GET(path, request, ServerLogsResponse.class, headers);
  }

  @Override
  public QueryEndpointResponse query(QueryRequest request) {
    String path = String.format("/serving-endpoints/%s/invocations", request.getName());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    return apiClient.POST(path, request, QueryEndpointResponse.class, headers);
  }

  @Override
  public ServingEndpointPermissions setPermissions(ServingEndpointPermissionsRequest request) {
    String path =
        String.format("/api/2.0/permissions/serving-endpoints/%s", request.getServingEndpointId());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");
    return apiClient.PUT(path, request, ServingEndpointPermissions.class, headers);
  }

  @Override
  public ServingEndpointDetailed updateConfig(EndpointCoreConfigInput request) {
    String path = String.format("/api/2.0/serving-endpoints/%s/config", request.getName());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");
    return apiClient.PUT(path, request, ServingEndpointDetailed.class, headers);
  }

  @Override
  public ServingEndpointPermissions updatePermissions(ServingEndpointPermissionsRequest request) {
    String path =
        String.format("/api/2.0/permissions/serving-endpoints/%s", request.getServingEndpointId());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");
    return apiClient.PATCH(path, request, ServingEndpointPermissions.class, headers);
  }
}
