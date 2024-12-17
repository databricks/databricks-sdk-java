// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.oauth2;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import java.util.HashMap;
import java.util.Map;

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
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");
    return apiClient.POST(path, request.getPolicy(), FederationPolicy.class, headers);
  }

  @Override
  public void delete(DeleteServicePrincipalFederationPolicyRequest request) {
    String path =
        String.format(
            "/api/2.0/accounts/%s/servicePrincipals/%s/federationPolicies/%s",
            apiClient.configuredAccountID(),
            request.getServicePrincipalId(),
            request.getPolicyId());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    apiClient.DELETE(path, request, DeleteResponse.class, headers);
  }

  @Override
  public FederationPolicy get(GetServicePrincipalFederationPolicyRequest request) {
    String path =
        String.format(
            "/api/2.0/accounts/%s/servicePrincipals/%s/federationPolicies/%s",
            apiClient.configuredAccountID(),
            request.getServicePrincipalId(),
            request.getPolicyId());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    return apiClient.GET(path, request, FederationPolicy.class, headers);
  }

  @Override
  public ListFederationPoliciesResponse list(
      ListServicePrincipalFederationPoliciesRequest request) {
    String path =
        String.format(
            "/api/2.0/accounts/%s/servicePrincipals/%s/federationPolicies",
            apiClient.configuredAccountID(), request.getServicePrincipalId());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    return apiClient.GET(path, request, ListFederationPoliciesResponse.class, headers);
  }

  @Override
  public FederationPolicy update(UpdateServicePrincipalFederationPolicyRequest request) {
    String path =
        String.format(
            "/api/2.0/accounts/%s/servicePrincipals/%s/federationPolicies/%s",
            apiClient.configuredAccountID(),
            request.getServicePrincipalId(),
            request.getPolicyId());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");
    return apiClient.PATCH(path, request.getPolicy(), FederationPolicy.class, headers);
  }
}
