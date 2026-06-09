// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.aisearch;

import com.databricks.sdk.support.Generated;

/** Lifecycle state of an AI Search endpoint, used by both Standard and Storage Optimized SKUs. */
@Generated
public enum EndpointStatusState {
  DELETED,
  OFFLINE,
  ONLINE,
  PROVISIONING,
  RED_STATE,
  YELLOW_STATE,
}
