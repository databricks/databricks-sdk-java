// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.fasterxml.jackson.annotation.JsonProperty;

@Generated
public enum TableType {
  @JsonProperty("EXTERNAL")
  EXTERNAL,

  @JsonProperty("MANAGED")
  MANAGED,

  @JsonProperty("MATERIALIZED_VIEW")
  MATERIALIZED_VIEW,

  @JsonProperty("STREAMING_TABLE")
  STREAMING_TABLE,

  @JsonProperty("VIEW")
  VIEW,
}
