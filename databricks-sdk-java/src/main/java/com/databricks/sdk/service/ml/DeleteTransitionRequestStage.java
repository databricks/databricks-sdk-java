// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.fasterxml.jackson.annotation.JsonProperty;

@Generated
public enum DeleteTransitionRequestStage {
  @JsonProperty("Archived")
  ARCHIVED,

  @JsonProperty("None")
  NONE,

  @JsonProperty("Production")
  PRODUCTION,

  @JsonProperty("Staging")
  STAGING,
}
