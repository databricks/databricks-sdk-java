// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.oauth2;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import java.util.HashMap;
import java.util.Map;

/** Package-local implementation of OAuthEnrollment */
@Generated
class OAuthEnrollmentImpl implements OAuthEnrollmentService {
  private final ApiClient apiClient;

  public OAuthEnrollmentImpl(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  @Override
  public void create(CreateOAuthEnrollment request) {
    String path =
        String.format("/api/2.0/accounts/%s/oauth2/enrollment", apiClient.configuredAccountID());
    Map<String, String> headers = new HashMap<>();
    headers.put("Content-Type", "application/json");
    apiClient.POST(path, request, Void.class, headers);
  }

  @Override
  public OAuthEnrollmentStatus get() {
    String path =
        String.format("/api/2.0/accounts/%s/oauth2/enrollment", apiClient.configuredAccountID());
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    return apiClient.GET(path, OAuthEnrollmentStatus.class, headers);
  }
}
