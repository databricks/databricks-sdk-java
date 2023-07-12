// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import com.databricks.sdk.support.Generated;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Type of statement for this query */
@Generated
public enum QueryStatementType {
  @JsonProperty("ALTER")
  ALTER,

  @JsonProperty("ANALYZE")
  ANALYZE,

  @JsonProperty("COPY")
  COPY,

  @JsonProperty("CREATE")
  CREATE,

  @JsonProperty("DELETE")
  DELETE,

  @JsonProperty("DESCRIBE")
  DESCRIBE,

  @JsonProperty("DROP")
  DROP,

  @JsonProperty("EXPLAIN")
  EXPLAIN,

  @JsonProperty("GRANT")
  GRANT,

  @JsonProperty("INSERT")
  INSERT,

  @JsonProperty("MERGE")
  MERGE,

  @JsonProperty("OPTIMIZE")
  OPTIMIZE,

  @JsonProperty("OTHER")
  OTHER,

  @JsonProperty("REFRESH")
  REFRESH,

  @JsonProperty("REPLACE")
  REPLACE,

  @JsonProperty("REVOKE")
  REVOKE,

  @JsonProperty("SELECT")
  SELECT,

  @JsonProperty("SET")
  SET,

  @JsonProperty("SHOW")
  SHOW,

  @JsonProperty("TRUNCATE")
  TRUNCATE,

  @JsonProperty("UPDATE")
  UPDATE,

  @JsonProperty("USE")
  USE,
}
