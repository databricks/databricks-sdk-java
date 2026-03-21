// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import com.databricks.sdk.support.Generated;

/**
 * Statuses which are also used by OperationStatus in runtime. When adding a new QueryStatus, make
 * sure to update com.databricks.sqlgateway.history.QueryStatusOrdering
 */
@Generated
public enum QueryStatus {
  CANCELED,
  COMPILED,
  COMPILING,
  FAILED,
  FINISHED,
  QUEUED,
  RUNNING,
  STARTED,
}
