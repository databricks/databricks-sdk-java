// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The type of connection. */
@Generated
public enum ConnectionType {
  @JsonProperty("DATABRICKS")
  DATABRICKS,

  @JsonProperty("MYSQL")
  MYSQL,

  @JsonProperty("POSTGRESQL")
  POSTGRESQL,

  @JsonProperty("REDSHIFT")
  REDSHIFT,

  @JsonProperty("SNOWFLAKE")
  SNOWFLAKE,

  @JsonProperty("SQLDW")
  SQLDW,

  @JsonProperty("SQLSERVER")
  SQLSERVER,
}
