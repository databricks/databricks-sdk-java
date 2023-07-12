// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.pipelines;

import com.databricks.sdk.support.Generated;
import com.fasterxml.jackson.annotation.JsonProperty;

@Generated
public enum UpdateStateInfoState {
  @JsonProperty("CANCELED")
  CANCELED,

  @JsonProperty("COMPLETED")
  COMPLETED,

  @JsonProperty("CREATED")
  CREATED,

  @JsonProperty("FAILED")
  FAILED,

  @JsonProperty("INITIALIZING")
  INITIALIZING,

  @JsonProperty("QUEUED")
  QUEUED,

  @JsonProperty("RESETTING")
  RESETTING,

  @JsonProperty("RUNNING")
  RUNNING,

  @JsonProperty("SETTING_UP_TABLES")
  SETTING_UP_TABLES,

  @JsonProperty("STOPPING")
  STOPPING,

  @JsonProperty("WAITING_FOR_RESOURCES")
  WAITING_FOR_RESOURCES,
}
