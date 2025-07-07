// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.settings;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.core.DatabricksException;
import com.databricks.sdk.core.http.Request;
import com.databricks.sdk.support.Generated;
import java.io.IOException;

/** Package-local implementation of NetworkPolicies */
@Generated
class NetworkPoliciesImpl implements NetworkPoliciesService {
  private final ApiClient apiClient;

  public NetworkPoliciesImpl(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  @Override
  public AccountNetworkPolicy createNetworkPolicyRpc(CreateNetworkPolicyRequest request) {
    String path =
        String.format("/api/2.0/accounts/%s/network-policies", apiClient.configuredAccountID());
    try {
      Request req = new Request("POST", path, apiClient.serialize(request.getNetworkPolicy()));
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      return apiClient.execute(req, AccountNetworkPolicy.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public void deleteNetworkPolicyRpc(DeleteNetworkPolicyRequest request) {
    String path =
        String.format(
            "/api/2.0/accounts/%s/network-policies/%s",
            apiClient.configuredAccountID(), request.getNetworkPolicyId());
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
  public AccountNetworkPolicy getNetworkPolicyRpc(GetNetworkPolicyRequest request) {
    String path =
        String.format(
            "/api/2.0/accounts/%s/network-policies/%s",
            apiClient.configuredAccountID(), request.getNetworkPolicyId());
    try {
      Request req = new Request("GET", path);
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      return apiClient.execute(req, AccountNetworkPolicy.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public ListNetworkPoliciesResponse listNetworkPoliciesRpc(ListNetworkPoliciesRequest request) {
    String path =
        String.format("/api/2.0/accounts/%s/network-policies", apiClient.configuredAccountID());
    try {
      Request req = new Request("GET", path);
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      return apiClient.execute(req, ListNetworkPoliciesResponse.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public AccountNetworkPolicy updateNetworkPolicyRpc(UpdateNetworkPolicyRequest request) {
    String path =
        String.format(
            "/api/2.0/accounts/%s/network-policies/%s",
            apiClient.configuredAccountID(), request.getNetworkPolicyId());
    try {
      Request req = new Request("PUT", path, apiClient.serialize(request.getNetworkPolicy()));
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      return apiClient.execute(req, AccountNetworkPolicy.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }
}
