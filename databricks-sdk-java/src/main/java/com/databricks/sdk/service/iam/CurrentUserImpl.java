// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.iam;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.core.DatabricksException;
import com.databricks.sdk.core.http.Request;
import com.databricks.sdk.support.Generated;
import java.io.IOException;

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
    try {
      Request req = new Request("GET", path);

      req.withHeader("Accept", "application/json");
      if (apiClient.workspaceId() != null) {
        req.withHeader("X-Databricks-Org-Id", apiClient.workspaceId());
      }
      return apiClient.execute(req, User.class);
    } catch (IOException e) {
      throw new DatabricksException("IO error: " + e.getMessage(), e);
    }
  }
}
