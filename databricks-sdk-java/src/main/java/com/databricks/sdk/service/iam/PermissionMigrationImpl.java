// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.iam;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import java.util.HashMap;
import java.util.Map;

/** Package-local implementation of PermissionMigration */
@Generated
class PermissionMigrationImpl implements PermissionMigrationService {
  private final ApiClient apiClient;

  public PermissionMigrationImpl(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  @Override
  public MigratePermissionsResponse migratePermissions(MigratePermissionsRequest request) {
    String path = "/api/2.0/permissionmigration";
    Map<String, String> headers = new HashMap<>();
    headers.put("Accept", "application/json");
    headers.put("Content-Type", "application/json");
    return apiClient.execute("POST", path, request, MigratePermissionsResponse.class, headers);
  }
}
