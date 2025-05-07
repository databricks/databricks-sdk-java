// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.pipelines;

import com.databricks.sdk.support.Generated;

/** What triggered this update. */
@Generated
public enum StartUpdateCause {
  API_CALL,
  JOB_TASK,
  RETRY_ON_FAILURE,
  SCHEMA_CHANGE,
  SERVICE_UPGRADE,
  USER_ACTION,
}
