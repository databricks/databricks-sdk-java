// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.compute;

import com.databricks.sdk.support.Generated;
import com.fasterxml.jackson.annotation.JsonProperty;

@Generated
public enum CommandStatus {
  @JsonProperty("Cancelled")
  CANCELLED,

  @JsonProperty("Cancelling")
  CANCELLING,

  @JsonProperty("Error")
  ERROR,

  @JsonProperty("Finished")
  FINISHED,

  @JsonProperty("Queued")
  QUEUED,

  @JsonProperty("Running")
  RUNNING,
}
