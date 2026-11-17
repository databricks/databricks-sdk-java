// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.aisearch;

import com.databricks.sdk.support.Generated;

/** Detailed lifecycle state of the index. */
@Generated
public enum IndexStatusState {
  DOWNLOADING,
  OFFLINE,
  OFFLINE_FAILED,
  ONLINE,
  ONLINE_CONTINUOUS_UPDATE,
  ONLINE_DIRECT_ACCESS,
  ONLINE_NO_PENDING_UPDATE,
  ONLINE_PIPELINE_FAILED,
  ONLINE_TRIGGERED_UPDATE,
  ONLINE_UPDATING_PIPELINE_RESOURCES,
  PROVISIONING,
  PROVISIONING_ENDPOINT,
  PROVISIONING_INDEX,
  PROVISIONING_INITIAL_SNAPSHOT,
  PROVISIONING_PIPELINE_RESOURCES,
}
