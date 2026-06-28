// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.iam;

import com.databricks.sdk.support.Generated;

/**
 * APIs for migrating acl permissions, used only by the ucx tool:
 * https://github.com/databrickslabs/ucx
 *
 * <p>This is the high-level interface, that contains generated methods.
 *
 * <p>Evolving: this interface is under development. Method signatures may change.
 */
@Generated
public interface PermissionMigrationService {
  /** Migrate Permissions. */
  MigratePermissionsResponse migratePermissions(
      MigratePermissionsRequest migratePermissionsRequest);
}
