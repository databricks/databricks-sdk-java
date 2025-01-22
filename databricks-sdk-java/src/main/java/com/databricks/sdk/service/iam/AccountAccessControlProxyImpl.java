// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.iam;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.core.DatabricksException;
import com.databricks.sdk.core.http.Request;
import com.databricks.sdk.support.Generated;
import java.io.IOException;

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
    try {
      Request req = new Request("GET", path);
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      return apiClient.execute(req, GetAssignableRolesForResourceResponse.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public RuleSetResponse getRuleSet(GetRuleSetRequest request) {
    String path = "/api/2.0/preview/accounts/access-control/rule-sets";
    try {
      Request req = new Request("GET", path);
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      return apiClient.execute(req, RuleSetResponse.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }

  @Override
  public RuleSetResponse updateRuleSet(UpdateRuleSetRequest request) {
    String path = "/api/2.0/preview/accounts/access-control/rule-sets";
    try {
      Request req = new Request("PUT", path, apiClient.serialize(request));
      ApiClient.setQuery(req, request);
      req.withHeader("Accept", "application/json");
      req.withHeader("Content-Type", "application/json");
      return apiClient.execute(req, RuleSetResponse.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }
}
