// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.iam;

import com.databricks.sdk.core.ApiClient;
import com.databricks.sdk.support.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * APIs for migrating acl permissions, used only by the ucx tool:
 * https://github.com/databrickslabs/ucx
 */
@Generated
public class PermissionMigrationAPI {
  private static final Logger LOG = LoggerFactory.getLogger(PermissionMigrationAPI.class);

  private final PermissionMigrationService impl;

  /** Regular-use constructor */
  public PermissionMigrationAPI(ApiClient apiClient) {
    impl = new PermissionMigrationImpl(apiClient);
  }

  /** Constructor for mocks */
  public PermissionMigrationAPI(PermissionMigrationService mock) {
    impl = mock;
  }

  /** Migrate Permissions. */
  public MigratePermissionsResponse migratePermissions(MigratePermissionsRequest request) {
    return impl.migratePermissions(request);
  }

  public PermissionMigrationService impl() {
    return impl;
  }
}
