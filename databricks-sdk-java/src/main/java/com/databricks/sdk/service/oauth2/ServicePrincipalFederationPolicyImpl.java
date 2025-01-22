// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.oauth2;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.core.DatabricksException;
import com.databricks.sdk.core.http.Request;
import com.databricks.sdk.support.Generated;
import java.io.IOException;

/** Package-local implementation of ServicePrincipalFederationPolicy */
@Generated
class ServicePrincipalFederationPolicyImpl implements ServicePrincipalFederationPolicyService {
  private final ApiClient apiClient;

  public ServicePrincipalFederationPolicyImpl(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  @Override
  public FederationPolicy create(CreateServicePrincipalFederationPolicyRequest request) {
    String path =
        String.format(
            "/api/2.0/accounts/%s/servicePrincipals/%s/federationPolicies",
            apiClient.configuredAccountID(), request.getServicePrincipalId());
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
  public void delete(DeleteServicePrincipalFederationPolicyRequest request) {
    String path =
        String.format(
            "/api/2.0/accounts/%s/servicePrincipals/%s/federationPolicies/%s",
            apiClient.configuredAccountID(),
            request.getServicePrincipalId(),
            request.getPolicyId());
    try {
      Request req = new Request("DELETE", path);
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      apiClient.execute(req, DeleteResponse.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public FederationPolicy get(GetServicePrincipalFederationPolicyRequest request) {
    String path =
        String.format(
            "/api/2.0/accounts/%s/servicePrincipals/%s/federationPolicies/%s",
            apiClient.configuredAccountID(),
            request.getServicePrincipalId(),
            request.getPolicyId());
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
  public ListFederationPoliciesResponse list(
      ListServicePrincipalFederationPoliciesRequest request) {
    String path =
        String.format(
            "/api/2.0/accounts/%s/servicePrincipals/%s/federationPolicies",
            apiClient.configuredAccountID(), request.getServicePrincipalId());
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
  public FederationPolicy update(UpdateServicePrincipalFederationPolicyRequest request) {
    String path =
        String.format(
            "/api/2.0/accounts/%s/servicePrincipals/%s/federationPolicies/%s",
            apiClient.configuredAccountID(),
            request.getServicePrincipalId(),
            request.getPolicyId());
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
