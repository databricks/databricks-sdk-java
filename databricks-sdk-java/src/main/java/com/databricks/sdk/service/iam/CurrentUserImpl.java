// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.iam;

import com.databricks.sdk.client.ApiClient;
import com.databricks.sdk.support.Generated;
import org.apache.http.client.methods.*;

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
    return apiClient.GET(path, User.class);
  }
}
