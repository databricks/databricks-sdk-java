// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.compute;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import java.util.HashMap;
import java.util.Map;

/** Package-local implementation of ClusterPolicies */
@Generated
class ClusterPoliciesImpl implements ClusterPoliciesService {
  private final ApiClient apiClient;

  public ClusterPoliciesImpl(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  @Override
  public CreatePolicyResponse create(CreatePolicy request) {
    String path = "/api/2.0/policies/clusters/create";
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");
    return apiClient.POST(path, request, CreatePolicyResponse.class, headers);
  }

  @Override
  public void delete(DeletePolicy request) {
    String path = "/api/2.0/policies/clusters/delete";
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");
    apiClient.POST(path, request, Void.class, headers);
  }

  @Override
  public void edit(EditPolicy request) {
    String path = "/api/2.0/policies/clusters/edit";
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");
    apiClient.POST(path, request, Void.class, headers);
  }

  @Override
  public Policy get(GetClusterPolicyRequest request) {
    String path = "/api/2.0/policies/clusters/get";
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    return apiClient.GET(path, request, Policy.class, headers);
  }

  @Override
  public GetClusterPolicyPermissionLevelsResponse getClusterPolicyPermissionLevels(
      GetClusterPolicyPermissionLevelsRequest request) {
    String path =
        String.format(
            "/api/2.0/permissions/cluster-policies/%s/permissionLevels",
            request.getClusterPolicyId());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    return apiClient.GET(path, request, GetClusterPolicyPermissionLevelsResponse.class, headers);
  }

  @Override
  public ClusterPolicyPermissions getClusterPolicyPermissions(
      GetClusterPolicyPermissionsRequest request) {
    String path =
        String.format("/api/2.0/permissions/cluster-policies/%s", request.getClusterPolicyId());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    return apiClient.GET(path, request, ClusterPolicyPermissions.class, headers);
  }

  @Override
  public ListPoliciesResponse list(ListClusterPoliciesRequest request) {
    String path = "/api/2.0/policies/clusters/list";
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    return apiClient.GET(path, request, ListPoliciesResponse.class, headers);
  }

  @Override
  public ClusterPolicyPermissions setClusterPolicyPermissions(
      ClusterPolicyPermissionsRequest request) {
    String path =
        String.format("/api/2.0/permissions/cluster-policies/%s", request.getClusterPolicyId());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");
    return apiClient.PUT(path, request, ClusterPolicyPermissions.class, headers);
  }

  @Override
  public ClusterPolicyPermissions updateClusterPolicyPermissions(
      ClusterPolicyPermissionsRequest request) {
    String path =
        String.format("/api/2.0/permissions/cluster-policies/%s", request.getClusterPolicyId());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");
    return apiClient.PATCH(path, request, ClusterPolicyPermissions.class, headers);
  }
}
