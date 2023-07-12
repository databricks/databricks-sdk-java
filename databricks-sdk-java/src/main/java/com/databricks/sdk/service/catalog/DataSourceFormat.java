// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Data source format */
@Generated
public enum DataSourceFormat {
  @JsonProperty("AVRO")
  AVRO,

  @JsonProperty("CSV")
  CSV,

  @JsonProperty("DELTA")
  DELTA,

  @JsonProperty("DELTASHARING")
  DELTASHARING,

  @JsonProperty("JSON")
  JSON,

  @JsonProperty("ORC")
  ORC,

  @JsonProperty("PARQUET")
  PARQUET,

  @JsonProperty("TEXT")
  TEXT,

  @JsonProperty("UNITY_CATALOG")
  UNITY_CATALOG,
}
