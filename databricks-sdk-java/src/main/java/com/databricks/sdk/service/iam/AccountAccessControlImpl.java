// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.iam;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.core.DatabricksException;
import com.databricks.sdk.core.http.Request;
import com.databricks.sdk.support.Generated;
import java.io.IOException;

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
    String path =
        String.format(
            "/api/2.0/preview/accounts/%s/access-control/rule-sets",
            apiClient.configuredAccountID());
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
    String path =
        String.format(
            "/api/2.0/preview/accounts/%s/access-control/rule-sets",
            apiClient.configuredAccountID());
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
