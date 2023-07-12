// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.pipelines;

import com.databricks.sdk.support.Generated;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The health of a pipeline. */
@Generated
public enum GetPipelineResponseHealth {
  @JsonProperty("HEALTHY")
  HEALTHY,

  @JsonProperty("UNHEALTHY")
  UNHEALTHY,
}
