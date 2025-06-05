// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.pipelines;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.core.DatabricksException;
import com.databricks.sdk.core.http.Request;
import com.databricks.sdk.support.Generated;
import java.io.IOException;

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
    try {
      Request req = new Request("POST", path, apiClient.serialize(request));
      ApiClient.setQuery(req, request.toPb());
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      return apiClient.execute(req, CreatePipelineResponse.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public void delete(DeletePipelineRequest request) {
    String path = String.format("/api/2.0/pipelines/%s", request.getPipelineId());
    try {
      Request req = new Request("DELETE", path);
      ApiClient.setQuery(req, request.toPb());
      req.withHeader("Accept", "application/json");
      apiClient.execute(req, DeletePipelineResponse.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public GetPipelineResponse get(GetPipelineRequest request) {
    String path = String.format("/api/2.0/pipelines/%s", request.getPipelineId());
    try {
      Request req = new Request("GET", path);
      ApiClient.setQuery(req, request.toPb());
      req.withHeader("Accept", "application/json");
      return apiClient.execute(req, GetPipelineResponse.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public GetPipelinePermissionLevelsResponse getPermissionLevels(
      GetPipelinePermissionLevelsRequest request) {
    String path =
        String.format(
            "/api/2.0/permissions/pipelines/%s/permissionLevels", request.getPipelineId());
    try {
      Request req = new Request("GET", path);
      ApiClient.setQuery(req, request.toPb());
      req.withHeader("Accept", "application/json");
      return apiClient.execute(req, GetPipelinePermissionLevelsResponse.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public PipelinePermissions getPermissions(GetPipelinePermissionsRequest request) {
    String path = String.format("/api/2.0/permissions/pipelines/%s", request.getPipelineId());
    try {
      Request req = new Request("GET", path);
      ApiClient.setQuery(req, request.toPb());
      req.withHeader("Accept", "application/json");
      return apiClient.execute(req, PipelinePermissions.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public GetUpdateResponse getUpdate(GetUpdateRequest request) {
    String path =
        String.format(
            "/api/2.0/pipelines/%s/updates/%s", request.getPipelineId(), request.getUpdateId());
    try {
      Request req = new Request("GET", path);
      ApiClient.setQuery(req, request.toPb());
      req.withHeader("Accept", "application/json");
      return apiClient.execute(req, GetUpdateResponse.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public ListPipelineEventsResponse listPipelineEvents(ListPipelineEventsRequest request) {
    String path = String.format("/api/2.0/pipelines/%s/events", request.getPipelineId());
    try {
      Request req = new Request("GET", path);
      ApiClient.setQuery(req, request.toPb());
      req.withHeader("Accept", "application/json");
      return apiClient.execute(req, ListPipelineEventsResponse.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public ListPipelinesResponse listPipelines(ListPipelinesRequest request) {
    String path = "/api/2.0/pipelines";
    try {
      Request req = new Request("GET", path);
      ApiClient.setQuery(req, request.toPb());
      req.withHeader("Accept", "application/json");
      return apiClient.execute(req, ListPipelinesResponse.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public ListUpdatesResponse listUpdates(ListUpdatesRequest request) {
    String path = String.format("/api/2.0/pipelines/%s/updates", request.getPipelineId());
    try {
      Request req = new Request("GET", path);
      ApiClient.setQuery(req, request.toPb());
      req.withHeader("Accept", "application/json");
      return apiClient.execute(req, ListUpdatesResponse.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public PipelinePermissions setPermissions(PipelinePermissionsRequest request) {
    String path = String.format("/api/2.0/permissions/pipelines/%s", request.getPipelineId());
    try {
      Request req = new Request("PUT", path, apiClient.serialize(request));
      ApiClient.setQuery(req, request.toPb());
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      return apiClient.execute(req, PipelinePermissions.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public StartUpdateResponse startUpdate(StartUpdate request) {
    String path = String.format("/api/2.0/pipelines/%s/updates", request.getPipelineId());
    try {
      Request req = new Request("POST", path, apiClient.serialize(request));
      ApiClient.setQuery(req, request.toPb());
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      return apiClient.execute(req, StartUpdateResponse.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public void stop(StopRequest request) {
    String path = String.format("/api/2.0/pipelines/%s/stop", request.getPipelineId());
    try {
      Request req = new Request("POST", path);
      ApiClient.setQuery(req, request.toPb());
      req.withHeader("Accept", "application/json");
      apiClient.execute(req, StopPipelineResponse.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public void update(EditPipeline request) {
    String path = String.format("/api/2.0/pipelines/%s", request.getPipelineId());
    try {
      Request req = new Request("PUT", path, apiClient.serialize(request));
      ApiClient.setQuery(req, request.toPb());
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      apiClient.execute(req, EditPipelineResponse.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public PipelinePermissions updatePermissions(PipelinePermissionsRequest request) {
    String path = String.format("/api/2.0/permissions/pipelines/%s", request.getPipelineId());
    try {
      Request req = new Request("PATCH", path, apiClient.serialize(request));
      ApiClient.setQuery(req, request.toPb());
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      return apiClient.execute(req, PipelinePermissions.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }
}
