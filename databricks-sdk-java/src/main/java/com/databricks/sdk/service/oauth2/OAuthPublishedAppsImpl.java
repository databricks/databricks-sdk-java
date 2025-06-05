// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.oauth2;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.core.DatabricksException;
import com.databricks.sdk.core.http.Request;
import com.databricks.sdk.support.Generated;
import java.io.IOException;

/** Package-local implementation of OAuthPublishedApps */
@Generated
class OAuthPublishedAppsImpl implements OAuthPublishedAppsService {
  private final ApiClient apiClient;

  public OAuthPublishedAppsImpl(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  @Override
  public GetPublishedAppsOutput list(ListOAuthPublishedAppsRequest request) {
    String path =
        String.format(
            "/api/2.0/accounts/%s/oauth2/published-apps", apiClient.configuredAccountID());
    try {
      Request req = new Request("GET", path);
      ApiClient.setQuery(req, request.toPb());
      req.withHeader("Accept", "application/json");
      return apiClient.execute(req, GetPublishedAppsOutput.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }
}
