// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import com.databricks.sdk.support.Generated;
import com.fasterxml.jackson.annotation.JsonProperty;

/** State that alert evaluates to when query result is empty. */
@Generated
public enum AlertOptionsEmptyResultState {
  @JsonProperty("ok")
  OK,

  @JsonProperty("triggered")
  TRIGGERED,

  @JsonProperty("unknown")
  UNKNOWN,
}
