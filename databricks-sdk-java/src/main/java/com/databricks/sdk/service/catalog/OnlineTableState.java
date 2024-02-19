// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;

/** The state of an online table. */
@Generated
public enum OnlineTableState {
  OFFLINE,
  OFFLINE_FAILED,
  ONLINE,
  ONLINE_CONTINUOUS_UPDATE,
  ONLINE_NO_PENDING_UPDATE,
  ONLINE_PIPELINE_FAILED,
  ONLINE_TABLE_STATE_UNSPECIFIED,
  ONLINE_TRIGGERED_UPDATE,
  ONLINE_UPDATING_PIPELINE_RESOURCES,
  PROVISIONING,
  PROVISIONING_INITIAL_SNAPSHOT,
  PROVISIONING_PIPELINE_RESOURCES,
}
