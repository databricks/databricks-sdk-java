// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.jobs;

import com.databricks.sdk.support.Generated;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The repair history item type. Indicates whether a run is the original run or a repair run. */
@Generated
public enum RepairHistoryItemType {
  @JsonProperty("ORIGINAL")
  ORIGINAL,

  @JsonProperty("REPAIR")
  REPAIR,
}
