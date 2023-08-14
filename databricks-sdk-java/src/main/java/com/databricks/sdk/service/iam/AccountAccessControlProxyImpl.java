// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.iam;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import java.util.HashMap;
import java.util.Map;

/** Package-local implementation of AccountAccessControlProxy */
@Generated
class AccountAccessControlProxyImpl implements AccountAccessControlProxyService {
  private final ApiClient apiClient;

  public AccountAccessControlProxyImpl(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  @Override
  public GetAssignableRolesForResourceResponse getAssignableRolesForResource(
      GetAssignableRolesForResourceRequest request) {
    String path = "/api/2.0/preview/accounts/access-control/assignable-roles";
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");

    return apiClient.GET(path, request, GetAssignableRolesForResourceResponse.class, headers);
  }

  @Override
  public RuleSetResponse getRuleSet(GetRuleSetRequest request) {
    String path = "/api/2.0/preview/accounts/access-control/rule-sets";
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");

    return apiClient.GET(path, request, RuleSetResponse.class, headers);
  }

  @Override
  public RuleSetResponse updateRuleSet(UpdateRuleSetRequest request) {
    String path = "/api/2.0/preview/accounts/access-control/rule-sets";
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");

    return apiClient.PUT(path, request, RuleSetResponse.class, headers);
  }
}
