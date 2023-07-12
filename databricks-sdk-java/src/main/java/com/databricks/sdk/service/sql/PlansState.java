// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import com.databricks.sdk.support.Generated;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Whether plans exist for the execution, or the reason why they are missing */
@Generated
public enum PlansState {
  @JsonProperty("EMPTY")
  EMPTY,

  @JsonProperty("EXISTS")
  EXISTS,

  @JsonProperty("IGNORED_LARGE_PLANS_SIZE")
  IGNORED_LARGE_PLANS_SIZE,

  @JsonProperty("IGNORED_SMALL_DURATION")
  IGNORED_SMALL_DURATION,

  @JsonProperty("IGNORED_SPARK_PLAN_TYPE")
  IGNORED_SPARK_PLAN_TYPE,

  @JsonProperty("UNKNOWN")
  UNKNOWN,
}
