// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.aisearch;

import com.databricks.sdk.support.Generated;

/**
 * Overall outcome of a data-plane upsert or delete. Mirrors the legacy
 * `databricks.brickindexscheduler.UpsertDeleteDataStatus` value-for-value.
 */
@Generated
public enum DataModificationStatus {
  FAILURE,
  PARTIAL_SUCCESS,
  SUCCESS,
}
