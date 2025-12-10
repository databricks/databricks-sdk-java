// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.compute;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.core.DatabricksException;
import com.databricks.sdk.core.http.Request;
import com.databricks.sdk.support.Generated;
import java.io.IOException;

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
    try {
      Request req = new Request("POST", path, apiClient.serialize(request));

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      return apiClient.execute(req, CreatePolicyResponse.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public void delete(DeletePolicy request) {
    String path = "/api/2.0/policies/clusters/delete";
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
  public void edit(EditPolicy request) {
    String path = "/api/2.0/policies/clusters/edit";
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
  public Policy get(GetClusterPolicyRequest request) {
    String path = "/api/2.0/policies/clusters/get";
    try {
      Request req = new Request("GET", path);

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      return apiClient.execute(req, Policy.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public GetClusterPolicyPermissionLevelsResponse getPermissionLevels(
      GetClusterPolicyPermissionLevelsRequest request) {
    String path =
        String.format(
            "/api/2.0/permissions/cluster-policies/%s/permissionLevels",
            request.getClusterPolicyId());
    try {
      Request req = new Request("GET", path);

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      return apiClient.execute(req, GetClusterPolicyPermissionLevelsResponse.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public ClusterPolicyPermissions getPermissions(GetClusterPolicyPermissionsRequest request) {
    String path =
        String.format("/api/2.0/permissions/cluster-policies/%s", request.getClusterPolicyId());
    try {
      Request req = new Request("GET", path);

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      return apiClient.execute(req, ClusterPolicyPermissions.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public ListPoliciesResponse list(ListClusterPoliciesRequest request) {
    String path = "/api/2.0/policies/clusters/list";
    try {
      Request req = new Request("GET", path);

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      return apiClient.execute(req, ListPoliciesResponse.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public ClusterPolicyPermissions setPermissions(ClusterPolicyPermissionsRequest request) {
    String path =
        String.format("/api/2.0/permissions/cluster-policies/%s", request.getClusterPolicyId());
    try {
      Request req = new Request("PUT", path, apiClient.serialize(request));

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      return apiClient.execute(req, ClusterPolicyPermissions.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public ClusterPolicyPermissions updatePermissions(ClusterPolicyPermissionsRequest request) {
    String path =
        String.format("/api/2.0/permissions/cluster-policies/%s", request.getClusterPolicyId());
    try {
      Request req = new Request("PATCH", path, apiClient.serialize(request));

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      return apiClient.execute(req, ClusterPolicyPermissions.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }
}
