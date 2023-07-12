// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.service.sql;

import com.databricks.sdk.support.Generated;
import com.fasterxml.jackson.annotation.JsonProperty;

/** State of the warehouse */
@Generated
public enum State {
  @JsonProperty("DELETED")
  DELETED,

  @JsonProperty("DELETING")
  DELETING,

  @JsonProperty("RUNNING")
  RUNNING,

  @JsonProperty("STARTING")
  STARTING,

  @JsonProperty("STOPPED")
  STOPPED,

  @JsonProperty("STOPPING")
  STOPPING,
}
