// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.fasterxml.jackson.annotation.JsonProperty;

@Generated
public enum ListSecurableType {
  @JsonProperty("catalog")
  CATALOG,

  @JsonProperty("schema")
  SCHEMA,

  @JsonProperty("table")
  TABLE,
}
