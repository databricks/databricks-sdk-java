// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.serving;

import com.databricks.sdk.client.ApiClient;
import com.databricks.sdk.support.Generated;
import org.apache.http.client.methods.*;

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
    return apiClient.GET(path, request, BuildLogsResponse.class);
  }

  @Override
  public ServingEndpointDetailed create(CreateServingEndpoint request) {
    String path = "/api/2.0/serving-endpoints";
    return apiClient.POST(path, request, ServingEndpointDetailed.class);
  }

  @Override
  public void delete(DeleteServingEndpointRequest request) {
    String path = String.format("/api/2.0/serving-endpoints/%s", request.getName());

    apiClient.DELETE(path, request, Void.class);
  }

  @Override
  public void exportMetrics(ExportMetricsRequest request) {
    String path = String.format("/api/2.0/serving-endpoints/%s/metrics", request.getName());

    apiClient.GET(path, request, Void.class);
  }

  @Override
  public ServingEndpointDetailed get(GetServingEndpointRequest request) {
    String path = String.format("/api/2.0/serving-endpoints/%s", request.getName());
    return apiClient.GET(path, request, ServingEndpointDetailed.class);
  }

  @Override
  public ListEndpointsResponse list() {
    String path = "/api/2.0/serving-endpoints";
    return apiClient.GET(path, ListEndpointsResponse.class);
  }

  @Override
  public ServerLogsResponse logs(LogsRequest request) {
    String path =
        String.format(
            "/api/2.0/serving-endpoints/%s/served-models/%s/logs",
            request.getName(), request.getServedModelName());
    return apiClient.GET(path, request, ServerLogsResponse.class);
  }

  @Override
  public QueryEndpointResponse query(QueryRequest request) {
    String path = String.format("/serving-endpoints/%s/invocations", request.getName());
    return apiClient.POST(path, request, QueryEndpointResponse.class);
  }

  @Override
  public ServingEndpointDetailed updateConfig(EndpointCoreConfigInput request) {
    String path = String.format("/api/2.0/serving-endpoints/%s/config", request.getName());
    return apiClient.PUT(path, request, ServingEndpointDetailed.class);
  }
}
