// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.postgres;

import com.databricks.sdk.support.Generated;

/** The lifecycle state of a migration. */
@Generated
public enum MigrationState {
  MIGRATION_STATE_ASSESSING,
  MIGRATION_STATE_ASSESSMENT_NEEDS_ACTION,
  MIGRATION_STATE_COMPLETED,
  MIGRATION_STATE_DRAFT,
  MIGRATION_STATE_FAILED,
  MIGRATION_STATE_INITIAL_DATA_LOAD,
  MIGRATION_STATE_READY_TO_START,
  MIGRATION_STATE_SCHEMA_LOAD,
}
