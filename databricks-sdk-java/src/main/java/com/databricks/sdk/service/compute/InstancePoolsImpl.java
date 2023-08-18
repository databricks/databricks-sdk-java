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
    return apiClient.POST(path, request, CreateInstancePoolResponse.class, headers);
  }

  @Override
  public void delete(DeleteInstancePool request) {
    String path = "/api/2.0/instance-pools/delete";
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");
    apiClient.POST(path, request, Void.class, headers);
  }

  @Override
  public void edit(EditInstancePool request) {
    String path = "/api/2.0/instance-pools/edit";
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");
    apiClient.POST(path, request, Void.class, headers);
  }

  @Override
  public GetInstancePool get(GetInstancePoolRequest request) {
    String path = "/api/2.0/instance-pools/get";
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    return apiClient.GET(path, request, GetInstancePool.class, headers);
  }

  @Override
  public GetInstancePoolPermissionLevelsResponse getInstancePoolPermissionLevels(
      GetInstancePoolPermissionLevelsRequest request) {
    String path =
        String.format(
            "/api/2.0/permissions/instance-pools/%s/permissionLevels", request.getInstancePoolId());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    return apiClient.GET(path, request, GetInstancePoolPermissionLevelsResponse.class, headers);
  }

  @Override
  public InstancePoolPermissions getInstancePoolPermissions(
      GetInstancePoolPermissionsRequest request) {
    String path =
        String.format("/api/2.0/permissions/instance-pools/%s", request.getInstancePoolId());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    return apiClient.GET(path, request, InstancePoolPermissions.class, headers);
  }

  @Override
  public ListInstancePools list() {
    String path = "/api/2.0/instance-pools/list";
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    return apiClient.GET(path, ListInstancePools.class, headers);
  }

  @Override
  public InstancePoolPermissions setInstancePoolPermissions(
      InstancePoolPermissionsRequest request) {
    String path =
        String.format("/api/2.0/permissions/instance-pools/%s", request.getInstancePoolId());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");
    return apiClient.PUT(path, request, InstancePoolPermissions.class, headers);
  }

  @Override
  public InstancePoolPermissions updateInstancePoolPermissions(
      InstancePoolPermissionsRequest request) {
    String path =
        String.format("/api/2.0/permissions/instance-pools/%s", request.getInstancePoolId());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");
    return apiClient.PATCH(path, request, InstancePoolPermissions.class, headers);
  }
}
