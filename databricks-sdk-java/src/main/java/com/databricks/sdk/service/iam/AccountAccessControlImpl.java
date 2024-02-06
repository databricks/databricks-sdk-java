// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.iam;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import java.util.HashMap;
import java.util.Map;

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
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    return apiClient.GET(path, null, GetAssignableRolesForResourceResponse.class, headers);
  }

  @Override
  public RuleSetResponse getRuleSet(GetRuleSetRequest request) {
    String path =
        String.format(
            "/api/2.0/preview/accounts/%s/access-control/rule-sets",
            apiClient.configuredAccountID());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    return apiClient.GET(path, null, RuleSetResponse.class, headers);
  }

  @Override
  public RuleSetResponse updateRuleSet(UpdateRuleSetRequest request) {
    String path =
        String.format(
            "/api/2.0/preview/accounts/%s/access-control/rule-sets",
            apiClient.configuredAccountID());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");
    return apiClient.PUT(path, request, RuleSetResponse.class, headers);
  }
}
