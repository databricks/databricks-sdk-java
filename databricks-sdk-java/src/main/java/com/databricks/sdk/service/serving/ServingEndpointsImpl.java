// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.serving;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.core.DatabricksException;
import com.databricks.sdk.core.http.Request;
import com.databricks.sdk.support.Generated;
import java.io.IOException;

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
    try {
      Request req = new Request("GET", path);
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      return apiClient.execute(req, BuildLogsResponse.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public ServingEndpointDetailed create(CreateServingEndpoint request) {
    String path = "/api/2.0/serving-endpoints";
    try {
      Request req = new Request("POST", path, apiClient.serialize(request));
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      return apiClient.execute(req, ServingEndpointDetailed.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public ServingEndpointDetailed createProvisionedThroughputEndpoint(
      CreatePtEndpointRequest request) {
    String path = "/api/2.0/serving-endpoints/pt";
    try {
      Request req = new Request("POST", path, apiClient.serialize(request));
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      return apiClient.execute(req, ServingEndpointDetailed.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public void delete(DeleteServingEndpointRequest request) {
    String path = String.format("/api/2.0/serving-endpoints/%s", request.getName());
    try {
      Request req = new Request("DELETE", path);
      ApiClient.setQuery(req, request);
      apiClient.execute(req, Void.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public ExportMetricsResponse exportMetrics(ExportMetricsRequest request) {
    String path = String.format("/api/2.0/serving-endpoints/%s/metrics", request.getName());
    try {
      Request req = new Request("GET", path);
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "text/plain");
      return apiClient.execute(req, ExportMetricsResponse.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public ServingEndpointDetailed get(GetServingEndpointRequest request) {
    String path = String.format("/api/2.0/serving-endpoints/%s", request.getName());
    try {
      Request req = new Request("GET", path);
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      return apiClient.execute(req, ServingEndpointDetailed.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public GetOpenApiResponse getOpenApi(GetOpenApiRequest request) {
    String path = String.format("/api/2.0/serving-endpoints/%s/openapi", request.getName());
    try {
      Request req = new Request("GET", path);
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "text/plain");
      return apiClient.execute(req, GetOpenApiResponse.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public GetServingEndpointPermissionLevelsResponse getPermissionLevels(
      GetServingEndpointPermissionLevelsRequest request) {
    String path =
        String.format(
            "/api/2.0/permissions/serving-endpoints/%s/permissionLevels",
            request.getServingEndpointId());
    try {
      Request req = new Request("GET", path);
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      return apiClient.execute(req, GetServingEndpointPermissionLevelsResponse.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public ServingEndpointPermissions getPermissions(GetServingEndpointPermissionsRequest request) {
    String path =
        String.format("/api/2.0/permissions/serving-endpoints/%s", request.getServingEndpointId());
    try {
      Request req = new Request("GET", path);
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      return apiClient.execute(req, ServingEndpointPermissions.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public HttpRequestResponse httpRequest(ExternalFunctionRequest request) {
    String path = "/api/2.0/external-function";
    try {
      Request req = new Request("POST", path, apiClient.serialize(request));
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "text/plain");
      req.withHeader("Content-Type", "application/json");
      return apiClient.execute(req, HttpRequestResponse.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public ListEndpointsResponse list() {
    String path = "/api/2.0/serving-endpoints";
    try {
      Request req = new Request("GET", path);
      req.withHeader("Accept", "application/json");
      return apiClient.execute(req, ListEndpointsResponse.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public ServerLogsResponse logs(LogsRequest request) {
    String path =
        String.format(
            "/api/2.0/serving-endpoints/%s/served-models/%s/logs",
            request.getName(), request.getServedModelName());
    try {
      Request req = new Request("GET", path);
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      return apiClient.execute(req, ServerLogsResponse.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public EndpointTags patch(PatchServingEndpointTags request) {
    String path = String.format("/api/2.0/serving-endpoints/%s/tags", request.getName());
    try {
      Request req = new Request("PATCH", path, apiClient.serialize(request));
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      return apiClient.execute(req, EndpointTags.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public PutResponse put(PutRequest request) {
    String path = String.format("/api/2.0/serving-endpoints/%s/rate-limits", request.getName());
    try {
      Request req = new Request("PUT", path, apiClient.serialize(request));
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      return apiClient.execute(req, PutResponse.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public PutAiGatewayResponse putAiGateway(PutAiGatewayRequest request) {
    String path = String.format("/api/2.0/serving-endpoints/%s/ai-gateway", request.getName());
    try {
      Request req = new Request("PUT", path, apiClient.serialize(request));
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      return apiClient.execute(req, PutAiGatewayResponse.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public QueryEndpointResponse query(QueryEndpointInput request) {
    String path = String.format("/serving-endpoints/%s/invocations", request.getName());
    try {
      Request req = new Request("POST", path, apiClient.serialize(request));
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      return apiClient.execute(req, QueryEndpointResponse.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public ServingEndpointPermissions setPermissions(ServingEndpointPermissionsRequest request) {
    String path =
        String.format("/api/2.0/permissions/serving-endpoints/%s", request.getServingEndpointId());
    try {
      Request req = new Request("PUT", path, apiClient.serialize(request));
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      return apiClient.execute(req, ServingEndpointPermissions.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public ServingEndpointDetailed updateConfig(EndpointCoreConfigInput request) {
    String path = String.format("/api/2.0/serving-endpoints/%s/config", request.getName());
    try {
      Request req = new Request("PUT", path, apiClient.serialize(request));
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      return apiClient.execute(req, ServingEndpointDetailed.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public ServingEndpointPermissions updatePermissions(ServingEndpointPermissionsRequest request) {
    String path =
        String.format("/api/2.0/permissions/serving-endpoints/%s", request.getServingEndpointId());
    try {
      Request req = new Request("PATCH", path, apiClient.serialize(request));
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      return apiClient.execute(req, ServingEndpointPermissions.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public ServingEndpointDetailed updateProvisionedThroughputEndpointConfig(
      UpdateProvisionedThroughputEndpointConfigRequest request) {
    String path = String.format("/api/2.0/serving-endpoints/pt/%s/config", request.getName());
    try {
      Request req = new Request("PUT", path, apiClient.serialize(request));
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      return apiClient.execute(req, ServingEndpointDetailed.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }
}
