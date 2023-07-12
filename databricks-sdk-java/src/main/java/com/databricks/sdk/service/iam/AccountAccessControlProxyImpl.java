// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.iam;

import java.io.IOException;
import java.util.Collection;
import java.util.Map;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.core.DatabricksException;
import com.databricks.sdk.support.Generated;



/** Package-local implementation of AccountAccessControlProxy */
@Generated
class AccountAccessControlProxyImpl implements AccountAccessControlProxyService {
  private final ApiClient apiClient;

  public AccountAccessControlProxyImpl(ApiClient apiClient) {
    this.apiClient = apiClient;
  }
	
  @Override
  public GetAssignableRolesForResourceResponse getAssignableRolesForResource(GetAssignableRolesForResourceRequest request) {
    String path = "/api/2.0/preview/accounts/access-control/assignable-roles";
    return apiClient.GET(path, request, GetAssignableRolesForResourceResponse.class);
  }
  
  @Override
  public RuleSetResponse getRuleSet(GetRuleSetRequest request) {
    String path = "/api/2.0/preview/accounts/access-control/rule-sets";
    return apiClient.GET(path, request, RuleSetResponse.class);
  }
  
  @Override
  public RuleSetResponse updateRuleSet(UpdateRuleSetRequest request) {
    String path = "/api/2.0/preview/accounts/access-control/rule-sets";
    return apiClient.PUT(path, request, RuleSetResponse.class);
  }
  
}