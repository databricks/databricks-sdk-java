// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.pipelines;

import com.databricks.sdk.support.Generated;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The severity level of the event. */
@Generated
public enum EventLevel {
  @JsonProperty("ERROR")
  ERROR,

  @JsonProperty("INFO")
  INFO,

  @JsonProperty("METRICS")
  METRICS,

  @JsonProperty("WARN")
  WARN,
}
