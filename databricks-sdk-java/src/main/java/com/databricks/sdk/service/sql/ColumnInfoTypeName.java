// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import com.databricks.sdk.support.Generated;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Name of type (INT, STRUCT, MAP, and so on) */
@Generated
public enum ColumnInfoTypeName {
  @JsonProperty("ARRAY")
  ARRAY,

  @JsonProperty("BINARY")
  BINARY,

  @JsonProperty("BOOLEAN")
  BOOLEAN,

  @JsonProperty("BYTE")
  BYTE,

  @JsonProperty("CHAR")
  CHAR,

  @JsonProperty("DATE")
  DATE,

  @JsonProperty("DECIMAL")
  DECIMAL,

  @JsonProperty("DOUBLE")
  DOUBLE,

  @JsonProperty("FLOAT")
  FLOAT,

  @JsonProperty("INT")
  INT,

  @JsonProperty("INTERVAL")
  INTERVAL,

  @JsonProperty("LONG")
  LONG,

  @JsonProperty("MAP")
  MAP,

  @JsonProperty("NULL")
  NULL,

  @JsonProperty("SHORT")
  SHORT,

  @JsonProperty("STRING")
  STRING,

  @JsonProperty("STRUCT")
  STRUCT,

  @JsonProperty("TIMESTAMP")
  TIMESTAMP,

  @JsonProperty("USER_DEFINED_TYPE")
  USER_DEFINED_TYPE,
}
