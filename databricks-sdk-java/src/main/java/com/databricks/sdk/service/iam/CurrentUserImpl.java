// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.iam;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import java.util.HashMap;
import java.util.Map;

/** Package-local implementation of CurrentUser */
@Generated
class CurrentUserImpl implements CurrentUserService {
  private final ApiClient apiClient;

  public CurrentUserImpl(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  @Override
  public User me() {
    String path = "/api/2.0/preview/scim/v2/Me";
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    return apiClient.GET(path, User.class, headers);
  }
}
