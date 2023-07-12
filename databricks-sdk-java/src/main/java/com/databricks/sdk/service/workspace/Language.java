// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.workspace;

import com.databricks.sdk.support.Generated;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The language of the object. This value is set only if the object type is `NOTEBOOK`. */
@Generated
public enum Language {
  @JsonProperty("PYTHON")
  PYTHON,

  @JsonProperty("R")
  R,

  @JsonProperty("SCALA")
  SCALA,

  @JsonProperty("SQL")
  SQL,
}
