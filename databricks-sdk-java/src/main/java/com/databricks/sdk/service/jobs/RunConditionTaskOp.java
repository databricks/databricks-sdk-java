// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.Generated;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The condtion task operator. */
@Generated
public enum RunConditionTaskOp {
  @JsonProperty("EQUAL_TO")
  EQUAL_TO,

  @JsonProperty("GREATER_THAN")
  GREATER_THAN,

  @JsonProperty("GREATER_THAN_OR_EQUAL")
  GREATER_THAN_OR_EQUAL,

  @JsonProperty("LESS_THAN")
  LESS_THAN,

  @JsonProperty("LESS_THAN_OR_EQUAL")
  LESS_THAN_OR_EQUAL,

  @JsonProperty("NOT_EQUAL")
  NOT_EQUAL,
}
