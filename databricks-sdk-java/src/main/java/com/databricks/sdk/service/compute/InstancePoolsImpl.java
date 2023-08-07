// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.compute;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;

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
    return apiClient.POST(path, request, CreateInstancePoolResponse.class);
  }

  @Override
  public void delete(DeleteInstancePool request) {
    String path = "/api/2.0/instance-pools/delete";
    apiClient.POST(path, request, Void.class);
  }

  @Override
  public void edit(EditInstancePool request) {
    String path = "/api/2.0/instance-pools/edit";
    apiClient.POST(path, request, Void.class);
  }

  @Override
  public GetInstancePool get(GetInstancePoolRequest request) {
    String path = "/api/2.0/instance-pools/get";
    return apiClient.GET(path, request, GetInstancePool.class);
  }

  @Override
  public GetInstancePoolPermissionLevelsResponse getInstancePoolPermissionLevels(
      GetInstancePoolPermissionLevelsRequest request) {
    String path =
        String.format(
            "/api/2.0/permissions/instance-pools/%s/permissionLevels", request.getInstancePoolId());
    return apiClient.GET(path, request, GetInstancePoolPermissionLevelsResponse.class);
  }

  @Override
  public InstancePoolPermissions getInstancePoolPermissions(
      GetInstancePoolPermissionsRequest request) {
    String path =
        String.format("/api/2.0/permissions/instance-pools/%s", request.getInstancePoolId());
    return apiClient.GET(path, request, InstancePoolPermissions.class);
  }

  @Override
  public ListInstancePools list() {
    String path = "/api/2.0/instance-pools/list";
    return apiClient.GET(path, ListInstancePools.class);
  }

  @Override
  public InstancePoolPermissions setInstancePoolPermissions(
      InstancePoolPermissionsRequest request) {
    String path =
        String.format("/api/2.0/permissions/instance-pools/%s", request.getInstancePoolId());
    return apiClient.PUT(path, request, InstancePoolPermissions.class);
  }

  @Override
  public InstancePoolPermissions updateInstancePoolPermissions(
      InstancePoolPermissionsRequest request) {
    String path =
        String.format("/api/2.0/permissions/instance-pools/%s", request.getInstancePoolId());
    return apiClient.PATCH(path, request, InstancePoolPermissions.class);
  }
}
