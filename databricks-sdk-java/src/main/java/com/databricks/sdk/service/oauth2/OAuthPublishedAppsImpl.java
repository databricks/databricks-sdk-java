// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.oauth2;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import java.util.HashMap;
import java.util.Map;

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
            "/api/2.0/accounts/%s/oauth2/published-apps/", apiClient.configuredAccountID());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    return apiClient.GET(path, null, GetPublishedAppsOutput.class, headers);
  }
}
