// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.ml;

import com.databricks.sdk.support.Generated;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Whether to display only active, only deleted, or all runs. Defaults to only active runs. */
@Generated
public enum SearchRunsRunViewType {
  @JsonProperty("ACTIVE_ONLY")
  ACTIVE_ONLY,

  @JsonProperty("ALL")
  ALL,

  @JsonProperty("DELETED_ONLY")
  DELETED_ONLY,
}
