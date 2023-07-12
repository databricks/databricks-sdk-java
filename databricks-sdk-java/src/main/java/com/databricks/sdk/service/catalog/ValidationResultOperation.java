// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The operation tested. */
@Generated
public enum ValidationResultOperation {
  @JsonProperty("DELETE")
  DELETE,

  @JsonProperty("LIST")
  LIST,

  @JsonProperty("READ")
  READ,

  @JsonProperty("WRITE")
  WRITE,
}
