// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import com.databricks.sdk.support.Generated;
import com.fasterxml.jackson.annotation.JsonProperty;

/** A singular noun object type. */
@Generated
public enum ObjectType {
  @JsonProperty("alert")
  ALERT,

  @JsonProperty("dashboard")
  DASHBOARD,

  @JsonProperty("data_source")
  DATA_SOURCE,

  @JsonProperty("query")
  QUERY,
}
