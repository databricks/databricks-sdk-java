// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Qualifier for type of experiments to be returned. If unspecified, return only active experiments.
 */
@Generated
public enum SearchExperimentsViewType {
  @JsonProperty("ACTIVE_ONLY")
  ACTIVE_ONLY,

  @JsonProperty("ALL")
  ALL,

  @JsonProperty("DELETED_ONLY")
  DELETED_ONLY,
}
