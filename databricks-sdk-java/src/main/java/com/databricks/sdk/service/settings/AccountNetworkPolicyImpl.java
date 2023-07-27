// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.settings;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;

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
    return apiClient.DELETE(path, request, DeleteAccountNetworkPolicyResponse.class);
  }

  @Override
  public AccountNetworkPolicyMessage readAccountNetworkPolicy(
      ReadAccountNetworkPolicyRequest request) {
    String path =
        String.format(
            "/api/2.0/accounts/%s/settings/types/network_policy/names/default",
            apiClient.configuredAccountID());
    return apiClient.GET(path, request, AccountNetworkPolicyMessage.class);
  }

  @Override
  public AccountNetworkPolicyMessage updateAccountNetworkPolicy(
      UpdateAccountNetworkPolicyRequest request) {
    String path =
        String.format(
            "/api/2.0/accounts/%s/settings/types/network_policy/names/default",
            apiClient.configuredAccountID());
    return apiClient.PATCH(path, request, AccountNetworkPolicyMessage.class);
  }
}
