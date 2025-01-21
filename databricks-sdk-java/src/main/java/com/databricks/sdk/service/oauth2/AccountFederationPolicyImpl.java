// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.oauth2;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import java.util.HashMap;
import java.util.Map;

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
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");
    return apiClient.execute("POST", path, request.getPolicy(), FederationPolicy.class, headers);
  }

  @Override
  public void delete(DeleteAccountFederationPolicyRequest request) {
    String path =
        String.format(
            "/api/2.0/accounts/%s/federationPolicies/%s",
            apiClient.configuredAccountID(), request.getPolicyId());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    apiClient.execute("DELETE", path, request, DeleteResponse.class, headers);
  }

  @Override
  public FederationPolicy get(GetAccountFederationPolicyRequest request) {
    String path =
        String.format(
            "/api/2.0/accounts/%s/federationPolicies/%s",
            apiClient.configuredAccountID(), request.getPolicyId());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    return apiClient.execute("GET", path, request, FederationPolicy.class, headers);
  }

  @Override
  public ListFederationPoliciesResponse list(ListAccountFederationPoliciesRequest request) {
    String path =
        String.format("/api/2.0/accounts/%s/federationPolicies", apiClient.configuredAccountID());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    return apiClient.execute("GET", path, request, ListFederationPoliciesResponse.class, headers);
  }

  @Override
  public FederationPolicy update(UpdateAccountFederationPolicyRequest request) {
    String path =
        String.format(
            "/api/2.0/accounts/%s/federationPolicies/%s",
            apiClient.configuredAccountID(), request.getPolicyId());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");
    return apiClient.execute("PATCH", path, request.getPolicy(), FederationPolicy.class, headers);
  }
}
