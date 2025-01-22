// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.compute;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.core.DatabricksException;
import com.databricks.sdk.core.http.Request;
import com.databricks.sdk.support.Generated;
import java.io.IOException;

/** Package-local implementation of InstancePools */
@Generated
class InstancePoolsImpl implements InstancePoolsService {
  private final ApiClient apiClient;

  public InstancePoolsImpl(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  @Override
  public CreateInstancePoolResponse create(CreateInstancePool request) {
    String path = "/api/2.0/instance-pools/create";
    try {
      Request req = new Request("POST", path, apiClient.serialize(request));
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      return apiClient.execute(req, CreateInstancePoolResponse.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public void delete(DeleteInstancePool request) {
    String path = "/api/2.0/instance-pools/delete";
    try {
      Request req = new Request("POST", path, apiClient.serialize(request));
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      apiClient.execute(req, DeleteInstancePoolResponse.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public void edit(EditInstancePool request) {
    String path = "/api/2.0/instance-pools/edit";
    try {
      Request req = new Request("POST", path, apiClient.serialize(request));
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      apiClient.execute(req, EditInstancePoolResponse.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public GetInstancePool get(GetInstancePoolRequest request) {
    String path = "/api/2.0/instance-pools/get";
    try {
      Request req = new Request("GET", path);
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      return apiClient.execute(req, GetInstancePool.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public GetInstancePoolPermissionLevelsResponse getPermissionLevels(
      GetInstancePoolPermissionLevelsRequest request) {
    String path =
        String.format(
            "/api/2.0/permissions/instance-pools/%s/permissionLevels", request.getInstancePoolId());
    try {
      Request req = new Request("GET", path);
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      return apiClient.execute(req, GetInstancePoolPermissionLevelsResponse.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public InstancePoolPermissions getPermissions(GetInstancePoolPermissionsRequest request) {
    String path =
        String.format("/api/2.0/permissions/instance-pools/%s", request.getInstancePoolId());
    try {
      Request req = new Request("GET", path);
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      return apiClient.execute(req, InstancePoolPermissions.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public ListInstancePools list() {
    String path = "/api/2.0/instance-pools/list";
    try {
      Request req = new Request("GET", path);
      req.withHeader("Accept", "application/json");
      return apiClient.execute(req, ListInstancePools.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public InstancePoolPermissions setPermissions(InstancePoolPermissionsRequest request) {
    String path =
        String.format("/api/2.0/permissions/instance-pools/%s", request.getInstancePoolId());
    try {
      Request req = new Request("PUT", path, apiClient.serialize(request));
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      return apiClient.execute(req, InstancePoolPermissions.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public InstancePoolPermissions updatePermissions(InstancePoolPermissionsRequest request) {
    String path =
        String.format("/api/2.0/permissions/instance-pools/%s", request.getInstancePoolId());
    try {
      Request req = new Request("PATCH", path, apiClient.serialize(request));
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      return apiClient.execute(req, InstancePoolPermissions.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }
}
