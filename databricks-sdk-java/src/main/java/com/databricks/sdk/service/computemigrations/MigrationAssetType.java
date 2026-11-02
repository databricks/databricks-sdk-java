// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.computemigrations;

import com.databricks.sdk.support.Generated;

/**
 * Type of a migration asset: the Classic asset being migrated, or an asset the migration agent
 * created for it. Migrations can only be created for JOB assets.
 */
@Generated
public enum MigrationAssetType {
  FILE,
  INTERACTIVE,
  JOB,
}
