// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import com.databricks.sdk.support.Generated;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Warehouse type: `PRO` or `CLASSIC`. If you want to use serverless compute, you must set to `PRO`
 * and also set the field `enable_serverless_compute` to `true`.
 */
@Generated
public enum CreateWarehouseRequestWarehouseType {
  @JsonProperty("CLASSIC")
  CLASSIC,

  @JsonProperty("PRO")
  PRO,

  @JsonProperty("TYPE_UNSPECIFIED")
  TYPE_UNSPECIFIED,
}
