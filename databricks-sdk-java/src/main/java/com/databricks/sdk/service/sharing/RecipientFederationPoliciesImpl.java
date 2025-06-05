// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.sharing;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.core.DatabricksException;
import com.databricks.sdk.core.http.Request;
import com.databricks.sdk.support.Generated;
import java.io.IOException;

/** Package-local implementation of RecipientFederationPolicies */
@Generated
class RecipientFederationPoliciesImpl implements RecipientFederationPoliciesService {
  private final ApiClient apiClient;

  public RecipientFederationPoliciesImpl(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  @Override
  public FederationPolicy create(CreateFederationPolicyRequest request) {
    String path =
        String.format(
            "/api/2.0/data-sharing/recipients/%s/federation-policies", request.getRecipientName());
    try {
      Request req = new Request("POST", path, apiClient.serialize(request.getPolicy()));
      ApiClient.setQuery(req, request.toPb());
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      return apiClient.execute(req, FederationPolicy.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public void delete(DeleteFederationPolicyRequest request) {
    String path =
        String.format(
            "/api/2.0/data-sharing/recipients/%s/federation-policies/%s",
            request.getRecipientName(), request.getName());
    try {
      Request req = new Request("DELETE", path);
      ApiClient.setQuery(req, request.toPb());
      req.withHeader("Accept", "application/json");
      apiClient.execute(req, DeleteResponse.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public FederationPolicy getFederationPolicy(GetFederationPolicyRequest request) {
    String path =
        String.format(
            "/api/2.0/data-sharing/recipients/%s/federation-policies/%s",
            request.getRecipientName(), request.getName());
    try {
      Request req = new Request("GET", path);
      ApiClient.setQuery(req, request.toPb());
      req.withHeader("Accept", "application/json");
      return apiClient.execute(req, FederationPolicy.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public ListFederationPoliciesResponse list(ListFederationPoliciesRequest request) {
    String path =
        String.format(
            "/api/2.0/data-sharing/recipients/%s/federation-policies", request.getRecipientName());
    try {
      Request req = new Request("GET", path);
      ApiClient.setQuery(req, request.toPb());
      req.withHeader("Accept", "application/json");
      return apiClient.execute(req, ListFederationPoliciesResponse.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public FederationPolicy update(UpdateFederationPolicyRequest request) {
    String path =
        String.format(
            "/api/2.0/data-sharing/recipients/%s/federation-policies/%s",
            request.getRecipientName(), request.getName());
    try {
      Request req = new Request("PATCH", path, apiClient.serialize(request.getPolicy()));
      ApiClient.setQuery(req, request.toPb());
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      return apiClient.execute(req, FederationPolicy.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }
}
