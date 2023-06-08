// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.iam;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;

/** Package-local implementation of AccountAccessControl */
@Generated
class AccountAccessControlImpl implements AccountAccessControlService {
  private final ApiClient apiClient;

  public AccountAccessControlImpl(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  @Override
  public RuleSetResponse get(GetAccountAccessControlRequest request) {
    String path =
        String.format(
            "/preview/accounts/%s/access-control/rule-sets", apiClient.configuredAccountID());
    return apiClient.GET(path, request, RuleSetResponse.class);
  }

  @Override
  public GetAssignableRolesForResourceResponse list(ListAccountAccessControlRequest request) {
    String path =
        String.format(
            "/preview/accounts/%s/access-control/assignable-roles",
            apiClient.configuredAccountID());
    return apiClient.GET(path, request, GetAssignableRolesForResourceResponse.class);
  }

  @Override
  public RuleSetResponse update(UpdateRuleSetRequest request) {
    String path =
        String.format(
            "/preview/accounts/%s/access-control/rule-sets", apiClient.configuredAccountID());
    return apiClient.PUT(path, request, RuleSetResponse.class);
  }
}
