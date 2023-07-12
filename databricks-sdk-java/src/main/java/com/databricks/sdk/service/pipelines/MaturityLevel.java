// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.pipelines;

import com.databricks.sdk.support.Generated;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Maturity level for EventDetails. */
@Generated
public enum MaturityLevel {
  @JsonProperty("DEPRECATED")
  DEPRECATED,

  @JsonProperty("EVOLVING")
  EVOLVING,

  @JsonProperty("STABLE")
  STABLE,
}
