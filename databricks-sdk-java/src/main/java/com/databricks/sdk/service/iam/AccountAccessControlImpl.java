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
  public GetAssignableRolesForResourceResponse getAssignableRolesForResource(
      GetAssignableRolesForResourceRequest request) {
    String path =
        String.format(
            "/api/2.0/preview/accounts/%s/access-control/assignable-roles",
            apiClient.configuredAccountID());
    return apiClient.GET(path, request, GetAssignableRolesForResourceResponse.class);
  }

  @Override
  public RuleSetResponse getRuleSet(GetRuleSetRequest request) {
    String path =
        String.format(
            "/api/2.0/preview/accounts/%s/access-control/rule-sets",
            apiClient.configuredAccountID());
    return apiClient.GET(path, request, RuleSetResponse.class);
  }

  @Override
  public RuleSetResponse updateRuleSet(UpdateRuleSetRequest request) {
    String path =
        String.format(
            "/api/2.0/preview/accounts/%s/access-control/rule-sets",
            apiClient.configuredAccountID());
    return apiClient.PUT(path, request, RuleSetResponse.class);
  }
}
