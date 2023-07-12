// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.fasterxml.jackson.annotation.JsonProperty;

/** This describes an enum */
@Generated
public enum Stage {
  @JsonProperty("Archived")
  ARCHIVED, // Archived stage.

  @JsonProperty("None")
  NONE, // The initial stage of a model version.

  @JsonProperty("Production")
  PRODUCTION, // Production stage.

  @JsonProperty("Staging")
  STAGING, // Staging or pre-production stage.
}
