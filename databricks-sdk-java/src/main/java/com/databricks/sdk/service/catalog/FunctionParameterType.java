// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The type of function parameter. */
@Generated
public enum FunctionParameterType {
  @JsonProperty("COLUMN")
  COLUMN,

  @JsonProperty("PARAM")
  PARAM,
}
