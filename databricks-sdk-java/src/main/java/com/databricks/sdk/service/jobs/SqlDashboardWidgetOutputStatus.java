// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.Generated;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The execution status of the SQL widget. */
@Generated
public enum SqlDashboardWidgetOutputStatus {
  @JsonProperty("CANCELLED")
  CANCELLED,

  @JsonProperty("FAILED")
  FAILED,

  @JsonProperty("PENDING")
  PENDING,

  @JsonProperty("RUNNING")
  RUNNING,

  @JsonProperty("SUCCESS")
  SUCCESS,
}
