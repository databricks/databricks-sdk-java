// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

import com.databricks.sdk.support.Generated;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Decides which runtime engine to be use, e.g. Standard vs. Photon. If unspecified, the runtime
 * engine is inferred from spark_version.
 */
@Generated
public enum RuntimeEngine {
  @JsonProperty("NULL")
  NULL,

  @JsonProperty("PHOTON")
  PHOTON,

  @JsonProperty("STANDARD")
  STANDARD,
}
