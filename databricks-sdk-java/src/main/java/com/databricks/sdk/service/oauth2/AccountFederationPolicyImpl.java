// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.oauth2;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.core.DatabricksException;
import com.databricks.sdk.core.http.Request;
import com.databricks.sdk.support.Generated;
import java.io.IOException;

/** Package-local implementation of AccountFederationPolicy */
@Generated
class AccountFederationPolicyImpl implements AccountFederationPolicyService {
  private final ApiClient apiClient;

  public AccountFederationPolicyImpl(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  @Override
  public FederationPolicy create(CreateAccountFederationPolicyRequest request) {
    String path =
        String.format("/api/2.0/accounts/%s/federationPolicies", apiClient.configuredAccountID());
    try {
      Request req = new Request("POST", path, apiClient.serialize(request.getPolicy()));
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      return apiClient.execute(req, FederationPolicy.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public void delete(DeleteAccountFederationPolicyRequest request) {
    String path =
        String.format(
            "/api/2.0/accounts/%s/federationPolicies/%s",
            apiClient.configuredAccountID(), request.getPolicyId());
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
  public FederationPolicy get(GetAccountFederationPolicyRequest request) {
    String path =
        String.format(
            "/api/2.0/accounts/%s/federationPolicies/%s",
            apiClient.configuredAccountID(), request.getPolicyId());
    try {
      Request req = new Request("GET", path);
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      return apiClient.execute(req, FederationPolicy.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public ListFederationPoliciesResponse list(ListAccountFederationPoliciesRequest request) {
    String path =
        String.format("/api/2.0/accounts/%s/federationPolicies", apiClient.configuredAccountID());
    try {
      Request req = new Request("GET", path);
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      return apiClient.execute(req, ListFederationPoliciesResponse.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public FederationPolicy update(UpdateAccountFederationPolicyRequest request) {
    String path =
        String.format(
            "/api/2.0/accounts/%s/federationPolicies/%s",
            apiClient.configuredAccountID(), request.getPolicyId());
    try {
      Request req = new Request("PATCH", path, apiClient.serialize(request.getPolicy()));
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      return apiClient.execute(req, FederationPolicy.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }
}
