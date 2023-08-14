// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.settings;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import java.util.HashMap;
import java.util.Map;

/** Package-local implementation of AccountNetworkPolicy */
@Generated
class AccountNetworkPolicyImpl implements AccountNetworkPolicyService {
  private final ApiClient apiClient;

  public AccountNetworkPolicyImpl(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  @Override
  public DeleteAccountNetworkPolicyResponse deleteAccountNetworkPolicy(
      DeleteAccountNetworkPolicyRequest request) {
    String path =
        String.format(
            "/api/2.0/accounts/%s/settings/types/network_policy/names/default",
            apiClient.configuredAccountID());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");

    return apiClient.DELETE(path, request, DeleteAccountNetworkPolicyResponse.class, headers);
  }

  @Override
  public AccountNetworkPolicyMessage readAccountNetworkPolicy(
      ReadAccountNetworkPolicyRequest request) {
    String path =
        String.format(
            "/api/2.0/accounts/%s/settings/types/network_policy/names/default",
            apiClient.configuredAccountID());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");

    return apiClient.GET(path, request, AccountNetworkPolicyMessage.class, headers);
  }

  @Override
  public AccountNetworkPolicyMessage updateAccountNetworkPolicy(
      UpdateAccountNetworkPolicyRequest request) {
    String path =
        String.format(
            "/api/2.0/accounts/%s/settings/types/network_policy/names/default",
            apiClient.configuredAccountID());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");

    return apiClient.PATCH(path, request, AccountNetworkPolicyMessage.class, headers);
  }
}
