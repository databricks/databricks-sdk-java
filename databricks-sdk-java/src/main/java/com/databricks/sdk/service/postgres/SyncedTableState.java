// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.postgres;

import com.databricks.sdk.support.Generated;

/**
 * The state of a synced table. Copied from database_table_statuses.proto to decouple SDK packages.
 */
@Generated
public enum SyncedTableState {
  SYNCED_TABLE_OFFLINE,
  SYNCED_TABLE_OFFLINE_FAILED,
  SYNCED_TABLE_ONLINE,
  SYNCED_TABLE_ONLINE_CONTINUOUS_UPDATE,
  SYNCED_TABLE_ONLINE_NO_PENDING_UPDATE,
  SYNCED_TABLE_ONLINE_PIPELINE_FAILED,
  SYNCED_TABLE_ONLINE_TRIGGERED_UPDATE,
  SYNCED_TABLE_ONLINE_UPDATING_PIPELINE_RESOURCES,
  SYNCED_TABLE_PROVISIONING,
  SYNCED_TABLE_PROVISIONING_INITIAL_SNAPSHOT,
  SYNCED_TABLE_PROVISIONING_PIPELINE_RESOURCES,
}
