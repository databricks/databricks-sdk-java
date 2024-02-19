// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import com.databricks.sdk.support.Generated;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Parameters can have several different types. */
@Generated
public enum ParameterType {
  @JsonProperty("datetime")
  DATETIME,

  @JsonProperty("enum")
  ENUM,

  @JsonProperty("number")
  NUMBER,

  @JsonProperty("query")
  QUERY,

  @JsonProperty("text")
  TEXT,
}
