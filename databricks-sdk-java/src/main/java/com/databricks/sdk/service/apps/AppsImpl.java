// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.apps;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.core.DatabricksException;
import com.databricks.sdk.core.http.Request;
import com.databricks.sdk.support.Generated;
import java.io.IOException;

/** Package-local implementation of Apps */
@Generated
class AppsImpl implements AppsService {
  private final ApiClient apiClient;

  public AppsImpl(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  @Override
  public App create(CreateAppRequest request) {
    String path = "/api/2.0/apps";
    try {
      Request req = new Request("POST", path, apiClient.serialize(request.getApp()));
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      return apiClient.execute(req, App.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public AppUpdate createUpdate(AsyncUpdateAppRequest request) {
    String path = String.format("/api/2.0/apps/%s/update", request.getAppName());
    try {
      Request req = new Request("POST", path, apiClient.serialize(request));
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      return apiClient.execute(req, AppUpdate.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public App delete(DeleteAppRequest request) {
    String path = String.format("/api/2.0/apps/%s", request.getName());
    try {
      Request req = new Request("DELETE", path);
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      return apiClient.execute(req, App.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public AppDeployment deploy(CreateAppDeploymentRequest request) {
    String path = String.format("/api/2.0/apps/%s/deployments", request.getAppName());
    try {
      Request req = new Request("POST", path, apiClient.serialize(request.getAppDeployment()));
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      return apiClient.execute(req, AppDeployment.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public App get(GetAppRequest request) {
    String path = String.format("/api/2.0/apps/%s", request.getName());
    try {
      Request req = new Request("GET", path);
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      return apiClient.execute(req, App.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public AppDeployment getDeployment(GetAppDeploymentRequest request) {
    String path =
        String.format(
            "/api/2.0/apps/%s/deployments/%s", request.getAppName(), request.getDeploymentId());
    try {
      Request req = new Request("GET", path);
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      return apiClient.execute(req, AppDeployment.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public GetAppPermissionLevelsResponse getPermissionLevels(GetAppPermissionLevelsRequest request) {
    String path =
        String.format("/api/2.0/permissions/apps/%s/permissionLevels", request.getAppName());
    try {
      Request req = new Request("GET", path);
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      return apiClient.execute(req, GetAppPermissionLevelsResponse.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public AppPermissions getPermissions(GetAppPermissionsRequest request) {
    String path = String.format("/api/2.0/permissions/apps/%s", request.getAppName());
    try {
      Request req = new Request("GET", path);
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      return apiClient.execute(req, AppPermissions.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public AppUpdate getUpdate(GetAppUpdateRequest request) {
    String path = String.format("/api/2.0/apps/%s/update", request.getAppName());
    try {
      Request req = new Request("GET", path);
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      return apiClient.execute(req, AppUpdate.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public ListAppsResponse list(ListAppsRequest request) {
    String path = "/api/2.0/apps";
    try {
      Request req = new Request("GET", path);
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      return apiClient.execute(req, ListAppsResponse.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public ListAppDeploymentsResponse listDeployments(ListAppDeploymentsRequest request) {
    String path = String.format("/api/2.0/apps/%s/deployments", request.getAppName());
    try {
      Request req = new Request("GET", path);
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      return apiClient.execute(req, ListAppDeploymentsResponse.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public AppPermissions setPermissions(AppPermissionsRequest request) {
    String path = String.format("/api/2.0/permissions/apps/%s", request.getAppName());
    try {
      Request req = new Request("PUT", path, apiClient.serialize(request));
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      return apiClient.execute(req, AppPermissions.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public App start(StartAppRequest request) {
    String path = String.format("/api/2.0/apps/%s/start", request.getName());
    try {
      Request req = new Request("POST", path, apiClient.serialize(request));
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      return apiClient.execute(req, App.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public App stop(StopAppRequest request) {
    String path = String.format("/api/2.0/apps/%s/stop", request.getName());
    try {
      Request req = new Request("POST", path, apiClient.serialize(request));
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      return apiClient.execute(req, App.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public App update(UpdateAppRequest request) {
    String path = String.format("/api/2.0/apps/%s", request.getName());
    try {
      Request req = new Request("PATCH", path, apiClient.serialize(request.getApp()));
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      return apiClient.execute(req, App.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public AppPermissions updatePermissions(AppPermissionsRequest request) {
    String path = String.format("/api/2.0/permissions/apps/%s", request.getAppName());
    try {
      Request req = new Request("PATCH", path, apiClient.serialize(request));
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      return apiClient.execute(req, AppPermissions.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }
}
