// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.
package com.databricks.sdk.service.iam;

import com.databricks.sdk.support.Generated;

/**
 * This spec contains undocumented permission migration APIs used in
 * https://github.com/databrickslabs/ucx.
 *
 * <p>This is the high-level interface, that contains generated methods.
 *
 * <p>Evolving: this interface is under development. Method signatures may change.
 */
@Generated
public interface PermissionMigrationService {
  /**
   * Migrate Permissions.
   *
   * <p>Migrate a batch of permissions from a workspace local group to an account group.
   */
  PermissionMigrationResponse migratePermissions(
      PermissionMigrationRequest permissionMigrationRequest);
}
