// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.catalog;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.core.DatabricksException;
import com.databricks.sdk.core.http.Request;
import com.databricks.sdk.support.Generated;
import java.io.IOException;

/** Package-local implementation of Policies */
@Generated
class PoliciesImpl implements PoliciesService {
  private final ApiClient apiClient;

  public PoliciesImpl(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  @Override
  public PolicyInfo createPolicy(CreatePolicyRequest request) {
    String path = "/api/2.1/unity-catalog/policies";
    try {
      Request req = new Request("POST", path, apiClient.serialize(request.getPolicyInfo()));

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      return apiClient.execute(req, PolicyInfo.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public DeletePolicyResponse deletePolicy(DeletePolicyRequest request) {
    String path =
        String.format(
            "/api/2.1/unity-catalog/policies/%s/%s/%s",
            request.getOnSecurableType(), request.getOnSecurableFullname(), request.getName());
    try {
      Request req = new Request("DELETE", path);

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      return apiClient.execute(req, DeletePolicyResponse.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public PolicyInfo getPolicy(GetPolicyRequest request) {
    String path =
        String.format(
            "/api/2.1/unity-catalog/policies/%s/%s/%s",
            request.getOnSecurableType(), request.getOnSecurableFullname(), request.getName());
    try {
      Request req = new Request("GET", path);

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      return apiClient.execute(req, PolicyInfo.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public ListPoliciesResponse listPolicies(ListPoliciesRequest request) {
    String path =
        String.format(
            "/api/2.1/unity-catalog/policies/%s/%s",
            request.getOnSecurableType(), request.getOnSecurableFullname());
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
  public PolicyInfo updatePolicy(UpdatePolicyRequest request) {
    String path =
        String.format(
            "/api/2.1/unity-catalog/policies/%s/%s/%s",
            request.getOnSecurableType(), request.getOnSecurableFullname(), request.getName());
    try {
      Request req = new Request("PATCH", path, apiClient.serialize(request.getPolicyInfo()));

      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      return apiClient.execute(req, PolicyInfo.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }
}
