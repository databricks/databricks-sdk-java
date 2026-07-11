// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.postgres;

import com.databricks.sdk.support.Generated;

/**
 * The replication state of a single replicated table (CdfStatus), as reported by the wal2delta
 * extension on the primary compute.
 */
@Generated
public enum CdfState {
  CDF_STATE_SKIPPED,
  CDF_STATE_SNAPSHOTTING,
  CDF_STATE_STREAMING,
  CDF_STATE_TERMINATED,
}
