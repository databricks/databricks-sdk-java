// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.compute;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.core.DatabricksException;
import com.databricks.sdk.core.http.Request;
import com.databricks.sdk.support.Generated;
import java.io.IOException;

/** Package-local implementation of Libraries */
@Generated
class LibrariesImpl implements LibrariesService {
  private final ApiClient apiClient;

  public LibrariesImpl(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  @Override
  public ListAllClusterLibraryStatusesResponse allClusterStatuses() {
    String path = "/api/2.0/libraries/all-cluster-statuses";
    try {
      Request req = new Request("GET", path);
      req.withHeader("Accept", "application/json");
      return apiClient.execute(req, ListAllClusterLibraryStatusesResponse.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public ClusterLibraryStatuses clusterStatus(ClusterStatus request) {
    String path = "/api/2.0/libraries/cluster-status";
    try {
      Request req = new Request("GET", path);
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      return apiClient.execute(req, ClusterLibraryStatuses.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public DefaultBaseEnvironment createDefaultBaseEnvironment(
      CreateDefaultBaseEnvironmentRequest request) {
    String path = "/api/2.0/default-base-environments";
    try {
      Request req = new Request("POST", path, apiClient.serialize(request));
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      return apiClient.execute(req, DefaultBaseEnvironment.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public void deleteDefaultBaseEnvironment(DeleteDefaultBaseEnvironmentRequest request) {
    String path = String.format("/api/2.0/default-base-environments/%s", request.getId());
    try {
      Request req = new Request("DELETE", path);
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      apiClient.execute(req, Void.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public void install(InstallLibraries request) {
    String path = "/api/2.0/libraries/install";
    try {
      Request req = new Request("POST", path, apiClient.serialize(request));
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      apiClient.execute(req, Void.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public ListDefaultBaseEnvironmentsResponse listDefaultBaseEnvironments(
      ListDefaultBaseEnvironmentsRequest request) {
    String path = "/api/2.0/default-base-environments";
    try {
      Request req = new Request("GET", path);
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      return apiClient.execute(req, ListDefaultBaseEnvironmentsResponse.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public void refreshDefaultBaseEnvironments(RefreshDefaultBaseEnvironmentsRequest request) {
    String path = "/api/2.0/default-base-environments/refresh";
    try {
      Request req = new Request("POST", path, apiClient.serialize(request));
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      apiClient.execute(req, Void.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public void uninstall(UninstallLibraries request) {
    String path = "/api/2.0/libraries/uninstall";
    try {
      Request req = new Request("POST", path, apiClient.serialize(request));
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      apiClient.execute(req, Void.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public DefaultBaseEnvironment updateDefaultBaseEnvironment(
      UpdateDefaultBaseEnvironmentRequest request) {
    String path = String.format("/api/2.0/default-base-environments/%s", request.getId());
    try {
      Request req = new Request("PATCH", path, apiClient.serialize(request));
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      return apiClient.execute(req, DefaultBaseEnvironment.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }
}
