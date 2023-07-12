// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import com.databricks.sdk.support.Generated;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Security policy for warehouses */
@Generated
public enum GetWorkspaceWarehouseConfigResponseSecurityPolicy {
  @JsonProperty("DATA_ACCESS_CONTROL")
  DATA_ACCESS_CONTROL,

  @JsonProperty("NONE")
  NONE,

  @JsonProperty("PASSTHROUGH")
  PASSTHROUGH,
}
