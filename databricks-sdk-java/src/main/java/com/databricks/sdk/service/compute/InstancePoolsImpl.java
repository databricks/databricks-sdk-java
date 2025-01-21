// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.compute;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import java.util.HashMap;
import java.util.Map;

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
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");
    return apiClient.execute("POST", path, request, CreateInstancePoolResponse.class, headers);
  }

  @Override
  public void delete(DeleteInstancePool request) {
    String path = "/api/2.0/instance-pools/delete";
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");
    apiClient.execute("POST", path, request, DeleteInstancePoolResponse.class, headers);
  }

  @Override
  public void edit(EditInstancePool request) {
    String path = "/api/2.0/instance-pools/edit";
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");
    apiClient.execute("POST", path, request, EditInstancePoolResponse.class, headers);
  }

  @Override
  public GetInstancePool get(GetInstancePoolRequest request) {
    String path = "/api/2.0/instance-pools/get";
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    return apiClient.execute("GET", path, request, GetInstancePool.class, headers);
  }

  @Override
  public GetInstancePoolPermissionLevelsResponse getPermissionLevels(
      GetInstancePoolPermissionLevelsRequest request) {
    String path =
        String.format(
            "/api/2.0/permissions/instance-pools/%s/permissionLevels", request.getInstancePoolId());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    return apiClient.execute(
        "GET", path, request, GetInstancePoolPermissionLevelsResponse.class, headers);
  }

  @Override
  public InstancePoolPermissions getPermissions(GetInstancePoolPermissionsRequest request) {
    String path =
        String.format("/api/2.0/permissions/instance-pools/%s", request.getInstancePoolId());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    return apiClient.execute("GET", path, request, InstancePoolPermissions.class, headers);
  }

  @Override
  public ListInstancePools list() {
    String path = "/api/2.0/instance-pools/list";
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    return apiClient.execute("GET", path, null, ListInstancePools.class, headers);
  }

  @Override
  public InstancePoolPermissions setPermissions(InstancePoolPermissionsRequest request) {
    String path =
        String.format("/api/2.0/permissions/instance-pools/%s", request.getInstancePoolId());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");
    return apiClient.execute("PUT", path, request, InstancePoolPermissions.class, headers);
  }

  @Override
  public InstancePoolPermissions updatePermissions(InstancePoolPermissionsRequest request) {
    String path =
        String.format("/api/2.0/permissions/instance-pools/%s", request.getInstancePoolId());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");
    return apiClient.execute("PATCH", path, request, InstancePoolPermissions.class, headers);
  }
}
