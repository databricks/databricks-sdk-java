// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.catalog;

import com.databricks.sdk.support.Generated;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The current state of enablement for the system schema. An empty string means the system schema is
 * available and ready for opt-in.
 */
@Generated
public enum SystemSchemaInfoState {
  @JsonProperty("AVAILABLE")
  AVAILABLE,

  @JsonProperty("DISABLE_INITIALIZED")
  DISABLE_INITIALIZED,

  @JsonProperty("ENABLE_COMPLETED")
  ENABLE_COMPLETED,

  @JsonProperty("ENABLE_INITIALIZED")
  ENABLE_INITIALIZED,

  @JsonProperty("UNAVAILABLE")
  UNAVAILABLE,
}
