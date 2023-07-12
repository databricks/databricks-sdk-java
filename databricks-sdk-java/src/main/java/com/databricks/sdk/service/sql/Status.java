// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import com.databricks.sdk.support.Generated;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Health status of the warehouse. */
@Generated
public enum Status {
  @JsonProperty("DEGRADED")
  DEGRADED,

  @JsonProperty("FAILED")
  FAILED,

  @JsonProperty("HEALTHY")
  HEALTHY,

  @JsonProperty("STATUS_UNSPECIFIED")
  STATUS_UNSPECIFIED,
}
