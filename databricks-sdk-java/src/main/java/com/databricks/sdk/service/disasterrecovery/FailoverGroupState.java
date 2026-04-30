// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.disasterrecovery;

import com.databricks.sdk.support.Generated;

/** The aggregate state of a FailoverGroup. */
@Generated
public enum FailoverGroupState {
  ACTIVE,
  CREATING,
  CREATION_FAILED,
  DELETING,
  DELETION_FAILED,
  FAILING_OVER,
  FAILOVER_FAILED,
  INITIAL_REPLICATION,
}
