// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Stage of the model version. Valid values are:
 *
 * <p>* `None`: The initial stage of a model version.
 *
 * <p>* `Staging`: Staging or pre-production stage.
 *
 * <p>* `Production`: Production stage.
 *
 * <p>* `Archived`: Archived stage.
 */
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
