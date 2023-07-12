// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Function SQL data access. */
@Generated
public enum CreateFunctionSqlDataAccess {
  @JsonProperty("CONTAINS_SQL")
  CONTAINS_SQL,

  @JsonProperty("NO_SQL")
  NO_SQL,

  @JsonProperty("READS_SQL_DATA")
  READS_SQL_DATA,
}
